<%-- 
    Document   : doQuizFillword
    Created on : Nov 14, 2019, 9:57:59 AM
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
        <jsp:include page="/WEB-INF/view/PageHeader.jsp?title=Home Page"/>
        <title>Quiz time!</title>
    </head>
    <style>
        .bg{
            font-family: Advent Pro;
        }
        h1{
            font-size: 72px;
            font-family: Advent Pro;
            font-weight: 300;
            color: #997B5E
        }
        .inputbox{
            width: 700px;
            padding: 10px;
            outline: none;
            border: transparent;
            background-image: url(./images/inputbox.png);
            font-family: Advent Pro;
            font-size: 20px;
            color: white
        }
        
    </style>
    <body background= "./images/bg.png" width="100%" height="100%">
    <center><div class="bg">
            <h1>${q.getDescription()}</h1>
            <img src="./images/Line 2.png" width="1000px" height="8px">
            <div style="margin: 50px 100px 50px 100px; font-size: 30px; color: #805B25">${i.getDescription()}</div>
            <form action="Fillword" method="post">
                <table style="font-size: 30px; color: #805B25">
                    <tr>
                        <td style="padding-right: 20px">Answer : </td>
                        <td><input type="text" name="userAnswer" class="inputbox"></td>
                    </tr>
                    <tr>
                        <td><input type="hidden" name="count" value="${count+1}"></td>
                        <td align="right"><button type="submit" style="background-color: transparent; border: none"><div style="margin-top: 50px"><img src="./images/Next.png" width="150px" height="auto"></div></button></td>
                    </tr>
                </table>
            </form>
        </div>
    </center>
</body>
</html>
