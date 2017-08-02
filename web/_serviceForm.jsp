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
<jsp:include page="_menuOwner.jsp"/>

        <h2> AGREGAR SERVICIOS</h2>
        <jsp:useBean id="servic" class="pe.com.yoursoccerfield.services.YSFService"/>
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


</div>
</div>
    <script src="js/jquery.js"></script>
    <script src="js/bootstrap.js"></script>

</body>
</html>
