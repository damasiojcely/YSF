<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: leone
  Date: 02/07/2017
  Time: 23:12
  To change this template use File | Settings | File Templates.
--%>
<jsp:useBean id="service" class="pe.com.yoursoccerfield.services.YSFService"/>
<form action="courts" method="post">
    <input type="text" name="id" value="${court.id}"
    <c:out value="${action == 'edit' ? 'readonly=\"readonly\"' : '' }"/>
    />
    <input type="text" name="name" value="${court.name}"/>
    <input type="text" name="capacity" value="${court.capacity}"/>
    <input type="text" name="address" value="${court.address}"/>
    <input type="text" name="email" value="${court.email}"/>
    <input type="text" name="phone" value="${court.phone}"/>
    <input type="text" name="price" value="${court.price}"/>
    <input type="text" name="photo" value="${court.photo}"/>
    <input type="text" name="type" value="${court.type}"/>
    <input type="text" name="state" value="${court.state}"/>
    <input type="hidden" value="${action == 'edit' ? "update" : "agregate"}" name="action"/>
    <input type="submit"/>
</form>
