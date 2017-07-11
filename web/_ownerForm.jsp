<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: leone
  Date: 02/07/2017
  Time: 17:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://bootstrapjsp.org/" prefix="b" %>

<html>
<head>
    <title>EDITAR OWNER</title>
    <jsp:include page="bootstrap.jsp"/>
</head>
<body>

<jsp:useBean id="service" class="pe.com.yoursoccerfield.services.YSFService"/>
<form action="owners" method="post">

    <b:formgroup>
        <b:inputgroup>

        <input type="text" name="id" value="${owner.id}"
                <c:out value="${action == 'edit' ? 'readonly=\"readonly\"' : '' }"/>
        />
        <input type="text" name="firstName" value="${owner.firstName}"/>
        <input type="text" name="lastName" value="${owner.lastName}"/>
        <input type="text" name="email" value="${owner.email}"/>
        <input type="text" name="password" value="${owner.password}"/>
        <input type="text" name="dni" value="${owner.dni}"/>
        <input type="text" name="photo" value="${owner.photo}"/>
        <input type="text" name="phone" value="${owner.phone}"/>
        <input type="text" name="position" value="${owner.position}"/>
            <input type="hidden" value="${action == 'edit' ? "update" : "agregate"}" name="action"/>
        <input type="submit"/>
    </b:inputgroup>
    </b:formgroup>

</form>
</body>
</html>

