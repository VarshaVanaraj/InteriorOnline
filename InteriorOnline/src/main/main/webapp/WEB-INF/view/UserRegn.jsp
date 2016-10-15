<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="admin.jsp" %>
<html>
<body background="resources/images/Purple-wallpaper-3.jpg" class="body-style">
<div align="center"><br><br>
<h1>Customer List</h1>


      <table border="1">
      <tr>
             <th>ID</th>
             <th>NAME</th>
             <th>EMAIL</th>
             <th>USERNAME</th>
             <th>PASSWORD</th>
             <th>CPWD</th>
            <!-- <th>ACTION</th>-->
       </tr>
       <c:forEach var="customer" items="${cmr}">
       <tr>
       		<td><c:out value="${customer.id}"/></td>
       		<td><c:out value="${customer.name}"/></td>
       		<td><c:out value="${customer.email}"/></td>
       		<td><c:out value="${customer.uname}"/></td>
       		<td><c:out value="${customer.pwd}"/></td>
       		<td><c:out value="${customer.cpwd}"/></td>
       		<!--<td>
       			<a href="/updCust">edit</a>&nbsp;&nbsp;
       			<a href="/delCust">delete</a>
       		</td>-->
       	</tr>
       	</c:forEach>      
		</table>
	
</div>
</body>
</html>