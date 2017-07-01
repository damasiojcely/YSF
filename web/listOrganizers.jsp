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
</head>
<body>
<jsp:useBean id="service" class="pe.com.yoursoccerfield.services.YSFService"/>
<c:forEach var="organizer" items="${service.organizers}">
    <p><c:out value="${organizer.firstName}"/><c:out value=" ${organizer.lastName}"/> </p>
</c:forEach>
</body>
</html>
