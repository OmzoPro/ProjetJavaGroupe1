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