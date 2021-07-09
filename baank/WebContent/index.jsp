<!doctype html>
<html lang="">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel = "stylesheet" type = "text/css" href="<%=request.getContextPath()%>/assets/css/bootstrap.css">
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="<%=request.getContextPath()%>/assets/assets/css/bootstrap.min.css">
        <!-- Animate CSS -->
        <link rel="stylesheet" href="<%=request.getContextPath()%>/assets/assets/css/animate.min.css">
        <!-- Meanmenu CSS -->
        <link rel="stylesheet" href="<%=request.getContextPath()%>/assets/assets/css/meanmenu.css">
        <!-- Boxicons CSS -->
        <link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/boxicons.min.css">
        <!-- Flaticon CSS -->
        <link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/flaticon.css">
        <!-- Nice Select CSS -->
        <link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/nice-select.min.css">
        <!-- Owl Carousel CSS -->
        <link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/owl.carousel.min.css">
        <!-- Owl Carousel Default CSS -->
        <link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/owl.theme.default.min.css">
        <!-- Odometer CSS -->
        <link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/odometer.min.css">
        <!-- Magnific Popup CSS -->
        <link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/magnific-popup.min.css">
        <!-- Style CSS -->
        <link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/style.css">
        <!-- Responsive CSS -->
		<link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/responsive.css">

        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

		<title>AaskanBi_Bank - Un conseil a l'�coute de vos besoins</title>

        <link rel="icon" type="image/png" href="<%=request.getContextPath()%>/assets/img/favicon.png">
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
                                <a href="#">M�dina, DAKAR-SENEGAL</a>
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
                              <img src="<%=request.getContextPath()%>/assets/img/logo-3.png" alt="image">
                          </a>
                      </div>
                  </div>
              </div>
          </div>


        </div>




<div class="main-navbar">
  <div class="container">
      <nav class="navbar navbar-expand-md navbar-light">
          <a class="navbar-brand" href="?p=accueil">
              <img src="<%=request.getContextPath()%>/assets/img/logo-3.png" alt="image">
          </a>

         
          
          
          <div class="collapse navbar-collapse mean-menu" id="navbarSupportedContent">
              <ul class="navbar-nav">
                 
                  <li class="nav-item">
                      <a href="?p=ajout_client" class="nav-link">
                          Ajout de client
                      </a>
                  </li>
                  
                  <li class="nav-item">
                      <a href="?p=list_client" class="nav-link">
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
                              <a href="jsp/verifieDepot.jsp" class="nav-link">
                                  Depot
                              </a>
                          </li>

                          <li class="nav-item">
                              <a href="jsp/verifieRetrait.jsp" class="nav-link">
                                  Retrait
                              </a>
                          </li>

                          <li class="nav-item">
                              <a href="jsp/verifieVirement.jsp" class="nav-link">
                                  Virement
                              </a>
                          </li>
                      </ul>
                  </li>
                 
                  
                  
              </ul>

              <div class="others-options d-flex align-items-center">
                  <div class="option-item">
                    
                    <a href="?deconnexion=true" class="default-btn">welcome </a>
                  </div>
              </div>
          </div>
      </nav>
  </div>
</div>



<!-- Start Main Banner Area -->
<div class="main-banner">
    <div class="main-banner-item banner-item-three">
        <div class="container">
            <div class="row align-items-center">
                <div class="col-lg-6">
                    <div class="main-banner-content">
                        <h1>Rejoignez la banque Aaskanbi une banque mutualiste et responsable</h1>
                        <p>Votre transfert de compte est facilité, changement de vie ou de région, votre Banque Aaskanbi vous accompagne et facilite votre démarche. </p>
                        <div class="banner-btn">
                        <a href="?p=solde" class="default-btn">Consultez votre solde</a>
                        </div>
                    </div>
                </div>

                <div class="col-lg-6">
                    <div class="../main-banner-image">
                        <img src="<%=request.getContextPath()%>/assets/img/main-banner/banner-image-2.jpg" alt="image">
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div class="main-banner-shape">
        <div class="shape-1">
            <img src="<%=request.getContextPath()%>/assets/img/main-banner/banner-shape-2.png" alt="image">
        </div>
        <div class="shape-2">
            <img src="<%=request.getContextPath()%>/assets/img/main-banner/banner-shape-3.png" alt="image">
        </div>
        <div class="shape-3">
            <img src="assets/img/main-banner/banner-shape-4.png" alt="image">
        </div>
    </div>
</div>
<!-- End Main Banner Area -->

<!-- Start Grow Area -->
<section class="grow-area ptb-100">
    <div class="container">
        <div class="row align-items-center">
            <div class="col-lg-6">
                <div class="grow-image">
                    <img src="assets/img/grow.png" alt="image">
                </div>
            </div>

            <div class="col-lg-6">
                <div class="grow-content">
                    <span>AaskanBi_Bank</span>
                    <h3>A propos de nous</h3>
                    <p>Acteur clé de l’économie régionale, Banque Aaskanbi s’est fixée pour objectif d’accompagner tout ceux qui entreprennent sur le chemin de la réussite. <br>Banque Aaskanbi, elle est la propriété de ses clients. <br><br>S’engager au service des projets personnels et professionnels de ses clients et sociétaires, et les accompagner dans la durée, tel est l’esprit Banque Aaskanbi.
                    Un conseiller a l’écoute de vos besoins.<br>
                    <br><br>Chez Banque AasKanbi, tous les clients bénéficient d’un conseiller dédier. <br>Epaulé par un réseau d’experts il vous connait et est à votre disposition pour vous accompagner dans tous vos projets.
                    </p>

                </div>
            </div>
        </div>
    </div>
</section>
<!-- End Grow Area -->

<!-- Start Operate Area -->
<section class="operate-area ptb-100">
    <div class="container">
        <div class="row align-items-center">
            <div class="col-lg-6">
                <div class="operate-content">
                    <span>AaskanBi_Bank</span>
                    <h2>Ouvrir un compte : les documents à communiquer </h2>
                    <h3>En vue de l’ouverture des comptes, vous devez notamment transmettre les principaux documents :</h3>
                    <p>Une pièce en cours de validités (carte d’identité, passeport ou titre de séjours).
                    <br>Un justificatif de domicile de moins de trois mois.
                    <br>Un justificatif d’activité (avis d’imposition, carte d’étudiant…).
                    <br>D’autres documents avec une date récente, peuvent vous être demandé en fonction de votre situation personnelle et professionnelle
                    </p>
                </div>
            </div>

            <div class="col-lg-6">
                <div class="operate-image">
                    <img src="assets/img/operate.png" alt="image">
                </div>
            </div>
        </div>
    </div>
</section>
<!-- End Operate Area -->

<!-- Start Fun Facts Area -->
<section class="fun-facts-area bg-color pt-100 pb-70">
    <div class="container">
        <div class="section-title">
            <span>Pourquoi nous choisir</span>
            <h2>Notre banque est au service de ses clients avec beaucoup de professionalisme.</h2>
        </div>

        <div class="row">
            <div class="col-lg-3 col-md-6 col-sm-6">
                <div class="single-fun-fact">
                    <div class="icon">
                        <i class="flaticon-positive-vote"></i>
                    </div>

                    <h3>
                        <span class="odometer" data-count="358412">00</span>
                    </h3>
                    <p>Des clients satisfaits</p>
                </div>
            </div>

            <div class="col-lg-3 col-md-6 col-sm-6">
                <div class="single-fun-fact">
                    <div class="icon">
                        <i class="flaticon-confetti"></i>
                    </div>

                    <h3>
                        <span class="odometer" data-count="25">00</span>
                    </h3>
                    <p>projets finnancés</p>
                </div>
            </div>

            <div class="col-lg-3 col-md-6 col-sm-6">
                <div class="single-fun-fact">
                    <div class="icon">
                        <i class="flaticon-bank"></i>
                    </div>

                    <h3>
                        <span class="odometer" data-count="2545">00</span>
                    </h3>
                    <p>Nos succursales</p>
                </div>
            </div>

            <div class="col-lg-3 col-md-6 col-sm-6">
                <div class="single-fun-fact">
                    <div class="icon">
                        <i class="flaticon-success"></i>
                    </div>

                    <h3>
                        <span class="odometer" data-count="54285">00</span>
                    </h3>
                    <p>Fonctionne avec succès</p>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- End Fun Facts Area -->

<!-- Start Partner Area -->
<div class="partner-area ptb-100">
    <div class="container">
        <div class="partner-slider owl-carousel owl-theme">
            <div class="partner-item">
                <img src="assets/img/partner/partner-1.png" alt="image">
            </div>

            <div class="partner-item">
                <img src="assets/img/partner/partner-2.png" alt="image">
            </div>

            <div class="partner-item">
                <img src="assets/img/partner/partner-3.png" alt="image">
            </div>

            <div class="partner-item">
                <img src="assets/img/partner/partner-4.png" alt="image">
            </div>

            <div class="partner-item">
                <img src="assets/img/partner/partner-5.png" alt="image">
            </div>
        </div>
    </div>
</div>
<!-- End Partner Area -->


<!-- Start Footer Area -->
        <section class="footer-area bg-ffffff pt-100 pb-70">
            <div class="container">
                <div class="row">
                    <div class="col-lg-3 col-sm-6">
                        <div class="single-footer-widget">
                            <div class="footer-logo">
                                <h2><a href="index.html">AaskanBi_Bank</a></h2>

                                <p>Epaulé par un réseau d’experts il vous connait et est à votre disposition pour vous accompagner dans tous vos projets.</p>

                                <ul class="social">
                                    <li>
                                        <a href="#" class="facebook" target="_blank">
                                            <i class='bx bxl-facebook'></i>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#" class="twitter" target="_blank">
                                            <i class='bx bxl-twitter'></i>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#" class="pinterest" target="_blank">
                                            <i class='bx bxl-instagram'></i>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#" class="linkedin" target="_blank">
                                            <i class='bx bxl-linkedin'></i>
                                        </a>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>

                    <div class="col-lg-3 col-sm-6">
                        <div class="single-footer-widget">
                            <h3>Contact</h3>

                            <ul class="footer-contact-info">
                                <li>
                                    <i class='bx bxs-phone'></i>
                                    <span>T�l�phone</span>
                                    <a href="tel:771441417">+ (221) 77 144 14 17</a>
                                </li>
                                <li>
                                    <i class='bx bx-envelope'></i>
                                    <span>Email</span>
                                    <a href="mailto:hello@AasKanbibank.com">contact@askanbibank.com</a>
                                </li>
                                <li>
                                    <i class='bx bx-map'></i>
                                    <span>Address</span>
                                    Rue 09 Angle 14, Medina Fass guél tapé, DAKAR-SENEGAL
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- End Footer Area -->

        <!-- Start Copy Right Area -->
        <div class="copyright-area bg-ffffff">
            <div class="container">
                <div class="copyright-area-content">
                    <p>
                        <i class='bx bx-copyright'></i>
                        Copyright @2021 AaskanBi_Bank. All Rights Reserved by
                        <a href="#" target="_blank">Group1</a>
                    </p>
                </div>
            </div>
        </div>
        <!-- End Copy Right Area -->

        <!-- Start Go Top Area -->
        <div class="go-top">
            <i class='bx bx-up-arrow-alt'></i>
        </div>
        <!-- End Go Top Area -->

        <!-- Jquery Slim JS -->
        <script src="assets/js/jquery.min.js"></script>
        <!-- Popper JS -->
        <script src="assets/js/popper.min.js"></script>
        <!-- Bootstrap JS -->
        <script src="assets/js/bootstrap.min.js"></script>
        <!-- Meanmenu JS -->
        <script src="assets/js/jquery.meanmenu.js"></script>
        <!-- Nice Select JS -->
        <script src="assets/js/jquery.nice-select.min.js"></script>
        <!-- Owl Carousel JS -->
        <script src="assets/js/owl.carousel.min.js"></script>
        <!-- Magnific Popup JS -->
        <script src="assets/js/jquery.magnific-popup.min.js"></script>
        <!-- Odometer JS -->
        <script src="assets/js/odometer.min.js"></script>
        <!-- Jquery Appear JS -->
        <script src="assets/js/jquery.appear.min.js"></script>
        <!-- Ajaxchimp JS -->
		<script src="assets/js/jquery.ajaxchimp.min.js"></script>
		<!-- Form Validator JS -->
		<script src="assets/js/form-validator.min.js"></script>
		<!-- Contact JS -->
        <script src="assets/js/contact-form-script.js"></script>
        <!-- Wow JS -->
        <script src="assets/js/wow.min.js"></script>
        <!-- Custom JS -->
        <script src="assets/js/main.js"></script>
    </body>
</html>
