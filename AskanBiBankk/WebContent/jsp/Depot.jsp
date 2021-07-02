





<%@page import="sn.EE_bank.domaine.Compte"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="C"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel = "stylesheet" type = "text/css" href="bootstrap/css/bootstrap.css">
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
<div class="container">


	


<section class="open-account-area ptb-100">
    <div class="container">
        <div class="section-title">
            <h2>Depot argent</h2>
        </div>
        <div class="open-account-form">
            <form action="<%=request.getContextPath()%>/Depot" method="post">
            
            <% Compte c = (Compte) session.getAttribute("sessionDepot");
            %>
               <div class="row">
                    <div class="col-lg-12 col-md-12">
                        <div class="form-group">
                            <label class="">Numéro de Compte du client</label>
                            
                            <input type="text" name="num_compte" value="<%=c.getNumCompte() %> " class="form-control">
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Prénom du client</label>
                            <input type="text" value=" " class="form-control">
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Nom du client</label>
                            <input type="text" disabled="" value="fall " class="form-control">
                        </div>
                    </div>
                     <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Type de compte du client</label>
                            <input type="text"   name="typeCompte" value="<%=c.getTypeCompte() %>" class="form-control">
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Solde du compte</label>
                            <input type="text" value="50000 " class="form-control">
                        </div>
                    </div>
                                            <div class="col-lg-12 col-md-12">
                        <div class="form-group">
                            <label>Montant à deposer</label>
                            <input type="number" name="montantOperation" class="form-control" placeholder="Montant">
                            <input type="hidden" name="toperation" value="Depot" class="form-control">
                            <input type="hidden" name="idAgent" value="4" class="form-control">
                            <input type="hidden" name="dateO" value="02/07/2021" class="form-control">
                            
                            <input type="hidden" name="soldeAvant" value="50000" class="form-control">
                            
                        </div>
                        </div>
                        
                    <div class="col-lg-12">
                        <div class="banner-form-btn">
                                                        <button type="submit" name="depot_retrait" class="default-btn">
                                Envoyer
                            </button>
                                                    </div>
                    </div>
                </div>
            </form>
       </div>
    </div>
</section>
</div>
<table class="table">
	  <thead>
	    <tr>
	      <th scope="col">idOperation</th>
	      <th scope="col">numCompte</th>
	      
	      <th scope="col">dateOperation</th>
	      <th scope="col">idOperation</th>
	      <th scope="col">numCompte</th>
	      <th scope="col">soldeAvant</th>
	      <th scope="col">soldeApres</th>
	      <th scope="col">idAgent</th>
	    </tr>
	  </thead>
	  <tbody>
	  	<C:forEach items="${operations}" var="t">
	  		
		    <tr>
		      <td>${t.idOperation}</td>
		      <td>${t.numCompte}</td>
		    
		      <td>${t.dateOperation}</td>
		      <td>${t.idOperation}</td>
		      <td>${t.numCompte}</td>
		      <td>${t.soldeAvant}</td>
		      <td>${t.soldeApres}</td>
		      <td>${t.idAgent}</td>
		    </tr>
	    </C:forEach>
	  </tbody>
	</table>
	


</body>
</html>