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
        <title>JSP Page</title>
    </head>
    <body>
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
    </body>
</html>
