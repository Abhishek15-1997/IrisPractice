<%@page import="javax.servlet.descriptor.TaglibDescriptor"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"  %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<div>
<body>

	<c:if test=""></c:if>

	<table>
	<tr>
	<th>Category Name</th>
	<th>category Description</th>
	</tr>
	
	<c:forEach items="${catlist}" var="catObj">
	<tr>
	<td>${catObj.CategoryName  }</td>
	<td>${catObj.des  }</td>
		<td><a href="updateCategory/${catObj}">Update</a></td>
		<td><a href="deleteCategory/${catObj}">Delete</a></td>
	</tr>
	
	
	</c:forEach>
	
	</table>
	
	
</body>
</div>
</html>