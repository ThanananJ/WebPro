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
        <link rel="stylesheet" type="text/css" href="./css/index.css">
        <link href="https://fonts.googleapis.com/css?family=Advent+Pro&display=swap" rel="stylesheet">
        <jsp:include page="/WEB-INF/view/PageHeader.jsp?title=Home Page"/>
        <title>Web Pro</title>
    </head>
    <body background="./images/bg.png" width="100%" height="100%">
        <div class ="bg">
            <h1 style = "color:#A0896F;font-size: 72px;"> Search your quiz </h1>
            <form method="post" action="Searching">
                <input type="text" name="quizName" id ="search">
                <select name ="grade" id="drop1">
                    <option value ="4">Grade 10</option>
                    <option value ="5">Grade 11</option>
                    <option value ="6">Grade 12</option>
                </select>
                <select name ="subjects" id="drop2">
                    <option value ="Thai">Thai</option>
                    <option value ="Mathematic">Mathematic</option>
                    <option value ="Science">Science</option>
                    <option value="English">English</option>
                    <option value="Social">Social</option>
                    <option value="Other">Others</option>
                </select>
                <br>
                <br>
                <a href="./index.jsp"><input type ="submit" value="Get Started" id ="startbutton"></a>
            </form>
            <br>
            <div class ="announce">
                <table border="1" width="70%" height="90%" align="center" bordercolor="white" cellpadding ="9px">
                    <tr bgcolor="#BA9366" id="a1">
                        <th>Announcement</th>
                    </tr>
                    <c:forEach items="${announcementList}" var="al">
                        <tr bgcolor="#EBE4D1">
                            <th>${al.content}</th>
                        </tr>
                    </c:forEach>
                    <tr id="a5">
                        <td><a href="./Announcement.jsp"> See more</a> </td>
                    </tr>
                </table>
            </div>
        </div>

    </body>
</html>
