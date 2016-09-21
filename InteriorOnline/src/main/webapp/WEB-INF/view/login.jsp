<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Interior Online login</title>
</head>
 <body background="resources/images/Purple-wallpaper-3.jpg">
  	<%@ include file="header.jsp" %>
  	<div class="modal-dialog" id="sze">
  	<div class="modal-content">
  	<div class="modal-header">
  	<div class="img">
  		<img id="iconimg" src="resources/images/Chrysanthemum.jpg" class="img-circle" height="100px" width=100px"\></div>
  		<h2 class="text-center">My Account</h2>
  	
  	<div class="modal-body">
  		<form class="col-md-12 center-block" action="homepg.jsp">
  			<div class="form-group"> 				
  				<input type="text" class="form-control input-lg" placeholder="username"><br>
  			</div>
  			<div class="form-group">
  				<input type="password" class="form-control input-lg" placeholder="password"><br>
  			</div>
  			<div class="align-center">
  				<a href="/loginbtn">
  				<input class="btn btn-default btn-lg" type="submit" value="Login"><br></a>
  				<a href="register" class="pull-right"><big><u>Register</u></big></a>
  			</div>
 	 		</form>
  	</div>
  	</div>
  </div>	
  </div>
  </body>
  </html>