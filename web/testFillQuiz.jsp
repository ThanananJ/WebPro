<%-- 
    Document   : testFillQuiz
    Created on : Nov 16, 2019, 12:48:00 PM
    Author     : Mark
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Create</h1>
        <form action="AddItemsFill" method="post">
            <table>
                <c:forEach begin="1" end="${Integer.valueOf(runLoop)}" varStatus="vs" >
                    <tr>
                        <td>${vs.count}</td>
                        <td><input type="text" name="itemdescription${vs.count}"></td>
                    </tr>
                    <tr>
                        <td>Answers : </td>
                        <td><input type="text" name="answersdescription${vs.count}"></td>
                    </tr>
                </c:forEach>
            </table> 
            <input name="finish" hidden="true" ><input type="submit" value="Finish">
        </form>



    </body>
</html>
