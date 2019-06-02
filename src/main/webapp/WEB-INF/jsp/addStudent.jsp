
<html>
<head>
    <style>
        body {
            background-color: gray;
        }
    </style>
</head>
<body>
<h3>Welcome, Enter The Student Details</h3>
    <form method="POST" action="/addStudent" >
        <table>
            <tr>
                <td><label name="name">Name</label></td>
                <td><input name="name"/></td>
            </tr>

            <tr>
                <td><label name="surname">
                    Surname</label></td>
                <td><input name="surname"/></td>
            </tr>

            <tr>
                <td><label name="age">Age</label></td>
                <td><input name="age"/></td>
            </tr>

            <tr>
                <td><input type="submit" value="Submit"/></td>
            </tr>
        </table>
    </form>
    <form method="get" action="/index">
        <button type="submit"> Back</button>
    </form>

</body>
</html>






