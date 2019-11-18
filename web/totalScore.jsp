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
        <jsp:include page="/WEB-INF/view/PageHeader.jsp?title=Home Page"/>
        <style>
            .bg{
                font-family: Advent-Pro;
                color: #997B5E;
            }
            #score{
                border-radius: 200px;
                width: 400px;
                height: 400px;
                border: 4px solid #997B5E;
                font-size:120px;
                text-align: center;
                margin-left: 40%;
                margin-top: 50px;
                position: absolute;
                padding-top:100px;
            }
        </style>
        <title>Total Score</title>
    </head>
    <body background="./images/bg.png" width="100%" height="100%">
        <div class="bg">
            <h1 style="text-align: center; font-size: 72px;"> M.4</h1>
                <p id="score">10/10</p>
        </div>
    </body>
</html>
