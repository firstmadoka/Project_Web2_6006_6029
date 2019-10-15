<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <% String error = (String) request.getAttribute("error");
    	String uname = "";
    	String pwd = "";
    	
    	Cookie[] cookies = request.getCookies();
    	if(cookies != null){
    		for(int i = 0; i<cookies.length; i++) {
    			if("uname".equals(cookies[i].getName())){
    				uname = cookies[i].getValue();
    			}
    		
    			if("pwd".equals(cookies[i].getName())){
    				pwd = cookies[i].getValue();
    			}
    		}
    	}else{
    
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
 	function check(){
 		if(document.getElementById('us1').checked == 1){
 			document.getElementById('us2').disabled = true ;
 		}else{
 			document.getElementById('us2').disabled = false ;
 		}
 	}
 	function check2(){
 		if(document.getElementById('us2').checked == 1){
 			document.getElementById('us1').disabled = true ;
 		}else{
 			document.getElementById('us1').disabled = false ;
 		}
 	}
 	 </script>
</head>
<body>
<form name="frm" action="Loginservlet" method="post">
username : <input type="text" name="uname" value="<%= uname%>" > <br>
password : <input type="password" name="pwd" value="<%= pwd%>"> <br>
<input type="checkbox" name="remember" value="1" id="us1" onclick="check()">remember username & password<br>

<input type="checkbox" name="remember" value="2" id="us2" onclick="check2()">remember  only username <br>

<input type="submit" value="login"><br>
<% if (null != error) { %>
<%= error %>
<% } %>
</form>

</body>
</html>
<% } %>