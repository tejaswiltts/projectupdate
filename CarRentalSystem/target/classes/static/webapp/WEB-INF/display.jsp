<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Price</title>
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



 <div class="container">
    <div align="center" class="bo">
        <h1> New booking</h1>
        <br />
        <form action="#" action="@{/cal}" method="post">
 
            <table border="0" cellpadding="10" class="table table-hover">
                 <thead>
                  <tr>
                    <th>BOOKING ID:</th>
                    <th>CAR ID:</th>
                    </tr>
                  </thead>   
                  <tbody>
           <tr each="booking : ${listBooking}">
                <td text="${booking.Id}">BOOKING ID</td>
                <td text="${booking.car_id}">CAR ID</td> 
              </tr>
              </tbody> 
            </table>
        </form>
    </div>
     </div> 




</body>
</html>