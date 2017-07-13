<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://bootstrapjsp.org/" prefix="b" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <title>OWNERS</title>
    <jsp:include page="bootstrap.jsp"/>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style type="text/css">
        .carousel-inner > .item > img,
        .carousel-inner > .item > a > img {
            width: 100%;
            margin: auto;
        }
        * {
           padding: 0px;
            margin: 0px;
        }
        #header {
            margin: auto;
            width: 500px;
            font-family: "Century Gothic";
        }
        ul, ol{
            list-style: none;
        }
        .nav li a {
            background-color: #000;
            color: #fff;
            text-decoration: none;
            padding: 10px 15px;
            display:block;
        }
        .nav li a:hover{
            background-color: #1b6d85;
        }

        .nav > li {
            float:left;
        }

        .nav > ul {
            display: none;
            position:absolute;
            min-width: 140px;
        }
        .nav li:hover > ul{
            display:block;
        }

      </style>
</head>
<body>

<div class="header">
    <div class="container">
        <div class="agile_header_grid">
            <div class="w3_agile_logo">
                <center><h1><a href="index.jsp">Organizer</a></h1></center>
            </div>
            <div class="agileits_w3layouts_sign_in">
            </div>
            <div class="clearfix"> </div>
        </div>

        <%-- ok --%>
        <nav class="nav navbar-inverse">
            <div>
                <ul class="nav">
                    <li><a href="">Mi perfil</a>
                    <ul>
                        <li><a href="">Editar Perfil</a> </li>
                        <li><a href="">Cambiar Password</a></li>
                    </ul>
                    </li>
                    <li><a href="search.jsp">¿Que Cancha?</a></li>
                    <li><a href="index.jsp">Log out</a></li>
                </ul>
            </div>
        </nav>

    </div>
</div>

<div class="container" style="width: 500px; height: 450px">
    <center><h1>Informacion del contacto organizador</h1></center>
    <hr>
    <jsp:useBean id="service" class="pe.com.yoursoccerfield.services.YSFService"/>
    <center><form action="organizers" method="post" >
        <div class="container" style="width:450px; height: 434px ">
        <b:formgroup>
            <b:inputgroup>
                <div class="form-group">
                    <label class="control-label">ID: </label>
                    <div>
                        <input type="text" class="form-control"  name="id"  value="${id}"
                            <c:out value="${action == 'edit' ? 'readonly=\"readonly\"' : '' }"/>
                    </div>
                </div>
                <br>
                <div class="form-group">
                    <label class="control-label">Nombres:</label>
                    <div >
                        <input type="text" class="form-control"  name="firstName" value="${organizer.firstName}"/>
                    </div>
                </div>
                <br>
                <div class="form-group">
                    <label class="control-label">Apellidos:</label>
                    <div>
                        <input type="text" class="form-control" name="lastName" value="${organizer.lastName}"/>
                    </div>
                </div>
                <br>
                <div class="form-group">
                    <label class="control-label">Email:</label>
                    <div>
                        <input type="email" class="form-control"  name="email" value="${organizer.email}"/>
                    </div>
                </div>
                <br>
                <div class="form-group">
                    <label class="control-label">Telefono:</label>
                    <div>
                        <input type="text" class="form-control" name="Phone" value="${organizer.phone}"/>
                    </div>
                </div>
                <br>
                <div class="form-group">
                    <label class="control-label">Posicion:</label>
                    <div >
                        <input type="text" class="form-control" name="position" value="${organizer.position}"/>
                    </div>
                </div>
                <br>
                <div class="form-group">
                    <label class="control-label">DNI:</label>
                    <div>
                        <input type="text" class="form-control" name="dni" value="${organizer.dni}"/>
                    </div>
                </div>

                <input type="hidden" value="${action == "update"}" name="action"/>
                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-8">
                        <button type="submit" class="btn btn-primary" value="Grabar">Grabar</button>
                    </div>
                </div>
                </b:inputgroup>
        </b:formgroup></div>
    </form>
        <% String id = request.getParameter("id"); %>
        <p>Me han pasado <%= id%></p>
    </center>
</div>
</body>
</html>
