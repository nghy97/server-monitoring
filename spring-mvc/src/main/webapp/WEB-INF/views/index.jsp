<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<title>index</title>

<style>
h1 {
	text-align: center;
	color: #5D5D5D;
}

.jumbotron {
	width: 800px;
	margin: auto;
	text-align: center;
}
.danger {
	color: red;
}
</style>
</head>

<body>
	<nav class="navbar navbar-default">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="/"><span
				class="glyphicon glyphicon-home" aria-hidden="true"></span></a>
		</div>
	</div>
	</nav>
	<h1>server list</h1>
	<br />
	<div class="jumbotron">
		<h4><div id="time"></div></h4>
		<br />
		<table id="server-list" class="table table-hover table-striped table-bordered"
			style="width: 600px; margin: auto;">
			<thead>
				<tr style="background-color: white;">
					<th
						style="text-align: center; vertical-align: middle; font-size: 2rem;">server
						id</th>
					<th
						style="text-align: center; vertical-align: middle; font-size: 2rem;">host
						name</th>
					<th
						style="text-align: center; vertical-align: middle; font-size: 2rem;">ip
						address</th>
					<th
						style="text-align: center; vertical-align: middle; font-size: 2rem;">os</th>
					<th
						style="text-align: center; vertical-align: middle; font-size: 2rem;">status</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="arrayListServerInformation"
					items="${ arrayListServerInformation }">
					<tr
						onclick="location.href='/monitoring/${ arrayListServerInformation.id }'"
						style="cursor: pointer;">
						<td style="text-align: center;">${ arrayListServerInformation.id }</td>
						<td style="text-align: center;">${ arrayListServerInformation.hostName }</td>
						<td style="text-align: center;">${ arrayListServerInformation.ipAddress }</td>
						<td style="text-align: center;">${ arrayListServerInformation.osName }</td>
						<td style="text-align: center;"></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<script>
		$(document).ready(function() {
			setInterval(function() {
				$.ajax({
					type: 'GET',
					url: '/detail',
					success: function(res) {
						var data = JSON.parse(res);
						$('#time').text(data[0].time);
						for (var i = 0; i < $('#server-list tbody tr').length; i++) {
							for (var j = 0; j < data.length; j++) {
								if ($('#server-list tbody tr td:nth-child(1)')[i].innerHTML === data[j].id) {
									$('#server-list tbody tr td:nth-child(5)')[i].innerHTML = data[j].status;
								}	
							}
						}
						for (var i = 0; i < $('#server-list tbody tr').length; i++) {
							if ($('#server-list tbody tr td:nth-child(5)')[i].innerHTML === 'danger') {
								$('#server-list tbody tr td:nth-child(5)')[i].innerHTML = null;
								$('#server-list tbody tr td:nth-child(5)')[i].innerHTML = '<div style="border-radius: 50% 50%; -moz-border-radius: 50% 50%; -webkit-border-radius: 50% 50%; background: #FF0000; height: 20px; width: 20px; margin: auto;"></div>';
							} else if ($('#server-list tbody tr td:nth-child(5)')[i].innerHTML === 'warning') {
								$('#server-list tbody tr td:nth-child(5)')[i].innerHTML = '<div style="border-radius: 50% 50%; -moz-border-radius: 50% 50%; -webkit-border-radius: 50% 50%; background: #FFBB00; height: 20px; width: 20px; margin: auto;"></div>';
							} else {
								$('#server-list tbody tr td:nth-child(5)')[i].innerHTML = '<div style="border-radius: 50% 50%; -moz-border-radius: 50% 50%; -webkit-border-radius: 50% 50%; background: #1DDB16; height: 20px; width: 20px; margin: auto;"></div>';
							}
						}
						
					},
					error: function(err) {
						console.log('cannot receive status model.');
					}
				});
			}, 1000)
		});
	</script>
</body>

</html>