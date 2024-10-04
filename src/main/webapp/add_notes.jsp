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
<form action="add-note" method="post">
<input type="text" name="categoryName" placeholder="enter the category Name">
<br>
<input type="text" name="noteTitle" placeholder="enter the Note Name">
<br>
<input type="text" name="text" placeholder="enter your note">
<input type="submit">
</form>
</body>
</html>