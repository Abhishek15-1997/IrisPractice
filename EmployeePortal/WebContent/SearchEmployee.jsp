<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<div align="center">
<h1 style="color:green;">Welcome   ${EmpAd.f_name }  to the portal</h1>
</head>
<body>
<form action="searchEmp" method="get">
<table>
<tr>
	<td>Enter Employee ID:</td><td><input type="text" name="search" placeholder="EMPID"></td><td><input type="submit" value="search"></td><td><input type="submit" value="go back" onclick="form.action='HomeForAdmin.jsp';" ></td></tr><br>
	
	<tr></tr>
	</table>
	</form>
	
	
	
</body>
</div>
</html>