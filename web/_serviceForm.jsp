<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>

    <title>New Service</title>
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
<jsp:useBean id="servic" class="pe.com.yoursoccerfield.services.YSFService"/>
<center><div class="container img-responsive" style="width:500px; height: 434px ">
    <form class="form-horizontal" action="services" method="post">
        <div class="form-group">
            <label class="control-label col-sm-5">ID:</label>
            <div class="col-sm-7">
                <input type="text" name="id" class="form-control" placeholder="ID" value="${service.id}"
                        <c:out value="${action == 'edit' ? 'readonly=\"readonly\"' : '' }"/>
                />
    		</div>
			</div>
        <div class="form-group">
            <label class="control-label col-sm-5">Nombre de Servicio:</label>
            <div class="col-sm-7">
                <input type="text" name="name" class="form-control" placeholder="createDate" value="${service.name}"/>
            </div>
			</div>
			
			<div class="form-group">
            <label class="control-label col-sm-5">Precio:</label>
            <div class="col-sm-7">
                <input type="text" name="price" class="form-control" placeholder="createDate" value="${service.price}"/>
            </div>
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