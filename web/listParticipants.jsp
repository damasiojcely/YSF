<%@ page import="pe.com.yoursoccerfield.models.Organizer" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lnakaya
  Date: 7/1/2017
  Time: 10:37 AM
  To change this template use File | Settings | File Templates.
--%>
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
    <!-- Sidebar Holder -->
    <nav id="sidebar">
        <div class="sidebar-header">
            <a href="index.jsp"><h3> NORS | YSF</h3></a>
            <a href="index.jsp"><strong> YSF </strong></a>
        </div>

        <ul class="list-unstyled components">

            <li>
                <a href="index2.jsp" >
                    <i class="glyphicon glyphicon-home"></i>
                    HOME
                </a>
            </li>

            <li class="active">
                <a href="#homeSubmenu" data-toggle="collapse" aria-expanded="false">
                    <i class="glyphicon glyphicon-user"></i>
                    MI PERFIL
                </a>
                <ul class="collapse list-unstyled" id="homeSubmenu">
                    <li><a href="#"> PERFIL</a></li>
                    <li><a href="#"> EDITAR</a></li>
                    <li><a href="#"> ELIMINAR</a></li>
                </ul>
            </li>
            <li>
                <a href="#">
                    <i class="glyphicon glyphicon-briefcase"></i>

                    ESTADIOS
                </a>
                <a href="#pageSubmenu" data-toggle="collapse" aria-expanded="false">
                    <i class="glyphicon glyphicon-duplicate"></i>
                    RESERVACIONES
                </a>
                <ul class="collapse list-unstyled" id="pageSubmenu">
                    <li><a href="#">REGISTRAR</a></li>
                    <li><a href="#">EDITAR</a></li>
                    <li><a href="listReservations.jsp">REGISTROS</a></li>
                    <li><a href="#">ELIMINAR</a></li>
                </ul>
            </li>
            <li>
                <a href="#">
                    <i class="glyphicon glyphicon-link"></i>
                    MI EQUIPO
                </a>
            </li>
            <li>
                <a href="#">
                    <i class="glyphicon glyphicon-paperclip"></i>
                    SERVICIOS
                </a>
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

        <div class="row">

<jsp:useBean id="service" class="pe.com.yoursoccerfield.services.YSFService"/>
    <%String ide=(String)request.getSession().getAttribute("uorganizer");%>
<c:forEach var="participant" items="<%=service.getParticipantByOrganizer(ide)%>">
            <div class="col-md-6">

    <div class="media">
    <div class="media-left media-middle">
        <img src="image/Participant/${participant.id}.jpg" class="media-object" style="width:200px">
    </div>
    <div class="media-body">
        <h4 class="media-heading">${participant.firstName}</h4>
        <p>LAST NAME : ${participant.lastName} </p>
        <p> EMAIL : ${participant.email} </p>
        <p> POSITION  :  ${participant.position} </p>
        <P><button type="button" class="btn btn-default"><a href="participants?action=edit&id=<c:out value="${participant.id}"/>">Edit</a></button>
        <form method="post" action="participants">
            <input type="hidden" name="id" value="${participant.id}">
            <input type="submit" class="btn btn-default" value="delete" name="action"/>
        </form>
        </P>


  <%--  <tr><td><c:out value="${participant.id}"/></td>
        <td><c:out value="${participant.firstName}"/></td>
        <td><c:out value="${participant.lastName}"/></td>
        <td><c:out value="${participant.email}"/></td>
        <td><c:out value="${participant.position}"/></td>

        <td><a href="participants?action=edit&id=<c:out value="${participant.id}"/>">Edit</a></td>
        <td><form method="post" action="participants">
            <input type="hidden" name="id" value="${participant.id}">
            <input type="submit" value="delete" name="action"/>
        </form></td>
    </tr>--%>

    </div>
    </div>
    <hr>
            </div>
</c:forEach>


      <%--  <div class="media">
            <div class="media-left media-middle">
                <img src="img_avatar1.png" class="media-object" style="width:150px">
            </div>
            <div class="media-body">
                <h4 class="media-heading">Media Middle</h4>
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
            </div>
        </div>
        <hr>
--%>


        </div>



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