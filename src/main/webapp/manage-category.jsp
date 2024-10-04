<%@page import="com.ex.category.Category"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style >
th, td {
            width: 150px;
            text-align: center;
            border: 1px solid black;
            padding: 5px;
        }
</style>
</head>
<body>
<%@ include file="nav.jsp" %>
Categories
<br>
<a href="add-category.jsp">Add Category</a>
<% List<Category> categories=(List<Category>)session.getAttribute("categories"); 
%>
<table>
	<tr>
		<th>Category Id</th>
		<th>Category Name</th>
		<th>Description</th>
		<th>Edit</th>
		<th>Delete</th>
	</tr>
	<% if(categories!=null){
		for(Category category:categories){ %>
	<tr>
		<td><%= category.getCatogeryId() %></td>
		<td><%= category.getCatogeryName() %></td>	
		<td><%= category.getDescription() %></td>	
		<td><a href="#">edit</a></td>
		<td><a href="#">delete</a></td>		
	<% } }%>
</table>
</body>
</html>