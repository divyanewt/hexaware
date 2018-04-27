<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.util.*" %>
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CartPage</title>
</head>
<body>
<% String[] mobiles= (String[])session.getAttribute("mobiles");
	List<String> list =  Arrays.asList(mobiles); 
%>
<c:forEach items="${list}" var="mobile">
<table>
	<tr><th>Select</th><th>BrandName</th><th>Price</th></tr>
	<tr><td><label class="container">
  <input type="checkbox" name="mobile" value="${list}">
  <span class="checkmark"></span>
 
</label> </td><td>"${list}"</td></tr>

</table>
</c:forEach>
</body>
</html>