<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lnakaya
  Date: 7/1/2017
  Time: 10:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://bootstrapjsp.org/" prefix="b" %>
<html>
<head>
    <title>List Owners</title>
    <link href="css/style.css" rel="stylesheet" type="text/css" media="all"/>
</head>
<body>
<h2> LISTA DE CLIENTES </h2>
<jsp:include page="bootstrap.jsp"/>
<div class="container">

<table class="table table-hover">
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
<c:forEach var="owner" items="${service.owners}">
    <tr><td><c:out value="${owner.id}"/></td>
        <td><c:out value="${owner.firstName}"/></td>
        <td><c:out value="${owner.lastName}"/></td>
        <td><c:out value="${owner.email}"/></td>
        <td><c:out value="${owner.password}"/></td>
        <td><c:out value="${owner.dni}"/></td>
        <td><c:out value="${owner.photo}"/></td>
        <td><c:out value="${owner.phone}"/></td>
        <td><c:out value="${owner.position}"/></td>
        <td><a href="owners?action=edit&id=<c:out value="${owner.id}"/>">Edit</a></td>
    </tr>
</c:forEach>
<a href="owners?action=add">Add Owner</a>
</table>
</div>
</body>
</html>
