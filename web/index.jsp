
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://bootstrapjsp.org/" prefix="b" %>
<%@ taglib prefix=";color" uri="http://bootstrapjsp.org/" %>
<html lang="en">
<head>
  <title>PAGINA PRINCIPAL</title>
    <jsp:include page="bootstrap.jsp"/>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style>
        .carousel-inner > .item > img,
        .carousel-inner > .item > a > img {
            width: 100%;
            margin: auto;
        }
    </style>
</head>
<body>

<div class="header">
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">YSF</a>
                </div>
                <ul class="nav navbar-nav">
                    <li class="active"><a href="index.jsp">Home</a></li>
                    <li><a href="#">Acerca</a></li>
                    <li><a href="register.jsp">Registro</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="index2.jsp"><span class="glyphicon glyphicon-log-in"></span> Log In</a></li>
                </ul>
            </div>
        </nav>
</div>

<div class="container">
<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <!-- Wrapper for slides -->
    <div class="carousel-inner">
        <div class="item active">
            <img src="image/logoYSF.jpg" alt="Chania" width="600" height="200">
            <div class="carousel-caption">
            </div>
        </div>

        <div class="item">
            <img src="image/soccer.jpg" alt="Chania" width="600" height="200">
            <div class="carousel-caption">
            </div>
        </div>

        <div class="item">
            <img src="image/fields.jpg" alt="Chania" width="600" height="200">
            <div class="carousel-caption">
            </div>
        </div>
    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-only" >Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only" >Next</span>
    </a>
    </div>
</div>
</div>


</body>
</html>
