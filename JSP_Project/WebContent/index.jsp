<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">
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

	<h2 class="w3-center">Automatic Slideshow</h2>

	<div class="w3-content w3-section" style="max-width: 500px">

		<img class="mySlides" src="img/a1.jpg" style="width: 100%"> <img
			class="mySlides" src="img/a2.jpg" style="width: 100%"> <img
			class="mySlides" src="img/a3.jpg" style="width: 100%">
	</div>

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
</body>
</html>