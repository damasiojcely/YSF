<!DOCTYPE html>
<html>
<head>

    <title>About</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width , initial-scale=1">
    <link href="css/bootstrap.css" rel="stylesheet"/>
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


<div class="center-block" >
    <div class="center-block" >
        <center><h2 class="text-center">Conoce acerca de nosotros</h2></center>
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
                <img src="image/jugador.jpg" alt="Chania" width="460" height="345">
                <div class="carousel-caption">
                    <h3>RESERVACIONES</h3>
                    <h4>Realiza tus reservaciones de canchas de futbol</h4>
                </div>
            </div>

            <div class="item img-responsive">
                <img src="image/arquero.jpg" alt="Chania" width="460" height="345">
                <div class="carousel-caption">
                    <h3>GESTIONA TUS ESTADIOS</h3>
                    <h5>Administra tus canchas de futbol</h5>
                </div>
            </div>

            <div class="item img-responsive">
                <img src="image/pelota.jpg" alt="Flower" width="460" height="345">
                <div class="carousel-caption">
                    <h3>CONTROL</h3>
                    <h5>Controla todos tus registro</h5>
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

<div id="about" class="container-fluid img-responsive">
    <div class="row">
        <div class="col-sm-1">
        </div>
        <div class="col-sm-5">
            <h2>Your Soccer Field</h2><br>
            <h4 class="text-justify">Esta plataforma te ayudar&aacute; a encontrar canchas para alquilar de una manera r&aacute;pida y sencilla.
                Si tienes un local de alquiler de cancha tambi&eacute;n podr&aacute;s promocionar y los usuarios podr&aacute;n encontarte.
                Ahora podr&aacute;s encontrar tu cancha al alcance de tus manos desde una computadora o dispositivo m&oacute;vil y poder contar adem&aacute;s con
                amplios servicios que podr&aacute;s disfrutar con tus amigos.

            </h4><br>
        </div><p> </p>
        <div class="col-sm-5">
            <span><img src="image/logoYSF.jpg" class="img-responsive" WIDTH="650" HEIGHT="250"></span>
        </div>

    </div>
    <div class="col-sm-1">
    </div>
    <div class="img-responsive">
        <center><h3><span>Reserva tu cancha sin moverte de tu casa y sin demora</span></h3></center>

    </div>
</div>

<br>



<!--->
<!--galeria-->
<div id="service">
    <div class="container">
        <div class="row">
            <div class="col-xs-12 col-md-6 col-md-offset-3">
                <div class="service-heading">
                    <h2>GALERIA </h2>
                </div>
            </div>
        </div>
    </div>
</div>
<section id="section-works" class="section appear clearfix">
    <div class="container">
        <div class="row">
            <div class="container">
                <div class="row">

                    <div class="gallery">
                        <figure>
                            <img  src="image/index/cancha1.jpg"  class="img-responsive mediana imgcenter" alt="" />
                            <figcaption>Canchitas Vip <small>Lima- Surco</small></figcaption>
                        </figure>
                        <figure>
                            <img src="image/index/cancha2.jpg"  class="img-responsive mediana imgcenter" alt="" />
                            <figcaption>Complejo Liceo Naval  <small>Lima - San Borja</small></figcaption>
                        </figure>
                        <figure>
                            <img src="image/index/cancha3.jpg"  class="img-responsive mediana imgcenter" alt="" />
                            <figcaption>La 7 San Luis <small> Lima- San Luis</small>
                            </figcaption>
                        </figure>
                        <figure>
                            <img src="image/index/adicional3.jpg"  class="img-responsive mediana imgcenter" alt="" />
                            <figcaption>Camerinos Personalizados <small>Lima-Peru</small></figcaption>
                        </figure>
                        <figure>
                            <img src="image/index/adicional5.jpg"  class="img-responsive mediana imgcenter" alt="" />
                            <figcaption>
                                Camisetas<small>Servicios Adicionales</small>
                            </figcaption>
                        </figure>
                        <figure>
                            <img src="image/index/adicional1.jpg"  class="img-responsive mediana imgcenter" alt="" />
                            <figcaption>Restaurante <small>Servicios Adicionales</small></figcaption>
                        </figure>
                    </div>

                    <svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" style="display:none;">
                        <symbol id="close" viewBox="0 0 18 18">
                            <path fill-rule="evenodd" clip-rule="evenodd" fill="#FFFFFF" d="M9,0.493C4.302,0.493,0.493,4.302,0.493,9S4.302,17.507,9,17.507
			S17.507,13.698,17.507,9S13.698,0.493,9,0.493z M12.491,11.491c0.292,0.296,0.292,0.773,0,1.068c-0.293,0.295-0.767,0.295-1.059,0
			l-2.435-2.457L6.564,12.56c-0.292,0.295-0.766,0.295-1.058,0c-0.292-0.295-0.292-0.772,0-1.068L7.94,9.035L5.435,6.507
			c-0.292-0.295-0.292-0.773,0-1.068c0.293-0.295,0.766-0.295,1.059,0l2.504,2.528l2.505-2.528c0.292-0.295,0.767-0.295,1.059,0
			s0.292,0.773,0,1.068l-2.505,2.528L12.491,11.491z"/>
                        </symbol>
                    </svg>
                </div>
            </div>
        </div>
    </div>
</section>
<!--/--->
<!---->
<script src="js/jquery.js"></script>
<script src="js/bootstrap.js"></script>

<script>
    popup = {
        init: function(){
            $('figure').click(function(){
                popup.open($(this));
            });

            $(document).on('click', '.popup img', function(){
                return false;
            }).on('click', '.popup', function(){
                popup.close();
            })
        },
        open: function($figure) {
            $('.gallery').addClass('pop');
            $popup = $('<div class="popup" />').appendTo($('body'));
            $fig = $figure.clone().appendTo($('.popup'));
            $bg = $('<div class="bg" />').appendTo($('.popup'));
            $close = $('<div class="close"><svg><use xlink:href="#close"></use></svg></div>').appendTo($fig);
            $shadow = $('<div class="shadow" />').appendTo($fig);
            src = $('img', $fig).attr('src');
            $shadow.css({backgroundImage: 'url(' + src + ')'});
            $bg.css({backgroundImage: 'url(' + src + ')'});
            setTimeout(function(){
                $('.popup').addClass('pop');
            }, 10);
        },
        close: function(){
            $('.gallery, .popup').removeClass('pop');
            setTimeout(function(){
                $('.popup').remove()
            }, 100);
        }
    }

    popup.init()


</script>
<hr>
<footer id="myFooter">
    <div class="footer-copyright text-center">
        <h5> Copyright 2017, NORS Todos los derechos reservados. Privacidad | Terminos y condiciones </h5>
    </div>
</footer>
</body>
</html>
