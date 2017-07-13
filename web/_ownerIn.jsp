
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
    <div class="container">
        <div class="agile_header_grid">
            <div class="w3_agile_logo">
                <h1><a href="index.jsp">Owner</a></h1>
            </div>
            <div class="agileits_w3layouts_sign_in">
            </div>
            <div class="clearfix"> </div>
        </div>

        <%-- ok --%>
        <nav class="nav navbar-inverse">
            <div class="container-fluid">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="">Mi perfil</a></li>
                    <li><a href="">Mis Canchas</a></li>
                    <li><a href="">Reservas</a></li>
                    <li><a href="index.jsp">Log out</a></li>
                </ul>
            </div>
        </nav>

    </div>
</div>
<div class="container">
<center><h1>Informacion del contacto administrador</h1></center>
    <hr>
<jsp:useBean id="service" class="pe.com.yoursoccerfield.services.YSFService"/>
<center><form action="owners" method="post" >
    <b:formgroup>
        <b:inputgroup>
            <div class="form-group">
                <label class="control-label">ID: </label>
                <div class="col-sm-10">
                    <input type="text" class="form-control"  name="id"  value="${owner.id}"
                    <c:out value="${action == 'edit' ? 'readonly=\"readonly\"' : '' }"/>
                </div>
            </div>
            <br>
            <div class="form-group">
                <label class="control-label">Nombres:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control"  name="firstName" value="${owner.firstName}"/>
                </div>
            </div>
            <br>
            <div class="form-group">
                <label class="control-label">Apellidos:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="lastName" value="${owner.lastName}"/>
                </div>
            </div>
            <br>
            <div class="form-group">
                <label class="control-label">Email:</label>
                <div class="col-sm-10">
                    <input type="email" class="form-control"  name="email" value="${owner.email}"/>
                </div>
            </div>
            <br>
            <div class="form-group">
                <label class="control-label">Telefono:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="Phone" value="${owner.phone}"/>
                </div>
            </div>
        </b:inputgroup>
    </b:formgroup>
</form>
</center>
</div>
</body>
</html>
