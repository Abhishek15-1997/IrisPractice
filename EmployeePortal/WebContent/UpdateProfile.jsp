<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="Entity.*" %>
<html>
<head>
<h1 style="color:green;">Welcome   ${EmpAd.f_name }  to the portal</h1>
</head>
<body>

<form action="update" method="get">
	<fieldset>
	<legend>Update Profile Form</legend>
	
	<table>
	<tr>
	<td> Your Employee Id is:</td><td><input type="text" name="empid" value=${EmpAd.empid }   disabled="disabled"  ></td>
	</tr> 
	
	<tr>
	<td> Your First Name is:</td><td><input type="text" name="fname" value=${EmpAd.f_name } ></td>
	</tr>
	
		<tr>
	<td> Your Last Name is:</td><td><input type="text" name="lname" value=${EmpAd.l_name }  ></td>
	</tr>
	
		<tr>
	<td> Your Age is:</td><td><input type="text"  value=${EmpAd.age } name="age" ></td>
	</tr>
	
	<tr>
	<td> Your Gender is</td><td><input type="text"  value=${EmpAd.gender } name="gender" ></td>
	</tr>
	
	
		<tr>
	<td>Your Phone No is</td><td><input type="text"  value=${EmpAd.phoneNo } name="phno" ></td>
	</tr>
	<tr>
	<td>Enter your Password</td><td><input type="text"  value=${EmpAd.pass } name="pass" ></td>
	</tr>
		
	</table>
	<tr>	
	<td><input type="submit" value="submit" ></td><td><input type="submit" value="go back" onclick="form.action='HomeForEmp.jsp';" ></td>
	</tr>
	</fieldset>
	</form>
</body>
</html>