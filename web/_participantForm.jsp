<%@ page import="pe.com.yoursoccerfield.models.Organizer" %>
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

    <title>Participantes</title>

</head>
<body>


<jsp:include page="_menuOrganizer.jsp"/>

        <h2> AGREGAR PARTICIPANTE </h2>
<jsp:useBean id="service" class="pe.com.yoursoccerfield.services.YSFService"/>
<form action="participants" method="post" class="form-horizontal">

    <div class="form-group">
        <label class="control-label col-sm-4" > ID : </label>
        <div class="col-sm-8">
    <input type="text" name="id" class="form-control" value="${participant.id}"<c:out value="${action == 'edit' ? 'readonly=\"readonly\"' : '' }"/>/>
        </div>
    </div>

    <div class="form-group">
        <label class="control-label col-sm-4" > First Name : </label>
        <div class="col-sm-8">
    <input type="text" name="firstName" class="form-control" value="${participant.firstName}"/>
        </div>
    </div>

    <div class="form-group">
        <label class="control-label col-sm-4"> Last Name : </label>
        <div class="col-sm-8">
    <input type="text" name="lastName" class="form-control" value="${participant.lastName}"/>
        </div>
    </div>

    <div class="form-group">
        <label class="control-label col-sm-4"> Email : </label>
        <div class="col-sm-8">
    <input type="text" name="email" class="form-control" value="${participant.email}"/>
        </div>
    </div>

    <div class="form-group">
        <label class="control-label col-sm-4" > Position : </label>
        <div class="col-sm-8">
    <input type="text" name="position" class="form-control" value="${participant.position}"/>
        </div>
    </div>

    <div class="form-group">
        <label class="control-label col-sm-4"> ID Organizer : </label>
        <div class="col-sm-8">
    <input type="text" name="organizer" class="form-control" value="${organizer.id}"/>
        </div>

    </div>
    <input type="hidden" value="${action == 'edit' ? "update" : "agregate"}" name="action"/>

    <div class="form-group">
        <div class="col-sm-offset-4 col-sm-8">
    <input type="submit" class="btn btn-success" />
        </div>
    </div>



</form>



    </div>
</div>



</body>
</html>

