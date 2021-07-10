<%@include file="header2.jsp"%>
<!-- Start Open Account Banner -->
<section class="open-account-area ptb-100">
    <div class="container">
        <div class="section-title">
            <h2>Formulaire pour ajout agent</h2>
        </div>
        <div class="open-account-form">
            <form action="<%=request.getContextPath()%>/ajoutAgent" method="post">
                <div class="row">
               		<c:choose>
	                	<c:when test="${sessionScope['user'].role == 'super_admin' }">
					   		<input type="hidden" name="grade" value="chef_agent">
	                		<div class="col-lg-6 col-md-6">
	                			<div class="form-group">
							        <label>Agence</label>
								    <select name="idAgence" class="form-control">
							        	<c:forEach items="${agence}" var="a">
							        	<option value="<c:out value='${a.idAgence}'/>">${a.nomAgence} </option>
								       </c:forEach>
						        	</select>
						        </div>
					        </div>
	                 	</c:when>
	                 	<c:when test="${sessionScope['user'].role == 'chef_agent' }">
	                	
					   		<input type="hidden" name="grade" value="agent">
					   		<input type="hidden" name="idAgence" value="<c:out value="${sessionScope['agentcon'].idAgence }"/>">
	                		
	                 	</c:when>
					</c:choose>
                            
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
                            <label>Sexe</label>
                             <select name="sexe" class="form-control">
                                <option value="masculin">Masculin</option>
                                <option value="feminin">Feminin</option>
                            </select>
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
                            <input required="required" type="text" class="form-control" placeholder="fo deuk" name="adresse">
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>Login</label>
                            <input required="required" type="text" class="form-control" placeholder="login" name="login">
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <div class="form-group">
                            <label>password</label>
                            <input required="required" type="Password" class="form-control" placeholder="password" name="password">
                        </div>
                    </div>
                    <div class="col-lg-12">
                        <div class="banner-form-btn">
                        <button type="submit" class="btn btn-primary">Ajouter</button>
                        </div>
                    </div>
                </div>
            </form>
        </div>
    </div>
</section>
<!-- End Open Account Banner -->
<%@ include file="footer.jsp"%>