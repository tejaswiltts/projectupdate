<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Car</title>
<link rel="stylesheet" type="text/css" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<script type="text/javascript" src="/webjars/jquery/jquery.min.js"></script>
	<script type="text/javascript" src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<style>

 .bo {
/*   background-color: #E0FFFF; */
        font-size: 20px;
        height: auto;
        margin: 10px;
        padding: 20px;
        margin-left: 25%;
        margin-right: 25%;
        box-shadow: 5px 10px 5px #888888;
        }
        .bod{
         background-image: url("C:/Users/Training/Desktop/temp.jpg");
  background-color: #cccccc;
  height: auto;
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
		<form class="navbar-form navbar-right" action="@{/logout}" method="post">
    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">logout</button>
  </form>
</nav>

<div class="container">
<div class="bod">
    <div align= "center" class="bo">
        <h1>Add New Car</h1>
        <br />
        <form action="#" action="@{/save}" object="${product}" method="post">
 
            <table border="0" cellpadding="10" class="table table-hover">
                  <tr>
                    <td>Car ID:</td>
                    <td><input type="text" field="*{id}" /></td>
                </tr>
                <tr>
                    <td>Owner Name:</td>
                    <td><input type="text" field="*{name}" /></td>
                </tr>
                <tr>
                    <td>Car Name:</td>
                    <td><input type="text" field="*{cname}" /></td>
                </tr>
                <tr>
                    <td>Car Type:</td>
                    <td><input type="text" field="*{ctype}" /></td>
                </tr>
                <tr>
                    <td>Price:</td>
                    <td><input type="text" field="*{price}" /></td>
                </tr> 
                <tr>
                    <td>Register Number</td>
                    <td><input type="text" field="*{rnum}" /></td>
                </tr>                           
                <tr>
                    <td>Year of Manufacture</td>
                    <td><input type="text" field="*{year}" /></td>
                </tr>
                <tr>
                    <td>Color</td>
                    <td><input type="text" field="*{color}" /></td>
                </tr>
                
                <tr>
                    <td colspan="2" align="center"><button type="submit">Save</button> </td>
                </tr>
            </table>
    </div>
    </div>
    </div>
</body>
</html>