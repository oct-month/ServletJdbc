<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>JSP page</title>
</head>
<body style="font-size: large;">
	<p>哪种水果富含维生素C：</p>
	<form action="test5.jsp" method="POST">
		<input type="radio" name="Ra" value="a" checked/>苹果
		<input type="radio" name="Ra" value="b"/>土豆
		<input type="radio" name="Ra" value="c"/>黄瓜
		<input type="radio" name="Ra" value="d"/>柠檬<br/>
		<input type="submit" value="提交答案"/>
	</form>
</body>
</html>
