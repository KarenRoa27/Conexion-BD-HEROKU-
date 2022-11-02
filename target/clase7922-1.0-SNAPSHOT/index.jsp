<%-- 
    Document   : index
    Created on : 7 sept 2022, 13:14:08
    Author     : Karen Yulied Bohorquez Roa 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <head>
            <meta charset="utf-8">
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <title>HEROKU+CONEXION BD</title>
            <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
            <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" >
            <link href="Css/Estilo.css" rel="stylesheet" type="text/css"/>
            <link href="./bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <body>
        </head>
<body style ="background-color: #000000;"></body>
        <body>
            <div class="container col-lg-3">
                <div id="contendor">
                <form action="Control" method="post">
                    <div class="form-group text-center">
                    <img src="img/BienvenidoHomero.gif"width="320px" height="129 px">  
                    </div>
                    <div class="form-group">
                        <label>Nombre:</label>
                        <input type="text" name="txt_nombres"placeholder="Ingrese Nombre" class="form-control"required/>  
                    </div>
                    <div class="form-group">
                        <label>Telefono:</label>
                        <input type="string" name="txt_telefono"placeholder="Digite Su Telefono" class="form-control"required/>  
                    </div>
                    <div class="form-group">
                        <label>Email:</label>
                        <input type="email" name="txt_email"placeholder="Example@gmail.com" class="form-control"required/>  
                    </div>
                    <div class="form-group">
                        <label>Clave:</label>
                        <input type="password" name="txt_clave"placeholder="********" class="form-control"required/>  
                    </div>
                    <div id="registro">
                 <input class="btn-danger btn-block" type="submit" name="btn_registrar" value="Registrar"/>  
                 <input class="btn-danger btn-block"type="reset" name="btn_borrar" value="Borrar"/>
                  </div>
                </form>
             <h1> Hecho Por:Karen Yulied Bohorquez Roa</h1>
     
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.3/dist/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
