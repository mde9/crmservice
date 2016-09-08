<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
<%@ include file ="style.css" %>
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Profile</title>
</head>
<body>


	<h1>Twój profil</h1>

	<table border="0px">



		<tr>
			<td>Login: </td><td> ${check.login }</td>

		</tr>
		
		<tr>
		<td>zdjęcie : </td><td><!-- <img src="${check.foto }" /> --></td>
		</tr>

	

	</table>
	<br />
	<br />
	<a href="contact">Kontakty</a>
	<c:if test="${check.idrole==2 }">
		<a href="user">Lista użytkowników</a>
	</c:if>
	
	<a href="/crmsystem">Wyloguj</a>




</body>
</html>