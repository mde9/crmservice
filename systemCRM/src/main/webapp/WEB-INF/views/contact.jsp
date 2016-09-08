<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
 
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>contact</title>
</head>
<body>


	<h1>Kontakty</h1>
	
	<table border="1"> 
		
<td> Imie i nazwisko </td><td> Nazwa firmy </td><td> email </td><td> telefon </td>
		<c:forEach var="contact" items="${listcontact}">
			<tr>
				<td>${contact.firstName }  ${contact.lastName}</td><td> ${contact.companyName }</td><td> ${contact.email}</td><td> ${contact.phone} </td>
				<td><a href="editcontact?idcontact=${contact.idcontact}" >Edycja</a> </td>
				<td><a href="deletecontact?idcontact=${contact.idcontact}" >Usuń</a> </td>
			</tr>
		</c:forEach>
	</table>
	<br/><br/>
	<td><a href="addcontact" >Dodaj kontakt</a> </td>
	


</body>
</html>