<%-- 
    Document   : TeacherLogin
    Created on : Nov 5, 2019, 10:51:23 PM
    Author     : nattawanee.sks
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <style>
            @import url('https://fonts.googleapis.com/css?family=Advent+Pro&display=swap');
            body, html {
                height: 100%;
                width: auto
            }

            .bg {
                /* The image used */
                background-image: url(./images/loginBG.png);

                /* Full height */
                height: 100%;

                /* Center and scale the image nicely */
                background-position: center;
                background-repeat: no-repeat;
                background-size: cover;
            }
            * {box-sizing: border-box;}

            /* Style the input container */
            .input-container {
                display: flex;
                width: 1000px;
                margin-bottom: 15px;
            }

            /* Style the input fields */
            .input-field {
                width: 400px;
                padding: 10px;
                outline: none;
                border: transparent;
                background-image: url(./images/inputbox.png);
                font-family: Advent Pro;
                font-size: 20px;
                color: white
            }

            .text{
                font-family: 'Advent Pro';
                font-weight: lighter;
            }
        </style>
    </head>
    <body>
        <body class="bg">
        <div style="text-align: right;margin: 50px 50px 0px 0px"><img src="./images/logo.png" width="400px" height="auto"></div>

        <form action="TeacherLogin" method="post">
            <table style="float: right; margin: 50px 50px 0px 0px">
                <tr>
                    <td>
                        <p class="text" style="font-size: 30px">Username : </p>
                    </td>
                    <td>
                        <input class="input-field" type="text" placeholder="Teacher id" name="username">
                    </td>
                </tr>
                <tr>
                    <td>
                        <p class="text" style="font-size: 30px">Password : </p>
                    </td>
                    <td>
                        <input class="input-field" type="password" placeholder="Password" name="password">
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td style="text-align: right">
                        <button type="submit" style="border: 0; background: transparent;">
                            <img src="./images/loginbtn.png" width="90" height="auto" alt="submit" />
                        </button>
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><p class="text" style="text-align: right; color: red;font-size: 30px">${message}</p></td>
                </tr>
            </table>
        </form>
    </body>
    </body>
</html>
