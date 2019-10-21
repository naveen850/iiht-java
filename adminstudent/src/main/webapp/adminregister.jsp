<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="register" method="post" modelAttribute="AdminRegister">
Admin Name: <form:input path="adminName" type="text"/><br>
User Name : <form:input path="userName" type="text"/><br>
password : :<form:input path="password" type="password"/><br>
<input type="submit" value="Register">

</form:form>
${message}
</body>
</html>