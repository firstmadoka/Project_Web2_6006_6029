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
<div class="container-fluid">

	


	
=======
	
<<<<<<< HEAD


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
=======
>>>>>>> branch 'master' of https://github.com/firstmadoka/Project_Web2_6006_6029.git
=======
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
    <li class="nav-item">
      <a href="#" class="nav-link text-dark font-italic bg-light">
                <i class="fa fa-th-large mr-3 text-primary fa-fw"></i>
                Home
            </a>
    </li>
    <li class="nav-item">
      <a href="#" class="nav-link text-dark font-italic">
                <i class="fa fa-address-card mr-3 text-primary fa-fw"></i>
                About
            </a>
    </li>
    <li class="nav-item">
      <a href="#" class="nav-link text-dark font-italic">
                <i class="fa fa-cubes mr-3 text-primary fa-fw"></i>
                Services
            </a>
    </li>
    <li class="nav-item">
      <a href="#" class="nav-link text-dark font-italic">
                <i class="fa fa-picture-o mr-3 text-primary fa-fw"></i>
                Gallery
            </a>
    </li>
  </ul>

  <p class="text-gray font-weight-bold text-uppercase px-3 small py-4 mb-0">Charts</p>

  <ul class="nav flex-column bg-white mb-0">
    <li class="nav-item">
      <a href="#" class="nav-link text-dark font-italic">
                <i class="fa fa-area-chart mr-3 text-primary fa-fw"></i>
                Area charts
            </a>
    </li>
    <li class="nav-item">
      <a href="#" class="nav-link text-dark font-italic">
                <i class="fa fa-bar-chart mr-3 text-primary fa-fw"></i>
                Bar charts
            </a>
    </li>
    <li class="nav-item">
      <a href="#" class="nav-link text-dark font-italic">
                <i class="fa fa-pie-chart mr-3 text-primary fa-fw"></i>
                Pie charts
            </a>
    </li>
    <li class="nav-item">
      <a href="#" class="nav-link text-dark font-italic">
                <i class="fa fa-line-chart mr-3 text-primary fa-fw"></i>
                Line charts
            </a>
    </li>
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
>>>>>>> branch 'master' of https://github.com/firstmadoka/Project_Web2_6006_6029.git
</body>
