<%-- 
    Document   : SeeTotalScore
    Created on : Nov 21, 2019, 11:14:44 AM
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
        <link rel="stylesheet" type="text/css" href="./css/studentProfile.css">
        <link href="https://fonts.googleapis.com/css?family=Advent+Pro&display=swap" rel="stylesheet">
        <jsp:include page="/WEB-INF/view/PageHeader.jsp?title=Total Score"/>
        <title>Student Profile</title>
        <style>
            .bg{
                font-family: Advent Pro;
                text-align: center;
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
            h1{
                font-size: 72px;
                font-family: Advent Pro;
                font-weight: 300;
                color: #997B5E
            }
            h2{
                font-size: 48px;
                font-family: Advent Pro;
                font-weight: 300;
                color: #997B5E
            }
        </style>
    </head>
    <body class="bgimg">
        <div class="bg">
        <h1>Total Score of</h1>
        <h2>${q.getDescription()}</h2>
        <table>
            <tr>
                <th>Student id</th>
                <th>Student name</th>
                <th>Score</th>
            </tr>
            <c:forEach items="score" var="s">
                <tr>
                    <td>3</td>
                    <td>2</td>
                    <td>1</td>
                </tr>
            </c:forEach>
        </table>
        </div>
    </body>
</html>
