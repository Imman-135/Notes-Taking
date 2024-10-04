<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
.main h1 {
margin-left: 400px;
}
.main form{
margin-left:500px;
}
.main .submit{
margin-left:60px;
}

</style>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
<%@ include file="nav.jsp" %>
<br>
<br>
<div class="main">
<h1>Enter the Details Below</h1><br>
<form action="register">
<input type="text" name="username" placeholder="Enter the User name">
<br>
<br>
<input type="text" name="email" placeholder="Enter the User email">
<br>
<br>
<input type="password" name="password" placeholder="Enter the Password">
<br>
<br>
<input type="submit" class="submit">
</form>
</div>

</body>
</html>