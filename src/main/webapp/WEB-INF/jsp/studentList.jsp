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
<h1>Students List</h1>

<br/><br/>
<div>
    <table border="1">
        <tr>
            <th>Id</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Age</th>
        </tr>
        <c:forEach  items="${myStudentList}" var ="student">
            <tr>
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>${student.surname}</td>
                <td>${student.age}</td>
            </tr>
        </c:forEach>
    </table>


    <form method="get" action="formStudent">
        <button type="submit" >Add student</button>
    </form>

    <form method="get" action="download.pdf">
        <button type="submit" >Download PDF</button>
    </form>

    <form method="get" action="/index">
        <button type="submit"> Back</button>
    </form>



    <h2>Find by id</h2>
    <form method="get" action="/student">
        <input type="text" name="idIndex">
        <button type="submit"> Find</button>
    </form>

</div>
</body>

</html>