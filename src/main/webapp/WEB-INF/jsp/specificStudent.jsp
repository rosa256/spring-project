<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8" />
    <title>Person List</title>
    <style>
        body {
            background-color: gray;
        }
    </style>
</head>
<body>
<h1>Specific Student</h1>

<br/><br/>
<div>
    <table border="1">
        <tr>
            <th>Id</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Age</th>
        </tr>
        <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.surname}</td>
            <td>${student.age}</td>
        </tr>
    </table>


    <form method="get" action="formStudent">
        <button type="submit" >Add student</button>
    </form>

    <form method="get" action="studentList">
        <button type="submit" >Show students</button>
    </form>

    <form method="get" action="index">
        <button type="submit"> Back</button>
    </form>

</div>
</body>

</html>