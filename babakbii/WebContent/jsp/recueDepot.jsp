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
                            <label>Agence: <c:out value='${agenc1.nomAgence}' /> </label>
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Adresse: <c:out value='${agenc1.adresse}' /></label>
                        </div>
                    </div>
                     <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Téléphone: <c:out value='${agenc1.telephone}' /></label>
                        </div>
                    </div>
                    <div class="col-lg-12 col-md-12">
                        <div class="form-group">
                            <label class=""><h1>Agent operant</h1></label>
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Prenom: <c:out value='${ag1.prenom}' /> </label>
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Nom: <c:out value='${ag1.nom}' /></label>
                        </div>
                    </div>
                     <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Téléphone: <c:out value='${ag1.telephone}' /></label>
                        </div>
                    </div>
                    <div class="col-lg-12 col-md-12">
                        <div class="form-group">
                            <label class=""><h1>Client</h1></label>
                        </div>
                    </div>
                    <div class="col-lg-12 col-md-12">
                        <div class="form-group">
                            <label>Numéro de compte:<c:out value='${cpt1.numCompte}' /> </label>
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Prenom: <c:out value='${cli1.prenom}' /></label>
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Nom: <c:out value='${cli1.nom}' /></label>
                        </div>
                    </div>
                    
                        <div class="col-lg-12 col-md-12">
                        <div class="form-group">
                            <label>Montant deposé: <c:out value='${cpt1.solde}' /> Fcfa</label>
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
