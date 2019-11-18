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
        <link rel="stylesheet" type="text/css" href="./css/studentProfile.css">
        <link href="https://fonts.googleapis.com/css?family=Advent+Pro&display=swap" rel="stylesheet">
        <jsp:include page="/WEB-INF/view/PageHeader.jsp?title=${StudentFristname} Profile"/>
        <title>Student Profile</title>
    </head>
    <body background="./images/bg.png" width="100%" height="100%">
        <div class="profile">
            <h1 style="font-size: 72px;">My Profile</h1>
            <img src="./images/UserProfile.png" alt="UserProfile" width="218px" height="218px">
            <p style="font-size: 30px;">${StudentFristname} ${StudentLastname}</p>
            <p style="font-size: 30px;">${TeacherFristname} ${TeacherLastname}</p>
        </div>
        <c:choose>
            <c:when test="${teacher==null}">
                <div class="history">
                    <p style="font-size: 30px;">Test History</p>
                    <center><table class="tab">
                            <tr style="background-color: white">
                                <th>Quiz No.</th>
                                <th>Quiz Name</th>
                                <th>Score</th>
                                <th>Max Score</th>
                            </tr>
                            <c:forEach items="${studentList}" var="sl">
                            <tr>
                                <td>${sl.quiz_id}</td>
                                <td>${sl.quiz_name}</td>
                                <td>${sl.score}</td>
                                <td>${sl.maxscore}</td>
                            </tr>
                            </c:forEach>
                        </table></center>
                </div>
            </c:when>
            <c:otherwise>
                <div class="history">
                    <p style="font-size: 30px;">My Quiz</p>  <a href="AddQuiz" ><input type="button"></a>
                    <center><table class="tab">
                            <tr style="background-color: white">
                                <th>Quiz No.</th>
                                <th>Quiz Name</th>
                                <th colspan="2">#</th>
                            </tr>
                            <c:forEach items="${teacherList}" var="tl">
                            <tr>
                                <td>${tl.quiz_id}</td>
                                <td>${tl.description}</td>
                                <td><a href="EditQuiz">Edit</a></td>
                                <td><a href="DeleteQuiz?id=${tl.quiz_id}">Delete</a></td>
                            </tr>
                            </c:forEach>
                        </table></center>
                </div>
            </c:otherwise>
        </c:choose>

        ${message}

    </body>
</html>
