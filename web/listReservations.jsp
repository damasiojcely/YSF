<%@ page import="pe.com.yoursoccerfield.models.Owner" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>List Reservations</title>
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
            <h2> LISTA DE RESERVACIONES </h2>
            <table class="table table-hover">
    <tr>
        <th>Id</th>
        <th>Fecha</th>
        <th>Estado</th>
        <th>Tiempo juego</th>
        <th>Horas</th>
        <th>Total</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    <jsp:useBean id="service" class="pe.com.yoursoccerfield.services.YSFService"/>
    <c:forEach var="reservation" items="${service.reservations}">
        <tr><td><c:out value="${reservation.id}"/></td>
            <td><c:out value="${reservation.createDate}"/></td>
            <td><c:out value="${reservation.state}"/></td>
            <td><c:out value="${reservation.gameTime}"/></td>
            <td><c:out value="${reservation.hours}"/></td>
            <td> <c:out value="${reservation.total}"/></td>
            <td><a href="reservations?action=edit&id=<c:out value="${reservation.id}"/> ">Edit</a></td>
            <td><form method="post" action="reservations">
                <input type="hidden" name="id" value="${reservation.id}">
                <input type="submit" value="delete" name="action"/>
            </form></td>
         </tr>
       </c:forEach>
      </table>

        <a href="reservations?action=add">Add Reservation</a>
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
