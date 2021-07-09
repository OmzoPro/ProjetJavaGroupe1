<%@include file="../view/header.jsp"%>
<%@include file="../view/menue.jsp"%>
<%@include file="../view/nav.jsp"%>

<div class="container">

<section class="open-account-area ptb-100">
    <div class="container">
        <div class="section-title">
        
        </div>
      
        <div class="open-account-form">
           <form action="<%=request.getContextPath()%>/verifieVirement" method="post">
                 <div class="row">
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Numéro de compte du client</label>
                            <input type="text" name="username" class="form-control" placeholder="Numéro de compte">
                            <input type="hidden" name="type_operation" value="virement">
                        </div>
                    </div>
                                        <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Numéro de compte du destinataire</label>
                            <input type="text" name="compte2" class="form-control" placeholder="Numéro de compte">
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


<%@include file="../view/footer.jsp"%>

