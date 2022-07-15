<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Articles</title>

<link rel = "stylesheet" href = '<c:url value = "/resources/css/Table.css"/>' 
type="text/css"/>

</head>
<body>

	<form action = "/articles/searchresults" method = "get">
			<p><input type="text" name = "keyword" placeholder = "Search on page">
			<input type="submit" value="SEARCH">
			</p>
	</form>
		
	<table>
		<tr>
			<th>ID</th>
			<th>TITLE</th>
			<th>DATE</th>
			<th>AUTHOR</th>
			<th>MAGAZINE</th>
			<th>LAST UPDATE</th>
		</tr>
		<c:forEach items = "${articles}" var = "article">
		<tr>
			<td>${article.articleid}</td>
			<td>${article.content.publicationName}</td>
			<td><fmt:formatDate type = "date" value = "${article.dateOfPublication}" /></td>
			<td>${article.author.name} ${article.author.surname}</td>
			<td>${article.magazine.name}</td>
			<td><fmt:formatDate type = "date" value = "${article.lastDateOfEdition}" /> ${article.lastTimeOfEdition}</td>
			<td><a href="<c:url value="/articles/${article.getArticleid()}"/>">Read Article</a></td>
			<td><a href="<c:url value="/showeditarticle/${article.getArticleid()}"/>">Edit</a></td>
			<td><a href="<c:url value="/deletearticleinfo/${article.getArticleid()}"/>">Delete</a></td>
		</tr>
		</c:forEach>
	</table>
	
</body>
</html>