<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Page Header</title>
        <link href="https://fonts.googleapis.com/css?family=Advent+Pro&display=swap" rel="stylesheet">
        <style>
            .navbar {
                background-color: #D3E8E1;
                margin: auto;
                padding: 10px;
                width: 100%;
                height:100%;
            }

            .nav a {
                text-decoration: none;
                color: #694624;
                font-size: 18px;
                font-family: Andale Mono;
            }
            .nav ul {
                list-style-type: none;
                margin:auto;
                height: 100%;
            }
            .nav li {
                display: inline;
                margin-right: 30px;

            }
        </style>
    </head>
    <body>
        <div class ="navbar">
            <a href = "./index.jsp"> <img src="./images/logo.png" alt="logo" height="70px"></a>
            <div class ="nav">
                <ul>
                    <li><a href="/index.jsp">My Profile</a></li>
                    <li ><a href="./login.jsp">Logout</a></li>
                </ul>
            </div>
        </div>
    </div>
</body>

</html>