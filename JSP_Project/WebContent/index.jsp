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
<div class="container-fluid">

	<h2 class="w3-center">Automatic Slideshow</h2>

	<div class="w3-content w3-section" style="max-width: 500px">

		<img class="mySlides" src="img/a1.jpg" style="width: 100%"> <img
			class="mySlides" src="img/a2.jpg" style="width: 100%"> <img
			class="mySlides" src="img/a3.jpg" style="width: 100%">
=======
	<div id="demo" class="carousel slide" data-ride="carousel">
  		<ul class="carousel-indicators">
    		<li data-target="#demo" data-slide-to="0" class="active"></li>
    		<li data-target="#demo" data-slide-to="1"></li>
    		<li data-target="#demo" data-slide-to="2"></li>
  		</ul>
  		<div class="carousel-inner">
    		<div class="carousel-item active">
      			<img src="img/a1.jpg" alt="Los Angeles" width="1100" height="500">
      			<div class="carousel-caption">
        			<h3>Los Angeles</h3>
        			<p>We had such a great time in LA!</p>
      			</div>   
    		</div>
    		<div class="carousel-item">
      			<img src="img/a2.jpg" alt="Chicago" width="1100" height="500">
      			<div class="carousel-caption">
        			<h3>Chicago</h3>
        			<p>Thank you, Chicago!</p>
      			</div>   
    		</div>
    		<div class="carousel-item">
      			<img src="img/a3.jpg" alt="New York" width="1100" height="500">
      			<div class="carousel-caption">
        			<h3>New York</h3>
        			<p>We love the Big Apple!</p>
      			</div>   
    		</div>
  		</div>
  		<a class="carousel-control-prev" href="#demo" data-slide="prev">
    		<span class="carousel-control-prev-icon"></span>
  		</a>
  		<a class="carousel-control-next" href="#demo" data-slide="next">
    		<span class="carousel-control-next-icon"></span>
  		</a>
>>>>>>> branch 'master' of https://github.com/firstmadoka/Project_Web2_6006_6029.git
	</div>
<<<<<<< HEAD

	<!-- Sidebar -->
	<div class="w3-sidebar w3-light-grey w3-bar-block" style="width: 25%">
		<h3 class="w3-bar-item">Menu</h3>
		<a href="#" class="w3-bar-item w3-button">หน้าแรก</a> <a href="#"
			class="w3-bar-item w3-button">ข้อมูลหอพัก</a> <a href="#"
			class="w3-bar-item w3-button">ตรวจสอบสถานะเช็คชื่อ</a> <a href="#"
			class="w3-bar-item w3-button">ขออนุญาตลาหอพัก</a> <a href="#"
			class="w3-bar-item w3-button">ออกจากระบบ</a>
	</div>

	<!-- Page Content -->
	<div style="margin-left: 25%">

		<div class="w3-container w3-teal">
			<h1>หน้าแรก</h1>
		</div>
			
			<div class="row">
				<div class="col-sm-4">
					<img src="img_car.jpg" alt="Car" style="width: 100%">

					
						<h2>Sidebar Navigation Example</h2>
						<p>The sidebar with is set with "style="width:25%".</p>
						<p>The left margin of the page content is set to the same
							value.</p>
				</div>
				div class="col-sm-4">
					<img src="img_car.jpg" alt="Car" style="width: 100%">

					
						<h2>Sidebar Navigation Example</h2>
						<p>The sidebar with is set with "style="width:25%".</p>
						<p>The left margin of the page content is set to the same
							value.</p>
				</div>
				div class="col-sm-4">
					<img src="img_car.jpg" alt="Car" style="width: 100%">

					
						<h2>Sidebar Navigation Example</h2>
						<p>The sidebar with is set with "style="width:25%".</p>
						<p>The left margin of the page content is set to the same
							value.</p>
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
</body>
</html>