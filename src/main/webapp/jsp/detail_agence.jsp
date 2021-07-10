<%@include file="header2.jsp"%>

<!-- Debut tableau -->
<section class="open-account-area ptb-100">
    <div class="container">
        <div class="open-account-form">
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
                        <label>Agence: ${agence.nomAgence}</label>
                    </div>
                </div>

                <div class="col-lg-6 col-md-6">
                    <div class="form-group">
                        <label>Adresse:${agence.adresse} </label>
                    </div>
                </div>
                <div class="col-lg-6 col-md-6">
                    <div class="form-group">
                        <label>Téléphone: ${agence.telephone}</label>
                    </div>
                </div>

                <div class="col-lg-12 col-md-12">
                    <div class="form-group">
                        <label class=""><h1>liste des agents</h1></label>
                    </div>
                </div>
            </div>
            <table class="table table-bordered" >
              <!--entete tableau-->
              <thead >
                <tr>
                  <th>Nom</th>
                  <th>Prenom</th>
                  <th>telephone</th>
                  <th>grade</th>
                  <th>adresse</th>
                </tr>
              </thead>
              <!--corpt tableau-->
              <tbody>
                <!--
                recuperation des donnÃ©es de la base par l'appÃ©l de la methode
                getUsers de la classe UserController s
                  --->

                <tr>
                  <th></th>
                  <th></th>
                  <th></th>
                  <th></th>
                  <th></th>

                </tr>
              </tbody>
            </table>
        </div>
    </div>
</section>
<!-- End Open Account Banner -->
<%@ include file="footer.jsp"%>