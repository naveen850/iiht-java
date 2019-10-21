<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="text-align: center;background-color: gray">
<form:form action="studentregister" method="post" modelAttribute="StudentRegister">

Student Number:<form:input path="studentNumber" type="text"/><br>
Student Name:<form:input path="studentName" type="text"/><br>
Student username:<form:input path="userName" type="text"/><br>
Student Course:<form:input path="studentCourse" type="text"/><br>
Student course fee:<form:input path="studentCourseFee" type="text"/><br>
Student Password:<form:input path="password" type="password"/><br>
<input type="submit" value="Register">

</form:form>

</body>
</html>