<%-- 
    Document   : validation_of_name_surname_outcome
    Created on : 24 May 2026, 2:18:18 PM
    Author     : TSHOVELO MOLTAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Validation Of Name And Surname Outcome Page</title>
    </head>
    <body>
        <h1>Validation Of Name And Surname Outcome</h1>
        <p>
            Your Name And Surname Are Valid. Welcome , <b><%= request.getAttribute("name") %> <%= request.getAttribute("surname") %></b>
        </p>
        <p>
            <a href="menu.html">Go Back To Main Menu</a>    |
            <a href="enter_name_surname.html">Go Back To Main Menu</a>
        </p>
    </body>
</html>
