<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: leone
  Date: 29/06/2017
  Time: 21:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List ubigeos</title>
</head>
<body>
<jsp:useBean id="service" class="pe.com.yoursoccerfield.services.HRService"/>
<c:forEach var="ubigeo" items="${service.ubigeos}">
    <p><c:out value="${ubigeo.departmentName}"/></p>
</c:forEach>
</body>
</html>
