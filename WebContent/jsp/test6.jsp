<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>JSP page</title>
</head>
<body style="font-size: large;">
	<%
	long sum = 0;
	String s1 = request.getParameter("sum");
	String s2 = request.getParameter("n");
	if (s1 == null)
		s1 = "";
	if (s2 == null)
		s2 = "";
	if (s1.equals("1"))
	{
		int n = Integer.parseInt(s2);
		for (int i=1; i <= n; ++ i)
		{
			sum += i;
		}
	}
	else if (s1.equals("2"))
	{
		int n = Integer.parseInt(s2);
		for (int i=1; i <= n; ++ i)
		{
			sum += i * i;
		}
	}
	%>
	<p>您的求和结果是<%= sum %></p>
</body>
</html>
