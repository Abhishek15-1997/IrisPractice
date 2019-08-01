<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="EmployeeListners.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<div align="center">

	<h1 style="color:green;">Welcome   ${EmpAd.f_name }  to the portal</h1>
	
</head>
<body>
	<a href="ViewAllEmps">View Profile Of Employees</a><br></br>
	<a href="SearchEmployee.jsp">Search an Employees</a><br></br>
	
	<a href="UpdateProfile">Update Profile</a><br></br>
	<a href="logoutServ">Log Out </a><br></br>
	
<!--  	No of users: ${applicationScope.count }-->
	No of users : <%=EmpSessionListner.count %>
</body>
</div>
</html>