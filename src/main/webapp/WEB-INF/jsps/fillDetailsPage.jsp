<%@page import="com.dev.org.fbsmvc.entity.Flight"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
form{
width: 30%;
margin-left:auto;
margin-right:auto;
padding:10px;
box-shadow:0px 2px 8px rgba(0,0,0,0.26);
border-radius:8px;
}
form div{
display:flex;
align-items:center;
margin-top:1rem;
}
input{
margin-left:1rem;
padding:5px
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align:center;color:green">Details Page</h1>
<form action="bookTicket" method="post">
<div>
<label>Selected Flight's Flight Number</label>
<input type="number" name="flightNumber" value="${selectedFlight.flightNumber}" readonly/>
</div>
<div>
<label>Enter No. of Seats You would like to book</label>
<input type="number" name="seats" min="0" max="9"/>
</div>
<div>
<label>Enter Mobile Number</label>
<input type="number" name="mobileNo" min="0" max="999999999"/>
</div>
<div>
<label>Enter Email</label>
<input type="text" name="email" />
</div>
<div>
<button style="background-color:green;color:white;border:none;padding:10px;border-radius:10px" type="submit">Book Ticket</button>
</div>
</form>
</body>
</html>
