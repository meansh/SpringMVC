<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${Header }</h1>
	<p>${Desc }</p>
	<h1>Welcome, ${user.userName }</h1>
	<h1>Your email address is ${user.email }</h1>
	<h1>Your password address is ${user.password }</h1>
	
</body>
</html>