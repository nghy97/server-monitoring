<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">

<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>index</title>

<style>
h1 {
	text-align: center;
	color: #5D5D5D;
}

.jumbotron {
	width: 600px;
	margin: auto;
	text-align: center;
}
</style>
</head>

<body onload="realtimeClock()">
	<nav class="navbar navbar-default">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="/"><span
				class="glyphicon glyphicon-home" aria-hidden="true"></span></a>
		</div>
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
			</ul>
			<c:choose>
				<c:when test="${sessionedAdmin == null }">
					<ul class="nav navbar-nav navbar-right">
						<li><a href="/signin">signin</a></li>
					</ul>
				</c:when>
				<c:when test="${sessionedAdmin != null }">
					<ul class="nav navbar-nav navbar-right">
						<li><a href="/signout">signout</a></li>
					</ul>
				</c:when>
			</c:choose>
		</div>

	</div>
	</nav>
	<h1>server list</h1>
	<br />
	<div class="jumbotron">
		<div class="container">
			<h4>
				<div id="time"></div>
			</h4>
			<br />
			<c:choose>
				<c:when test="${sessionedAdmin == null }">
				</c:when>
				<c:when test="${sessionedAdmin != null }">
					<a href="/add" class="btn btn-primary pull-right" role="button">add</a>
					<hr style="color: black;">
				</c:when>
			</c:choose>
			<table id="server-list"
				class="table table-hover table-striped table-bordered">
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
	</div>
	<script src="/js/index.js"></script>
</body>

</html>