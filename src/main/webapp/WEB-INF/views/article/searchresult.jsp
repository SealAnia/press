<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Result</title>

<link rel = "stylesheet" href = '<c:url value = "/resources/css/Table.css"/>' 
type="text/css"/>

</head>
<body>

	<table>
		<tr>
			<th>ID</th>
			<th>TITLE</th>
			<th>DATE</th>
			<th>AUTHOR</th>
			<th>MAGAZINE</th>
		</tr>
		<c:forEach items = "${results}" var = "article">
		<tr>
			<td>${article.articleid}</td>
			<td>${article.content.publicationName}</td>
			<td>${article.dateOfPublication}</td>
			<td>${article.author.name} ${article.author.surname}</td>
			<td>${article.magazine.name}</td>
			<td><a href="<c:url value="/articles/${article.getArticleid()}"/>"> Read Article</a></td>
		</tr>
		</c:forEach>
	</table>
	
	<a href = "/articles"> BACK</a>

</body>
</html>