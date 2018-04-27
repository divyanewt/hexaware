<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Net Bazar</h1>
<h2>Mobiles</h2><br>
<a href="HomePage.jsp">Home</a>
<a href="view.jsp">View Cart</a><br><br>
<form action="Cart">
<table>
<tr><th>Select</th><th>BrandName</th><th>Price</th></tr>
	<tr><td><label class="container">
  <input type="checkbox" name="mobile" value="Samsung Price-25000">
  <span class="checkmark"></span>
 
</label> </td><td>Samsung</td><td>25000</td></tr>
<tr><td>
<label class="container">
  <input type="checkbox" name="mobile" value="Nokia Price-15000">
  <span class="checkmark"></span>
</label></td> <td>Nokia</td><td>15000</td>
</tr>
<tr><td>
<label class="container">
  <input type="checkbox" name="mobile" value="LG Price-25000">
  <span class="checkmark"></span>
</label> </td><td>LG</td><td>5000</td></tr>

<tr><td><input type="submit" value="Add Cart">
</table>
</form>
</body>
</html>