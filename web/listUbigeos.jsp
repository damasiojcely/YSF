<%--
  Created by IntelliJ IDEA.
  User: lnakaya
  Date: 7/1/2017
  Time: 10:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ListUbigeos</title>
    <link href="css/style.css" rel="stylesheet" type="text/css" media="all"/>
</head>
<body>
<jsp:useBean id="service" class="pe.com.yoursoccerfield.services.YSFService"/>
<c:forEach var="ubigeo" items="${service.ubigeos}">
    <p><c:out value="${court.name}"/></p>
</c:forEach>
</body>
</html>
