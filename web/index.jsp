<!DOCTYPE html>
<html>
<head>

    <title>YSF</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width , initial-scale=1">
    <link href="css/bootstrap.css" rel="stylesheet"/>
    <link rel="stylesheet" href="css/Footer-with-button-logo.css">
    <link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">

    <style>
        .carousel-inner > .item > img,
        .carousel-inner > .item > a > img {
            width: 100%;
            margin: auto;
        }

    </style>
</head>
<p id="myPage" data-spy="scroll" data-target=".navbar" data-offset="60" style="background-color: #F1F1F1">
<jsp:include page="_head.jsp"/>

<div class="center-block" >
    <div class="center-block" >
        <center><h2 class="text-center">Your Soccer Field</h2></center>
    </div>
</div>

<div class="container">
    <div id="myCarousel" class="carousel slide" data-ride="carousel">
        <div class="carousel slide"></div>
        <!-- Indicators -->
        <ol class="carousel-indicators">
            <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
            <li data-target="#myCarousel" data-slide-to="1"></li>
            <li data-target="#myCarousel" data-slide-to="2"></li>
        </ol>

        <!-- Wrapper for slides -->
        <div class="carousel-inner img-responsive" role="listbox">

            <div class="item active img-responsive">
                <img src="image/player.jpg" alt="Chania" width="460" height="345">
                <div class="carousel-caption">
                    <h3>RESERVACIONES</h3>
                    <p>Realiza tus reservaciones de canchas de futbol</p>
                </div>
            </div>

            <div class="item img-responsive">
                <img src="image/fields.jpg" alt="Chania" width="460" height="345">
                <div class="carousel-caption">
                    <h3>GESTIONA TUS ESTADIOS</h3>
                    <p>Administra tus canchas de futbol</p>
                </div>
            </div>

            <div class="item img-responsive">
                <img src="image/ball.jpg" alt="Flower" width="460" height="345">
                <div class="carousel-caption">
                    <h3>CONTROL</h3>
                    <p>Controla todo tus registro</p>
                </div>
            </div>


        </div>

        <!-- Left and right controls -->
        <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
            <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
            <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>
</div>

<br>

<br>
<!-- Container (About Section) -->
<div id="about" class="container-fluid img-responsive">
    <div class="row">
        <div class="col-sm-1">
        </div>
        <div class="col-sm-4">
            <h2 style="color: #3e8f3e">ACERCA </h2><br>
            <h3>Realiza tu reserva y pasa momentos deportivos jugando f&uacute;tbol
                en las mejores estadios de grass sint&eacute;tico .</h3><br>
        </div>
        <div class="col-sm-1">
        </div>
        <div class="col-sm-5 img-responsive">
            <span><img src="image/logoYSF.jpg" class="img-responsive img-rounded" WIDTH="650" HEIGHT="200"></span>
        </div>
    </div>
</div>

<!--->

<!--/footer-->
<hr>
<footer id="myFooter">
    <div class="footer-copyright text-center">
        <h5> Copyright 2017, NORS Todos los derechos reservados. Privacidad | Terminos y condiciones </h5>
    </div>
</footer>

<script src="js/jquery.js"></script>
<script src="js/bootstrap.js"></script>


</body>
</html>
