<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Interior Online</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
   <link rel="stylesheet" href="resources/bootstrap/css/bootstrap.min.css">
  <script src="resources/bootstrap/jquery.min.js"></script>
  <script src="resources/bootstrap/js/bootstrap.min.js"></script>
  <script src="resources/bootstrap/js/angular.min.js"></script>
  <link rel="stylesheet" href="resources/bootstrap/css/styles.css">
 </head>
 <body ng-app="myApp">
 <div class="container-fluid">
  <nav class="navbar navbar-fixed-top navbar-dark">
    <a class="navbar-brand" href="#"><img src="resources/images/icon1.png" class="img-thumbnail pull-left"/>Interior Online</a> 
    <ul class="nav navbar-nav pull-left">
    <li class="nav-item active">
      <a class="nav-link" href="/">Home</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="/Register">Register</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="/Login">Login</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="/About">About Us</a>
    </li>
     <li class="nav-item">
      <a class="nav-link" href="/Contact">Contact Us</a>
    </li>
    </ul>
    <form class="form-inline pull-xs-right">
    	<button class="btn btn-outline-success pull-right" type="submit">Search</button>
    	<input class="form-control pull-right" type="text" placeholder="Search" ng-model="searchBar">
  </form>
</nav>
</div>

</body>
</html>