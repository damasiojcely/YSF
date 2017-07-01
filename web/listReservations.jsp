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
</head>
<body>
<jsp:useBean id="service" class="pe.com.yoursoccerfield.services.YSFService"/>
<c:forEach var="reservation" items="${service.reservations}">
    <p><c:out value="${reservation.id}"/><c:out value=" ${reservation.organizer.firstName}"/></p>
</c:forEach>
</body>
</html>
