<%-- 
    Document   : endQuiz
    Created on : Nov 16, 2019, 6:39:57 PM
    Author     : nattawanee.sks
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <link href="https://fonts.googleapis.com/css?family=Advent+Pro&display=swap" rel="stylesheet">
        <jsp:include page="/WEB-INF/view/PageHeader.jsp?title=Quiz End!"/>
        <title>Quiz end!</title>
        <style>
            .bg{
                font-family: Advent Pro;
            }
            #box{
                border-radius: 15px;
                background-color: #DEC7A4;
                /*width:1000px;
                height:386px;*/
                margin-top: 40px;
                margin-left: 200px;
                margin-right: 200px;
            }
            h1{
                font-size: 72px;
                font-family: Advent Pro;
                font-weight: 300;
                color: #997B5E
            }
            body {
                height: 100%;
                width: auto
            }

            .bgimg {
                /* The image used */
                background-image: url(./images/bg.png);

                /* Full height */
                height: 100%;
                width: 100%;

                /* Center and scale the image nicely */
                /*background-position: center;*/
                background-repeat: no-repeat;
                background-size: cover;
            }
        </style>
    </head>
    <body class="bgimg">
        <div class="bg">
            <center>
                <h1>Quiz is End!!</h1>
                <img src="./images/Line 2.png" width="1000px" height="8px"><br>
                <a href="./Summary" style="font-size: 30px">see score</a>
            </center>
        </div>
    </body>
</html>
