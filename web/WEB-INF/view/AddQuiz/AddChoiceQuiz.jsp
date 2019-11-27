<%-- 
    Document   : testChQuiz
    Created on : Nov 16, 2019, 12:48:21 PM
    Author     : Mark
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <link rel="stylesheet" type="text/css" href="./css/doQuizChoice.css">
        <jsp:include page="/WEB-INF/view/PageHeader.jsp?title=Add Quiz"/>
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
            table {
                margin: 25px 50px 25px 250px;
                font-size: 36px;
                color:#805B25;
            }
            .input-field {
                width: 500px;
                padding: 10px;
                outline: none;
                border: transparent;
                background-image: url(./images/inputbox.png);
                font-family: Advent Pro;
                font-size: 20px;
                color: white;
                border-radius: 10px
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
            <center><h1>Create</h1></center>
            <form action="AddItemsCh" method="post">
                <table>
                    <c:forEach begin="1" end="${Integer.valueOf(runLoop)}" varStatus="vs" >
                        <tr>
                            <td style="text-align: right">${vs.count}.</td>
                            <td><input type="text" name="itemdescription${vs.count}" class="input-field" required="true"></td>
                        </tr>
                        <c:forEach begin="1" end="4" varStatus="vsch">
                            <tr>
                                <td style="text-align: right">Choice${vsch.count} : </td>
                                <td><input type="text" name="choicedescription${vs.count}/${vsch.count}" class="input-field" required="true"></td>
                            </tr>
                        </c:forEach>
                        <tr>
                            <td style="text-align: right">Answers Correct : </td>
                            <td><input type="text" name="choicesboolean${vs.count}" class="input-field" required="true"></td>
                        </tr>
                    </c:forEach>
                </table> 
                <input name="finish" hidden="true" >
                <center><button type="submit" style="background-color: transparent; border: none"><img src="./images/Next.png" width="200px" height="auto"></button></center>
            </form>
        </div>
    </body>
</html>
