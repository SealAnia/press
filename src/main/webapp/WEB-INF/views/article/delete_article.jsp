<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Article</title>
</head>
<body>

	<script src="<c:url value="/resources/js/delete_article_alert.js" var = "OKAlert" />"></script>
	
	<c:url value="/deletearticle/${article.getArticleid()}" var="article"/>
	
	<script src="${OKAlert}"></script>

</body>
</html>