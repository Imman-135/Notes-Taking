<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style>
h1{
text-align: center;
}
form{
text-align: center;
}</style>
</head>
<body>
<%@ include file="nav.jsp" %>
<h1>Login Page</h1>
<br>
<br>
<form action="login" method="post">
	<input type="text" placeholder="enter the email" name="email" required="required">
<br>
<br>
	<input type="password" placeholder="enter the password " name="password" required="required">
<br>
<br>
	<input type="submit">
</form>
</body>
</html>