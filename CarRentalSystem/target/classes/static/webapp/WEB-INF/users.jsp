<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Users</title>
	<link rel="stylesheet" type="text/css" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<script type="text/javascript" src="/webjars/jquery/jquery.min.js"></script>
	<script type="text/javascript" src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	
	<style>
	 body{
         background-image: url("C:/Users/Training/Desktop/temp3.jpg");
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
    <a class="navbar-brand" href="/index1">View Cars</a>
	<a class="navbar-brand" href="/index2">View Booking</a>
		<form class="navbar-form navbar-right" action="@{/logout}" method="post">
    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">logout</button>
  </form>
</nav>


<div class="container text-center">
<!-- <div align="right">
         <form th:action="@{/logout}" method="post">
    <input type="submit" value="Sign Out" />
    </form>
</div> -->
	<div>
<!-- 	<a href="/index1">View Cars</a> -->
<!-- 	<a href="/index2">View Booking</a> -->
		<form>
			<h1>
				Welcome <b><i>[[${#request.userPrincipal.principal.fullName}]]</b></i>
			</h1>
		</form>
	</div>
	<div>
		<h2>List of Users</h2>
	</div>
	
	<div>
		<table class="table table-striped table-bordered">
			<thead class="thead-dark">
				<tr>
					<th>User ID</th>
					<th>E-mail</th>
					<th>First Name</th>
					<th>Last Name</th>
				</tr>
			</thead>
			<tbody>
				<tr each="user: ${listUsers}">
					<td text="${user.id}">User ID</td>
					<td text="${user.email}">E-mail</td>
					<td text="${user.firstName}">First Name</td>
					<td text="${user.lastName}">Last Name</td>
				</tr>
			</tbody>
		</table>
	</div>
</div>
</body>
</html>