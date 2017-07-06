
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://bootstrapjsp.org/" prefix="b" %>
<html lang="en">
<head>
  <title>PAGINA PRINCIPAL YOUR SOCCER FIELD </title>
    <jsp:include page="bootstrap.jsp"/>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style>
        .carousel-inner > .item > img,
        .carousel-inner > .item > a > img {
            width: 70%;
            margin: auto;
        }
    </style>
</head>
<body>

<div class="header">
  <div class="container">
    <div class="agile_header_grid">
      <div class="w3_agile_logo">
        <h1><a href="index.jsp"><span>Your</span>Soccer Field</a></h1>
      </div>
      <div class="agileits_w3layouts_sign_in">
      </div>
      <div class="clearfix"> </div>
    </div>

    <%-- ok --%>
    <nav class="nav navbar-inverse">
        <div class="container-fluid">
            <ul class="nav navbar-nav">
                <li class="active"><a href="index.jsp">Inicio</a></li>
                <li><a href="" > Funciones </a></li>
                <li><a href="">Acerca</a></li>
                <li><a href="">Galeria</a></li>
                <li><a href="">Contactanos</a></li>
                <li><a href="index2.jsp">Iniciar Sesión</a></li>
                <li><a href="">Registrate</a></li>
            </ul>
        </div>
    </nav>

  </div>
</div>

<div class="container">
<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
        <div class="item active" alt="Chania" width="600" height="345">
            <img src="image/ball.jpg" alt="Chania">
            <div class="carousel-caption">
                <h3>ball</h3>
                <p>the ball</p>
            </div>
        </div>

        <div class="item">
            <img src="image/fields.jpg" alt="Chania" alt="Chania" width="460" height="345">
            <div class="carousel-caption">
                <h3>fields </h3>
                <p>the field</p>
            </div>
        </div>

        <div class="item">
            <img src="image/player.jpg" alt="Flower" alt="Chania" width="460" height="345">
            <div class="carousel-caption">
                <h3>jugador</h3>
                <p>the player</p>
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

<%--
<!-- //banner -->
<!-- bootstrap-pop-up -->
<div class="modal video-modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModal">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        SportConexus
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
      </div>
      <section>
        <div class="modal-body">
          <img src="images/banner.jpg" alt=" " class="img-responsive" />
          <p>Comparte momentos inolvidables con tus amigos gracias a "SportConnexus"
            SportConnexus te ofrece una gran cantidad de espacios deportivos para elegir
            la mejor opcion que se adapte a tus necesidades.
            <i>"Reservar un lugar deportivo disponible nunca ha sido más fácil"</i></p>
        </div>
      </section>
    </div>
  </div>
</div>

<div class="two-grids">
  <div class="col-md-6 w3_two_grid_left">
    <img src="images/2.jpg" alt=" " class="img-responsive" />
  </div>
  <div class="col-md-6 w3_two_grid_right">
    <h3>Ten momentos divertidos</h3>
    <p class="w3layouts_dummy_para"></p>
    <div class="w3_two_grid_right1">
      <div class="col-xs-3 w3_two_grid_right_grid">
        <div class="w3_two_grid_right_grid1">
          <i class="fa fa-thumbs-up" aria-hidden="true"></i>
        </div>
      </div>
      <div class="col-xs-9 w3_two_grid_right_gridr">
        <h4>Registro</h4>
        <p>Registro de Equipos.</p>
      </div>
      <div class="clearfix"> </div>
    </div>
    <div class="w3_two_grid_right1">
      <div class="col-xs-3 w3_two_grid_right_grid">
        <div class="w3_two_grid_right_grid1">
          <i class="fa fa-building" aria-hidden="true"></i>
        </div>
      </div>
      <div class="col-xs-9 w3_two_grid_right_gridr">
        <h4>Calendario</h4>
        <p>Disponibilidad de espacios deportivos.</p>
      </div>
      <div class="clearfix"> </div>
    </div>
    <div class="w3_two_grid_right1">
      <div class="col-xs-3 w3_two_grid_right_grid">
        <div class="w3_two_grid_right_grid1">
          <i class="fa fa-wrench" aria-hidden="true"></i>
        </div>
      </div>
      <div class="col-xs-9 w3_two_grid_right_gridr">
        <h4>Mantenimiento </h4>
        <p>Mantenimiento de espacios deportivos.</p>
      </div>
      <div class="clearfix"> </div>
    </div>
    <div class="w3_two_grid_right1">
      <div class="col-xs-3 w3_two_grid_right_grid">
        <div class="w3_two_grid_right_grid1">
          <i class="fa fa-trophy" aria-hidden="true"></i>
        </div>
      </div>
      <div class="col-xs-9 w3_two_grid_right_gridr">
        <h4> Torneos internos </h4>
        <p>Competicion de entre equipos. </p>
      </div>
      <div class="clearfix"> </div>
    </div>
  </div>
  <div class="clearfix"> </div>
</div>

<div class="footer">
  <div class="container">
    <div class="w3_footer_grids">
      <div class="col-md-4 w3_footer_grid">
        <h2><a href="index.jsp"><span>Sport</span>Connexus</a></h2>
        <p>Nuestra Web <a href="#">http:///SportConnexus.com</a> WebSite de reservacion de espacios deportivo.</p>
      </div>
      <div class="col-md-3 w3_footer_grid">
        <div class="w3l_footer_grid">
          <i class="fa fa-home" aria-hidden="true"></i>
        </div>
        <h4>Dirección</h4>
        <p>Av. José Carlos Mariátegui 375 urb. Lucyana Distrito: Los Olivos</p>
      </div>
      <div class="col-md-2 w3_footer_grid">
        <div class="w3l_footer_grid">
          <i class="fa fa-phone" aria-hidden="true"></i>
        </div>
        <h4>Llamanos al: </h4>
        <p>+(01) 543 5225 <span>+(51) 982 220 552 </span></p>
      </div>
      <div class="col-md-3 w3_footer_grid">
        <div class="w3l_footer_grid">
          <i class="fa fa-envelope" aria-hidden="true"></i>
        </div>
        <h4>Correos: </h4>
        <p><a href="mailto:info@example.com">info@SportConnexus.com</a>
          <span><a href="mailto:info@example.com">administracion@SportConnexus.com</a></span></p>
      </div>
      <div class="clearfix"> </div>
    </div>
  </div>
</div>
<div class="copyright">
  <div class="container">
    <div class="w3ls_copyright_left">
      <ul>
        <li><a href="services.jsp">Servicios</a></li>
        <li><a href="about.jsp">Acerca</a></li>
        <li><a href="portfolio.jsp">Galería</a></li>
        <li><a href="contact.jsp">Contáctanos</a></li>
      </ul>
      <p> © 2017 SportConnexus. Todos los Derechos Reservados </p>
    </div>
    <div class="w3ls_copyright_right">
      <ul>
        <li><a href="#" class="w3_agile_facebook"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
        <li><a href="#" class="agile_twitter"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
        <li><a href="#" class="w3_agile_dribble"><i class="fa fa-dribbble" aria-hidden="true"></i></a></li>
        <li><a href="#" class="w3_agile_vimeo"><i class="fa fa-vimeo" aria-hidden="true"></i></a></li>
      </ul>
    </div>
    <div class="clearfix"> </div>
  </div>
</div>

--%>

</body>
</html>
