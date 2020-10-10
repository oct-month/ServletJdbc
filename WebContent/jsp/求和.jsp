<%@ page contentType="text/html; charset=UTF-8" pageEncoding="utf8"  %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <title>the JSP page</title>
</head>
<body style="font-size: large;">
    <p>JSP 页面求和运算示例</p>
    <%
        int sum=0;
        for (int i=0; i <= 100; ++ i)
        {
            sum += i;
        }
    %>
    <p>1 到 100 的和是：<%= sum %></p>
</body>
</html>
