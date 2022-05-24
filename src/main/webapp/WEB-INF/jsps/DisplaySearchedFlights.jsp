<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
table{
border-collapse:collapse;
text-align:center;
margin-left:auto;
margin-right:auto;
margin-top:1rem;
}
th,td{
padding:15px;

}
tr:nth-child(even) {
background-color: #f2f2f2
}
h3{
text-align:center
}
</style>
<meta charset="ISO-8859-1">
<title>all Flights</title>
</head>
<body>
<h3>Searched Flight Details</h3>
<form action="fillDetails" method="post">
	<table border="1">
		<tr>
			<th>ID</th>
			<th>Flight Number</th>
			<th>Airline</th>
			<th>Source</th>
			<th>Destination</th>
			<th>Departure Time</th>
			<th>Arrival Time</th>
			<th>Rate</th>
			<th>Select</th>
		</tr>
		<c:forEach items="${flightList}" var="flight">
			<tr>
				<td style="padding:5px">${flight.id}</td>
				<td>${flight.flightNumber}</td>
				<td>${flight.airline}</td>
				<td>${flight.source}</td>
				<td>${flight.destination}</td>
				<td>${flight.departureTime}</td>
				<td>${flight.arrivalTime}</td>
				<td>${flight.rate}</td>
				<td><input type="radio" name="selectedFlight" value="${flight.flightNumber}"></td>
			</tr>
		</c:forEach>
	</table>
	<button style="position: relative;left:70%;margin-top:1.5rem" type="submit"> Proceed to Fill Form</button>
	</form>
</body>
</html>