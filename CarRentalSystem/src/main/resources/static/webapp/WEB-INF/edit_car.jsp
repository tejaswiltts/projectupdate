<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Product</title>
<link rel="stylesheet" type="text/css" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<script type="text/javascript" src="/webjars/jquery/jquery.min.js"></script>
	<script type="text/javascript" src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-light bg-light">
  <a class="navbar-brand">Car Rental</a>
		<form class="navbar-form navbar-right" action="@{/logout}" method="post">
    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">logout</button>
  </form>
</nav>
    <div align="center">
        <h1>Edit Car</h1>
        <br />
        <form action="#" action="@{/save}" object="${product}" method="post">
 
            <table border="0" cellpadding="10">
                 
                 <tr>
                    <td>Car ID:</td>
                    <td><input type="text" field="*{id}" readonly="readonly" /></td>
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
                    <td colspan="2"><button type="submit">Save</button> </td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>