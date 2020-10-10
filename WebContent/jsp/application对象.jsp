<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>JSP page</title>
</head>
<body style="font-size: large;">
	<%
	String strNum = (String) application.getAttribute("Num");
	int Num = 0;
	if (strNum != null)
		Num = Integer.parseInt(strNum) + 1;
	application.setAttribute("Num", String.valueOf(Num));
	%>
	Application对象中的<font color="blue">Num</font>变量值为<font color="red"><%= Num %></font>
</body>
</html>
