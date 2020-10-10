<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>JSP page</title>
</head>
<body style="font-size: large;">
	<%
	String s = request.getParameter("Ra");
	if (s != null && s.equals("d"))
		out.println("正确");
	else
		out.println("错误");
	%>
</body>
</html>
