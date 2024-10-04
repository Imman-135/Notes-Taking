<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="nav.jsp" %>
<form action="add-category" method="post">
<input type="text" name="categoryName" placeholder="Enter the Category Name">
<br>
<input type="text" name="categoryDescription" placeholder="Enter The Category Description">
<br>

<input type="submit">
</form>
</body>
</html>
