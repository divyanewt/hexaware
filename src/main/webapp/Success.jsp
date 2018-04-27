<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Successfully logged in!!!</h1>
<hr>
<div>
	<h2 style="color:green">Welcome <%=request.getAttribute("name") %>!!!!!</h2>
	<br>
	<h3 align="right"><%=new Date() %></h3>
</div>
</body>
</html>