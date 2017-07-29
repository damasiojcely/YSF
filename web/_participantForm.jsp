<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>

    <title>New Participant</title>
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
    <h2>Registro Participante</h2><br>
    <form class="form-horizontal" action="participants" method="post">
        <div class="form-group">
            <label class="control-label col-sm-5">ID:</label>
            <div class="col-sm-7">

                <input type="text" name="id" class="form-control" placeholder="ID" value="${participant.id}"
                        <c:out value="${action == 'edit' ? 'readonly=\"readonly\"' : '' }"/>
                />
		</div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-5">Nombre:</label>
            <div class="col-sm-7">
                <input type="text" name="firstName" class="form-control" placeholder="Joaquin Sebastian" value="${participant.firstName}"/>
            </div>
        </div>
		
		<div class="form-group">
            <label class="control-label col-sm-5">Apellidos:</label>
            <div class="col-sm-7">
                <input type="text" name="firstName" class="form-control" placeholder="Moreno Saenz" value="${participant.lastName}"/>
            </div>
        </div>
		
		<div class="form-group">
            <label class="control-label col-sm-5">Correo Electr&oacuteico;:</label>
            <div class="col-sm-7">
                <input type="text" name="firstName" class="form-control" placeholder="Joaquin Moreno" value="${participant.email}"/>
            </div>
        </div>
		
		<div class="form-group">
            <label class="control-label col-sm-5">Posici&oacuteico;n:</label>
            <div class="col-sm-7">
                <input type="text" name="firstName" class="form-control" placeholder="Joaquin Moreno" value="${participant.position}"/>
            </div>
        </div>
		
		<div class="form-group">
            <label class="control-label col-sm-5">Organizador:</label>
            <div class="col-sm-7">
                <input type="text" name="firstName" class="form-control" placeholder="Joaquin Moreno" value="${organizer.id}"/>
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