<%@ page import="pe.com.yoursoccerfield.models.Organizer" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>Collapsible sidebar using Bootstrap 3</title>

    <!-- Bootstrap CSS CDN -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <!-- Our Custom CSS -->
    <link rel="stylesheet" href="css/style4.css">
</head>
<body>



<div class="wrapper">
    <nav id="sidebar">
        <div class="sidebar-header">
            <a href="index.jsp"><h3> NORS | YSF</h3></a>
            <a href="index.jsp"><strong> YSF </strong></a>
        </div>

        <ul class="list-unstyled components">

            <li class="active">
                <a href="index2.jsp" >
                    <i class="glyphicon glyphicon-home"></i>
                    HOME
                </a>
            </li>

            <li>
                <a href="#homeSubmenu" data-toggle="collapse" aria-expanded="false">
                    <i class="glyphicon glyphicon-user"></i>
                    MI PERFIL
                </a>
                <ul class="collapse list-unstyled" id="homeSubmenu">
                    <li><a href="listOwners.jsp"> PERFIL</a></li>
                    <li><a href="#"> EDITAR</a></li>
                    <li><a href="#"> ELIMINAR</a></li>
                </ul>
            </li>
            <li>

                <a href="#">
                    <i class="glyphicon glyphicon-briefcase"></i>

                    CLIENTES
                </a>



                <a href="#pageSubmenu" data-toggle="collapse" aria-expanded="false">
                    <i class="glyphicon glyphicon-duplicate"></i>
                    RESERVACIONES
                </a>
                <ul class="collapse list-unstyled" id="pageSubmenu">
                    <li><a href="#">EDITAR</a></li>
                    <li><a href="listReservations.jsp">REGISTROS</a></li>
                </ul>
            </li>
            <li>
                <a href="#pageestadio" data-toggle="collapse" aria-expanded="false">
                    <i class="glyphicon glyphicon-link"></i>
                    ESTADIOS
                </a>
                <ul class="collapse list-unstyled" id="pageestadio">
                    <li><a href="#">LISTAR </a></li>
                    <li><a href="#">AGREGAR</a></li>
                    <li><a href="#">EDITAR</a></li>
                    <li><a href="listReservations.jsp">ELIMINAR</a></li>
                </ul>
            </li>
            <li>
                <a href="#pageservice" data-toggle="collapse" aria-expanded="false">
                    <i class="glyphicon glyphicon-paperclip"></i>
                    SERVICIOS
                </a>
                <ul class="collapse list-unstyled" id="pageservice">
                    <li><a href="#">LISTAR </a></li>
                    <li><a href="#">AGREGAR</a></li>
                    <li><a href="#">EDITAR</a></li>
                    <li><a href="listReservations.jsp">ELIMINAR</a></li>
                </ul>
            </li>
            <li>
                <a href="#">
                    <i class="glyphicon glyphicon-send"></i>
                    DASHBOARD
                </a>
            </li>
        </ul>

        <ul class="list-unstyled CTAs">
            <li><a href="" class="download"> INICIO</a></li>
            <li><a href="" class="article"> ACERCA</a></li>
            <li><a href="" class="article"> FUNCIONES </a></li>
            <li><a href="" class="article"> CONTACTANOS</a></li>
        </ul>
    </nav>

    <!-- Page Content Holder -->
    <div id="content">

        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" id="sidebarCollapse" class="btn btn-info navbar-btn">
                        <i class="glyphicon glyphicon-align-left"></i>
                        <span>Menu</span>
                    </button>
                </div>

                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="#">ACERCA</a></li>
                        <li><a href="#">FUNCIONES</a></li>
                        <li><a href="#">CONTACTANOS</a></li>
                        <li><a href="#">LOG OUT</a></li>
                    </ul>
                </div>
            </div>
        </nav>

        <img src="image/grass.jpg">

    </div>
</div>





<!-- jQuery CDN -->
<script src="https://code.jquery.com/jquery-1.12.0.min.js"></script>
<!-- Bootstrap Js CDN -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<script type="text/javascript">
    $(document).ready(function () {
        $('#sidebarCollapse').on('click', function () {
            $('#sidebar').toggleClass('active');
        });
    });
</script>
</body>
</html>
