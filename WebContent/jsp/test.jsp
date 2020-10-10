<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:useBean id="add" scope="page" class="beans.AddClass">
	<jsp:setProperty name="add" property="*"/>
</jsp:useBean>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>JSP page</title>
</head>
<body style="font-size: large;">
	Result=:
	<%
	add.calculate();
	out.println(add.getFirst() + " + " + add.getSecond() + " + " + add.getThird() + " = " + add.getResult());
	%>
	<form action="#" method="get">
		<input type="text" name="first"/><br/>
		<input type="text" name="second"/><br/>
		<input type="text" name="third"/><br/>
		<input type="submit" value="计算和"/>
	</form>
</body>
</html>
