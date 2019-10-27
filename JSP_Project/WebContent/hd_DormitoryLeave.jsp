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

table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 50%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>
<link rel="stylesheet" type="text/css" href="css/util.css">
<link rel="stylesheet" type="text/css" href="css/main.css">
</head>
<body>
	<<<<<<< HEAD <<<<<<< HEAD
	<div class="container-fluid">



		<div style="margin-left: 20%">
			<div class="site-section">
				<div class="container">

					<div class="row" align="center">
						<div class="col-lg-12">

							<h2>  จัดการการลาหอพักของนักศึกษา </h2>

<form action="#" method="post">

								<div class="form-group row">
									<div class="col-md-4 ">

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
									<p> หมายเลขห้อง </p>
									&nbsp; &nbsp; &nbsp;
									<div class="form-group row">
										<div class="col-md-12">
											<input type="text" class="form-control"
												placeholder="รหัสนักศึกษา">
										
										</div>
										
									</div>
									<div class="col-md-3 ">
<input type="submit" class="btn btn-success" value="ส่ง">
</div>

								</div>
								
								</form>






							<form action="#" method="post">

								<div class="form-group row">
									<table align="center">
										<thead>
											<tr class="table100-head">
												<th> รหัสนักศึกษา </th>
												<th> วันที่ลาหอพัก </th>
												<th> วันที่กลับหอพัก </th>
												<th> เวลาที่ยื่นขอลา </th>
												<th> การอนุญาติลาหอพัก </th>
											</tr>
										</thead>
										<tr>
											<td>Alfreds Futterkiste</td>
											<td>Maria Anders</td>
											<td>Germany</td>
											<td>Italy</td>
											<td>
											<a href="url"> ตรวจสอบข้อมูล </a>
											<input type="submit" class="btn btn-success " value="อนุญาต"  >
											<input type="submit" class="btn btn-info"  value="ไม่อนุญาต"  >
											</td>
										</tr>
										
									</table>
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
	======= =======
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
						class="nav-link text-dark font-italic "> <i
							class="fa fa-cubes mr-3 text-primary fa-fw"></i>
							จัดการสถานะของนักศึกษา
					</a></li>
					<li class="nav-item"><a href="#"
						class="nav-link text-dark font-italic bg-light"> <i
							class="fa fa-picture-o mr-3 text-primary fa-fw"></i>
							จัดการการลาหอพักของนักศึกษา
					</a></li>
					<li class="nav-item"><a href="#"
						class="nav-link text-dark font-italic"> <i
							class="fa fa-picture-o mr-3 text-primary fa-fw"></i> จัดการข่าวสาร
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