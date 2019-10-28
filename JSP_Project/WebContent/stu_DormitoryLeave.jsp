<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<script src="bootstrap/js/jquery.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
<link href="fontawesome/css/all.css" rel="stylesheet">
<link href="css/index.css" rel="stylesheet">
<style>
/* Make the image fully responsive */
.carousel-inner img {
	width: 100%;
	height: 100%;
}
</style>
</head>
<body>
	<<<<<<< HEAD <<<<<<< HEAD
	<div class="container-fluid">
		<!-- Page Content -->
		<div style="margin-left: 20%">

			<div class="row mb-4 ">
				<div class="col-md-7 text-center mx-auto">

					<h2 class="serif">ขออนุญาตลาหอพัก</h2>
				</div>
			</div>

			<div class="row">
				<div class="col-lg-8 mb-5">
					<form action="#" method="post">
						<div class="form-group row">
							<div class="col-md-4 mb-4 mb-lg-0">
								จำนวนวันที่ต้องการลา <select name="amount" id="amount">
									<%
										for (int j = 1; j < 5; j++) {
									%>
									<option value="<%=j%>"><%=j%></option>
									<%
										}
									%>
								</select>
							</div>
							<br>

						</div>

						<div class="form-group row">
							<div class="col-md-4">
								วันที่ต้องการลา<input type="date" name="datestrat">
							</div>
						</div>

						<div class="form-group row">
							<div class="col-md-4">
								วันที่กลับเข้าหอพัก<input type="date" name="dateend">
							</div>
						</div>

						<div class="form-group row">
							<div class="col-md-12">
								รายละเอียดการลา
								<textarea name="" id="" class="form-control"
									placeholder="รายละเอียดข่าวสาร" cols="30" rows="10"></textarea>
							</div>
						</div>

						<div class="form-group row">
							<div class="col-md-4">
								เบอร์ติดต่อกรณีฉุกเฉิน<input type="tel" name="tel">
							</div>
						</div>

					</form>
					<div class="form-group row">
<div class="col-md-3 ">
<input type="submit" class="btn btn-outline-success" value="บันทึก">
</div>
<div class="col-md-3 ">
<input type="reset" class="btn btn-outline-danger" value="ยกเลิก">
</div>
</div>
			</div>
		</div>


	</div>
	

	<script>
		var myIndex = 0;
		carousel();

		function carousel() {
			var i;
			var x = document.getElementsByClassName("mySlides");
			for (i = 0; i < x.length; i++) {
				x[i].style.display = "none";
			}
			myIndex++;
			if (myIndex > x.length) {
				myIndex = 1
			}
			x[myIndex - 1].style.display = "block";
			setTimeout(carousel, 2000); // Change image every 2 seconds
		}
	</script>
	======= >>>>>>> branch 'master' of
	https://github.com/firstmadoka/Project_Web2_6006_6029.git =======
	<div class="vertical-nav bg-white" id="sidebar">
		<div class="py-4 px-3 mb-4 bg-light">
			<div class="media d-flex align-items-center">
				<img
					src="https://res.cloudinary.com/mhmd/image/upload/v1556074849/avatar-1_tcnd60.png"
					alt="..." width="65"
					class="mr-3 rounded-circle img-thumbnail shadow-sm">
				<div class="media-body">
					<h4 class="m-0">Jason Doe</h4>
					<p class="font-weight-light text-muted mb-0">Web developer</p>
				</div>
			</div>
		</div>

		<p
			class="text-gray font-weight-bold text-uppercase px-3 small pb-4 mb-0">Main</p>

		<ul class="nav flex-column bg-white mb-0">
			<li class="nav-item"><a href="stu_index.jsp"
				class="nav-link text-dark font-italic "> <i
					class="fa fa-th-large mr-3 text-primary fa-fw"></i> หน้าแรก
			</a></li>
			<li class="nav-item"><a href="stu_DormitoryData.jsp"
				class="nav-link text-dark font-italic"> <i
					class="fa fa-address-card mr-3 text-primary fa-fw"></i> ข้อมูลหอพัก
			</a></li>
			<li class="nav-item"><a href="stu_CheckName.jsp"
				class="nav-link text-dark font-italic "> <i
					class="fa fa-cubes mr-3 text-primary fa-fw"></i> ตรวจสถานะเช็คชื่อ
			</a></li>
			<li class="nav-item"><a href="stu_DormitoryLeave.jsp"
				class="nav-link text-dark font-italic bg-light"> <i
					class="fa fa-picture-o mr-3 text-primary fa-fw"></i> ขออนุญาตลาหอพัก
			</a></li>
			
			<li class="nav-item"><a href="login.jsp"
				class="nav-link text-dark font-italic"> <i
					class="fa fa-picture-o mr-3 text-primary fa-fw"></i> ออกจากระบบ
			</a></li>
		</ul>

	</div>
	<!-- End vertical navbar -->



	<!-- End demo content -->
	<script type="text/javascript">
		$(function() {
			// Sidebar toggle behavior
			$('#sidebarCollapse').on('click', function() {
				$('#sidebar, #content').toggleClass('active');
			});
		});
	</script>
	>>>>>>> branch 'master' of
	https://github.com/firstmadoka/Project_Web2_6006_6029.git
</body>