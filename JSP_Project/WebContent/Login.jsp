<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <% String error = (String) request.getAttribute("error"); 
    Cookie[] cookies = request.getCookies();
    String uname="";
    String pwd="";
    try{
    	for(int i=0;i<cookies.length;i++){
    		if("uname".equals(cookies[i].getName())){
    			uname = cookies[i].getValue();
    		}
    		if("pwd".equals(cookies[i].getName())){
    			pwd = cookies[i].getValue();
    		}
    	}
    }catch(Exception e){
    	
    }
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="fontawesome/css/all.css">
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/login.css">
<title>ระบบหอพักมหาวิทยาลัยแม่โจ้</title>
</head>
<body>
	<div class="container">
		<div class="d-flex justify-content-center h-100">
			<div class="card">
				<div class="card-header">
					<h3>ลงชื่อเข้าใช้ระบบหอพักมหาวิทยาลัยแม่โจ้</h3>
				</div>
				<div class="card-body">
					<form name="frm" action="Loginservlet" method="post">
						<div class="input-group form-grop">
							<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-user"></i></span>
							</div>
							<input type="text" class="form-control" name="uname" value="<%= uname%>" placeholder="username">
						</div>
						<div class="input-group form-grop">
							<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-key"></i></span>
							</div>
							<input type="password" class="form-control" name="pwd" value="<%= pwd%>" placeholder="password">
						</div>
						<div class="row align-items-center remember">
							<input type="checkbox" class="form-control" name="remember" value="1" id="us1" onclick="check()">remember Me
						</div>
						<div class="form-group">
							<input type="submit" value="login" class="btn float-right login_btn">
							<% if (null != error) { %>
								<span class="errer"><%= error %></span>
							<% } %>
						</div>
					</form>
				</div>
				<div class="card-footer">
					<div class="d-flex justtify-content-center">
						<a href="#">Forgot your password</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>