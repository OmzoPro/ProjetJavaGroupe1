<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="">
<head>
    <!-- Required meta tags -->
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="assets/css/bootstrap.min.css">
    <!-- Animate CSS -->
    <link rel="stylesheet" href="assets/css/animate.min.css">
    <!-- Meanmenu CSS -->
    <link rel="stylesheet" href="assets/css/meanmenu.css">
    <!-- Boxicons CSS -->
    <link rel="stylesheet" href="assets/css/boxicons.min.css">
    <!-- Flaticon CSS -->
    <link rel="stylesheet" href="assets/css/flaticon.css">
    <!-- Nice Select CSS -->
    <link rel="stylesheet" href="assets/css/nice-select.min.css">
    <!-- Owl Carousel CSS -->
    <link rel="stylesheet" href="assets/css/owl.carousel.min.css">
    <!-- Owl Carousel Default CSS -->
    <link rel="stylesheet" href="assets/css/owl.theme.default.min.css">
    <!-- Odometer CSS -->
    <link rel="stylesheet" href="assets/css/odometer.min.css">
    <!-- Magnific Popup CSS -->
    <link rel="stylesheet" href="assets/css/magnific-popup.min.css">
    <!-- Style CSS -->
    <link rel="stylesheet" href="assets/css/style.css">
    <!-- Responsive CSS -->
    <link rel="stylesheet" href="assets/css/responsive.css">

    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

    <title>AaskanBi_Bank - Un conseil a l'�coute de vos besoins</title>

    <link rel="icon" type="image/png" href="assets/img/favicon.png">
</head>

<body>

<!-- Start Top Header Area -->
<div class="top-header-area bg-ffffff">
    <div class="container">
        <div class="row align-items-center">
            <div class="col-lg-6">
                <ul class="top-header-information">
                    <li>
                        <i class='bx bx-envelope'></i>
                        <a href="mailto:hello@AasKanbibank.com">contact@askanbibank.com</a>
                    </li>

                    <li>
                        <i class='bx bxs-phone'></i>
                        <a href="tel:771441417">+ (221) 77 144 14 17</a>
                    </li>
                </ul>
            </div>

            <div class="col-lg-6 text-right">
                <ul class="top-header-others">
                    <li>
                        <i class='bx bxs-map'></i>
                        <a href="#">Medina, DAKAR-SENEGAL</a>
                    </li>

                    <li class="languages-list">
                        <select>
                            <option value="1">English</option>
                            <option value="2">Germany</option>
                            <option value="3">Australia</option>
                        </select>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</div>
<!-- End Top Header Area -->


<!-- Start Navbar Area -->
<div class="navbar-area navbar-color-three">
    <div class="main-responsive-nav">
        <div class="container">
            <div class="main-responsive-menu">
                <div class="logo">
                    <a>
                        <img src="assets/img/logo-3.png" alt="image">
                    </a>
                </div>
            </div>
        </div>
    </div>


</div>




<div class="main-navbar">
    <div class="container">
        <nav class="navbar navbar-expand-md navbar-light">
            <a href="" class="navbar-brand">
                <img src="assets/img/logo-3.png" alt="image">
            </a>
            <div class="collapse navbar-collapse mean-menu" id="navbarSupportedContent">
                <ul class="navbar-nav">
					<c:if test="${sessionScope['user'].role == 'agent' }">
                    <li class="nav-item">
                        <a href="<%= request.getContextPath() %>/ajoutClient" class="nav-link">
                            Ajout de client
                        </a>
                    </li>

                    <li class="nav-item">
                        <a href="<%= request.getContextPath() %>/listeClient" class="nav-link">
                            Listes des Clients
                        </a>
                    </li>

                    <li class="nav-item">
                        <a href="#" class="nav-link">
                            Operations
                            <i class='bx bx-chevron-down'></i>
                        </a>
                        <ul class="dropdown-menu">
                            <li class="nav-item">
                                <a href="<%= request.getContextPath() %>/verifierDepot" class="nav-link">
                                    Depot
                                </a>
                            </li>

                            <li class="nav-item">
                                <a href="<%= request.getContextPath() %>/verifierRetrait" class="nav-link">
                                    Retrait
                                </a>
                            </li>

                            <li class="nav-item">
                                <a href="<%= request.getContextPath() %>/verifierVirement" class="nav-link">
                                    Virement
                                </a>
                            </li>
                        </ul>
                    </li>
                    </c:if>
                    
					<c:if test="${(sessionScope['user'].role == 'chef_agent') || (sessionScope['user'].role == 'super_admin') }"> 
                    <li class="nav-item">
                        <a href="<%= request.getContextPath() %>/ajoutAgent" class="nav-link">
                            Ajout Agent
                        </a>
                    </li>

                    <li class="nav-item">
                        <a href="<%= request.getContextPath() %>/listeAgent" class="nav-link">
                            Listes des Agents
                        </a>
                    </li>
                    </c:if>
                    <c:if test="${sessionScope['user'].role == 'super_admin' }"> 
                    <li class="nav-item">
                        <a href="<%= request.getContextPath() %>/ajoutAgence" class="nav-link">
                            Ajout Agence
                        </a>
                    </li>

                    <li class="nav-item">
                        <a href="<%= request.getContextPath() %>/listeAgence" class="nav-link">
                            Listes des Agences
                        </a>
                    </li>
                    </c:if>

                </ul>
                <c:choose>
                	<c:when test="${sessionScope['user'].role == null }">
				   		<div class="others-options d-flex align-items-center">
                    		<div class="option-item">
		                        <a href="<%= request.getContextPath() %>/login" class="default-btn">Connectez-Vous</a>
        		            </div>
                		</div>
                 	</c:when>
				    <c:otherwise>
				    	<div class="others-options d-flex align-items-center">
                    		<div class="option-item">
		                        <a href="<%= request.getContextPath() %>/logout" class="default-btn">welcome <c:out value="${sessionScope['role'] }"></c:out> </a>
         		           </div>
                		</div>
                	</c:otherwise>
				</c:choose>
            </div>
        </nav>
    </div>
</div>

