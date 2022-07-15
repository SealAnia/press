<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Article "${article.content.publicationName}"</title>
</head>
<body>
	
	<p>
		${article.content.publicationName}
	</p>
	
	<p>
		${article.content.content}
	</p>
	
	<p>
		Published in ${article.magazine.name}, ${article.dateOfPublication}
	</p>

</body>
</html>