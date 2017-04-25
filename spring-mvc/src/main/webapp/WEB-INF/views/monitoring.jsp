<!DOCTYPE html>
<meta charset="utf-8">
<style>
body {
	font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
	width: 960px;
	height: 500px;
	position: relative;
}

path.slice {
	stroke-width: 2px;
}

polyline {
	opacity: .3;
	stroke: black;
	stroke-width: 2px;
	fill: none;
}

svg text.percent {
	fill: white;
	text-anchor: middle;
	font-size: 12px;
}
</style>
<body>
	<button onClick="changeData()">Change Data</button>
	<script src="http://d3js.org/d3.v3.min.js"></script>
	<script src="donut.js"></script>
	<script>
		var salesData = [ {
			label : "Basic",
			color : "#3366CC"
		}, {
			label : "Plus",
			color : "#DC3912"
		}, {
			label : "Lite",
			color : "#FF9900"
		}, {
			label : "Elite",
			color : "#109618"
		}, {
			label : "Delux",
			color : "#990099"
		} ];

		var svg = d3.select("body").append("svg").attr("width", 700).attr(
				"height", 300);

		svg.append("g").attr("id", "salesDonut");
		svg.append("g").attr("id", "quotesDonut");

		Donut3D.draw("salesDonut", randomData(), 150, 150, 130, 100, 30, 0.4);
		Donut3D.draw("quotesDonut", randomData(), 450, 150, 130, 100, 30, 0);

		function changeData() {
			Donut3D.transition("salesDonut", randomData(), 130, 100, 30, 0.4);
			Donut3D.transition("quotesDonut", randomData(), 130, 100, 30, 0);
		}

		function randomData() {
			return salesData.map(function(d) {
				return {
					label : d.label,
					value : 1000 * Math.random(),
					color : d.color
				};
			});
		}
	</script>
</body>
