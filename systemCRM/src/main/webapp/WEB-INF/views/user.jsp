<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
 
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User</title>
</head>
<body>


	<h1>Użytkownicy</h1>
	
	<table border="1"> 
		

		<c:forEach var="user" items="${listuser}">
			<tr>
				<td>Login: ${user.login }</td>
				<td>Hasło: ${user.password}</td>
				<td> ${user.foto }</td>
				
			</tr>
		</c:forEach>
	</table>
	<br/><br/>
	
	


</body>
</html>