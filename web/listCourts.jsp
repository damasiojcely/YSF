<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lnakaya
  Date: 7/1/2017
  Time: 10:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Courts</title>
    <link href="css/style.css" rel="stylesheet" type="text/css" media="all"/>
</head>
<body>
<h2>Lista de Canchas</h2>
<table>
    <tr>
        <th>Id</th>
        <th>Nombre</th>
        <th>Capacidad</th>
        <th>Direccion</th>
        <th>Precio</th>
        <th>Tipo</th>
    </tr>
<jsp:useBean id="service" class="pe.com.yoursoccerfield.services.YSFService"/>
<c:forEach var="court" items="${service.courts}">
    <tr><td><c:out value="${court.id}"/></td>
        <td><c:out value="${court.name}"/></td>
        <td><c:out value="${court.capacity}"/></td>
        <td><c:out value="${court.address}"/></td>
        <td><c:out value="${court.price}"/></td>
        <td><c:out value="${court.type}"/></td>
    </tr>
   </c:forEach>
</table>
</body>
</html>
