<%-- 
    Document   : Start
    Created on : 16 May 2026, 12:16:33 AM
    Author     : TSHOVELO MOLTAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Start Page</title>
    </head>
    <body>
        <h1>Start</h1>
        <p>
            <b><%= application.getInitParameter("computer_name") %> : </b>Please Enter your name below to Start taking the quizzes.
        </p>
        <form action="StartSession.do" method="Post">
            Name : <input type="text" name="name"><br>
            <input type="submit" value="Start">
        </form>
    </body>
</html>
