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
            <jsp:useBean id="service" class="pe.com.yoursoccerfield.services.YSFService"/>
            <%String ide=(String)request.getSession().getAttribute("uowner");%>
            <c:forEach var="court" items="<%=service.getCourtsByOwner(ide)%>">
                <div class="col-md-4">
                    <div class="thumbnail">
                            <%--<a href="" target="_blank">--%>
                        <img src="image/court/${court.id}.jpg" alt="Lights" style="width:100%" data-toggle="modal" data-target="#${court.id}">
                        <div class="caption">
                            <p>${court.name}</p>
                            <p>${court.address}</p>
                        </div>


                        <div class="modal fade" id="${court.id}" role="dialog">
                            <div class="modal-dialog">

                                <!-- Modal content-->
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                                        <h4 class="modal-title">${court.name}</h4>
                                    </div>
                                    <div class="modal-body">
                                        <img src="image/court/${court.id}.jpg" width="450" height="200"><p></p>
                                        CAPACIDAD : ${court.capacity}<p></p>
                                        ADDRESS : ${court.address}<p></p>
                                        EMAIL : ${court.email}<p></p>
                                        PHONE : ${court.phone}<p></p>
                                        PRICE : ${court.price}<p></p>
                                        TYPE : ${court.type}<p></p>
                                        STATE : ${court.state}
                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-warning" data-dismiss="modal"> EDITAR </button>
                                        <button type="button" class="btn btn-danger" data-dismiss="modal"> ELIMINAR </button>
                                        <button type="button" class="btn btn-info" data-dismiss="modal"> CLOSE </button>

                                    </div>
                                </div>

                            </div>
                        </div>

                            <%--</a>--%>
                    </div>
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
