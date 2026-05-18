<%-- 
    Document   : enter_name
    Created on : 18 May 2026, 7:46:36 AM
    Author     : TSHOVELO MOLTAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Enter Name Page</title>
    </head>
    <body>
        <h1>Enter Name</h1>
        <p>
            Hello , My name is : <b><%= application.getInitParameter("computer") %></b> , And i am your Ai Assistance. Please enter your name in the form below.
        </p>
        <form action="StartSession.do" method="Post">
            Name : <input type="text" name="user"><br>
            <input type="submit" value="Submit"> 
        </form>
    </body>
</html>
