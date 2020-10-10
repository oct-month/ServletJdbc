<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>JSP page</title>
</head>
<body style="font-size: large;">
	<form action="test6.jsp" method="get">
		<p>选择计算和的方式：</p>
		<select name="sum">
			<option value="1" selected>计算1到n连续和
			<option value="2">计算1到n的平方和
		</select>
		<p>选择 n 的值：</p>
		<select name="n">
			<option value="10">n=10
			<option value="20">n=20
			<option value="30">n=30
			<option value="40">n=40
		</select>
		<input type="submit" value="提交你的选择"/>
	</form>
</body>
</html>
