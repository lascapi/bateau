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
		<a href="/bateau/heure">Horloge</a>
	</div>
	<div>
		<a href="/bateau/bateaux">Bateau(x)</a>
	</div>
	<div>
		<a href="/bateau/helloworld">Hello World</a>
	</div>
	<hr>
	<div>
		<%=LocalDate.now()%>
	</div>
</body>
</html>