<%@ page import="pe.com.yoursoccerfield.models.Owner" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>List Courts</title>
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
<body >
<jsp:include page="_headWithLogOut.jsp"/>
<jsp:include page="_menuOwner.jsp"/>
<div class="col-md-9">
    <div id="content">
        <div class="col-md-10">
            <h2> LISTA DE CANCHAS </h2>
            <table class="table table-hover" >
            <tr>
                <th>Id</th>
                <th>Nombre</th>
                <th>Capacidad</th>
                <th>Direccion</th>
                <th>Email</th>
                <th>Phone</th>
                <th>Precio</th>
                <th>Photo</th>
                <th>Tipo</th>
                <th>Estado</th>
                <th>Edit</th>
                <th>Delete</th>
            </tr>
            <jsp:useBean id="service" class="pe.com.yoursoccerfield.services.YSFService"/>
            <%String ide=(String)request.getSession().getAttribute("uowner");%>
            <c:forEach var="court" items="<%=service.getCourtsByOwner(ide)%>">
                <tr><td><c:out value="${court.id}"/></td>
                    <td><c:out value="${court.name}"/></td>
                    <td><c:out value="${court.capacity}"/></td>
                    <td><c:out value="${court.address}"/></td>
                    <td><c:out value="${court.email}"/></td>
                    <td><c:out value="${court.phone}"/></td>
                    <td><c:out value="${court.price}"/></td>
                    <td><c:out value="${court.photo}"/></td>
                    <td><c:out value="${court.type}"/></td>
                    <td><c:out value="${court.state}"/></td>
                    <td><</td>
                    <td><a href="courts?action=edit&id=<c:out value="${court.id}"/> " class="" >Edit</a></td>
                    <td><form method="post" action="courts">
                        <input type="hidden" name="id" value="${court.id}">
                        <input type="submit" value="delete" name="action"/>
                    </form></td>
                </tr>
               </c:forEach>

            </table>
        <a href="courts?action=add">Add Region</a>
    </div>
</div>

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
</div>
</body>

</html>
