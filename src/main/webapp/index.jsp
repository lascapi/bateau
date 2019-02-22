<%@page import="controller.MaServlet"%>
<%@page import="data.Bateau"%>
<%@page import="java.time.LocalTime"%>
<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bateau</title>
</head>
<body>
	<h1>Hello World</h1>
	<div>
		<a href="/heure">Horloge</a>
	</div>
	<div>
		<a href="/bateau">Bateau(x)</a>
	</div>
	<div>
		date :
		<%=LocalDate.now()%>
		heure :
		<%=LocalTime.now()%>
	</div>
</body>
</html>