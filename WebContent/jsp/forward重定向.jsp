<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body style="font-size: large;">
	<%
	request.setCharacterEncoding("utf-8");
	response.setCharacterEncoding("utf-8");
	%>
	<jsp:forward page="test3.jsp">
		<jsp:param name="name" value="a大茄子"/>
		<jsp:param name="address" value="b住在山里真不错"/>
	</jsp:forward>
</body>
</html>
