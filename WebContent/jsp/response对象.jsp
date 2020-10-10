<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>JSP page</title>
</head>
<body style="font-size: large;">
	<%
	String address = request.getParameter("where");
	if (address != null)
	{
		if (address.equals("QQ"))
			response.sendRedirect("http://www.qq.com");
		else if (address.equals("Microsoft"))
			response.sendRedirect("http://www.microsoft.com");
		else if (address.equals("Sun"))
			response.sendRedirect("http://www.sun.com");
	}
	%>
	<b>请选择：</b><br/>
	<form action="#" method="get">
		<select name="where">
			<option value="QQ" selected>前往QQ</option>
			<option value="Sun">前往Sun</option>
			<option value="Microsoft">前往Microsoft</option>
		</select>
		<input type="submit" value="go"/>
	</form>
</body>
</html>
