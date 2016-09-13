<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>InteriorOnline-Products</title>
<%@include file="header.jsp" %>
</head>
<body>
<table id="prod">
 <thead>
  	<tr>
  		<th>ID</th>
  		<th>PRODUCT</th>
  		<th>CATEGORY</th>
  		<th>PRICE</th>
  	</tr>
  </thead>
  <tbody>
    <c:forEach items="$(pl)" var="pro">
  	<tr>
  		<td>${pro.id}</td>
  		<td>${pro.product}</td>
  		<td>${pro.category}}</td>
  		<td>${pro.price}</td>	
  	</tr>
  	</c:forEach>
  </tbody>
  </table>
</body>
</html>