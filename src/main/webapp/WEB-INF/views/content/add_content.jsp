<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib prefix="spring_form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Article Content</title>

<link rel = "stylesheet" href = '<c:url value = "/resources/css/Form.css"/>' 
type="text/css"/>

</head>
<body>

	<c:url value="/showcontentform/" var="content"/>
	
	<spring_form:form action="${content}" method="post" modelAttribute="content">
    
    <spring_form:label path="publicationName">NAME:</spring_form:label>
    <spring_form:input type="text" path="publicationName"/><br>
    
    <label for="content">ARTICLE:</label>
    <textarea rows="10" cols="20" id = "content" name = "content">
    WRITE ARTICLE HERE
    </textarea><br>
    
    <input type="submit" value="Submit">
	</spring_form:form>

</body>
</html>