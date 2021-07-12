<%@include file="header.jsp"%>

<section class="open-account-area ptb-100">
  <div class="container">
    <div class="section-title">
        <h2>liste des agences</h2>
    </div>
      <!-- Debut tableau -->
      <table class="table table-bordered" >
        <!--entete tableau-->
        <thead >
          <tr>
            <th>Nom</th>
            <th>email</th>
            <th>adresse</th>
            <th>Telephone</th>
            <th scope="col">action</th>
          </tr>
        </thead>
        <!--corpt tableau-->
        <tbody>

        <c:forEach items="${agence}" var="a">
        <tr>
          <th>${a.nomAgence}</th>
          <th>${a.email}</th>
          <th>${a.adresse}</th>
          <th>${a.telephone}</th>
          <th>
            <a href="detailAgence?id=<c:out value='${a.idAgence}'/>"> <span class="material-icons">info</span></a>
            <a href="editAgence?id=<c:out value='${a.idAgence}'/>"> <span class="material-icons">edit_off</span></a>
            <a href="deleteAgence?id=<c:out value='${a.idAgence}'/>"><span class="material-icons">delete</span></a>
          </th>
        </tr>
        </c:forEach>
        </tbody>
      </table>
      <!-- Fin tableau -->
    </div>
</section>

<%@ include file="footer.jsp"%>