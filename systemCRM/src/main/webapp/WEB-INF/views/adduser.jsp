<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
<%--
<%@
include file ="style.css"%>--%>
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>addcontact</title>
</head>
<body>

	
	<h1>Dodaj użytkownika</h1>

	<form:form action="" commandName="user">
		<table>
			
			<tr>
				<td>Login:</td>
				<td><form:input path="login" /> <form:errors
						path="login" /></td>
			</tr>

			<tr>
				<td>Hasło:</td>
				<td><form:input path="password" /> <form:errors path="password" /></td>
			</tr>
											
			<tr>
				<td colspan="2"><input type="submit" value="Zatwierdz zmiany" /></td>

			</tr>

		</table>
	</form:form>





</body>
</html>