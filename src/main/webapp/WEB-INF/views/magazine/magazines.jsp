<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Magazines</title>

<link rel = "stylesheet" href = '<c:url value = "/resources/css/Table.css"/>' 
type="text/css"/>

</head>
<body>

	<table>
		<tr>
			<th>ID</th>
			<th>Title</th>
		</tr>
		<c:forEach items = "${magazines}" var = "magazine">
		<tr>
			<td>${magazine.magazineid}</td>
			<td>${magazine.name}</td>
		</tr>
		</c:forEach>
	</table>

</body>
</html>