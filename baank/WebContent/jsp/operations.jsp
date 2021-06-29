<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="C"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="../assets/css/bootstrap.min.css">
        <!-- Animate CSS -->
        <link rel="stylesheet" href="../assets/css/animate.min.css">
        <!-- Meanmenu CSS -->
        <link rel="stylesheet" href="../assets/css/meanmenu.css">
        <!-- Boxicons CSS -->
        <link rel="stylesheet" href="../assets/css/boxicons.min.css">
        <!-- Flaticon CSS -->
        <link rel="stylesheet" href="../assets/css/flaticon.css">
        <!-- Nice Select CSS -->
        <link rel="stylesheet" href="../assets/css/nice-select.min.css">
        <!-- Owl Carousel CSS -->
        <link rel="stylesheet" href="../assets/css/owl.carousel.min.css">
        <!-- Owl Carousel Default CSS -->
        <link rel="stylesheet" href="../assets/css/owl.theme.default.min.css">
        <!-- Odometer CSS -->
        <link rel="stylesheet" href="../assets/css/odometer.min.css">
        <!-- Magnific Popup CSS -->
        <link rel="stylesheet" href="../assets/css/magnific-popup.min.css">
        <!-- Style CSS -->
        <link rel="stylesheet" href="../assets/css/style.css">
        <!-- Responsive CSS -->
		<link rel="stylesheet" href="../assets/css/responsive.css">

        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

		<title>AaskanBi_Bank - Un conseil a l'écoute de vos besoins</title>

        <link rel="icon" type="image/png" href="../assets/img/favicon.png">
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
                                <a href="#">Médina, DAKAR-SENEGAL</a>
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
                              <img src="../assets/img/logo-3.png" alt="image">
                          </a>
                      </div>
                  </div>
              </div>
          </div>
     </div>

<div class="main-navbar">
  <div class="container">
      
          <a class="navbar-brand">
              <img src="../assets/img/logo-3.png" alt="image">
          </a>
  </div>
</div>


<div class="container">

<section class="open-account-area ptb-100">
    <div class="container">
        <div class="section-title">
        
        </div>
      
        <div class="open-account-form">
           <form action="<%=request.getContextPath()%>/login" method="post">
                <div class="row">
           
                   
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Numéro de compte du destinataire</label>
                            <input type="text" name="username" class="form-control" placeholder="Numéro de compte">
                        </div>
                    </div>
                    <div class="col-lg-12">
                        <div class="banner-form-btn">
                            <button type="submit" name="verifier_virement" class="default-btn">
                                Verifier
                            </button>
                        </div>
                    </div>
                    
                </div>
            </form>
        </div>
    </div>
</section>
</div>


</body>
</html>


