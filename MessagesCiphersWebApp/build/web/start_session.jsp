<%-- 
    Document   : start_session
    Created on : 08 May 2026, 13:36:35
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Start Session Page</title>
    </head>
    <body>
        <h1>Start Session</h1>
        <p>
           <strong>${initParam.computer_name}:</strong> : Welcome , please enter your name and Id below so i can address you by name and id.
        </p>
        <form action="StartSessionServelet.do" method="Post">
            Name : <input type="text" name="name"><br>
            ID : <input type="text" name="id"><br>
           <input type="submit" value="START SESSION">
        </form>
    </body>
</html>
