<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="font-size: large;">
	<p>获取文本框提交的信息：</p>
	<%
	// request.setCharacterEncoding("utf-8");
	String textContent = new String(request.getParameter("user").getBytes("ISO-8859-1"));
	%>
	<%= textContent %>
	<p>获取按钮的名字：</p>
	<%
	String buttonName = request.getParameter("submit");
	%>
	<%= buttonName %>
</body>
</html>
