<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>

    <title>Owner</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width , initial-scale=1">

</head>
<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="60" style="background-color: #F1F1F1">
<jsp:useBean id="service" class="pe.com.yoursoccerfield.services.YSFService"/>
<center>
<div class="row">
<div class="container img-responsive" style="width:500px; height: 434px ">

    <form class="form-horizontal img-responsive" action="owners" method="post">
        <h2>${action == 'edit' ? "Editar Perfil" : "Nuevo Perfil Administrator"}</h2><br>
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
                <input type="text" name="firstName" class="form-control" placeholder="Ingrese Nombres" value="${owner.firstName}"/>
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-5">Apellidos:</label>
            <div class="col-sm-7">
                <input type="text" name="lastName" class="form-control" placeholder="Ingrese Apellidos" value="${owner.lastName}"/>
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-5">Correo Electr&oacute;nico:</label>
            <div class="col-sm-7">
                <input type="text" name="email" class="form-control" placeholder="Ingrese email" value="${owner.email}"/>
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
                <button type="submit" class="btn btn-primary"> ${action == 'edit' ? "Actualizar" : "Grabar"}</button>

            </div>
        </div>
    </form>
</div>
</div></center>




