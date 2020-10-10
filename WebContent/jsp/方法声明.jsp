<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body style="font-size: large;">
	<p>JSP页面方法声明示例</p>
	<%!
	int i=0;
	int count()
	{
		int num = 0;
		++ num;
		return num;
	}
	%>
	<% i = count(); %>
	<p>您是第<%= i %>个访问该页面的用户</p>
</body>
</html>
