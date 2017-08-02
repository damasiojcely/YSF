<%--
  Created by IntelliJ IDEA.
  User: lnakaya
  Date: 8/1/2017
  Time: 4:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Functions</title>
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
<body>
<p id="myPage" data-spy="scroll" data-target=".navbar" data-offset="60" style="background-color: #F1F1F1">

<jsp:include page="_head.jsp"/>
<!--->
<br>
<br>
<div id="pasos" class="container-fluid img-responsive">
    <div class="row">
        <div class="col-sm-1">
        </div>
        <div class="col-sm-6 img-responsive img-rounded">
            <span><img src="image/banner.jpg" class="img-responsive img-rounded" WIDTH="650" HEIGHT="200"></span>
        </div>
        <div class="col-sm-3">
            <h2>Tu Reserva en 4 Pasos</h2><br>
            <div class="details-list">
                <ul>
                    <li><i class="fa fa-check"></i>Registrate totalmente gratis</li>
                    <li><i class="fa fa-check"></i>Selecciona tu mejor  horario</li>
                    <li><i class="fa fa-check"></i>Busca tu cancha favorita</li>
                    <li><i class="fa fa-check"></i>Reserva tu cancha y pasa un momento innovidable.</li>
                </ul>
            </div>
        </div>

    </div>
</div>


<hr>
<br>
<!---->
<p>
    <section id="feature" class="section-padding wow fadeIn delay-05s" >
        <div class="container">
            <div class="row">
                <div class="col-md-3 col-sm-6 col-xs-12">
                    <div class="wrap-item text-center">
                        <div class="item-img">
                            <img src="image/foot.png" class="img-responsive imgcenter">
                        </div>
                        <h3 class="pad-bt15">Reservas</h3>
<p class="text-center"> Reserva tu cancha desde  cualquier parte del país.</p>
</div>
</div>

<div class="col-md-3 col-sm-6 col-xs-12">
    <div class="wrap-item text-center">
        <div class="item-img">
            <img src="image/clock.png" class="img-responsive imgcenter">
        </div>
        <h3 class="pad-bt15">Tiempo</h3>
        <p class="text-center">Ahorra el tiempo de ir a separar tu cancha ,con un click ten el control en tus manos.</p>
    </div>
</div>
<div class="col-md-3 col-sm-6 col-xs-12">
    <div class="wrap-item text-center">
        <div class="item-img">
            <img src="image/servicios.png" class="img-responsive imgcenter">
        </div>
        <h3 class="pad-bt15">Servicios Adicionales</h3>
        <p class="text-center"> Reserva tus canchas y accede a servicios adicionales</p>
    </div>
</div>
<div class="col-md-3 col-sm-6 col-xs-12">
    <div class="wrap-item text-center">
        <div class="item-img">
            <img src="image/reserva.png" class="img-responsive imgcenter">
        </div>
        <h3 class="pad-bt15">Promociona tu cancha</h3>
        <p class="text-center"> Innovate y promociona tu cancha, para una mejor experiencia.</p>
    </div>
</div>

</div>
</div>
</section>
</p>

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
