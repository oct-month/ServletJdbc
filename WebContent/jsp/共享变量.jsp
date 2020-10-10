<%@ page contentType="text/html; charset=UTF-8" pageEncoding="utf8"  %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <title>the JSP page</title>
</head>
<body style="font-size: large;">
    <p>JSP页面变量声明示例</p>
    <%! int i=0; %>
    <% ++ i; %>
    <p>您是第 <%= i %> 位访问该页面的用户</p>
</body>
</html>
