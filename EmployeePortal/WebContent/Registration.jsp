<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<div align="center">
	<h1 style="color:green;">Welcome To Employee Portal</h1>
</head>
<body>
	<form action="Reg" method="get">
	<fieldset>
	<legend>Registration Form</legend>
	
	<table>
	
	<tr>
	<td>Enter your First Name</td><td><input type="text" name="fname"></td>
	</tr>
	
		<tr>
	<td>Enter your Last Name</td><td><input type="text" name="lname"></td>
	</tr>
	
		<tr>
	<td>Enter your Age</td><td><input type="text" name="age"></td>
	</tr>
	
		<tr>
	<td>Enter your Gender</td>
	<td>
	<input type="radio" name="gender" value="male" checked> Male
  <input type="radio" name="gender" value="female"> Female
  <input type="radio" name="gender" value="other"> Other </td>
	</tr>
	
	
		<tr>
	<td>Enter your Phone No</td><td><input type="text" name="ph_no"></td>
	</tr>
	<tr>
	<td>Enter your Password</td><td><input type="text" name="pass"></td>
	</tr>
		
	</table>	
	<tr><td><input type="submit" value="submit" ></td><td><input type="submit" value="go back" onclick="form.action='LogIn.jsp';" ></td>
	
	</fieldset>
	</form>
</body>
</div>
</html>