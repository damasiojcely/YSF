<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: leone
  Date: 02/07/2017
  Time: 23:28
  To change this template use File | Settings | File Templates.
--%>
<jsp:useBean id="service" class="pe.com.yoursoccerfield.services.YSFService"/>
<form action="participants" method="post">
    <input type="text" name="id" value="${participant.id}"
    <c:out value="${action == 'edit' ? 'readonly=\"readonly\"' : '' }"/>
    />
    <input type="text" name="firstName" value="${participant.firstName}"/>
    <input type="text" name="lastName" value="${participant.lastName}"/>
    <input type="text" name="email" value="${participant.email}"/>
    <input type="text" name="position" value="${participant.position}"/>
    <input type="text" name="organizer" value="${organizer.id}"/>
    <input type="hidden" value="${action == 'edit' ? "update" : "agregate"}" name="action"/>
    <input type="submit"/>
</form>
