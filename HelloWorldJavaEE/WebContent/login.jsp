<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Login page</h1>
	<form action = "LoginServlet" method = "post">
		Enter your email: <input type = "email" name = "email" size = 20>
		Enter your password: <input type = "password" name = "password" size = 20>
		<input id = "submitbtn" type = "submit" value = "Login">
	</form>
			<a href="<%=request.getContextPath()%>/register.jsp">Register Page Here</a> 
</body>
</html>