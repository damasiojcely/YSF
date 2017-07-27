<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>

    <title>New Owner</title>
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
<jsp:useBean id="service" class="pe.com.yoursoccerfield.services.YSFService"/>

<center><div class="container img-responsive" style="width:500px; height: 434px ">
    <h2>Registro Due&ntilde;o</h2><br>
    <form class="form-horizontal" action="owners" method="post">
        <div class="form-group">
            <label class="control-label col-sm-5">ID:</label>
            <div class="col-sm-7">
                <input type="text" name="id" class="form-control" placeholder="ID" value="${owner.id}"
                        <c:out value="${action == 'edit' ? 'readonly=\"readonly\"' : '' }"/>
                />
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-5">Nombres:</label>
            <div class="col-sm-7">
                <input type="text" name="firstName" class="form-control" placeholder="Jose Luis" value="${owner.firstName}"/>
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-5">Apellidos:</label>
            <div class="col-sm-7">
                <input type="text" name="lastName" class="form-control" placeholder="Perez Lopez" value="${owner.lastName}"/>
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-5">Correo Electr&oacute;nico:</label>
            <div class="col-sm-7">
                <input type="text" name="email" class="form-control" placeholder="Ejemplo: micorreo@mail.com" value="${owner.email}"/>
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-5">Contrase&ntilde;a:</label>
            <div class="col-sm-7">
                <input type="password" name="password" class="form-control" placeholder="Ingrese una contrase&ntilde;a" value="${owner.password}"/>
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-5">DNI:</label>
            <div class="col-sm-7">
                <input type="text" name="dni" class="form-control" placeholder="Ingrese DNI" value="${owner.dni}"/>
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-5">Tel&eacute;fono:</label>
            <div class="col-sm-7">
                <input type="text" name="phone" class="form-control" placeholder="Ingrese # Tel&eacute;fono" value="${owner.phone}"/>
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-5">Posici&oacute;n:</label>
            <div class="col-sm-7">
                <input type="text" name="position" class="form-control" placeholder="Posici&oacute;n de juego" value="${owner.position}"/>
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-5">Foto:</label>
            <div class="col-sm-7">
                <input id="file-1" type="file" class="file" multiple=true data-preview-file-type="any">
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
</div></center>

<script src="js/jquery.js"></script>
<script src="js/bootstrap.js"></script>

</body>
</html>
