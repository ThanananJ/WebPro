<%-- 
    Document   : testQuiz
    Created on : Nov 16, 2019, 12:47:12 PM
    Author     : Mark
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
        <link rel="stylesheet" type="text/css" href="./css/doQuizChoice.css">
        <jsp:include page="/WEB-INF/view/PageHeader.jsp?title=Add Quiz"/>
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
        <form action="AddQuiz" method="post">
            <h2>Quiz name</h2><input type="text" name="quizname"> <br>
            <h2>Subject</h2>
            <select name ="quizsubject" >
                <option value ="Thai">Thai</option>
                <option value ="Mathematics">Mathematics</option>
                <option value ="Science">Science</option>
                <option value="English">English</option>
                <option value="Social">Social</option>
                <option value="Other">Others</option>
            </select><br>
            <h2>Quiz type</h2><select name ="quiztype" >
                <option value ="1">Fill</option>
                <option value ="2">Ch</option>
            </select><br>
            <h2>Items</h2><input type="number" name="numberitems"min="1" > <br>
            <h2>For Class</h2><select name ="quizfoeclasss" >
                <option value ="401">4/1</option>
                <option value ="503">5/3</option>
            </select><br>  <br>
            <input name="create" hidden="true" ><input type="submit" value="Next">
        </form>
        </div>
    </body>
</html>
