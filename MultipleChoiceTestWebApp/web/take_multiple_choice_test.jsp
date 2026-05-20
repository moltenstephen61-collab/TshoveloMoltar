<%-- 
    Document   : take_multiple_choice_test
    Created on : 20 May 2026, 10:53:18 AM
    Author     : TSHOVELO MOLTAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Start Multiple Choice Test Page</title>
    </head>
    <body>
        <h1>Start Multiple Choice Test</h1>
         <p>
            <b> <%=application.getInitParameter("computer") %> : </b> <%= session.getAttribute("name") %> , Please press the button below to Start the test.
        </p>
        <form action="StartMultipleChoiceTest.do" method="Post">
            Student Name     : <input type="text" name="stud_name"><br> 
            Student Surname  : <input type="text" name="stud_surname"><br>
            Student Number   : <input type="text" name="stud_number"><br>
            <input type="submit" value="Start Test"> 
        </form>
    </body>
</html>
