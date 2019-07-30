<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Entity.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<h1 style="color:green;">Welcome <%= session.getAttribute("empname") %>  to the portal</h1>
</head>
<body>
<% EmployeeDetails e=(EmployeeDetails)session.getAttribute("Employee/Admin");%>
<form action="HomeForEmp.jsp" method="get">
	<fieldset>
	<legend>View Profile Form</legend>
	
	<table>
	<tr>
	<td> Your First Name is:</td><td><input type="text" value=<%=e.getF_name() %> c></td>
	</tr>
	
		<tr>
	<td> Your Last Name is:</td><td><input type="text" value=<%=e.getL_name() %> disabled="disabled" ></td>
	</tr>
	
		<tr>
	<td> Your Age is:</td><td><input type="text" value=<%=e.getAge() %> disabled="disabled" ></td>
	</tr>
	
	<tr>
	<td> Your Gender is</td><td><input type="text" value=<%=e.getGender() %> disabled="disabled" ></td>
	</tr>
	
	
		<tr>
	<td>Your Phone No is</td><td><input type="text" value=<%=e.getPhoneNo() %> disabled="disabled" ></td>
	</tr>
	<tr>
	<td>Enter your Password</td><td><input type="text" value=<%=e.getPass() %> disabled="disabled" ></td>
	</tr>
		
	</table>	
	<input type="submit" value="Go back" >
	
	</fieldset>
	</form>
</body>
</html>