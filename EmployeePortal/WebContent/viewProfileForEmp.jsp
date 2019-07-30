<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Entity.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<h1 style="color:green;">Welcome   ${EmpAd.f_name }  to the portal</h1>
</head>
<body>
<% EmployeeDetails e=(EmployeeDetails)session.getAttribute("Employee/Admin");%>
<form action="HomeForEmp.jsp" method="get">
	<fieldset>
	<legend>View Profile Form</legend>
	
	<table>
	<tr>
	<td> Your EmpId is:</td><td><input type="text" value=${EmpAd.empid } disabled="disabled"></td>
	</tr>
	<tr>
	<td> Your First Name is:</td><td><input type="text" value=${EmpAd.f_name } disabled="disabled"></td>
	</tr>
	
		<tr>
	<td> Your Last Name is:</td><td><input type="text" value=${EmpAd.l_name } disabled="disabled" ></td>
	</tr>
	
		<tr>
	<td> Your Age is:</td><td><input type="text" value=${EmpAd.age } disabled="disabled" ></td>
	</tr>
	
	<tr>
	<td> Your Gender is</td><td><input type="text" value=${EmpAd.gender } disabled="disabled" ></td>
	</tr>
	
	
		<tr>
	<td>Your Phone No is</td><td><input type="text" value=${EmpAd.phoneNo } disabled="disabled" ></td>
	</tr>
	<tr>
	<td>Enter your Password</td><td><input type="text" value=${EmpAd.pass } disabled="disabled" ></td>
	</tr>
		
	</table>	
	<input type="submit" value="Go back" >
	
	</fieldset>
	</form>
</body>
</html>