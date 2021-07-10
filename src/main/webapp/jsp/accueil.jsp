<%@include file="header2.jsp"%>
<!-- Start Main Banner Area -->
<div class="main-banner">
    <div class="main-banner-item banner-item-three">
        <div class="container">
            <div class="row align-items-center">
                <div class="col-lg-6">
                    <div class="main-banner-content">
                        <h1>Rejoignez la banque Aaskanbi une banque mutualiste et responsable</h1>
                        <p>Votre transfert de compte est facilité, changement de vie ou de région, votre Banque Aaskanbi vous accompagne et facilite votre démarche. </p>
                        <c:if test="${sessionScope['role'] == 'client' }">
                        <div class="banner-btn">
                        <a href="" class="default-btn">Consultez votre solde</a>
                        </div>
                        </c:if>
                    </div>
                </div>

                <div class="col-lg-6">
                    <div class="main-banner-image">
                        <img src="assets/img/main-banner/banner-image-2.jpg" alt="image">
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div class="main-banner-shape">
        <div class="shape-1">
            <img src="assets/img/main-banner/banner-shape-2.png" alt="image">
        </div>
        <div class="shape-2">
            <img src="assets/img/main-banner/banner-shape-3.png" alt="image">
        </div>
        <div class="shape-3">
            <img src="assets/img/main-banner/banner-shape-4.png" alt="image">
        </div>
    </div>
</div>
<!-- End Main Banner Area -->

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
                    <h3>A propos de nous</h3>
                    <p>Acteur clé de l’économie régionale, Banque Aaskanbi s’est fixée pour objectif d’accompagner tout ceux qui entreprennent sur le chemin de la réussite. <br>Banque Aaskanbi, elle est la propriété de ses clients. <br><br>S’engager au service des projets personnels et professionnels de ses clients et sociétaires, et les accompagner dans la durée, tel est l’esprit Banque Aaskanbi.
                    Un conseiller a l’écoute de vos besoins.<br>
                    <br><br>Chez Banque AasKanbi, tous les clients bénéficient d’un conseiller dédier. <br>Epaulé par un réseau d’experts il vous connait et est à votre disposition pour vous accompagner dans tous vos projets.
                    </p>

                </div>
            </div>
        </div>
    </div>
</section>
<!-- End Grow Area -->

<!-- Start Operate Area -->
<section class="operate-area ptb-100">
    <div class="container">
        <div class="row align-items-center">
            <div class="col-lg-6">
                <div class="operate-content">
                    <span>AaskanBi_Bank</span>
                    <h2>Ouvrir un compte : les documents à communiquer </h2>
                    <h3>En vue de l’ouverture des comptes, vous devez notamment transmettre les principaux documents :</h3>
                    <p>Une pièce en cours de validités (carte d’identité, passeport ou titre de séjours).
                    <br>Un justificatif de domicile de moins de trois mois.
                    <br>Un justificatif d’activité (avis d’imposition, carte d’étudiant…).
                    <br>D’autres documents avec une date récente, peuvent vous être demandé en fonction de votre situation personnelle et professionnelle
                    </p>
                </div>
            </div>

            <div class="col-lg-6">
                <div class="operate-image">
                    <img src="assets/img/operate.png" alt="image">
                </div>
            </div>
        </div>
    </div>
</section>
<!-- End Operate Area -->

<!-- Start Fun Facts Area -->
<section class="fun-facts-area bg-color pt-100 pb-70">
    <div class="container">
        <div class="section-title">
            <span>Pourquoi nous choisir</span>
            <h2>Notre banque est au service de ses clients avec beaucoup de professionalisme.</h2>
        </div>

        <div class="row">
            <div class="col-lg-3 col-md-6 col-sm-6">
                <div class="single-fun-fact">
                    <div class="icon">
                        <i class="flaticon-positive-vote"></i>
                    </div>

                    <h3>
                        <span class="odometer" data-count="358412">00</span>
                    </h3>
                    <p>Des clients satisfaits</p>
                </div>
            </div>

            <div class="col-lg-3 col-md-6 col-sm-6">
                <div class="single-fun-fact">
                    <div class="icon">
                        <i class="flaticon-confetti"></i>
                    </div>

                    <h3>
                        <span class="odometer" data-count="25">00</span>
                    </h3>
                    <p>projets finnancés</p>
                </div>
            </div>

            <div class="col-lg-3 col-md-6 col-sm-6">
                <div class="single-fun-fact">
                    <div class="icon">
                        <i class="flaticon-bank"></i>
                    </div>

                    <h3>
                        <span class="odometer" data-count="2545">00</span>
                    </h3>
                    <p>Nos succursales</p>
                </div>
            </div>

            <div class="col-lg-3 col-md-6 col-sm-6">
                <div class="single-fun-fact">
                    <div class="icon">
                        <i class="flaticon-success"></i>
                    </div>

                    <h3>
                        <span class="odometer" data-count="54285">00</span>
                    </h3>
                    <p>Fonctionne avec succès</p>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- End Fun Facts Area -->

<!-- Start Partner Area -->
<div class="partner-area ptb-100">
    <div class="container">
        <div class="partner-slider owl-carousel owl-theme">
            <div class="partner-item">
                <img src="assets/img/partner/partner-1.png" alt="image">
            </div>

            <div class="partner-item">
                <img src="assets/img/partner/partner-2.png" alt="image">
            </div>

            <div class="partner-item">
                <img src="assets/img/partner/partner-3.png" alt="image">
            </div>

            <div class="partner-item">
                <img src="assets/img/partner/partner-4.png" alt="image">
            </div>

            <div class="partner-item">
                <img src="assets/img/partner/partner-5.png" alt="image">
            </div>
        </div>
    </div>
</div>
<!-- End Partner Area -->
<%@ include file="footer.jsp"%>