<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="Entity.*" %>
<html>
<head>
<h1 style="color:green;">Welcome <%= session.getAttribute("empname") %>  to the portal</h1>
</head>
<body>
<% EmployeeDetails e=(EmployeeDetails)session.getAttribute("Employee/Admin");%>
<form action="update" method="get">
	<fieldset>
	<legend>Update Profile Form</legend>
	
	<table>
	<tr>
	<td> Your Emp Id is:</td><td><input type="text" name="empid" value=<%=e.getEmpid() %>   disabled="disabled"  ></td>
	</tr> 
	
	<tr>
	<td> Your First Name is:</td><td><input type="text" name="fname" value=<%=e.getF_name() %> ></td>
	</tr>
	
		<tr>
	<td> Your Last Name is:</td><td><input type="text" name="lname" value=<%=e.getL_name() %>  ></td>
	</tr>
	
		<tr>
	<td> Your Age is:</td><td><input type="text"  value=<%=e.getAge() %> name="age" ></td>
	</tr>
	
	<tr>
	<td> Your Gender is</td><td><input type="text"  value=<%=e.getGender() %> name="gender" ></td>
	</tr>
	
	
		<tr>
	<td>Your Phone No is</td><td><input type="text"  value=<%=e.getPhoneNo() %> name="phno" ></td>
	</tr>
	<tr>
	<td>Enter your Password</td><td><input type="text"  value=<%=e.getPass() %> name="pass" ></td>
	</tr>
		
	</table>
	<tr>	
	<td><input type="submit" value="submit" ></td><td><input type="submit" value="go back" onclick="form.action='HomeForEmp.jsp';" ></td>
	</tr>
	</fieldset>
	</form>
</body>
</html>