<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="Welcome.jsp" /> 
</head>
<body>
<div align="center">
<form action="validateEmployee" method="get">
	<table >
		<tr>
		<td><h3>Enter your emailId</h3> </td>
		<td><input type="text" name="t1"></td>		
		</tr>
		
		<tr>
		<td><h3>Enter your password</h3> </td>
		<td><input type="password" name="t2"></td>	
		</tr>
				
		<tr>
		<td><input type="submit" value="Login"></td>
		<td><input type="submit" value="Go Back" onclick="form.action='UserLinks.jsp';"></td>
		
		</tr>
					
	</table>
	</form>
	
	
</div>
	
</body>
</html>