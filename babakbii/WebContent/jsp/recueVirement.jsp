<%@include file="../view/header.jsp"%>
<%@include file="../view/menue.jsp"%>
<%@include file="../view/nav.jsp"%>





<section class="open-account-area ptb-100">
    <div class="container">
        <div class="section-title">
            
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
                            <label class=""><h1>Agence</h1></label>
                        </div>
                    </div>
                    <div class="col-lg-12 col-md-12">
                        <div class="form-group">
                            <label>Agence: <c:out value='${vagenc1.nomAgence}' /> </label>
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Adresse: <c:out value='${vagenc1.adresse}' /></label>
                        </div>
                    </div>
                     <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Téléphone: <c:out value='${vagenc1.telephone}' /></label>
                        </div>
                    </div>
                    <div class="col-lg-12 col-md-12">
                        <div class="form-group">
                            <label class=""><h1>Agent operant</h1></label>
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Prenom: <c:out value='${vag1.prenom}' /> </label>
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Nom: <c:out value='${vag1.nom}' /></label>
                        </div>
                    </div>
                     <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Téléphone: <c:out value='${vag1.telephone}' /></label>
                        </div>
                    </div>
                    <div class="col-lg-12 col-md-12">
                        <div class="form-group">
                            <label class=""><h1>Client</h1></label>
                        </div>
                    </div>
                    <div class="col-lg-12 col-md-12">
                        <div class="form-group">
                            <label>Numéro de compte:<c:out value='${cpt3.numCompte}' /> </label>
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Prenom: <c:out value='${cli3.prenom}' /></label>
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Nom: <c:out value='${cli3.nom}' /></label>
                        </div>
                    </div>
                    
                    <div class="col-lg-12 col-md-12">
                            <div class="form-group">
                                <label><center><h1>Coordonnées du destinataire</h1></center></label>
                            </div>
                        </div>

                        <div class="col-lg-12 col-md-12">
                            <div class="form-group">
                                <label>Numero de Compte du destinataire: <c:out value='${cptdest.numCompte}' /></label>
                            </div>
                        </div>
                        <div class="col-lg-6 col-md-6">
                            <div class="form-group">
                                <label>Prénom du client destinataire: <c:out value='${cli4.prenom}' /> </label>
                            </div>
                        </div>
                        <div class="col-lg-6 col-md-6">
                            <div class="form-group">
                                <label>Nom du client destinataire: <c:out value='${cli4.nom}' /></label>
                            </div>
                        </div>
                        <div class="col-lg-12 col-md-12">
                            <div class="form-group">
                               <label>Montant du virement: <c:out value='${cptdest.solde}' /> Fcfa</label>
                            </div>
                        </div>
                       
                    </hr>
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





<%@include file="../view/footer.jsp"%>
