<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>JSP page</title>
</head>
<body style="font-size: large;">
	<%
	String sessionId = session.getId();
	%>
	<p>你的sessionID是：</p>
	<%= sessionId %>
	<%!
	int number = 0;
	synchronized void countPeople()
	{
		++ number;
	}
	%>
	<%
	if (session.isNew())
	{
		countPeople();
		String str = String.valueOf(number);
		session.setAttribute("count", str);
	}
	%>
	<p>你是第<%= (String) session.getAttribute("count") %>个访问本站的人。</p>
</body>
</html>
