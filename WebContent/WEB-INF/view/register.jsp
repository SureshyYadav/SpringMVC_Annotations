<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page session="false"%> 
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
	<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<form:form id="regForm" modelAttribute="register"
		action="registerProcess" method="post">
		<table>
			<tr>
				<td>UserName:</td>
				<td><form:input path="username" /></td>
				<%-- <td><form:errors path="username" /></td> --%>
			</tr>
			<tr>
				<td>Password:</td>
				<td><form:input path="password" /></td>
				<td><form:errors path="password" /></td>
			</tr>
			<tr>
				<td>FirstName:</td>
				<td><form:input path="firstName" /></td>
				<td><form:errors path="firstName" /></td>
			</tr>
			<tr>
				<td>LastName:</td>
				<td><form:input path="lastName" /></td>
				<td><form:errors path="lastName" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><form:input path="email" /></td>
				<td><form:errors path="email" /></td>
			</tr>
			<tr>
				<td>Address:</td>
				<td><form:input path="address" /></td>
				<td><form:errors path="address" /></td>
			</tr>
			<tr>
				<td>PhoneNumber:</td>
				<td><form:input path="phoneNumber" /></td>
				<td><form:errors path="phoneNumber" /></td>
			</tr>
			<tr>
				<td colspan="2"><button type="submit">Register</button>
		</table>

	</form:form>
</body>
</html>