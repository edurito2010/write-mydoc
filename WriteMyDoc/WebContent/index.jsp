<%@ page import="com.docm.bean.*" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
.vl {
    border-left: 2px solid red;
    height: 500px;
    position: absolute;
    left: 50%;
    margin-left: -3px;
    top: 0;
}
</style>

<title>Insert title here</title>
</head>
<jsp:useBean id="employeeInfo" class="com.docm.bean.EmployeeBean" scope="request"></jsp:useBean>
    <jsp:setProperty property="*" name="employeeInfo"/>
<body>
	<hr>
	<form action="${pageContext.request.contextPath}/EmployeeManager" method="post">
		<label>First Name: </label>
		<input name="firstName" type="text" > <br>
		<label>Last Name: </label>
		<input name="lastName" type="text"> <br>
		<label>ZIP: </label>
		<input name="zipCode" type="text">
		<hr>
		<br>
		<input type="submit">
	</form>
	<div class="vl"></div>
</body>
</html>