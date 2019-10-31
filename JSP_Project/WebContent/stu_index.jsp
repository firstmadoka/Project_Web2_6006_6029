<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*,bean.*,controller.*,java.text.*"%>
<% Login login = (Login) session.getAttribute("login"); 
	ProjectManager pjm = new ProjectManager();
	People people = pjm.getPeopleByID(login.getUsername());
	List<News> newss = pjm.getNewsByDomitory(people.getDomitory().getDomitoryid());
%>
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
	<div style="margin-left: 20%">


		<div class="container">
			<div class="row mb-5 ">
				<div class="col-md-7 text-center mx-auto">

					<h2 class="serif">News</h2>
				</div>
			</div>

			<div class="row">
				<%for(News n : newss){ %>
				<div class="col-md-6">
					<div class="post-entry-1 h-100">
						<a href="AcNews?newsid=<%= n.getNewsid() %>"> <img src="img/d2.jpg" alt="Image"
							class="img-fluid">
						</a>
						<div class="post-entry-1-contents">

							<h2>
								<a href="AcNews?newsid=<%= n.getNewsid() %>"><%= n.getNewsid() %><%= n.getNewstitle() %></a>
							</h2>
							<span class="meta d-inline-block mb-3"><%= n.getNewscreated().getTime() %>
								<span class="mx-2">by</span> <a href="#"><%= n.getPeople().getPeoplefirstname() %></a></span>
							<p><%= n.getNewsdiscription() %>
							</p>
						</div>
					</div>
				</div>
				<% } %>
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
					<div class="media-body">
						<h4 class="m-0"><%=people.getPeoplefirstname() %>
							<%= people.getPeoplelastname() %></h4>
						<p class="font-weight-light text-muted mb-0"><%= people.getType().getTypedetail() %>,<%=people.getDomitory().getDomitoryname() %></p>
					</div>
				</div>
			</div>

			<p
				class="text-gray font-weight-bold text-uppercase px-3 small pb-4 mb-0">Main</p>

			<ul class="nav flex-column bg-white mb-0">
				<li class="nav-item"><a href="#"
					class="nav-link text-dark font-italic bg-light"> <i
						class="fa fa-th-large mr-3 text-primary fa-fw"></i> หน้าแรก
				</a></li>
				<li class="nav-item"><a href="stu_DormitoryData.jsp"
					class="nav-link text-dark font-italic"> <i
						class="fa fa-address-card mr-3 text-primary fa-fw"></i>
						ข้อมูลหอพัก
				</a></li>
				<li class="nav-item"><a href="stu_CheckName.jsp"
					class="nav-link text-dark font-italic"> <i
						class="fa fa-cubes mr-3 text-primary fa-fw"></i> ตรวจสถานะเช็คชื่อ
				</a></li>
				<li class="nav-item"><a href="stu_DormitoryLeave.jsp"
					class="nav-link text-dark font-italic"> <i
						class="fa fa-picture-o mr-3 text-primary fa-fw"></i>
						ขออนุญาตลาหอพัก
				</a></li>

				<li class="nav-item"><a href="login.jsp"
					class="nav-link text-dark font-italic"> <i
						class="fa fa-picture-o mr-3 text-primary fa-fw"></i> ออกจากระบบ
				</a></li>
			</ul>

			<!-- <ul class="nav flex-column bg-white mb-0">
			<li class="nav-item"><a href="#"
				class="nav-link text-dark font-italic"> <i
					class="fa fa-area-chart mr-3 text-primary fa-fw"></i> Area charts
			</a></li>
			<li class="nav-item"><a href="#"
				class="nav-link text-dark font-italic"> <i
					class="fa fa-bar-chart mr-3 text-primary fa-fw"></i> Bar charts
			</a></li>
			<li class="nav-item"><a href="#"
				class="nav-link text-dark font-italic"> <i
					class="fa fa-pie-chart mr-3 text-primary fa-fw"></i> Pie charts
			</a></li>
			<li class="nav-item"><a href="#"
				class="nav-link text-dark font-italic"> <i
					class="fa fa-line-chart mr-3 text-primary fa-fw"></i> Line charts
			</a></li>
		</ul> -->
		</div>
		<!-- End vertical navbar -->



		<script type="text/javascript">
		$(function() {
			// Sidebar toggle behavior
			$('#sidebarCollapse').on('click', function() {
				$('#sidebar, #content').toggleClass('active');
			});
		});
	</script>
</body>
</html>