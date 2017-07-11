<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: leone
  Date: 02/07/2017
  Time: 23:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>FORM</title>
    <jsp:include page="bootstrap.jsp"/>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style>
        .carousel-inner > .item > img,
        .carousel-inner > .item > a > img {
            width: 100%;
            margin: auto;
        }
    </style>
</head>
<body>
<jsp:useBean id="service" class="pe.com.yoursoccerfield.services.YSFService"/>
<form action="organizers" method="post">
    <input type="text" name="id" value="${organizer.id}"
    <c:out value="${action == 'edit' ? 'readonly=\"readonly\"' : '' }"/>
    />

    <div class="container">
        <h2> </h2>
        <form>
            <div class="form-group">
                <label>Nombres:</label>
                <input type="text" name="firstName" value="${organizer.firstName}"/>
            </div>
            <div class="form-group">
                <label>Apellidos:</label>
                <input type="text" name="lastName" value="${organizer.lastName}"/>
            </div>
            <div class="form-group">
                <label>Correo Electrónico:</label>
                <input type="text" name="email" value="${organizer.email}"/>
            </div>
            <div class="form-group">
                <label>Contraseña:</label>
                <input type="text" name="password" value="${organizer.password}"/>
            </div>
            <div class="form-group">
                <label>DNI:</label>
                <input type="text" name="dni" value="${organizer.dni}"/>
            </div>
            <div class="form-group">
                <label>PHOTO:</label>
                <input type="text" name="photo" value="${organizer.photo}"/>
            </div>
            <div class="form-group">
                <label>Phone:</label>
                <input type="text" name="phone" value="${organizer.phone}"/>
            </div>
            <div class="form-group">
                <label>Position:</label>
                <input type="text" name="position" value="${organizer.position}"/>
            </div>

            <input type="hidden" value="${action == 'edit' ? "update" : "agregate"}" name="action"/>
            <input type="submit"/>
        </form>
    </div>



</form>
</body>