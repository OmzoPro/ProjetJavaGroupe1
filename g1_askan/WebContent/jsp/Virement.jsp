
<%@include file="../view/header.jsp"%>
<%@include file="../view/menue.jsp"%>
<%@include file="../view/nav.jsp"%>
<div class="container">

<section class="open-account-area ptb-100">
    <div class="container">
        <div class="section-title">
            <h2>Virement argent</h2>
        </div>
        <div class="open-account-form">
            <form action="<%=request.getContextPath()%>/Virement" method="post">
                
                <div class="row">
                    <div class="col-lg-12 col-md-12">
                        <div class="form-group">
                            <label class="">Numéro de Compte du client</label> 
                            <input type="text" disabled=""   name="num_compte" value="<c:out value='${cpt3.numCompte}' />" class="form-control">
                            
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Prénom du client</label>
                            <input type="text" disabled="" value="fatima " class="form-control">
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Nom du client</label>
                            <input type="text" disabled="" value="kane " class="form-control">
                        </div>
                    </div>
                     <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Type de compte du client</label>
                            <input type="text" disabled="" value="<c:out value='${cpt3.typeCompte}' /> " class="form-control">
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Solde du compte</label>
                            <input type="text"   name="soldeAvant"  value="<c:out value='${cpt3.solde}' />" class="form-control">
                        </div>
                    </div>
                                            <div class="col-lg-12 col-md-12">
                            <div class="form-group">
                                <label><center><h1>Coordonnées du destinataire</h1></center></label>
                            </div>
                        </div>

                        <div class="col-lg-12 col-md-12">
                            <div class="form-group">
                                <label>Numero de Compte du destinataire</label>
                               
                           <input type="text" name="compteDestinataire" value="222555" class="form-control">
                            </div>
                        </div>
                        <div class="col-lg-6 col-md-6">
                            <div class="form-group">
                                <label>Prénom du client destinataire</label>
                                <input type="text"  value=" Pagaye " class="form-control">
                            </div>
                        </div>
                        <div class="col-lg-6 col-md-6">
                            <div class="form-group">
                                <label>Nom du client destinataire</label>
                                <input type="text"  value="ba " class="form-control">
                            </div>
                        </div>
                        <div class="col-lg-12 col-md-12">
                            <div class="form-group">
                                <label>Montant du virement</label>
                                <input type="number" name="montantOperation" class="form-control" placeholder="Montant">
                                <input type="hidden" name="toperation" value="virement" class="form-control">
                            </div>
                        </div>
                        
                    <div class="col-lg-12">
                        <div class="banner-form-btn">
                           <input type="hidden" name="soldeApres" value=" 159000" class="form-control">
                           <input type="hidden" name="dateO" value="15/12/2021 " class="form-control">
                           <input type="hidden" name="idAgent" value="5" class="form-control">
                           <input type="hidden" name="" value="15/12/2021 " class="form-control">
                            <button type="submit" name="virement" class="default-btn">
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
<%@include file="../view/footer.jsp"%>


