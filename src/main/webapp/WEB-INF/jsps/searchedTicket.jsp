<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
div{
width:25%;
margin-left:auto;
margin-right:auto;
box-shadow:0px 2px 8px rgba(0,0,0,0.26);
padding:15px}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 style="text-align:center">Searched Ticket</h2>
<div>
<p>PNR Number : ${ticket.PNRNumber} </p>
<p>Fare: Rs. ${ticket.onewayFare} </p>
<p>No. of Seats: ${ticket.seats}</p>
<p>Source: ${flight.source}</p>
<p>Destination: ${flight.destination}</p>
<p>Journey Date:  ${ticket.journeyDate}</p>
<p>Departure Time:  ${flight.departureTime}</p>
<p>Arrival Time: ${flight.arrivalTime}</p>
</div>
</body>
</html>