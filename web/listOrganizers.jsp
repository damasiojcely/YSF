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

    <title>Bienvenido Organizador</title>

    <!-- Bootstrap CSS CDN -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <!-- Our Custom CSS -->
    <link rel="stylesheet" href="css/style4.css">
</head>
<body>

<jsp:include page="_menuOrganizer.jsp"/>

        <jsp:useBean id="service" class="pe.com.yoursoccerfield.services.YSFService"/>
        <%String ide=(String)request.getSession().getAttribute("uorganizer");%>

        <c:forEach var="organizer" items="<%=service.getOrganizersById(ide)%>">
            <div class="row">
                <div class="col-md-4">
                    <img src="image/user/${organizer.id}.jpg" class="img-rounded" alt="Cinque Terre" width="304" height="236">
                </div>
                <div class="col-md-5">
                    <h4><label> ID : </label> ${organizer.id} </h4><p></p>
                    <h4><label>  NOMBRE : </label> ${organizer.firstName} </h4><p></p>
                    <h4><label> APELLIDO : </label> ${organizer.lastName} </h4><p></p>
                    <h4><label>  EMAIL : </label> ${organizer.email} </h4><p></p>
                    <h4><label> DNI : </label> ${organizer.dni} </h4><p></p>
                    <h4><label> PHONE : </label> ${organizer.phone} </h4><p></p>
                    <h4><label> POSITION : </label> ${organizer.position} </h4><p></p>
                    <br>
                    <button class="btn-success"><a href="organizers?action=edit&id=<c:out value="${organizer.id}"/>">EDITAR PERFIL</a></button>

                </div>

            </div>
        </c:forEach>

</div>
</div>
</div>
</div>

</div>
</div>



<!-- jQuery CDN -->
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
</body>
</html>
