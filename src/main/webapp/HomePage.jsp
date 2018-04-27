<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<%
	String userName= (String)session.getAttribute("user");
	
%>

<h1>Welcome <%= userName %></h1>

<a href="MobilePage.jsp">Mobile</a><br>
<a href="Watches">Watches</a><br>
<a href="Laptop">Laptop</a><br>
<a href="ViewCart.jsp">ViewCart</a>
</body>
</html>