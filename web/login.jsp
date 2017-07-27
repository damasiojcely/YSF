<!DOCTYPE html>
<html>
<head>

    <title>YSF</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width , initial-scale=1">
    <link href="css/bootstrap.css" rel="stylesheet"/>
    <style>
        .carousel-inner > .item > img,
        .carousel-inner > .item > a > img {
            width: 100%;
            margin: auto;
        }

    </style>
</head>
<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="60" style="background-color: #F1F1F1">

<jsp:include page="_head.jsp"/>

<center><div class="container img-responsive" style="width:450px; height: 434px ">
    <h2>Log in</h2><br>
    <form class="form-horizontal" action="login" method="post">
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">Email:</label>
            <div class="col-sm-10">
                <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="pwd">Password:</label>
            <div class="col-sm-10">
                <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="password">
            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-8">
                <button type="submit" class="btn btn-primary" value="Ingresar">Ingresar</button>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <label class="control-label">Si aun no tienes cuenta, Registrate
                    <a href="#" data-toggle="dropdown"> Aqui </a>

                        <ul class="dropdown-menu" role="menu">
                            <li><a role="menuitem" tabindex="-1" href="newOwner.jsp">Due&ntilde;o</a></li>
                            <li><a role="menuitem" tabindex="-1" href="newOrganizer.jsp">Organizador</a></li>
                        </ul>
                </label>
            </div>
        </div>
    </form>
</div></center>


<script src="js/jquery.js"></script>
<script src="js/bootstrap.js"></script>

</body>
</html>