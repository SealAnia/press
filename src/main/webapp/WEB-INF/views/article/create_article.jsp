<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib prefix="spring_form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Article</title>

<link rel = "stylesheet" href = '<c:url value = "/resources/css/Form.css"/>' 
type="text/css"/>

</head>
<body>

	<c:url value="/articles" var="article"/>
	
	<spring_form:form action="${article}" method="post" modelAttribute="article">
    
    <label for = "authorid">AUTHOR</label>
    <datalist id = "authorslist">
    	<c:forEach items = "${authors}" var = "author">
    		<option value = "${author.authorid}"> - ${author.name} ${author.surname}
    	</c:forEach>
    </datalist>
    <input type="number" name="authorid" id = "authorid" list="authorslist"><br>
    
    <label for = "magazineid">MAGAZINE</label>
    <datalist id = "magazineslist">
    	<c:forEach items = "${magazines}" var = "magazine">
    		<option value = "${magazine.magazineid}"> - ${magazine.name}
    	</c:forEach>
    </datalist>
    <input type="number" name="magazineid" id = "magazineid" list="magazineslist"><br>
    
    <label for = "contentsid">CONTENT</label>
    <datalist id = "contentlist">
    	<c:forEach items = "${contents}" var = "content">
    		<option value = "${content.contentsid}"> - ${content.publicationName}
    	</c:forEach>
    </datalist>
    <input type="number" name="contentsid" id = "contentsid" list="contentlist"><br>
    
    <spring_form:label path="dateOfPublication">DATE OF PUBLICATION:</spring_form:label>
    <spring_form:input type="date" path="dateOfPublication"/><br>
    
    <input type="submit" value="Submit">
	</spring_form:form>

</body>
</html>