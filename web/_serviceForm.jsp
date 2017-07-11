<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: leone
  Date: 02/07/2017
  Time: 23:33
  To change this template use File | Settings | File Templates.
--%>
<jsp:useBean id="servic" class="pe.com.yoursoccerfield.services.YSFService"/>
<form action="services" method="post">
    <input type="text" name="id" value="${service.id}"
    <c:out value="${action == 'edit' ? 'readonly=\"readonly\"' : '' }"/>
    />
    <input type="text" name="name" value="${service.name}"/>
    <input type="text" name="price" value="${service.price}"/>
    <input type="hidden" value="${action == 'edit' ? "update" : "agregate"}" name="action"/>
    <input type="submit"/>
</form>
