<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="admin.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add product</title>
</head>
<body>
<h1>Add Product Details</h1>
<div>
  <form:form method="POST" action="addProduct" commandName="pdtForm">
      <table>   
      <tr>
           <td><form:label path="name">Product Name:</form:label></td>
           <td><form:input path="name"/></td>
       </tr>
       <tr>
       		<td><form:label path="category">Product category:</form:label></td>
       		<td><form:input path="category"/></td>
       </tr>
       <tr>
           <td><form:label path="price">Product price:</form:label></td>
           <td><form:input path="price"/></td>
       </tr>
		<tr>
         <td colspan="2"><input type="submit" value="add product"/></td>
       </tr>
   </table> 
  </form:form>
</div> 
</body>
</html>