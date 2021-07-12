<%@include file="header.jsp"%>
<div class="container">

<section class="open-account-area ptb-100">
    <div class="container">
        <div class="section-title">
        
        </div>
      
        <div class="open-account-form">
           <form action="<%=request.getContextPath()%>/verifierDepot" method="post">
                <div class="row">
           
                   
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Numéro de compte du Client</label>
                            <input type="text" name="numCompte" class="form-control" placeholder="Numéro de compte">
                        </div>
                    </div>
                    <div class="col-lg-12">
                        <div class="banner-form-btn">
                            <button type="submit" name="" class="default-btn">
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


