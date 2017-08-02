<%@ page import="pe.com.yoursoccerfield.models.Owner" %>
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
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title> ADMINISTRADOR </title>

    <!-- Bootstrap CSS CDN -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <!-- Our Custom CSS -->
    <link rel="stylesheet" href="css/style4.css">
</head>
<body>

<jsp:include page="_menuOwner.jsp"/>

        <div class="row">
            <jsp:useBean id="servi" class="pe.com.yoursoccerfield.services.YSFService"/>
            <%String ie=(String)request.getSession().getAttribute("uowner");%>
            <c:forEach var="organizer" items="<%=servi.getOrganizerByOwner(ie)%>">
                <div class="col-md-6">
                    <div class="media">
                        <div class="media-left media-middle">
                            <img src="image/user/${organizer.id}.jpg" class="media-object" style="width:200px">
                        </div>
                        <div class="media-body">
                            <h4 class="media-heading">${organizer.firstName}</h4>
                            <p>LAST NAME : ${organizer.lastName} </p>
                            <p> EMAIL : ${organizer.email} </p>
                            <p> DNI : ${organizer.password}</p>
                            <p> PHONE : ${organizer.password}</p>
                            <p> POSITION  :  ${organizer.position}</p>
                            <button type="button" class="btn btn-default"><a href="organizers?action=edit&id=<c:out value="${organizer.id}"/>">Edit</a></button>
                            <form method="post" action="participants">
                                <input type="hidden" name="id" value="${organizer.id}">
                                <input type="submit" class="btn btn-default" value="delete" name="action"/>
                            </form>
                        </div>
                    </div>
                    <hr>
                </div>
            </c:forEach>
        </div>


</div>
</div>





<!-- jQuery CDN -->
<script src="https://code.jquery.com/jquery-1.12.0.min.js"></script>
<!-- Bootstrap Js CDN -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<script type="text/javascript">
    $(document).ready(function () {
        $('#sidebarCollapse').on('click', function () {
            $('#sidebar').toggleClass('active');
        });
    });
</script>
</body>
</html>

