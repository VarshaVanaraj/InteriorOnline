<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Interior Online login</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="resources/bootstrap/css/bootstrap.min.css">
  <script src="resources/bootstrap/jquery.min.js"></script>
  <script src="resources/bootstrap/js/bootstrap.min.js"></script>
  <style>
  .align-center
  {
  text-align:center;
  }
  .jumbotron
  {
  background:#00ff66;
  text-align:center;
  }
  .img
  {
  position:relative;
  left:243px;
  }
  </style>
  </head>
  <body>
  	<div class="container-fluid">
  	<div class="jumbotron">
  		<h1>Interior Online</h1>
  		<p>Everything your home needs</p>
  	</div>
  	<div class="modal-dialog">
  	<div class="modal-content">
  	<div class="modal-header">
  	<div class="img">
  		<img src="resources/images/Chrysanthemum.jpg" class="img-circle" height="100px" width=100px"\></div>
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
  				<input class="btn btn-default btn-lg" type="submit" value="Login"><br>
  				<a href="#" class="pull-right"><big><u>Register</u></big></a>
  			</div>
 	 		</form>
  	</div>
  	</div>
  </div>	
  </div></div>
  </body>
  </html>