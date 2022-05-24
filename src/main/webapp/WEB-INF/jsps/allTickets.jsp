<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3 style="text-align:center">All Tickets</h3>
<ul style="display:flex;justify-content:center;align-items:center;flex-wrap:wrap;list-style-type:none">
		<c:forEach items="${tickets}" var="ticket">
		<div style="margin-top:1rem;margin-left:1rem;min-width:20%;box-shadow:0px 2px 8px rgba(0,0,0,0.26);padding:15px">
			<li>
			<p>PNR Number : ${ticket.PNRNumber} </p>
			<p>Fare: Rs. ${ticket.onewayFare} </p>
			<p>No. of Seats: ${ticket.seats}</p>
			<p>Journey Date:  ${ticket.journeyDate}</p>
			</li>
			</div>
		</c:forEach>
</ul>
</body>
</html>