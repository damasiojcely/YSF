<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>

    <title>New Reservation</title>
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
    <h2>Reservacion</h2><br>
    <form class="form-horizontal" action="reservations" method="post">
        <div class="form-group">
            <label class="control-label col-sm-5">ID:</label>
            <div class="col-sm-7">
                <input type="text" name="id" class="form-control" placeholder="ID" value="${reservation.id}"
                        <c:out value="${action == 'edit' ? 'readonly=\"readonly\"' : '' }"/>
                />
			</div>
			</div>
        <div class="form-group">
            <label class="control-label col-sm-5">Dia de reservacion:</label>
            <div class="col-sm-7">
                <input type="date" name="createDate" class="form-control" placeholder="createDate" value="${reservation.createDate}"/>
            </div>
			</div>
			<div class="form-group">
            <label class="control-label col-sm-5">Estado:</label>
            <div class="col-sm-7">
                <input type="text" name="state" class="form-control" placeholder="Estado" value="${reservation.state}"/>
            </div>
			</div>
			<div class="form-group">
            <label class="control-label col-sm-5">Tiempo de Juego:</label>
            <div class="col-sm-7">
                <input type="text" name="gameTime" class="form-control" placeholder="Tiempo de juego" value="${reservation.gameTime}"/>
            </div>
			</div>
			<div class="form-group">
            <label class="control-label col-sm-5">Horas de Alquiler:</label>
            <div class="col-sm-7">
                <input type="text" name="hours" class="form-control" placeholder="horas" value="${reservation.hours}"/>
            </div>
			</div>
			<div class="form-group">
            <label class="control-label col-sm-5">Total de Reservaci&oacuten:;</label>
            <div class="col-sm-7">
                <input type="text" name="total" class="form-control" placeholder="state" value="${reservation.total}"/>
            </div>
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