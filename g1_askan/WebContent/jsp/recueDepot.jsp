
<%@include file="../view/header.jsp" %>
<%@include file="../view/menue.jsp" %>
	<%@include file="../view/nav.jsp" %>




<div class="container">

<section class="open-account-area ptb-100">
    <div class="container">
        <div class="section-title">
          
            <h2>Retrait d'argent</h2>
           
            
        </div>
        <div class="open-account-form">
        	<form>
                <div class="row" id='sectionAimprimer'>
                	<div class="col-lg-6 col-md-6">
                        <div class="form-group">
			           		<div class="logo">
			           			<img src="assets/img/logo-3.png" alt="image">
		                   	</div>
		                </div>
	            	</div>
                    <div class="col-lg-12 col-md-12">
                        <div class="form-group">
                           <h1> <label class="">Agence</label></h1>
                        </div>
                    </div>
                    <div class="col-lg-12 col-md-12">
                        <div class="form-group">
                            <label>Agence: <?=$_SESSION['nomAgence']?> </label>
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Adresse: <?=$_SESSION['adresseAgence']?></label>
                        </div>
                    </div>
                     <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Téléphone: <?=$_SESSION['telephoneAgence']?></label>
                        </div>
                    </div>
                    <div class="col-lg-12 col-md-12">
                        <div class="form-group">
                            <label class=""><h1>Agent operant</h1></label>
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Prenom: <?=$_SESSION['prenomAgentCon']?> </label>
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Nom: <?=$_SESSION['nomAgentCon']?></label>
                        </div>
                    </div>
                     <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Téléphone: <?=$_SESSION['telephoneAgent']?></label>
                        </div>
                    </div>
                    <div class="col-lg-12 col-md-12">
                        <div class="form-group">
                            <label class=""><h1>Client</h1></label>
                        </div>
                    </div>
                    <div class="col-lg-12 col-md-12">
                        <div class="form-group">
                            <label>Numéro de compte: <?=$_SESSION['numCompte']?> </label>
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Prenom: <?=$_SESSION['prenomCompte']?> </label>
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Nom: <?=$_SESSION['nomCompte']?></label>
                        </div>
                    </div>
                    <?php
                        if ($type_operation=='depot') {
                        ?>
                        <div class="col-lg-12 col-md-12">
                        <div class="form-group">
                            <label>Montant deposé: <?=$montant?> Fcfa</label>
                        </div>
                        </div>
                        <?php
                        }else if ($type_operation=='retrait') {
                        ?>
                        <div class="col-lg-12 col-md-12">
                        <div class="form-group">
                            <label>Montant retiré: <?=$montant?> Fcfa</label>
                        </div>
                        </div>
                        <?php
                        }else if ($type_operation=='virement') {
                        ?>
                        <div class="col-lg-12 col-md-12">
                            <div class="form-group">
                                <label><center><h1>Coordonnées du destinataire</h1></center></label>
                            </div>
                        </div>

                        <div class="col-lg-12 col-md-12">
                            <div class="form-group">
                                <label>Numero de Compte du destinataire: <?=$_SESSION['numCompte2']?></label>
                            </div>
                        </div>
                        <div class="col-lg-6 col-md-6">
                            <div class="form-group">
                                <label>Prénom du client destinataire: <?=$_SESSION['prenomCompte2']?> </label>
                            </div>
                        </div>
                        <div class="col-lg-6 col-md-6">
                            <div class="form-group">
                                <label>Nom du client destinataire: <?=$_SESSION['nomCompte2']?></label>
                            </div>
                        </div>
                        <div class="col-lg-12 col-md-12">
                            <div class="form-group">
                               <label>Montant du virement: <?=$montant?> Fcfa</label>
                            </div>
                        </div>
                        <?php
                        }
                    ?>
                  
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label><h5>Signature de l'agent</h5></label>
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label><h5>Signature du client</h5></label>
                        </div>
                    </div>
                    <br>

                </div>
                <div class="col-lg-12">
                    <div class="banner-form-btn">
                        <button onClick="imprimer('sectionAimprimer')">Imprimer le reçu</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</section>
<!-- End Open Account Banner -->
<script>
function imprimer(resultat) {
      var printContents = document.getElementById(resultat).innerHTML;    
   var originalContents = document.body.innerHTML;      
   document.body.innerHTML = printContents;     
   window.print();     
   document.body.innerHTML = originalContents;
   }
</script>
</div>




<%@include file="../view/footer.jsp" %>

















