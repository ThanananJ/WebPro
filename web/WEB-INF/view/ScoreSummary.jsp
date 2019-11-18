<%-- 
    Document   : ScoreSummary
    Created on : Nov 15, 2019, 12:01:43 AM
    Author     : nattawanee.sks
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://fonts.googleapis.com/css?family=Advent+Pro&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <!--<link href="https://fonts.googleapis.com/css?family=Advent+Pro&display=swap" rel="stylesheet">-->
        <jsp:include page="/WEB-INF/view/PageHeader.jsp?title=Score Summary"/>
        <style>
            @import url('https://fonts.googleapis.com/css?family=Advent+Pro&display=swap');
            .bg{
                font-family: Advent Pro;
                color: #997B5E;
            }
            #score{
                border-radius: 200px;
                width: 300px;
                height: 300px;
                border: 10px solid #997B5E;
                font-size:72px;
                text-align: center;
                margin-left: 40%;
                margin-top: 50px;
                position: absolute;
                padding-top:90px;
            }
        </style>
        <title>Summary Score</title>
    </head>
    <body background= "./images/bg.png" width="100%" height="100%">
        <div class="bg">
            <center>
            <h1 style="text-align: center; font-size: 72px;">${q.getDescription()}</h1>
            <img src="./images/Line 2.png" width="1000px" height="8px"><br>
                <p id="score">${score} / ${q.getMaxScore()}</p>
            <form action="./index.jsp">
                <button style="background-color: transparent; border: none; margin: 400px 0px 0px 0px"><img src="./images/back.png"></button>
            </form>
            </center>
        </div>
    </body>
</html>
