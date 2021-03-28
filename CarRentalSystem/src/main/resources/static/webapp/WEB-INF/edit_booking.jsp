<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BOOKING</title>
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
        <h1>EDIT BOOKING</h1>
        <br />
        <form action="#" action="@{/save2}" object="${booking}"
            method="post">
 
            <table border="0" cellpadding="10">
                 
                 <tr>
                    <td>BOOKING ID:</td>
                    <td><input type="text" field="*{Id}" readonly="readonly" /></td>
                </tr>
                 
                <tr>
                    <td>CAR ID:</td>
                    <td><input type="text" field="*{car_id}" /></td>
                </tr>
                <tr>
                    <td>EMAIL ID:</td>
                    <td><input type="text" field="*{email_id}" /></td>
                </tr>
                <tr>
                    <td>BOOKING DATE:</td>
                    <td><input type="text" field="*{booking_date}" /></td>
                </tr>
                <tr>
                    <td>MANY DAYS:</td>
                    <td><input type="text" field="*{many_days}" /></td>
                </tr> 
                <!-- <tr>
                    <td>STATUS</td>
                    <td><input type="text" th:field="*{status}" /></td>
                </tr> -->   
                <tr>
                <td><label for="status">STATUS:</label></td>
  <td><select field="*{status}">
    <option value="Confirmed">Confirmed</option>
    <option value="Booked">Booked</option>
    <option value="Available">Available</option>
  </select></td>
           </tr>                             
                <tr>
                    <td colspan="2"><button type="submit">Save</button> </td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>