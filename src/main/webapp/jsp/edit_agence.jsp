<%@include file="header2.jsp"%>
<!-- Start Open Account Banner -->
<section class="open-account-area ptb-100">
    <div class="container">
        <div class="section-title">
            <h2>Formulaire pour Modifier une agence</h2>
        </div>
        <div class="open-account-form">
            <form action="<%=request.getContextPath()%>/editAgence" method="post">
                <div class="row">
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Nom de l'agence</label>
                            <input type="hidden" name="idAgence" value="<c:out value="${agence.idAgence}"/>">
                            <input required="required" value="<c:out value="${agence.nomAgence}"/>" type="text" class="form-control" name="nom">
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Téléphone</label>
                            <input required="required" value="<c:out value="${agence.telephone}"/>" type="number" class="form-control" name="telephone">
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Email</label>
                            <input required="required" value="<c:out value="${agence.email}"/>" type="email" class="form-control" name="email">
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Adresse</label>
                            <input required="required" value="<c:out value="${agence.adresse}"/>" type="text" class="form-control" name="adresse">
                        </div>
                    </div>
                    <div class="col-lg-12">
                        <div class="banner-form-btn">
                        <button type="submit" class="btn btn-primary">Modifier</button>
                        </div>
                    </div>
                </div>
            </form>
        </div>
    </div>
</section>
<!-- End Open Account Banner -->
<%@ include file="footer.jsp"%>