<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Interior Online regn</title>
</head>
<body background="resources/images/Purple-wallpaper-3.jpg" ng-app="formApp">	
  <%@ include file="header.jsp" %>
  <div class="modal-dialog">
  <div class="modal-content">
  <div class="modal-header">
  		<h2 class="text-center">Register in Interior Online</h2>
  	
  <div class="modal-body">
  <form:form method="POST" action="register" ModelAttribute="RegnForm">
      <table>
       <tr>
           <td><form:label path="id">Customer ID:</form:label></td>
           <td><form:input path="id" value="${id}" readonly="true"/></td>
       </tr>
       <tr>
           <td><form:label path="name">Name:</form:label></td>
           <td><form:input path="name" value="${name}"/></td>
       </tr>
       <tr>
       		<td><form:label path="email">E-mail address</form:label></td>
       		<td><form:input path="email" value="${email}"/></td>
       </tr>
       <tr>
           <td><form:label path="uname">Username:</form:label></td>
           <td><form:input path="uname" value="${uname}"/></td>
       </tr>
       <tr>
           <td><form:label path="pwd">Password:</form:label></td>
           <td><form:password path="pwd" value="${pwd}"/></td>
       </tr>
       
       <tr>
           <td><form:label path="cpwd">Confirm Password:</form:label></td>
           <td><form:password path="cpwd" value="${cpwd}"/></td>
       </tr>
       <tr>
         <td colspan="2"><input type="submit" value="Submit"/></td>
       </tr>
   </table> 
  </form:form>
  </div>
  </div>
  </div>	
  </div>
</body>
</html>