<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
form div{
display:flex;
align-items:center;
justify-content:space-between;
margin-top:2rem;
}
input{
padding:5px
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="margin-left:auto; margin-right:auto; width:20%; padding:15px ; box-shadow:0px 2px 8px rgba(0,0,0,0.26); border-radius:8px">
<h2 style="color:green">Search Flight</h2>
<form action="searchFlight" method="post">
<div>
<label>Source</label>
<input name="source" type="text"/>
</div>
<div>
<label>Destination</label>
<input name="destination" type="text"/>
</div>
<div>
<label>Departure Date</label>
<input name="date" type="date"/>
</div>
<div>
<button type="submit" style="background-color:green;padding:10px;color:white; border:none; border-radius:8px">Search Flight</button>
</div>
</form>
</div>

</body>
</html>