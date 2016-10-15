<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Interior Online</title>
<%@ include file="header.jsp" %>
<div class="jumbotron">
<div class="container align-center">	
	<h1>INTERIOR ONLINE</h1>
	<p>Everything your home needs!!</p>
	<p>Add beauty to your home by purchasing</p>
	<p>our leading products exclusively for interior decoration</p>
</div>
</div>
<div class="container">
  <div class="row">
  	<div class="col-sm-12" style="width:900px;height:600px;">
  	  <div id="my-slider" class="carousel slide" data-ride="carousel">
  		<ol class="carousel-indicators">
    	  <li data-target="#my-slider" data-slide-to="0" class="active"></li>
    	  <li data-target="#my-slider" data-slide-to="1"></li>
    	  <li data-target="#my-slider" data-slide-to="2"></li>
 		</ol>	
  	   <div class="carousel-inner" role="listbox">
  	   <div class="item active">
  		<img src="resources/images/furn5s.jpg" class="img-responsive"/>
  	   </div>
  	   <div class="item">
  		<img src="resources/images/hf3s.jpg" class="img-responsive"/>
  	   </div>
  	   <div class="item">
  		<img src="resources/images/ligh3.jpg" class="img-responsive"/>
  	   </div>
  	   </div>
  		<a class="left carousel-control" href="#my-slider" role="button" data-slide="prev">
  				<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
  				<span class="sr-only">previous</span>
  		</a>
  		<a class="right carousel-control" href="#my-slider" role="button" data-slide="next">
  				<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
  				<span class="sr-only">next</span>
  		</a>
  		</div>
  	  </div>
  	</div>
  </div>
  <script>
  	var myApp=angular.module("myApp",[]);
    myApp.controller('sfn',function($scope){
    $scope.searches=[{product:'Book shelf',category:'Furniture',price:'Rs.6000'},
    	{product:'Entertainment unit',category:'Furniture',price:'Rs.15,000'},
    	{product:'Bed Spreads',category:'Home Furnish',price:'Rs.850'},
    	{product:'Curtains',category:'Home Furnish',price:'Rs.2500'},
    	{product:'Wall Lights',category:'Lighting',price:'Rs.1000'},
    	{product:'Table Lamps',category:'Lighting',price:'Rs.550'}];
    });
    
   </script>
   <table ng-controller="sfn">
  	<tr>
  		<th>PRODUCT</th>
  		<th>CATEGORY</th>
  		<th>PRICE</th>
  	</tr>
  	<tr ng-repeat = "search in searches | filter: searchBar">
  		<td><a href="#">{{search.product}}</a></td>
  		<td>{{search.category}}</td>
  		<td>{{search.price}}</td>	
  	</tr>
   </table>
   <%@ include file="footer.jsp" %>
  </body>
  </html>
  	
  	
  


