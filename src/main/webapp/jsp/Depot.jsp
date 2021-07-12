<%@include file="header.jsp"%>
<div class="container">

<section class="open-account-area ptb-100">
    <div class="container">
        <div class="section-title">
            <h2>Depot argent</h2>
        </div>
        <div class="open-account-form">
            <form action="<%=request.getContextPath()%>/Depot" method="post">
           
            
               <div class="row">
                    <div class="col-lg-12 col-md-12">
                        <div class="form-group">
                            <label class="">Numéro de Compte du client</label>
                            <input type="text" disabled="" value="<c:out value='${cpt1.numCompte}' />" class="form-control">
                            <input type="hidden" name="num_compte" value="<c:out value='${cpt1.numCompte}' />" class="form-control">
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Prénom du client</label>
                            <input type="text" disabled=""   value="<c:out value='${cli1.nom}' />"  class="form-control">
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Nom du client</label>
                            <input type="text" disabled="" value="<c:out value='${cli1.prenom}' />" class="form-control">
                        </div>
                    </div>
                     <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Type de compte du client <c:out value='${cpt1.typeCompte}' /></label>
                            <input type="text"  disabled="" name="typeCompte" value="<c:out value='${cpt1.typeCompte}' /> " class="form-control">
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Solde du compte</label>
                            <input type="text"  value="<c:out value='${cpt1.solde}' />" class="form-control">
                        </div>
                    </div>
                                            <div class="col-lg-12 col-md-12">
                        <div class="form-group">
                            <label>Montant à deposer</label>
                            <input type="number" name="montantOperation" class="form-control" placeholder="Montant">
                            <input type="hidden" name="toperation" value="depot" class="form-control">
                            <input type="hidden" name="idAgent" value="<c:out value='${cli1.idAgent}'/>" class="form-control">
                            <input type="hidden" name="dateO" value="28/06/2021" class="form-control">
                            <input type="hidden" name="soldeAvant" value="<c:out value='${cpt1.solde}' />" class="form-control">
                            
                            
                            
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



<%@include file="footer.jsp"%>