<%@include file="header.jsp"%>
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
                            <input type="text" disabled="" value="<c:out value='${cpt3.numCompte}' />" class="form-control">
                            <input type="hidden" name="num_compte" value="<c:out value='${cpt3.numCompte}' />" class="form-control">
                            
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Prénom du client</label>
                            <input type="text" disabled="" value="<c:out value='${cli3.prenom}'/>" class="form-control">
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Nom du client</label>
                            <input type="text" disabled="" value="<c:out value='${cli3.nom}'/>" class="form-control">
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
                                <input type="text" disabled="" value="<c:out value='${cptdest.numCompte}' />" class="form-control">
                           		 <input type="hidden" name="compteDestinataire" value="<c:out value='${cptdest.numCompte}' />" class="form-control" >
                               
                       
                            </div>
                        </div>
                        <div class="col-lg-6 col-md-6">
                            <div class="form-group">
                                <label>Prénom du client destinataire</label>
                                <input type="text"  value="<c:out value='${cli4.prenom}'/>" class="form-control">
                            </div>
                        </div>
                        <div class="col-lg-6 col-md-6">
                            <div class="form-group">
                                <label>Nom du client destinataire</label>
                                <input type="text"  value="<c:out value='${cli4.nom}'/> " class="form-control">
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
                          
                           <input type="hidden" name="dateO" value="15/12/2021 " class="form-control">
                           <input type="hidden" name="idAgent" value="<c:out value='${cli3.idAgent}'/>" class="form-control">
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
<%@include file="footer.jsp"%>


