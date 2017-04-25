<!DOCTYPE html>
<html>

<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
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
	<h1>server monitoring</h1>
	<br />
	<div class="jumbotron">
		<table
			class="table table-hover table-striped table-bordered table-condensed"
			style="width: 500px; margin: auto;">
			<thead>
				<tr style="background-color: white;">
					<th style="text-align: center; vertical-align: middle;">server
						id</th>
					<th style="text-align: center; vertical-align: middle;">host
						name</th>
					<th style="text-align: center; vertical-align: middle;">ip
						address</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td style="text-align: center;"><a href="#">server ${ arrayListServerInformation.id }</a></td>
					<td style="text-align: center;">${ arrayListServerInformation.hostName }</td>
					<td style="text-align: center;">${ arrayListServerInformation.ipAddress }</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>

</html>
