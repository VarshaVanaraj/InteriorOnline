<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ include file="admin.jsp" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>edit Customer details</title>
</head>
<body background="resources/images/Purple-wallpaper-3.jpg" text="white">
	<form:form method="POST" action="updCust" commandName="updateCust">
	<table>
	<tr>
           <td><form:label path="id">Enter the Customer ID:</form:label></td>
           <td><form:input path="id"/></td>
    </tr>
    <tr>
         <td colspan="2"><input type="submit" value="update"/></td>
    </tr>    
	</table>
	</form:form>
</body>
</html>