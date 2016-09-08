<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">

<%@ include file ="style.css" %>

</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>


	<h1>Logowanie</h1>
	<div id= "panel">
		<form:form action="" commandName="user">


			<label for="login">Login:</label>
			<form:input id ="login" path="login" />



			<label for="password">Hasło:</label>
			 <form:input type = "password" id= "password" path="password" /> 
			<div id="lower"> 
			 <input type="submit"
				value="Zatwierdz" />
				
				</div>
				</form:form>
	</div>
	
	<div id ="comment">Logowanie sprawdza tylko login i hasło, nie zdążyłam dodać
		blokowania dostępu do pozostałych stron. 
		<br /> Logowanie przechodzi do
		profilu właściwego użytkownika, ale nie pamieta go po przejsciu do
		innej strony Hasło nie powinno być trzymane jawnie w bazie danych.</div>

	





</body>
</html>