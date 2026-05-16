<%-- 
    Document   : Start_Multiple_choice
    Created on : 16 May 2026, 5:53:27 PM
    Author     : TSHOVELO MOLTAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Start Multiple Choice Page</title>
    </head>
    <body>
        <h1>Start Multiple Choice</h1>
        <p>
            <b><%= application.getInitParameter("computer_name") %> :</b>  <b><%= session.getAttribute("name") %></b> , Welcome to our multiple choice questions app. <br> 
            To start the multiple choice questions press the buttons below.
        </p>
        <form action ="StartMultipleChoice.do" method="Post">
            <input type="submit" value="Start">
        </form>
    </body>
</html>
