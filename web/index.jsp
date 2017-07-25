<!DOCTYPE html>
<html lang="en">
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
<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="60" style="background-color: #ffffff">


      <h1 class="text-center"> <span class="glyphicon-text-color"> NORS | YSF </span></h1>

<div class="row">
    <div class="col-md-12">

        <div class="container">

<nav class="navbar navbar-inverse ">

        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="index.jsp"> NORS | YSF</a>
        </div>
        <div class="collapse navbar-collapse" id="myNavbar">
            <ul class="nav navbar-nav ">
                <li class="active"><a href="index.jsp" class="glyphicon glyphicon-home" > HOME </a></li>
            </ul>

            <ul class="nav navbar-nav navbar-right">
                <li><a href="about.jsp">ACERCA</a></li>
                <li><a href="">FUNCIONES</a></li>
                <li><a href="">CONTACTANOS</a></li>
                <li><a href="#"class="glyphicon glyphicon-user" data-toggle="dropdown"> REGISTRARSE <span class="caret"></span> </a>

                    <ul class="dropdown-menu" role="menu">
                        <li><a role="menuitem" tabindex="-1" href="newOwner.jsp">Due&ntilde;o</a></li>
                        <li><a role="menuitem" tabindex="-1" href="newOrganizer.jsp">Organizador</a></li>
                    </ul>
                </li>

                <li><a href="login.jsp" class="glyphicon glyphicon-log-in" > INGRESAR</a></li>
            </ul>
        </div>


</nav>
        </div>
    </div>
</div>

      <div class="row">
          <div class="col-md-12">

    <div id="myCarousel" class="carousel slide" data-ride="carousel">
        <div class="carousel slide"></div>
        <!-- Indicators -->
        <ol class="carousel-indicators">
            <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
            <li data-target="#myCarousel" data-slide-to="1"></li>
            <li data-target="#myCarousel" data-slide-to="2"></li>
        </ol>

        <!-- Wrapper for slides -->
        <div class="carousel-inner" role="listbox">

            <div class="item active">
                <img src="image/player.jpg" alt="Chania" width="460" height="345">
                <div class="carousel-caption">
                    <h3>RESERVACIONES</h3>
                    <p>Realiza tus reservaciones de canchas de futbol</p>
                </div>
            </div>

            <div class="item">
                <img src="image/fields.jpg" alt="Chania" width="460" height="345">
                <div class="carousel-caption">
                    <h3>GESTIONA TUS ESTADIOS</h3>
                    <p>Administra tus canchas de futbol</p>
                </div>
            </div>

            <div class="item">
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
      </div>


<!-- Container (About Section) -->
<div id="about" class="container-fluid">
    <div class="row">
        <div class="col-sm-8">
            <h2>Acerca </h2><br>
            <h4>Realiza tu reserva y pasa momentos deportivos jugando futbol
                en las mejores estadios de grass sintetico .</h4><br>
        </div>
        <div class="col-sm-4">
            <span><img src="image/ball.jpg" WIDTH="430" HEIGHT="350"></span>
        </div>
    </div>
</div>

     <%-- <div style="background-color: #253340">
<div id="contact" class="container-fluid bg-grey">
    <div></div>
    <h2 class="text-center">CONTACTO</h2>
    <div class="row">
        <div class="col-sm-5">
            <p>Contactese con nosotros y nos pondremos en contacto con usted en 24 horas.</p>
            <p><span class="glyphicon glyphicon-map-marker"></span> Lima , Peru</p>
            <p><span class="glyphicon glyphicon-phone"></span> +51935922205</p>
            <p><span class="glyphicon glyphicon-envelope"></span> wilmerleonel1717@gmail.com</p>
        </div>
        <div class="col-sm-7 slideanim">
            <div class="row">
                <div class="col-sm-6 form-group">
                    <input class="form-control" id="name" name="name" placeholder="Nombre" type="text" required>
                </div>
                <div class="col-sm-6 form-group">
                    <input class="form-control" id="email" name="email" placeholder="Email" type="email" required>
                </div>
            </div>
            <textarea class="form-control" id="comments" name="comments" placeholder="Comentario" rows="5"></textarea><br>
            <div class="row">
                <div class="col-sm-12 form-group">
                    <button class="btn btn-default pull-right" type="submit"> Enviar</button>
                </div>
            </div>
        </div>
    </div>
</div>
      </div>
--%>
      <footer id="myFooter">
          <div class="container">
              <div class="row">
                  <div class="col-sm-3">
                      <h2 class="logo"><a href="#"> NORS | YSF  </a></h2>
                  </div>
                  <div class="col-sm-2">
                      <h5> Funciones </h5>
                      <ul>
                          <li><a href="#">Home</a></li>
                          <li><a href="#">Sign up</a></li>
                          <li><a href="#">Downloads</a></li>
                      </ul>
                  </div>
                  <div class="col-sm-2">
                      <h5> Acerca </h5>
                      <ul>
                          <li><a href="#">Company Information</a></li>
                          <li><a href="#">Contact us</a></li>
                          <li><a href="#">Reviews</a></li>
                      </ul>
                  </div>
                  <div class="col-sm-2">
                      <h5> Contactanos</h5>
                      <ul>
                          <li><a href="#">FAQ</a></li>
                          <li><a href="#">Help desk</a></li>
                          <li><a href="#">Forums</a></li>
                      </ul>
                  </div>
                  <div class="col-sm-3">
                      <div class="social-networks">
                          <a href="#" class="twitter"><i class="fa fa-twitter"></i></a>
                          <a href="#" class="facebook"><i class="fa fa-facebook"></i></a>
                          <a href="#" class="google"><i class="fa fa-google-plus"></i></a>
                          <a href="" class=""><i class=" "></i></a>

                      </div>
                      <button type="button" class="btn btn-default"> Contact</button>
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

