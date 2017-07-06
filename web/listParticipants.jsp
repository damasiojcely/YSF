<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lnakaya
  Date: 7/1/2017
  Time: 10:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Participants</title>
    <link href="css/style.css" rel="stylesheet" type="text/css" media="all"/>
</head>
<body>
<h2> LISTA DE PARTICIPANTES </h2>
<table>
    <tr>
        <th>Id</th>
        <th>Nombre</th>
        <th>Apellido</th>
        <th>Email</th>
        <th>Position</th>
        <th>Edit</th>
    </tr>
<jsp:useBean id="service" class="pe.com.yoursoccerfield.services.YSFService"/>
<c:forEach var="participant" items="${service.participants}">
    <tr><td><c:out value="${participant.id}"/></td>
        <td><c:out value="${participant.firstName}"/></td>
        <td><c:out value="${participant.lastName}"/></td>
        <td><c:out value="${participant.email}"/></td>
        <td><c:out value="${participant.position}"/></td>
        <td><a href="participants?action=edit&id=<c:out value="${participant.id}"/>">Edit</a></td>
    </tr>
</c:forEach>
    <a href="participants?action=add">Add Participant</a>
</table>

</body>
</html>
