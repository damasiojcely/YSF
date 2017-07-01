<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lnakaya
  Date: 7/1/2017
  Time: 10:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Reservations</title>
    <link href="css/style.css" rel="stylesheet" type="text/css" media="all"/>
</head>
<body>
<h2> RESERVACIONES REGISTRADAS </h2>
<table>
    <tr>
        <th>Id</th>
        <th>Fecha</th>
        <th>Estado</th>
        <th>Tiempo juego</th>
        <th>Horas</th>
        <th>Total</th>
    </tr>
    <jsp:useBean id="service" class="pe.com.yoursoccerfield.services.YSFService"/>
    <c:forEach var="reservation" items="${service.reservations}">
        <tr><td><c:out value="${reservation.id}"/></td>
            <td><c:out value="${reservation.createDate}"/></td>
            <td><c:out value="${reservation.state}"/></td>
            <td><c:out value="${reservation.gameTime}"/></td>
            <td><c:out value="${reservation.hours}"/></td>
            <td> <c:out value="${reservation.total}"/></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
