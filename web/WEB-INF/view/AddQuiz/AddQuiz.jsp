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
            td{
                text-align: left;
            }
            table {
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
            .inputSelect{
                outline: none;
                border: transparent;
                background-color: #DEC7A4;
            }
            input{
                font-size: 30px
            }
        </style>
    </head>
    <body background= "./images/bg.png" width="100%" height="100%">
        <div class="bg">
            <h1>Create your new Quiz</h1>
            <center><img src="./images/Line 2.png" width="1000px" height="8px"></center>
            <form action="AddQuiz" method="post">
                <table style="margin: 25px 50px 25px 300px">
                    <tr>
                        <td>Quiz name</td>
                        <td> : </td>
                        <td><input type="text" name="quizname" class="input-field" required="true"></td>
                    </tr>
                    <tr>
                        <td style="height: 10px"></td>
                    </tr>
                    <tr>
                        <td>
                            Subject
                        </td>
                        <td> : </td>
                        <td>
                            <select name ="quizsubject" class="inputSelect">
                                <option value ="Thai">Thai</option>
                                <option value ="Mathematic">Mathematic</option>
                                <option value ="Science">Science</option>
                                <option value="English">English</option>
                                <option value="Social">Social</option>
                                <option value="Other">Others</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td style="height: 10px"></td>
                    </tr>
                    <tr>
                        <td>
                            Quiz type
                        </td>
                        <td> : </td>
                        <td>
                            <select name ="quiztype" class="inputSelect">
                                <option value ="1">Fill short answer</option>
                                <option value ="2">Multiple Choice</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td style="height: 10px"></td>
                    </tr>
                    <tr>
                        <td>
                            Items
                        </td>
                        <td> : </td>
                        <td>
                            <input type="number" name="numberitems"min="1" class="input-field" required="true">
                        </td>
                    </tr>
                    <tr>
                        <td style="height: 10px"></td>
                    </tr>
                    <tr>
                    <td>
                        For Class
                    </td>
                    <td> : </td>
                    <td>
                        <select name ="quizforclasss" class="inputSelect">
                            <option value ="401">Grade 10 class 1</option>
                            <option value ="402">Grade 10 class 2</option>
                            <option value ="403">Grade 10 class 3</option>
                            <option value ="501">Grade 11 class 1</option>
                            <option value ="502">Grade 11 class 2</option>
                            <option value ="503">Grade 11 class 3</option>
                            <option value ="601">Grade 12 class 1</option>
                            <option value ="602">Grade 12 class 2</option>
                            <option value ="603">Grade 12 class 3</option>
                        </select>
                    </td>
                    </tr>
                    <tr>
                        <td style="height: 10px"></td>
                    </tr>
                    <tr>
                        <td>
                            <input name="create" hidden="true" >
                        </td>
                    </tr>
                </table>
                <button type="submit" style="background-color: transparent; border: none"><img src="./images/Next.png" width="200px" height="auto"></button>
            </form>
        </div>
    </body>
</html>
