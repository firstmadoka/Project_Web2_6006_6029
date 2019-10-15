<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import="bean.*" %>
    <% Login login =(Login) session.getAttribute("login"); 
			if(null == login){
				response.sendRedirect("index.jsp");
			}else{ 
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		Main 1<br>
		Hello <%= login.getUsername() %>
		<a href="Loginservlet">Logout</a>
	</div>
</body>
</html>
<% } %>