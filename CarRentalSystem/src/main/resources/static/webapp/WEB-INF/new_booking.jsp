<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> New booking</title>
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
        margin-left: 20%;
        margin-right: 20%;
        box-shadow: 5px 10px 5px #888888;
        }
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
		<form class="navbar-form navbar-right" action="@{/logout}" method="post">
    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">logout</button>
  </form>
</nav>
<div class="container">
    <div align="center" class="bo">
        <h1> New booking</h1>
        <br />
        <form action="#" action="@{/save2}" object="${booking}"
            method="post">
 
            <table border="0" cellpadding="10" class="table table-hover">
                 
                 
                  <tr>
                    <td>BOOKING ID:</td>
                    <td><input type="text" field="*{Id}" /></td>
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
                    <td>DAYS:</td>
                    <td><input type="text" field="*{many_days}" /></td>
                </tr> 
                <!-- <tr>
                    <td>STATUS</td>
                    <td><input type="text" th:field="*{status}" /></td>
                </tr>  -->  
                
                <tr>
                <td><label for="status">STATUS:</label></td>
  <td><select field="*{status}">
    <option value="Confirmed">Confirmed</option>
    <option value="Booked">Booked</option>
    <option value="Available">Available</option>
  </select></td>
           </tr>     
                                        
                <tr>
                    <td colspan="2" align="center"><button type="submit">Save</button> </td>
                </tr>
            </table>
        </form>
    </div>
     </div>
    <!-- <div align="right">
         <form th:action="@{/price}" method="post">
    <input type="submit" value="Price" />
    </form>
    </div> -->
</body>
</html>
