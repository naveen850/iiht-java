<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><center>
<form:form action="login" method="post" modelAttribute="Student">
Username : <form:input path="userName" type="text"/><br>
password :<form:input path="password" type="text"/><br>
<input type="submit" value="Login">
</form:form><br>
New User<a href="register">register</a>
<br>
${message }
</center>
</body>
</html>