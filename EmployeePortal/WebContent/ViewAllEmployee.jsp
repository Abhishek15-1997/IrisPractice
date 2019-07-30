<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="Entity.*" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head> <div align="center">
<h1 style="color:green;">Welcome   ${EmpAd.f_name }  to the portal</h1>
</head>
<body>
	
		<table border="1">
			<tr>
			<th>Employee id</th>
			<th>Employee first name</th>
			<th>Employee last name</th>
			<th>Employee age</th>
			<th>Employee gender</th>
			<th>Employee Phone No</th>
			<th>Employee Password</th></tr>		
		
		
		<c:forEach items="${EmpList}" var="e">
			<tr>
				<td>${e.empid }</td>
				<td>${e.f_name}</td>
				<td>${e.l_name}</td>
				<td>${e.gender}</td>
				<td>${e.age}</td>
				<td>${e.gender}</td>
				<td>${e.pass}</td>
				
			</tr>
			</c:forEach>
		</table>
</body>
</div>
</html>