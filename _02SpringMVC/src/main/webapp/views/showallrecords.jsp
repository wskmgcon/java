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
/* String name = (String)request.getAttribute("name");
String email = (String)request.getAttribute("email");


	System.out.print(email);
	out.print(name+"<br>") ;
	out.print(email+"<br>") ;
	*/
	
%>

<h2>User name </h2>${name }
<H2>Email Address :</H2>${email }

</body>
</html>