<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

	<title>Welcome to Car Rental</title>
	<link rel="stylesheet" type="text/css" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<script type="text/javascript" src="/webjars/jquery/jquery.min.js"></script>
	<script type="text/javascript" src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	<style>
	 body{
         background-image: url("C:/Users/Training/Desktop/temp.jpg");
  background-color: #cccccc;
  height: 800px;
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  position: relative;
        }
        
	</style>
</head>
<body>
<nav class="navbar navbar-light bg-light">
  <a class="navbar-brand">Car Rental</a>
    <a class="navbar-brand" href="@{/register}">Register</a>
    <a class="navbar-brand" href="@{/dis}">view cars</a>
	<a class="navbar-brand"  href="@{/login}">Login</a>
		<!-- <form class="navbar-form navbar-right" th:action="@{/logout}" method="post">
    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">logout</button>
  </form> -->
</nav>
	<div class="container" align= "center">
		<h1>Welcome to Car Rental</h1>
		<img src="C:/Users/Training/Desktop/1.jpg" alt="alternatetext" style="width:100%;height:650px;">
		<!-- <h3><a href="@{/users}">List of Users</a></h3>
		<h3><a href="@{/register}">Register</a></h3>
		<h3><a href="@{/login}">Login</a></h3> -->
	</div>

</body>
</html>