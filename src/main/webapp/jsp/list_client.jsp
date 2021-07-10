<%@include file="header2.jsp"%>
<section class="open-account-area ptb-100">
  <div class="container">
    <div class="section-title" >
        <h2>liste des Clients</h2>
    </div>
    <!-- Debut tableau -->
    <table class="table table-bordered" >
      <!--entete tableau-->
      <thead >
        <tr>
          <th>Nom</th>
          <th>Prenom</th>
          <th>telephone</th>
          <th>adresse</th>
          <th scope="col">action</th>
        </tr>
      </thead>
      <!--corpt tableau-->
      <tbody>
        <c:forEach items="${client}" var="t">
        <tr>
          <th>${t.nom}</th>
          <th>${t.prenom}</th>
          <th>${t.adresse}</th>
          <th>${t.telephone}</th>
          <th>
            <a href="detailAgent?id=<c:out value='${t.idClient}'/>"> <span class="material-icons">info</span></a>
            <a href="editAgent?id=<c:out value='${t.idClient}'/>"> <span class="material-icons">edit_off</span></a>
            <a href="deleteAgent?id=<c:out value='${t.idClient}'/>"><span class="material-icons">delete</span></a>
          </th>
        </tr>
        </c:forEach>
      </tbody>
    </table>
    <!-- Fin tableau -->

  </div>
</section>

<%@ include file="footer.jsp"%>