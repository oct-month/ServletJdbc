<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body style="font-size: large;">
	<%
	request.setCharacterEncoding("utf-8");
	response.setCharacterEncoding("utf-8");
	%>
	<%
	String name = request.getParameter("name");
	String address = request.getParameter("address");
	%>
	<%= name %>：<%= address %>
</body>
</html>
