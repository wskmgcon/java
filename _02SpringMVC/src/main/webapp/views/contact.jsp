<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact page</title>
</head>
<body>
	<h1>Contact Info</h1>
	<%
		// java code
		
	String email = (String)request.getAttribute("email");
	String mobile = (String)request.getAttribute("Mobile");
	String landLine = (String)request.getAttribute("Landline");
	
		System.out.print(email);
		out.print(email+"<br>") ;
		out.print(mobile+"<br>") ;
		out.print(landLine) ;
	%>

	<h2>hello</h2>
	<% %>
</body>
</html>