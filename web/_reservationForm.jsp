<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: leone
  Date: 02/07/2017
  Time: 17:49
  To change this template use File | Settings | File Templates.
--%>
<jsp:useBean id="service" class="pe.com.yoursoccerfield.services.YSFService"/>
<form action="reservations" method="post">
    <input type="text" name="id" value="${reservation.id}"
    <c:out value="${action == 'edit' ? 'readonly=\"readonly\"' : '' }"/>
    />
    <input type="text" name="createDate" value="${reservation.createDate}"/>
    <input type="text" name="state" value="${reservation.state}"/>
    <input type="text" name="gameTime" value="${reservation.gameTime}"/>
    <input type="text" name="hours" value="${reservation.hours}"/>
    <input type="text" name="total" value="${reservation.total}"/>
    <input type="hidden" value="${action == 'edit' ? "update" : "agregate"}" name="action"/>
    <input type="submit"/>
</form>