<%--
  Created by IntelliJ IDEA.
  User: Yessenia
  Date: 10/07/2017
  Time: 09:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>REGISTRO</title>
    <jsp:include page="bootstrap.jsp"/>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style>
        .carousel-inner > .item > img,
        .carousel-inner > .item > a > img {
            width: 100%;
            margin: auto;
        }
    </style>
</head>
<body>
    <div class="header">
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">YSF</a>
                </div>
                <ul class="nav navbar-nav">
                    <li class="active"><a href="index.jsp">Home</a></li>
                    <li><a href="#">Acerca</a></li>
                    <li><a href="#">Registro</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="index2.jsp"><span class="glyphicon glyphicon-log-in"></span> Log In</a></li>
                </ul>
            </div>
        </nav>
    </div>
    <div class="container" align="center">
        <img src="image/admin.jpg" alt="Chania">
    </div>
    <div class="container">
    </div>

    <div class="container">
        <h2> </h2>
        <form>
            <div class="form-group">
            <label>Nombres:</label>
            <input type="text" class="form-control" name="firstName">
            </div>
            <div class="form-group">
                <label>Apellidos:</label>
                <input type="text" class="form-control" name="lastName">
            </div>
            <div class="form-group">
                <label>Correo Electrónico:</label>
                <input type="text" class="form-control" name="email">
            </div>
            <div class="form-group">
                <label>Contraseña:</label>
                <input type="password" class="form-control" name="password">
            </div>
        </form>
    </div>

    <div class="container">
        <h2> </h2>
        <form>
            <table>
                <tr>
                    <td><label>Tipo de Usuario</label></td>
                    <td>    </td>
                    <td>
                        <form action="">
                            <input type="radio" name="owner" value="owner"> Dueño<br>
                            <input type="radio" name="organizer" value="organizer"> Organizador<br>
                        </form>
                    </td>
                </tr>
            </table>
        </form>
    </div>

    <div class="container">
        <h2> </h2>
        <form>
            <table>
                <tr>
                    <td><img src="image/LOGO2.JPG" alt="Chania"></td>
                    <td>    </td>
                    <td>
                        <button><a href="_organizerForm.jsp">Guardar</a></button>
                    </td>
                </tr>
            </table>
        </form>
    </div>

</body>
</html>
