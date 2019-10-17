<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  
  
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet"
	type="text/css">
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta content="text/html; charset=UTF-8" http-equiv="Content-Type">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<style>
.mySlides {
	display: none;
}
</style>
</head>
<body>
	<div class="container-fluid">

		<!-- Sidebar -->
		<div class="w3-sidebar w3-light-grey w3-bar-block" style="width: auto">
			<h3 class="w3-bar-item">Menu</h3>
			<a href="#" class="w3-bar-item w3-button">หน้าแรก</a> <a href="#"
				class="w3-bar-item w3-button">ข้อมูลหอพัก</a> <a href="#"
				class="w3-bar-item w3-button">ตรวจสอบสถานะเช็คชื่อ</a> <a href="#"
				class="w3-bar-item w3-button">ขออนุญาตลาหอพัก</a> <a href="#"
				class="w3-bar-item w3-button">ออกจากระบบ</a>
		</div>

		<!-- Page Content -->
		<div style="margin-left: 20%">

			<div class="w3-container w3-teal">
				<h1>ขออนุญาตลาหอพัก</h1>
			</div>

			<div class="row">
				<div class="col-sm-4">
					<form action="">
						<table>
							<tr>
							<td>จำนวนวันที่ต้องการลา 
							<select name="amount" id="amount">
									<%
										for (int j = 1; j < 5; j++) {
									%>
									<option value="<%=j%>"><%=j%></option>
									<%
										}
									%>
							</select>
							</td>

							</tr>
							<tr>
							<td>วันที่ต้องการลา </td> 
							<td><input type="date" name="datestrat"></td>
							</tr>
							<tr>
							<td>วันที่กลับเข้าหอพัก </td> 
							<td><input type="date" name="dateend"></td>
							</tr>
							<tr>
							<td>รายละเอียดการลา </td> 
							<td>
							<textarea name="detail" rows="5" cols="15"></textarea>
							</td>
							</tr>
							<tr>
							<td>วันที่กลับเข้าหอพัก </td> 
							<td><input type="tel" name="tel"></td>
							</tr>
							
						
						</table>
					</form>
							<input type="button" value="ส่ง">
							
							<input type="button" value="ยกเลิก">
				</div>

			</div>
		</div>

	</div>

	
</body>
</html>