<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>

    <title>New Court</title>
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
<body>
<jsp:include page="_head.jsp"/>
<jsp:useBean id="service" class="pe.com.yoursoccerfield.services.YSFService"/>

<center><div class="container img-responsive" style="width:500px; height: 434px ">
    <h2>Registro Cancha</h2><br>
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
            <label class="control-label col-sm-5">Nombres:</label>
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
                <input type="text" name="position" class="form-control" placeholder="75" value="${court.type}"/>
            </div>
        </div>
		
			<div class="form-group">
            <label class="control-label col-sm-5">Estado:</label>
            <div class="col-sm-7">
                <input type="text" name="position" class="form-control" placeholder="75" value="${court.state}"/>
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