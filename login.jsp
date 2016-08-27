<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>InteriorOnline login</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="resources/bootstrap/css/bootstrap.min.css">
  <script src="resources/bootstrap/jquery.min.js"></script>
  <script src="resources/bootstrap/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="resources/bootstrap/css/styles.css">
  </head>
  <body>
  	<div class="container-fluid">
  <nav class="navbar navbar-fixed-top navbar-dark">
    <a class="navbar-brand" href="#"><img src="resources/images/icon1.png" class="img-thumbnail pull-left"/>Interior Online</a> 
    <ul class="nav navbar-nav pull-left">
    <li class="nav-item active">
      <a class="nav-link" href="#">Home</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#">Products</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#">Deals</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#">Your Orders</a>
    </li>
    </ul>
    <form class="form-inline pull-xs-right">
    	<button class="btn btn-outline-success pull-right" type="submit">Search</button>
    	<input class="form-control pull-right" type="text" placeholder="Search">
  </form>
</nav>
</div>
  	<div class="modal-dialog">
  	<div class="modal-content">
  	<div class="modal-header">
  	<div class="img">
  		
  		<h1 class="text-center">Interior Online</h1>
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