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
        <th>Email</th>
        <th>Phone</th>
        <th>Precio</th>
        <th>Photo</th>
        <th>Tipo</th>
        <th>Estado</th>
        <th>Edit</th>
    </tr>
<jsp:useBean id="service" class="pe.com.yoursoccerfield.services.YSFService"/>
<c:forEach var="court" items="${service.courts}">
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
        <td><a href="courts?action=edit&id=<c:out value="${court.id}"/> ">Edit</a></td>
        <td><form method="post" action="courts">
            <input type="hidden" name="id" value="${court.id}">
            <input type="submit" value="delete" name="action"/>
        </form></td>
    </tr>
   </c:forEach>
    <a href="courts?action=add">Add Region</a>
</table>

</body>
</html>
