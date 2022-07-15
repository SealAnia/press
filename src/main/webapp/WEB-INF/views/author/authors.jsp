<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Authors</title>

<link rel = "stylesheet" href = '<c:url value = "/resources/css/Table.css"/>' 
type="text/css"/>

</head>
<body>

	<table>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Surname</th>
		</tr>
		<c:forEach items = "${authors}" var = "author">
		<tr>
			<td>${author.authorid}</td>
			<td>${author.name}</td>
			<td>${author.surname}</td>
		</tr>
		</c:forEach>
	</table>

</body>
</html>