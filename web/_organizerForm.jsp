<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: leone
  Date: 02/07/2017
  Time: 23:20
  To change this template use File | Settings | File Templates.
--%>
<jsp:useBean id="service" class="pe.com.yoursoccerfield.services.YSFService"/>
<form action="organizers" method="post">
    <input type="text" name="id" value="${organizer.id}"
    <c:out value="${action == 'edit' ? 'readonly=\"readonly\"' : '' }"/>
    />
    <input type="text" name="firstName" value="${organizer.firstName}"/>
    <input type="text" name="lastName" value="${organizer.lastName}"/>
    <input type="text" name="email" value="${organizer.email}"/>
    <input type="text" name="password" value="${organizer.password}"/>
    <input type="text" name="dni" value="${organizer.dni}"/>
    <input type="text" name="photo" value="${organizer.photo}"/>
    <input type="text" name="phone" value="${organizer.phone}"/>
    <input type="text" name="position" value="${organizer.position}"/>
    <input type="hidden" value="${action == 'edit' ? "update" : "agregate"}" name="action"/>
    <input type="submit"/>
</form>
