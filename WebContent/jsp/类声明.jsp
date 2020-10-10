<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body style="font-size: large;">
	<p>JSP页面类声明示例</p>
	<p>请输入x的值：</p>
	<form action="#" method="GET" name="from">
		<input type="text" name="xvalue"/>
		<input type="submit" value="caculate" name="submit"/>
	</form>
	<%!
	public class Square
	{
		int x;
		
		public int caculateSquare(int x)
		{
			int y;
			y = x * x;
			return y;
		}
	}
	%>
	<!-- HTML 注释内容 -->
	<%-- JSP 注释内容 --%>
	<%
	String str = request.getParameter("xvalue");
	int x, y;
	if (str != null)
		x = Integer.valueOf(str).intValue();
	else
		x = 0;
	Square sq = new Square();
	y = sq.caculateSquare(x);
	%>
	<p><%= x %>平方值为：<%= y %></p>
</body>
</html>
