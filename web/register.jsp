<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link href="css/style.css" rel="stylesheet" tye="text/css" media="all" />
</head>
<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="60" >
<nav class="navbar navbar-default ">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a  href="index.jsp"><img src="image/LOGO2.JPG" width="120" height="50"></a>
        </div>
        <div class="collapse navbar-collapse" id="myNavbar">
            <ul class="nav navbar-nav navbar-right">
                <li><a href="">ACERCA</a></li>
                <li><a href="">FUNCIONES</a></li>
                <li><a href="">CONTACTANOS</a></li>
                <li><a href="register.jsp">REGISTRARSE</a></li>
                <li><a href="login.jsp">INGRESAR</a></li>
            </ul>
        </div>
    </div>
</nav>
    <p>


    </p>


        <h2> </h2>
      <div class="row" >
          <div class="container-fluid">
          <div class="col-md-7">

              <img src="image/grass.jpg">

          </div>

          <div class="col-md-5">

              <h2> Registrase como : </h2>

              <p>

              </p>

              <br>

              <button><a href="newOrganizer.jsp"> ORGANIZADOR </a></button>

              <p>

              </p>

              <br>

               <button><a href="newOwner.jsp"> ADMINISTRADOR </a></button>

          </div>
      </div>
       </div>
</body>
</html>
