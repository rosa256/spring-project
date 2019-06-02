<!DOCTYPE HTML>
<html>
    <head>
        <meta charset="UTF-8" />
        <title>Welcome</title>
        <style>
            body {
                background-color: gray;
            }
        </style>
    </head>
    <body>
        <h1>Welcome</h1>
        <h2>${message}</h2>

        <form method="get" action="studentList">
            <button type="submit" >Show students</button>
        </form>

        <form method="get" action="formStudent">
            <button type="submit" >Add student</button>
        </form>
    </body>

</html>