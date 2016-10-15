<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>InteriorOnline-Products</title>
<%@include file="admin.jsp" %>
</head>
<body background="resources/images/Purple-wallpaper-3.jpg" class="body-style">
<div align="center"><br><br>
<h1>Product List</h1>
<table border="1">
  	<tr>
  		<th>ID</th>
  		<th>PRODUCT</th>
  		<th>CATEGORY</th>
  		<th>PRICE</th>
  		<th>ACTION</th>
  	</tr>
  
    <c:forEach items="$(pdt)" var="product">
  	<tr>
  		<td>${product.id}</td>
  		<td>${product.product}</td>
  		<td>${product.category}}</td>
  		<td>${product.price}</td>
  		<td>
       		<a href="/updPdt">edit</a>&nbsp;&nbsp;
       		<a href="/delPdt">delete</a>
       	</td>	
  	</tr>
  	</c:forEach> 
  </table>
  </div>
</body>
</html>