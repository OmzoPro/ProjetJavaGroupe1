<%@include file="header2.jsp"%>
<!-- Debut tableau -->
<section class="open-account-area ptb-100">
   <div class="container">
      <div class="section-title">

      </div>
      <div class="open-account-form">
         <form>
            <div class="row">
               <div class="col-lg-6 col-md-6">
                  <div class="form-group">
                     <div class="logo">
                        <img src="assets/img/logo-3.png" alt="image">
                     </div>
                  </div>
               </div>

               <div class="col-lg-12 col-md-12">
                  <div class="form-group">
                     <label class=""><h1>Agence: ${agent.idAgent}</h1></label>
                     idAgent: ${agent.idAgent} <br>
                     idAgence: ${agent.idAgence}
                     
                  </div>
               </div>
               <div class="col-lg-12 col-md-12">
                  <div class="form-group">
                     <label >nom Agence:${agenceagent.nomAgence}</label>
                  
                  </div>
               </div>
               <div class="col-lg-6 col-md-6">
                  <div class="form-group">
                     <label>Adresse:${agenceagent.adresse}</label>
                  </div>
               </div>
               <div class="col-lg-6 col-md-6">
                  <div class="form-group">
                     <label>Téléphone${agenceagent.telephone}</label>
                  </div>
               </div>
               <div class="col-lg-12 col-md-12">
                  <div class="form-group">
                     <label class=""><h1>liste des operations</h1></label>
                  </div>
               </div>
               <table class="table table-bordered" >
                  <!--entete tableau-->
                  <thead >
                     <tr>
                        <th>N° Compte</th>
                        <th>opération</th>
                        <th>date</th>
                        <th>solde Avant</th>
                        <th>solde Apres</th>
                     </tr>
                  </thead>
                  <tbody>
                   
                     <tr>
                        <th></th>
                        <th></th>
                        <th></th>
                        <th></th>
                        <th></th>
                     </tr>
                  </tbody>
               </table>
               <div class="col-lg-12 col-md-12">
                  <div class="form-group">
                     <label class=""><h1>liste des clients</h1></label>
                  </div>
               </div>
               <table class="table table-bordered" >
                  <!--entete tableau-->
                  <thead >
                     <tr>
                     <th>Nom</th>
                     <th>Prenom</th>
                     <th>telephone</th>
                     <th>N° compte</th>
                     <th>adresse</th>
                  </tr>
                  </thead>
                  <!--corpt tableau-->
                  <tbody>
                     <!--
                     recuperation des donnÃ©es de la base par l'appÃ©l de la methode
                     getUsers de la classe UserController s
                     --->
                     <c:forEach items="${'listeClientAgent'}" var="l">
				        <tr>
				          <th>${l.nom}</th>
				          <th>${l.prenom}</th>
				          <th>${l.telephone}</th>
				          <th>${compteclientagent.numCompte}</th>
				          <th>${l.adresse}</th>
				          
				        </tr>
			        </c:forEach>
                  </tbody>
               </table>
            </div>
         </form>
      </div>
   </div>
</section>
<!-- End Open Account Banner -->

<%@include file="footer.jsp"%>