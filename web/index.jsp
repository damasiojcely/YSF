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
<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="60" style="background-color: #F1F1F1">
<jsp:include page="_head.jsp"/>

<div class="row" >
    <div class="col-sm-6" >
        <h1 class="text-center">Your Soccer Field</h1>
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
<!-- Container (About Section) -->
<div id="about" class="container-fluid img-responsive">
    <div class="row">
        <div class="col-sm-1">
        </div>
        <div class="col-sm-3">
            <h2>Acerca </h2><br>
            <h4>Realiza tu reserva y pasa momentos deportivos jugando f&uacute;tbol
                en las mejores estadios de grass sint&eacute;tico .</h4><br>
        </div>
        <div class="col-sm-6 img-responsive">
            <span><img src="image/logoYSF.jpg" class="img-responsive" WIDTH="650" HEIGHT="200"></span>
        </div>
    </div>
</div>
<div>
</div>



<footer id="myFooter">
    <div class="container">
        <div class="row">
            <div class="col-sm-2">
                <h1 class="logo"><a href="#">NORS | YSF</a></h1>
                <div class="social-networks">
                    <a href="#" class="twitter"><i class="fa fa-twitter"></i></a>
                    <a href="#" class="facebook"><i class="fa fa-facebook"></i></a>
                    <a href="#" class="google"><i class="fa fa-google-plus"></i></a>
                </div>
            </div>
            <div class="col-sm-4">
                <h2 class="text-center">CONTACTO</h2>
                <p>Cont&aacute;ctese con nosotros y nos pondremos en contacto con usted en 24 horas.</p>
                <p><span class="glyphicon glyphicon-map-marker"></span> Lima , Peru</p>
                <p><span class="glyphicon glyphicon-phone"></span> +51935922205 / +51982095001 / +51953707278 / +51992196567</p>
                <p><span class="glyphicon glyphicon-envelope"></span> yoursoccerfield@gmail.com</p>
            </div>
            <div class="slideanim img-responsive">
                <div class="col-sm-6">
                    <div>
                        <p> </p><br>
                        <input class="form-control" id="email" name="email" placeholder="Email" type="email" required><br>
                        <textarea class="form-control" name="comments" placeholder="Comentario" rows="5"></textarea><br>
                        <button class="btn btn-default pull-right" type="submit"> Enviar</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="footer-copyright">
        <p> Copyright 2017, NORS Todos los derechos reservados. Privacidad | Terminos y condiciones </p>
    </div>
</footer>

<script src="js/jquery.js"></script>
<script src="js/bootstrap.js"></script>

</body>
</html>