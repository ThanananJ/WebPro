<%-- 
    Document   : selectRole
    Created on : Oct 31, 2019, 10:01:59 AM
    Author     : nattawanee.sks
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Get Started!</title>
        <style> 
            body, html {
                height: 100%;
                width: auto
            }

            .bg {
                /* The image used */
                background-image: url(./images/bg.png);

                /* Full height */
                height: 100%;

                /* Center and scale the image nicely */
                background-position: center;
                background-repeat: no-repeat;
                background-size: cover;
            }

            .text{
                font-family: Advent Pro;
                font-weight: lighter;
            }
            
            .btn{
                background-image: url(./images/inputbox.png);
                height: 100px;
                width: 250px;
            }
            
            .selectbtn{
                font-family: Advent Pro;
                font-weight: lighter;
                font-size: 30px;
                color: brown;
                text-decoration: none;
            }
            
            selectbtn:visited{
                color: #997B5E;
                text-decoration: none;
            }
            selectbtn:hover{
                color: #997B5E;
                text-decoration: none;
            }
        </style>
    </head>
    <body class="bg">
        <center><div><img src="./images/logo.png" width="400px" height="auto"></div></center>
        <div style="margin: 50px 0px 0px 0px"></div>
        <center><h1 class="text" style="font-size: 50px;color: #997B5E">You are ...?</h1></center>
        <center>
            <button class="btn"><a href="./TeacherLogin" class="selectbtn">Teacher</a></button>
            <div style="margin: 50px 50px 50px 50px"></div>
            <button class="btn"><a href="./Login" class="selectbtn">Student</a></button>
        </center>
    </body>
</html>
