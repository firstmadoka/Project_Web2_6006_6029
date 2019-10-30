<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*,bean.*,controller.*,java.text.*"%>
    <% News news = (News) request.getAttribute("news");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=news.getNewsid() %>
<%=news.getNewstitle() %>
</body>
</html>