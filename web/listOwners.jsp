<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lnakaya
  Date: 7/1/2017
  Time: 10:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Owners</title>
</head>
<body>
<jsp:useBean id="service" class="pe.com.yoursoccerfield.services.YSFService"/>
<c:forEach var="owner" items="${service.owners}">
    <p><c:out value="${owner.firstName}"/><c:out value="${owner.lastName}"/> </p>
</c:forEach>

</body>
</html>
