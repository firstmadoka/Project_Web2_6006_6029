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
<<<<<<< HEAD
<<<<<<< HEAD
<div class="container-fluid" >
		<!-- Page Content -->
		<div style="margin-left: 20%">

			<div class="site-section" >
<div class="container"  >
<div class="row mb-4 ">
<div class="col-md-7 text-center mx-auto">

<h2 class="serif"> เพิ่มนักศึกษาเข้าหอพัก </h2>
</div>
</div>
<div class="row">
<div class="col-lg-8 mb-5" >
<form action="#" method="post" >

<div class="form-group row" >
<div class="col-md-4 mb-4 mb-lg-0"  >
รหัสนักศึกษา <input type="text" class="form-control" placeholder=" รหัสนักศึกษา " >
</div>
</div>

<div class="form-group row" >
<div class="col-md-4 mb-4 mb-lg-0"  >
 ชื่อ <input type="text" class="form-control" placeholder=" ชื่อจริง " >
</div>
 
</div>

<div class="form-group row" >
<div class="col-md-4 mb-4 mb-lg-0"  >
นามสกุล <input type="text" class="form-control" placeholder=" นามสกุล " >
</div>
</div>

<div class="form-group row">
<div class="col-md-4">
วัน/เดือน/ปีเกิด <input type="date" class="form-control" placeholder="">
</div>
</div>

<div class="form-group row" >
<div class="col-md-4 mb-4 mb-lg-0"  >
เพศ <input type="radio" name="gender" value="male" checked> Male
  <input type="radio" name="gender" value="female"> Female<br>
</div>
 
</div>

<div class="form-group row" >
<div class="col-md-4 mb-4 mb-lg-0"  >
เบอร์ติดต่อ <input type="tel" class="form-control" placeholder=" เบอร์ติดต่อ " >
</div>
</div>

<div class="form-group row" >
<div class="col-md-4 mb-4 mb-lg-0"  >
คณะที่ศึกษา <input type="text" class="form-control" placeholder=" ชื่อคณะ " >
</div>
</div>

<div class="form-group row" >
<div class="col-md-4 mb-4 mb-lg-0"  >
สาขาที่ศึกษา <input type="text" class="form-control" placeholder=" ชื่อสาขา " >
</div>
</div>

<div class="form-group row">
<div class="col-md-12">
ที่อยู่ <textarea name="" id="" class="form-control" placeholder="รายละเอียดข่าวสาร" cols="10" rows="10"></textarea>
</div>
</div>

<div class="form-group row">
							<div class="col-md-4 mb-4 mb-lg-0">
								ชื่อหอพัก <select name="amount" id="amount">
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

<div class="form-group row" >
<div class="col-md-4 mb-4 mb-lg-0"  >
หมายเลขห้อง <input type="text" class="form-control" placeholder=" หมายเลขห้อง " >
</div>
</div>

<div class="form-group row">
<div class="col-md-12">
เพิ่มรูปภาพนักศึกษา  &nbsp; <input type="file"  placeholder="">
</div>
</div>
<div class="form-group row">
<div class="col-md-3 ">
<input type="submit" class="btn btn-success" value=" บันทึก ">
</div>
<div class="col-md-3 ">
<input type="reset" class="btn btn-success" value=" เคลียร์ ">
</div>
</div>


</form>
</div>

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

	<div class="vertical-nav bg-white" id="sidebar">
  <div class="py-4 px-3 mb-4 bg-light">
    <div class="media d-flex align-items-center">
    <img src="https://res.cloudinary.com/mhmd/image/upload/v1556074849/avatar-1_tcnd60.png" alt="..." width="65" class="mr-3 rounded-circle img-thumbnail shadow-sm">
      <div class="media-body">
        <h4 class="m-0">Jason Doe</h4>
        <p class="font-weight-light text-muted mb-0">Web developer</p>
      </div>
    </div>
  </div>

  <p class="text-gray font-weight-bold text-uppercase px-3 small pb-4 mb-0">Main</p>

  <ul class="nav flex-column bg-white mb-0">
					<li class="nav-item"><a href="#"
						class="nav-link text-dark font-italic "> <i
							class="fa fa-th-large mr-3 text-primary fa-fw"></i> หน้าแรก
					</a></li>
					<li class="nav-item"><a href="#"
						class="nav-link text-dark font-italic "> <i
							class="fa fa-address-card mr-3 text-primary fa-fw"></i>
							ข้อมูลหอพัก
					</a></li>
					<li class="nav-item"><a href="#"
						class="nav-link text-dark font-italic"> <i
							class="fa fa-cubes mr-3 text-primary fa-fw"></i>
							จัดการสถานะของนักศึกษา
					</a></li>
					<li class="nav-item"><a href="#"
						class="nav-link text-dark font-italic"> <i
							class="fa fa-picture-o mr-3 text-primary fa-fw"></i>
							จัดการการลาหอพักของนักศึกษา
					</a></li>
					<li class="nav-item"><a href="#"
						class="nav-link text-dark font-italic"> <i
							class="fa fa-picture-o mr-3 text-primary fa-fw"></i> จัดการข่าวสาร
					</a></li>
					<li class="nav-item"><a href="#"
						class="nav-link text-dark font-italic bg-light"> <i
							class="fa fa-picture-o mr-3 text-primary fa-fw"></i> เพิ่มนักศึกษาเข้าหอพัก
					</a></li>
					
					<li class="nav-item"><a href="#"
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

</body>
