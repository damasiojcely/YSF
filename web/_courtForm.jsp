<%@ page import="pe.com.yoursoccerfield.models.Owner" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Edit Courts</title>
    <%--<jsp:include page="bootstrap.jsp"/>--%>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width , initial-scale=1">
    <link href="css/bootstrap.css" rel="stylesheet"/>
    <link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/style4.css">

    <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link href="css/style.css" rel="stylesheet" tye="text/css" media="all" />
    <style>
        /* Set height of the grid so .sidenav can be 100% (adjust as needed) */
        .row.content {height: 550px}

        /* Set gray background color and 100% height */
        .sidenav {
            background-color: #f1f1f1;
            height: 100%;
        }

        /* On small screens, set height to 'auto' for the grid */
        @media screen and (max-width: 767px) {
            .row.content {height: auto;}
        }
    </style>


    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <!-- Bootstrap CSS CDN -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <!-- Our Custom CSS -->
    <link rel="stylesheet" href="css/style4.css">

</head>
<body >
<jsp:include page="_menuOwner.jsp"/>
<div class="col-md-9">
    <div id="content">
        <div class="col-md-10">
            <h2> MI CANCHA </h2>

                <jsp:useBean id="service" class="pe.com.yoursoccerfield.services.YSFService"/>
                <form class="form-horizontal" action="courts" method="post">
                    <div class="form-group">
                        <label class="control-label col-sm-5">ID:</label>
                        <div class="col-sm-7">
                            <input type="text" name="id" class="form-control" placeholder="ID" value="${court.id}"
                                    <c:out value="${action == 'edit' ? 'readonly=\"readonly\"' : '' }"/>
                            />
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-5">Nombres</label>
                        <div class="col-sm-7">
                            <input type="text" name="firstName" class="form-control" placeholder="Mi canchita" value="${court.name}"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-5">Capacidad:</label>
                        <div class="col-sm-7">
                            <input type="text" name="lastName" class="form-control" placeholder="Perez Lopez" value="${court.capacity}"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-5">Direccion:</label>
                        <div class="col-sm-7">
                            <input type="text" name="email" class="form-control" placeholder="Ejemplo: micorreo@mail.com" value="${court.address}"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-5">Correo Electr&oacuteico;:</label>
                        <div class="col-sm-7">
                            <input type="email" name="email" class="form-control" placeholder="canchita@gmail.com" value="${court.email}"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-5">Tel&eacute;fono:</label>
                        <div class="col-sm-7">
                            <input type="text" name="phone" class="form-control" placeholder="Ingrese # Tel&eacute;fono" value="${court.phone}"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-5">Precio:</label>
                        <div class="col-sm-7">
                            <input type="text" name="position" class="form-control" placeholder="75" value="${court.price}"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-5">Foto:</label>
                        <div class="col-sm-7">
                            <input id="file-1" type="file" class="file" multiple=true data-preview-file-type="any">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-sm-5">Tipo:</label>
                        <div class="col-sm-7">
                            <input type="text" name="position" class="form-control" placeholder="Sintetico ó Natural" value="${court.type}"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-sm-5">Estado:</label>
                        <div class="col-sm-7">
                            <input type="text" name="position" class="form-control" placeholder="" value="${court.state}"/>
                        </div>
                    </div>


                    <div class="form-group">

                        <div class="col-sm-5">
                            <input type="hidden" value="${action == 'edit' ? "update" : "agregate"}" name="action"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-8">
                            <button type="submit" class="btn btn-primary" value="Ingresar">Registrar</button>
                        </div>
                    </div>
                </form>
        </div>
    </div>

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
</div>
</body>

</html>