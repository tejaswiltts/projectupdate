<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Booking Manager</title>
<link rel="stylesheet" type="text/css" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<script type="text/javascript" src="/webjars/jquery/jquery.min.js"></script>
	<script type="text/javascript" src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	<style>
       body{
        background-image: url("C:/Users/Training/Desktop/te.jpg");
  background-color: #cccccc;
  height: 800px;
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  position: relative;
       }
       .he{
       color: grey;
        font-family:Monotype Corsiva;
        font-size: 45px;
        height: auto;
        margin: 5px;
        padding: 5px;
        box-shadow: 5px 10px 5px #888888;
       }
        .bo {
       
        font-size: 15px;
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
  <a class="navbar-brand" href="/new2">Create New Booking</a>
		<form class="navbar-form navbar-right" action="@{/logout}" method="post">
    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">logout</button>
  </form>
</nav>
<div class="container">
<div align="center">
    <h1 class="he">Booking List</h1>
    <!-- <a href="/new2">Create New Booking</a> -->
    <div class="bo">
    <table border="1" cellpadding="10" class="table table-hover">
        <thead>
            <tr>
               
                <th>BOOKING ID</th>
                <th>CAR ID</th>
                <th>EMAIL ID</th>
                <th>BOOKING DATE</th>
                <th>HOW MANY DAYS</th>
                <th>STATUS</th>
                <th>Actions</th>
                 
            </tr>
        </thead>
        <tbody>
            <tr each="booking : ${listBooking}">
                <td text="${booking.Id}">BOOKING ID</td>
                <td text="${booking.car_id}">CAR ID</td>
                <td text="${booking.email_id}">EMAIL ID</td>
                <td text="${booking.booking_date}">BOOKING DATE</td>
                <td text="${booking.many_days}">DAYS</td>
                <td text="${booking.status}">STATUS</td>
                <td>
                    <a href="@{'/edit2/' + ${booking.Id}}">Edit</a>
                    &nbsp;&nbsp;&nbsp;
                    <a href="@{'/delete2/' + ${booking.Id}}">Delete</a>
                </td>
            </tr>
        </tbody>
    </table>
</div> 
</div>
</div> 
</body>
</html>