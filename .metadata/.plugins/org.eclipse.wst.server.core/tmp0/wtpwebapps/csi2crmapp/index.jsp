<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="mipk.beanDB"%>
<html><head>
    
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:300,400">  <!-- Google web font "Open Sans" -->
	<link rel="stylesheet" href="css/fontawesome-all.min.css">
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/magnific-popup.css"/>
	<link rel="stylesheet" type="text/css" href="slick/slick.css"/>
	<link rel="stylesheet" type="text/css" href="slick/slick-theme.css"/>
	<link rel="stylesheet" href="css/tooplate-style.css">
    <!-- Custom CSS -->
    <style>
    body {
        padding-top: 70px;
        /* Required padding for .navbar-fixed-top. Remove if using .navbar-static-top. Change if height of navigation changes. */
    }
    </style>
<script>
		var renderPage = true;

	if(navigator.userAgent.indexOf('MSIE')!==-1
		|| navigator.appVersion.indexOf('Trident/') > 0){
   		/* Microsoft Internet Explorer detected in. */
   		alert("Please view this in a modern browser such as Chrome or Microsoft Edge.");
   		renderPage = false;
	}
	</script>

</head><body>
<br/>
<!---
<form action="BBDD" method="get">
       <table class="Primary">
            <tr>
                <td>
                   <div class="row-g3">
                    <label class="form-label">Query</label>
                    <input type="text" class="form-control" id="laQuery" placeholder="Ej: Select * From Alumnos;" >
                  </div> 
                </td>
                <td>
                     <div class="row-g3">
    <button type="submit" class="btn btn-primary mb-3">Ejecutar</button>
  </div>
                </td>
            </tr>
        </table>
    </form>
-->
<!-- Loader -->
	<div id="loader-wrapper">
		<div id="loader"></div>
		<div class="loader-section section-left"></div>
		<div class="loader-section section-right"></div>
	</div>
	
	<!-- Page Content -->
	<div class="container-fluid tm-main">
		<div class="row tm-main-row">

			<!-- Sidebar -->
			<div id="tmSideBar" class="col-xl-3 col-lg-4 col-md-12 col-sm-12 sidebar">

				<button id="tmMainNavToggle" class="menu-icon">&#9776;</button>

				<div class="inner">
					<nav id="tmMainNav" class="tm-main-nav">
						<ul>
							<li>
								<a href="#intro" id="tmNavLink1" class="scrolly active" data-bg-img="constructive_bg_01.jpg" data-page="#tm-section-1">
									<i class="fas fa-home tm-nav-fa-icon"></i>
									<span>Introduction</span>
								</a>
							</li>
							<li>
								<a href="#products" id="tmNavLink2" class="scrolly" data-bg-img="constructive_bg_02.jpg" data-page="#tm-section-2" data-page-type="carousel">
									<i class="fas fa-map tm-nav-fa-icon"></i>
									<span>Listado De Asignaturas</span>
								</a>
							</li>							
							<li>
								<a href="#company" class="scrolly" data-bg-img="constructive_bg_03.jpg" data-page="#tm-section-3">
									<i class="fas fa-users tm-nav-fa-icon"></i>
									<span>Listado de Alumnos</span>
								</a>
							</li>
							<li>
								<a href="#contact" class="scrolly" data-bg-img="constructive_bg_04.jpg" data-page="#tm-section-4">
									<i class="fas fa-comments tm-nav-fa-icon"></i>
									<span>Contact Us</span>
								</a>
							</li>
						</ul>
					</nav>
				</div>
			</div>

			<div class="col-xl-9 col-lg-8 col-md-12 col-sm-12 tm-content">

					<!-- section 1 -->
					<section id="tm-section-1" class="tm-section">
						<div class="ml-auto">
							<header class="mb-4"><h1 class="tm-text-shadow">Constructive Design</h1></header>
							<p class="mb-5 tm-font-big">Aenean fermentum vestibulum ipsum, ut pretium erat sodales sodales. Pellentesque quis orci vitae dui commodo sodales et ut quam. Etiam vitae egestas purus, ut malesuada enim.</p>
							<a href="#" class="btn tm-btn tm-font-big" data-nav-link="#tmNavLink2">Continue...</a> 
							<!-- data-nav-link holds the ID of nav item, which means this link should behave the same as that nav item  -->
						</div>
					</section>

					<!-- section 2 -->
					<section id="tm-section-2" class="tm-section tm-section-carousel">
						<div>
							<header class="mb-4"><h2 class="tm-text-shadow">Listado De Asignaturas</h2></header>		            
							<div class="tm-img-container">
							<% 
							String query="Select * FROM Asignaturas;";
							//String query="select * from Asignaturas;";
beanDB basededatos = new beanDB();
String [][] tablares = basededatos.resConsultaSelectA3(query);
%> 
<table class="table table-dark table-striped"">
<% for (int i=0; i<tablares.length;i++) {
//	%><tr> <%
	for (int j=0; j<tablares[i].length;j++) {
	%> <td> <%=tablares[i][j] %> </td> <%
	}
	%> </tr> <%
}
%>
</table>
</div>
							</div>		            		          
						</div>       		          	
					</section>

					<!-- section 3 -->
					<section id="tm-section-3" class="tm-section tm-section-carousel">						
						<div class="row mb-4">
							<header class="col-xl-12"><h2 class="tm-text-shadow">Listado De Alumnos</h2></header>		
						<div class="tm-img-container">
													<% 
String queryAlumnos="select * from Alumnos;";
String [][] tablaAlumnos = basededatos.resConsultaSelectA3(queryAlumnos);
%> 
<table class="table table-dark table-striped"">
<% for (int i=0; i<tablaAlumnos.length;i++) {
//	%><tr> <%
	for (int j=0; j<tablaAlumnos[i].length;j++) {
	%> <td> <%=tablaAlumnos[i][j] %> </td> <%
	}
	%> </tr> <%
}
%>
</table>
</div>				
</div>		               
					</section>

					<!-- section 4 -->
					<section id="tm-section-4" class="tm-section">
						<div class="tm-bg-transparent-black tm-contact-box-pad">
							<div class="row mb-4">
								<div class="col-sm-12">
									<header><h2 class="tm-text-shadow">Contact Us</h2></header>
								</div>
							</div>
							<div class="row tm-page-4-content">
								<div class="col-md-6 col-sm-12 tm-contact-col">
									<div class="contact_message">
										<form action="#contact" method="post" class="contact-form">
											<div class="form-group">
												<input type="text" id="contact_name" name="contact_name" class="form-control" placeholder="Name" required>
											</div>
											<div class="form-group">
												<input type="email" id="contact_email" name="contact_email" class="form-control" placeholder="Email" required>
											</div>
											<div class="form-group">
												<textarea id="contact_message" name="contact_message" class="form-control" rows="9" placeholder="Message" required></textarea>
											</div>
											<button type="submit" class="btn tm-btn-submit tm-btn ml-auto">Submit</button>
										</form>
									</div>
								</div>
								<div class="col-md-6 col-sm-12 tm-contact-col">
									<div class="tm-address-box">
										<p>Aliquam interdum, nisl sedd faucibus tempor, massa velit laoreet ipsum, et faucibus sapien magna at enim. Suspendisse a dictum tortor.</p>
										<p>Curabitur venenatis leo in augue convallis, vulputate sollicitudin ex maximus.</p>
										<address>
											120-240 Aliquam nec neque augue<br>
											Suspendisse tincidunt nunc,<br>
											vitae sagis justo 11000
										</address>
									</div>
								</div>
							</div>
						</div>
					</section>					
				</div>	<!-- .tm-content -->							
				
			</div>	<!-- row -->			
		</div>
		<div id="preload-01"></div>
		<div id="preload-02"></div>
		<div id="preload-03"></div>
		<div id="preload-04"></div>

		<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
		<script type="text/javascript" src="js/jquery.magnific-popup.min.js"></script>
		<script type="text/javascript" src="js/jquery.backstretch.min.js"></script>
		<script type="text/javascript" src="slick/slick.min.js"></script> <!-- Slick Carousel -->

		<script>

		var sidebarVisible = false;
		var currentPageID = "#tm-section-1";

		// Setup Carousel
		function setupCarousel() {

			// If current page isn't Carousel page, don't do anything.
			if($('#tm-section-2').css('display') == "none") {
			}
			else {	// If current page is Carousel page, set up the Carousel.

				var slider = $('.tm-img-slider');
				var windowWidth = $(window).width();

				if (slider.hasClass('slick-initialized')) {
					slider.slick('destroy');
				}

				if(windowWidth < 640) {
					slider.slick({
	              		dots: true,
	              		infinite: false,
	              		slidesToShow: 1,
	              		slidesToScroll: 1
	              	});
				}
				else if(windowWidth < 992) {
					slider.slick({
	              		dots: true,
	              		infinite: false,
	              		slidesToShow: 2,
	              		slidesToScroll: 1
	              	});
				}
				else {
					// Slick carousel
	              	slider.slick({
	              		dots: true,
	              		infinite: false,
	              		slidesToShow: 3,
	              		slidesToScroll: 2
	              	});
				}

				// Init Magnific Popup
				$('.tm-img-slider').magnificPopup({
				  delegate: 'a', // child items selector, by clicking on it popup will open
				  type: 'image',
				  gallery: {enabled:true}
				  // other options
				});
      		}
  		}

  		// Setup Nav
  		function setupNav() {
  			// Add Event Listener to each Nav item
	     	$(".tm-main-nav a").click(function(e){
	     		e.preventDefault();
		    	
		    	var currentNavItem = $(this);
		    	changePage(currentNavItem);
		    	
		    	setupCarousel();
		    	setupFooter();

		    	// Hide the nav on mobile
		    	$("#tmSideBar").removeClass("show");
		    });	    
  		}

  		function changePage(currentNavItem) {
  			// Update Nav items
  			$(".tm-main-nav a").removeClass("active");
     		currentNavItem.addClass("active");

	    	$(currentPageID).hide();

	    	// Show current page
	    	currentPageID = currentNavItem.data("page");
	    	$(currentPageID).fadeIn(1000);

	    	// Change background image
	    	var bgImg = currentNavItem.data("bgImg");
	    	$.backstretch("img/" + bgImg);		    	
  		}

  		// Setup Nav Toggle Button
  		function setupNavToggle() {

			$("#tmMainNavToggle").on("click", function(){
				$(".sidebar").toggleClass("show");
			});
  		}

  		// If there is enough room, stick the footer at the bottom of page content.
  		// If not, place it after the page content
  		function setupFooter() {
  			
  			var padding = 100;
  			var footerPadding = 40;
  			var mainContent = $("section"+currentPageID);
  			var mainContentHeight = mainContent.outerHeight(true);
  			var footer = $(".footer-link");
  			var footerHeight = footer.outerHeight(true);
  			var totalPageHeight = mainContentHeight + footerHeight + footerPadding + padding;
  			var windowHeight = $(window).height();		

  			if(totalPageHeight > windowHeight){
  				$(".tm-content").css("margin-bottom", footerHeight + footerPadding + "px");
  				footer.css("bottom", footerHeight + "px");  			
  			}
  			else {
  				$(".tm-content").css("margin-bottom", "0");
  				footer.css("bottom", "20px");  				
  			}  			
  		}

  		// Everything is loaded including images.
      	$(window).on("load", function(){

      		// Render the page on modern browser only.
      		if(renderPage) {
				// Remove loader
		      	$('body').addClass('loaded');

		      	// Page transition
		      	var allPages = $(".tm-section");

		      	// Handle click of "Continue", which changes to next page
		      	// The link contains data-nav-link attribute, which holds the nav item ID
		      	// Nav item ID is then used to access and trigger click on the corresponding nav item
		      	var linkToAnotherPage = $("a.tm-btn[data-nav-link]");
			    
			    if(linkToAnotherPage != null) {
			    	
			    	linkToAnotherPage.on("click", function(){
			    		var navItemToHighlight = linkToAnotherPage.data("navLink");
			    		$("a" + navItemToHighlight).click();
			    	});
			    }
		      	
		      	// Hide all pages
		      	allPages.hide();

		      	$("#tm-section-1").fadeIn();

		     	// Set up background first page
		     	var bgImg = $("#tmNavLink1").data("bgImg");
		     	
		     	$.backstretch("img/" + bgImg, {fade: 500});

		     	// Setup Carousel, Nav, and Nav Toggle
			    setupCarousel();
			    setupNav();
			    setupNavToggle();
			    setupFooter();

			    // Resize Carousel upon window resize
			    $(window).resize(function() {
			    	setupCarousel();
			    	setupFooter();
			    });
      		}	      	
		});

		</script>
<% 
//String query="select nombre, apellidos, COUNT(id_Alumno) from Alumnos  group by id_Alumno order by count(id_Alumno) DESC;";
//beanDB basededatos = new beanDB();
//String [][] tablares = basededatos.resConsultaSelectA3(query);
%> 
<table>
<%// for (int i=0; i<tablares.length;i++) {
//	%><tr> <%
	//for (int j=0; j<tablares[i].length;j++) {
	//%> <td> <%//=tablares[i][j] %> </td> <%
	//}
	//%> </tr> <%
//}
%>
</table>
</body></html>