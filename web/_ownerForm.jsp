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

            <div class="container">
                <h2> </h2>
                <form>
                    <div class="form-group">
                        <label>Nombres:</label>
                        <input type="text" name="firstName" value="${owner.firstName}"/>
                    </div>
                    <div class="form-group">
                        <label>Apellidos:</label>
                        <input type="text" name="lastName" value="${owner.lastName}"/>
                    </div>
                    <div class="form-group">
                        <label>Correo Electrónico:</label>
                        <input type="text" name="email" value="${owner.email}"/>
                    </div>
                    <div class="form-group">
                        <label>Contraseña:</label>
                        <input type="text" name="password" value="${owner.password}"/>
                    </div>
                    <div class="form-group">
                        <label>Nombres:</label>
                        <input type="text" name="dni" value="${owner.dni}"/>
                    </div>
                    <div class="form-group">
                        <label>Apellidos:</label>
                        <input type="text" name="photo" value="${owner.photo}"/>
                    </div>
                    <div class="form-group">
                        <label>Correo Electrónico:</label>
                        <input type="text" name="phone" value="${owner.phone}"/>
                    </div>
                    <div class="form-group">
                        <label>Apellidos:</label>
                        <input type="text" name="position" value="${owner.position}"/>
                    </div>

                    <input type="hidden" value="${action == 'edit' ? "update" : "agregate"}" name="action"/>
                    <input type="submit"/>
                </form>
            </div>

        </b:inputgroup>
    </b:formgroup>




</form>
</body>
</html>

