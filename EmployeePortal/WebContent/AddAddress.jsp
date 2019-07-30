<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<div align="center">
	<h1 style="color:green;">Welcome   ${EmpAd.f_name }  to the portal</h1>
</head>
<body>
<form action="AddressServ">
<fieldset>
	<legend>Address Form</legend>
	<table>
	<tr>
			<td>Your Employee id:</td><td><input type="text" value=${empId } disabled="disabled" ></td>
		</tr>
		<tr>
			<td>Enter State:</td><td><input type="text" name="State"></td>
		</tr>
		
		<tr>
			<td>Enter City:</td><td><input type="text" name="City"></td>
		</tr>
		
		<tr>
			<td>Enter Locality:</td><td><input type="text" name="Locality"></td>
		</tr>
		
		<tr>
			<td>Enter House No</td><td><input type="text" name="HouseNo"></td>
		</tr>
		
		<tr>
			<td>Enter Pin Code</td><td><input type="text" name="PinCode"></td>
		</tr>
		
		<tr>
			<td><input type="submit" value="submit"></td><td><input type="submit" value="go back" onclick="form.action='LogIn.jsp';" ></td>
		</tr>
	</table>
	</fieldset>
	</form>

</body>
</div>
</html>