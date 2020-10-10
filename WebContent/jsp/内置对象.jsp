<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>JSP page</title>
</head>
<body style="font-size: large;">
	<br/>客户使用的协议是：
	<%
	String protocol = request.getProtocol();
	out.println(protocol);
	%>
	<br/>浏览器支持的编码类型：
	<%
	String acceptEncoding = request.getHeader("accept-encoding");
	out.println(acceptEncoding);
	%>
	<br/>客户的IP地址：
	<%
	String ip = request.getRemoteAddr();
	out.println(ip);
	%>
	<br/>客户机的名字：
	<%
	String clientName = request.getRemoteHost();
	out.println(clientName);
	%>
	<br/>服务器的名称：
	<%
	String serverName = request.getServerName();
	out.println(serverName);
	%>
	<br/>服务器的端口号：
	<%
	int serverPort = request.getServerPort();
	out.println(serverPort);
	%>
	<br/>客户提交信息的页面路径：
	<%
	String path = request.getServletPath();
	out.println(path);
	%>
	<br/>客户提交信息的长度：
	<%
	int length = request.getContentLength();
	out.println(length);
	%>
	<br/>客户提交信息的方式：
	<%
	String method = request.getMethod();
	out.println(method);
	%>
	<br/>HTTP头文件中User-Agent的值：
	<%
	String header1 = request.getHeader("User-Agent");
	out.println(header1);
	%>
	<br/>HTTP头文件中Accept的值：
	<%
	String header2 = request.getHeader("accept");
	out.println(header2);
	%>
	<br/>HTTP头文件中Host的值：
	<%
	String header3 = request.getHeader("Host");
	out.println(header3);
	%>
</body>
</html>
