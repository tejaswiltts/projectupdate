<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Car Manager</title>
<link rel="stylesheet" type="text/css" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<script type="text/javascript" src="/webjars/jquery/jquery.min.js"></script>
	<script type="text/javascript" src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<style>
       body{
        background-image: url("C:/Users/Training/Desktop/temp5.jpg");
  background-color: #cccccc;
  height: 800px;
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  position: relative;
       }
       .he{
       color: solidblack;
        font-family:Monotype Corsiva;
        font-size: 35px;
        height: auto;
        margin: 5px;
        padding: 5px;
        box-shadow: 5px 10px 5px #888888;
       }
        .bo {
       
        font-size: 20px;
        height: auto;
        margin: 10px;
        padding: 20px;
        box-shadow: 5px 10px 5px #888888;
        }
    </style>
</head>
<body>
<nav class="navbar navbar-light bg-light">
  <a class="navbar-brand">Car Rental</a>
  <a class="navbar-brand" href="/new">Add New Car</a>
		<form class="navbar-form navbar-right" action="@{/logout}" method="post">
    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">logout</button>
  </form>
</nav>
<div class="container">
<div class="he" align="center">
    <h1>List of Car Available</h1>
    <!-- <a href="/new">Add New Car</a> -->
    </div>
    <div class="bo" align="center">
    <table border="1" cellpadding="10" class="table table-hover">
        <thead>
            <tr>
               
                <th>Car ID</th>
                <th>Owner Name</th>
                <th>Car Name</th>
                <th>Car Type</th>
                <th>Price</th>
                <th>Register number</th>
                <th>Year of Manufacture</th>
                <th>Color</th>
                <th>Actions</th>
                 
            </tr>
        </thead>
        <tbody>
            <tr each="product : ${listProducts}">
                <td text="${product.id}">Car ID</td>
                <td text="${product.name}">Owner Name</td>
                <td text="${product.cname}">Car Name</td>
                <td text="${product.ctype}">Car Type</td>
                <td text="${product.price}">Price</td>
                <td text="${product.rnum}">Register number</td>
                <td text="${product.year}">Price</td>
                <td text="${product.color}">Register number</td>
                <td>
                    <a href="@{'/edit/' + ${product.id}}">Edit</a>
                    &nbsp;&nbsp;&nbsp;
                    <a href="@{'/delete/' + ${product.id}}">Delete</a>
                </td>
            </tr>
        </tbody>
    </table>
</div>
</div>   
</body>
</html>