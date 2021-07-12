<%@include file="header.jsp"%>

<div class="container">

<section class="open-account-area ptb-100">
    <div class="container">
        <div class="section-title">
        
        </div>
      
        <div class="open-account-form">
           <form action="<%=request.getContextPath()%>/verifierVirement" method="post">
                 <div class="row">
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Numéro de compte du client</label>
                            <input type="text" name="numCompte" class="form-control" placeholder="Numéro de compte" required="required">
                            <input type="hidden" name="type_operation" value="virement">
                        </div>
                    </div>
                                        <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Numéro de compte du destinataire</label>
                            <input type="text" name="numCompte2" class="form-control" placeholder="Numéro de compte" required="required">
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


<%@include file="footer.jsp"%>

