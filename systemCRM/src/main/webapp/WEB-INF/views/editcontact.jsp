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
<title>editcontact</title>
</head>
<body>

	<a href="/crmsystem"> wroc do logowania</a>
	<h1>Edytuj kontakt</h1>

	<form:form action="" commandName="contact">
		<table>
			<tr>
				<td>Id kontakt</td>
				<td><form:input path="idcontact" disabled="true" /> <form:errors
						path="idcontact" /></td>
			</tr>

			<tr>
				<td>Imie:</td>
				<td><form:input path="firstName" /> <form:errors
						path="firstName" /></td>
			</tr>

			<tr>
				<td>Nazwisko:</td>
				<td><form:input path="lastName" /> <form:errors path="lastName" /></td>
			</tr>
			<tr>
				<td>Nazwa firmy:</td>
				<td><form:input path="companyName" /> <form:errors path="companyName" /></td>
			</tr>
			<tr>
				<td>email:</td>
				<td><form:input path="email" /> <form:errors path="email" /></td>
			</tr>
			<tr>
				<td>Nr. telefonu:</td>
				<td><form:input path="phone" /> <form:errors path="phone" /></td>
			</tr>
			
			
			
			<tr>
				<td colspan="2"><input type="submit" value="Zatwierdz zmiany" /></td>

			</tr>

		</table>
	</form:form>





</body>
</html>