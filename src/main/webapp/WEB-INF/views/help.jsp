<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	String name = (String) request.getAttribute("name");
	Integer rollnumber = (Integer) request.getAttribute("roll");
	LocalDateTime time = (LocalDateTime) request.getAttribute("time");
	%>
	
	<h1>
		Hello My name is
		<%= name %>
	</h1>
	
	<h1>Date and time is <%=time.toString() %></h1>
</body>
</html>