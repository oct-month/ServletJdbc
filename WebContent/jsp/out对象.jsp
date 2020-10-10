<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>JSP page</title>
</head>
<body style="font-size: large;">
	<%
	Date now = new Date();
	String hours = String.valueOf(now.getHours());
	String mins = String.valueOf(now.getMinutes());
	String secs = String.valueOf(now.getSeconds());
	%>
	现在是<% out.print(hours); %>点<% out.print(mins); %>分<% out.print(secs); %>秒。
</body>
</html>
