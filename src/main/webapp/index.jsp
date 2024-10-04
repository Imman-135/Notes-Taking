<%@page import="com.ex.user.Authenticator"%>
<%@page import="com.ex.user.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style >
.anchor a{
margin-left: 45%;
}
.anchor h1{
justify-content: center;
align-items: center;
}
</style>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<%@ include file="nav.jsp" %>
<br>
<br>
<%
Authenticator auth=Authenticator.getAuthenticator(session);
if(auth.getUser()==null)
{
%>
<div class="anchor">
<h1 style="text-align: center">Welcome to the Notes Taking Application</h1>
<br>
<br>
<br>
<a href="register.jsp"> Get Started</a>
</div>

<%
} else {
%>
<div class="anchor">
<h1 style="text-align: center">Welcome, <%= auth.getUser().getUserName()%></h1>
<br>
	<a href="add_notes.jsp">Add Notes</a>
<br>
	<a href="manage_category">Manage Category</a>

</div>

<% } %>
</body>
</html>