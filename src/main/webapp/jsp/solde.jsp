<%@include file="header.jsp"%>
<!-- Start Grow Area -->
<section class="grow-area ptb-100">
    <div class="container">
        <div class="row align-items-center">
            <div class="col-lg-6">
                <div class="grow-image">
                    <img src="assets/img/grow.png" alt="image">
                </div>
            </div>

            <div class="col-lg-6">
                <div class="grow-content">
                    <span>AaskanBi_Bank</span>
                    <hr>
                    <h4>le solde de votre compte est:</h4>
                    <hr>
                    <center><h4><span><c:out value="${sessionScope['comptecon'].solde }"></c:out> Fcfa</span></h4></center>
                    <hr>
                    <p>Merci de votre visite <c:out value="${sessionScope['clientcon'].prenom }"></c:out> <c:out value="${sessionScope['clientcon'].nom }"></c:out></p>

                </div>
            </div>
        </div>
    </div>
</section>
<!-- End Grow Area -->
<%@include file="footer.jsp"%>
