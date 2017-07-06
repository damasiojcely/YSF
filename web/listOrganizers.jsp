<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lnakaya
  Date: 7/1/2017
  Time: 10:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Organizers</title>
    <link href="css/style.css" rel="stylesheet" type="text/css" media="all"/>
</head>
<body>
<h2> LISTA DE CLIENTES </h2>
<table>
    <tr>
        <th>Id</th>
        <th>Nombre</th>
        <th>Apellido</th>
        <th>Email</th>
        <th>Password</th>
        <th>Dni</th>
        <th>Photo</th>
        <th>Phone</th>
        <th>Position</th>
        <th>Edit</th>
    </tr>
<jsp:useBean id="service" class="pe.com.yoursoccerfield.services.YSFService"/>
<c:forEach var="organizer" items="${service.organizers}">
    <tr><td><c:out value="${organizer.id}"/></td>
        <td><c:out value="${organizer.firstName}"/></td>
        <td><c:out value="${organizer.lastName}"/></td>
        <td><c:out value="${organizer.email}"/></td>
        <td><c:out value="${organizer.password}"/></td>
        <td><c:out value="${organizer.dni}"/></td>
        <td><c:out value="${organizer.photo}"/></td>
        <td><c:out value="${organizer.phone}"/></td>
        <td><c:out value="${organizer.position}"/></td>
        <td><a href="organizers?action=edit&id=<c:out value="${organizer.id}"/>">Edit</a></td>
    </tr>
</c:forEach>
    <a href="organizers?action=add">Add Organizer</a>
</table>
</body>
</html>
