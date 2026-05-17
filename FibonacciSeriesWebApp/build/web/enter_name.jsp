<%-- 
    Document   : enter_name
    Created on : 17 May 2026, 4:28:01 PM
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
            <b> <%= application.getInitParameter("computer_name") %> :</b> Please Enter your name to proceed.
        </p>
        <form action="StartSession.do" method="Post">
            Name : <input type ="text" name ="user"><br> 
            <input type="submit" value="submit"> 
        </form>
    </body>
</html>
