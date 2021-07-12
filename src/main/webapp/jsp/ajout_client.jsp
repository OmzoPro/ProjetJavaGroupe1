<%@include file="header.jsp"%>
<!-- Start Open Account Banner -->
<section class="open-account-area ptb-100">
    <div class="container">
        <div class="section-title">
            <h2>Formulaire pour ajout agent</h2>
        </div>
        <div class="open-account-form">
             <form action="<%=request.getContextPath()%>/ajoutClient"  method="POST">
                <div class="row">
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Nom</label>
                            <input required="required" type="text" class="form-control" placeholder="Nom" name="nom">
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Prenom</label>
                            <input required="required" type="text" class="form-control" placeholder="Prenom" name="prenom">
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Date de naissance</label>
                            <input required="required" type="Date" class="form-control" placeholder="dd/mm/yy" name="naissance">
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>sexe</label>
                            <select name="sexe">
                                <option value="Homme">Homme</option>
                                <option value="Femme">Femme</option>
                            </select>
                        </div>
                    </div>

                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>cni</label>
                            <input required="required" type="number" class="form-control" placeholder="cni" name="cni">
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Téléphone</label>
                            <input required="required" type="number" class="form-control" placeholder="Téléphone" name="telephone">
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Email</label>
                            <input required="required" type="email" class="form-control" placeholder="Email address" name="email">
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                        <label>Adresse</label>
                        <input required="required" type="text" class="form-control" placeholder="adresse" name="adresse">
                        </div>
                    </div>
                   <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>type compte</label>
                            <select name="typeCompte">
                                <option value="Epargne">Epargne</option>
                                <option value="Courant">Courant</option>
                            </select>
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Solde</label>
                            <input required="required" type="number" class="form-control" placeholder="Solde" name="solde">
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>login</label>
                            <input required="required" type="text" class="form-control" placeholder="mon" name="login">
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>password</label>
                            <input required="required" type="Password" class="form-control" placeholder="mot de passe" name="password">
                        </div>
                    </div>

                    <div class="col-lg-12">
                        <div class="banner-form-btn">
                            <input type="hidden" name="dateCreation" value="11/11/2021">
                            <input type="hidden" name="role" value="client">
                            <input type="hidden" name="idAgent" value="<c:out value="${sessionScope['agentcon'].idAgent }"></c:out>" >
                            <button type="submit" class="btn btn-primary" style="background-color: red;">Ajouter</button>
                        </div>
                    </div>
                </div>
            </form>
        </div>
    </div>
</section>
<!-- End Open Account Banner -->
<%@ include file="footer.jsp"%>