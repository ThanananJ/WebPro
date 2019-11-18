<%-- 
    Document   : doQuizChoice
    Created on : Nov 14, 2019, 5:11:44 PM
    Author     : nattawanee.sks
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
        <jsp:include page="/WEB-INF/view/PageHeader.jsp?title=Quiz time!"/>
        <title>Quiz time!</title>
        <style>
            .bg{
                font-family: Advent Pro;
                text-align: center;
            }
            h1{
                font-size: 72px;
                font-family: Advent Pro;
                font-weight: 300;
                color: #997B5E
            }

        </style>
    </head>
    <body background= "./images/bg.png" width="100%" height="100%">
        <div class="bg">
            <h1>${q.getDescription()}</h1>
            <img src="./images/Line 2.png" width="1000px" height="8px">
            <div style="margin: 50px 100px 50px 100px; font-size: 30px; color: #805B25">${i.getDescription()}</div>

            <form action="Choice">
                <center>
                    <table style="font-size: 30px; color: #805B25">
                        <c:forEach items="${answers}" var="a">
                            <tr>
                                <td style="width: 100px"><div style="margin-bottom: 12px"><input type="radio" name="userAnswer" value="${a.getDescription()}"></div></td>
                                <td style="width: 750px; text-align: left"><div style="background-color: #BA9366; padding-left: 10px">${a.getDescription()}</div></td>
                            </tr>
                        </c:forEach>
                        <tr>
                            <td><input type="hidden" name="count" value="${count+1}"></td>
                            <td align="right"><button type="submit" style="background-color: transparent; border: none"><div style="margin-top: 50px"><img src="./images/Next.png" width="150px" height="auto"></div></button></td>
                        </tr>
                    </table>
                </center>
            </form>
        </div>
    </body>
</html>
