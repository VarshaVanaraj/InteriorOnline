<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Interior Online regn</title>
</head>
<body background="resources/images/Purple-wallpaper-3.jpg" ng-app="formApp">	
  	<%@ include file="header.jsp" %>
  <div>
  	var formApp=angular.module("formApp",[]);
    formApp.controller('fm',function($scope){
    $scope.submitForm = function(isValid)
     {
    if (isValid)
     {
      alert('Registration successful!!');
     }
     };
     });
   </div>
  	<div class="modal-dialog">
  	<div class="modal-content">
  	<div class="modal-header">
  		<h2 class="text-center">Register in Interior Online</h2>
  	
  	<div class="modal-body" ng-controller="fm">
  		<form class="col-md-12 center-block" name="regn" ng-submit="submitForm(regn.$valid)" novalidate>
  			<label for="first name">First name:</label>
  			<input type="text" class="form-control input-lg" placeholder="enter your first name" ng-model="fname" required><br>
  			<label for="last name">Last name:</label>
  			<input type="text" class="form-control input-lg" placeholder="enter your surname" ng-model="lname"><br>
  			<label for="E-mail id">E-mail id:</label>
  			<input type="email" class="form-control input-lg" placeholder="eg:abc@gmail.com" ng-model="email" required><br>
  			<p ng-show="regn.email.$invalid && !regn.email.$pristine" class="help-block">Enter a valid email</p>
  			<label for="username">Username:</label>
  			<input type="text" class="form-control input-lg" placeholder="enter valid user name" ng-model="username"><br>
  			<p ng-show="regn.username.$error.minlength" class="help-block">Username is too short.</p>
  			<p ng-show="regn.username.$error.maxlength" class="help-block">Username is too long.</p>
  			<label for="Password">Password:</label>
  			<input type="password" class="form-control input-lg" placeholder="enter 8-digit character" ng-model="pwd" ng-maxlength="8" required><br>
  			<label for="Confirm Password">Confirm Password:</label>
  			<input type="password" class="form-control input-lg" placeholder="re-enter password" ng-model="cpwd" required><br>
  			<label for="Mobile number">Mobile number:</label>
  			<input type="number" class="form-control input-lg" placeholder="enter your 10-digit number" ng-model="mob" ng-pattern="/^[\+]?[(]?[0-9]{3}[)]?[-\s\.]?[0-9]{3}[-\s\.]?[0-9]{4,6}$/" ng-minlength="0" ng-maxlength="10"><br>
  			<div class="align-center">
  				<input class="btn btn-default btn-lg" type="submit" value="Submit" ng-disabled="regn.$invalid"><br>
  			</div>
 	 		</form>
  	</div>
  	</div>
  </div>	
  </div></div>











</body>
</html>