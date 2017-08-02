<%@ page import="pe.com.yoursoccerfield.models.Owner" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Your Soccer Field</title>
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
<body>
<jsp:include page="_menuOwner.jsp"/>

<div class="col-md-9">
    <div id="content">
        <div class="col-md-10">
            <h2> LISTA DE ADMINISTRADOR </h2>
            <div class="container">
                <jsp:useBean id="service" class="pe.com.yoursoccerfield.services.YSFService"/>
                <%String ide=(String)request.getSession().getAttribute("uowner");%>
                <c:forEach var="owner" items="<%=service.getOwnersById(ide)%>">
                    <div class="row">
                        <div class="col-md-4">
                            <img src="image/user/${owner.id}.jpg" class="img-rounded" alt="Cinque Terre" width="304" height="236">
                        </div>
                        <div class="col-md-5">
                            <h4><label> ID : </label> ${owner.id} </h4><p></p>
                            <h4><label>  NOMBRE : </label> ${owner.firstName} </h4><p></p>
                            <h4><label> APELLIDO : </label> ${owner.lastName} </h4><p></p>
                            <h4><label>  EMAIL : </label> ${owner.email} </h4><p></p>
                            <h4><label> DNI : </label> ${owner.dni} </h4><p></p>
                            <h4><label> PHONE : </label> ${owner.phone} </h4><p></p>
                            <h4><label> POSITION : </label> ${owner.position} </h4><p></p>
                            <br>
                            <button class="btn-success"><a href="owners?action=edit&id=<c:out value="${owner.id}"/>">EDITAR PERFIL</a></button>

                        </div>
                    </div>
                </c:forEach>
                <%--</table>--%>
            </div>
        </div>
    </div>
</div>

</div>
</div>
<%--
    </div>
--%>



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