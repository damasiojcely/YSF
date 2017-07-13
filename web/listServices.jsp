<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lnakaya
  Date: 7/1/2017
  Time: 10:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Services</title>
    <link href="css/style.css" rel="stylesheet" type="text/css" media="all"/>
</head>
<body>
<h2> LISTA DE SERVICIOS </h2>
<table>
    <tr>
        <th>Id</th>
        <th>Nombre</th>
        <th>Precio</th>
        <th>Edit</th>
    </tr>



<jsp:useBean id="servic" class="pe.com.yoursoccerfield.services.YSFService"/>
<c:forEach var="service" items="${servic.services}">

    <tr><td><c:out value="${service.id}"/></td>
        <td><c:out value="${service.name}"/></td>
        <td><c:out value="${service.price}"/></td>
        <td><a href="services?action=edit&id=<c:out value="${service.id}"/>">Edit</a></td>
        <td><form method="post" action="services">
            <input type="hidden" name="id" value="${service.id}">
            <input type="submit" value="delete" name="action"/>
        </form></td>
    </tr>
</c:forEach>
    <a href="services?action=add">Add Services</a>
</table>
</body>
</html>
