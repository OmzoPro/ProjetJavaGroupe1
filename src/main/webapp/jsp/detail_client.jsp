<%@include file="header2.jsp"%>

<!-- Debut tableau -->
<section class="open-account-area ptb-100">
    <div class="container">
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
                            <label><h1>Agence</h1></label>
                        </div>
                    </div>
                    <div class="col-lg-12 col-md-12">
                        <div class="form-group">
                            <label>nom Agence:</label>
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Adresse:</label>
                        </div>
                    </div>
                     <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Téléphone:</label>
                        </div>
                    </div>
                    <div class="col-lg-12 col-md-12">
                        <div class="form-group">
                            <label class=""><h1>Agent operant</h1></label>
                        </div>
                    </div>

                    <div class="col-lg-12 col-md-12">
                        <div class="form-group">
                            <label>nom agent:</label>
                        </div>
                    </div>

                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Adresse:</label>
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Téléphone:</label>
                        </div>
                    </div>
                    <table class="table table-bordered" >
      <!--entete tableau-->
      <thead >
        <tr>
          <th>N° compte</th>
          <th>operation</th>
          <th>date</th>
          <th>solde Avant</th>
          <th>solde Apres</th>

      </thead>
      <!--corpt tableau-->

      <tbody>
        <!--
        recuperation des données de la base par l'appél de la methode
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
               <div class="col-lg-12">

                    <div class="banner-form-btn">
                        <button onClick="return">return</button>
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
<%@ include file="footer.jsp"%>