<%-- 
    Document   : validate_numbers_outcome
    Created on : 24 May 2026, 5:09:46 PM
    Author     : TSHOVELO MOLTAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Validate Numbers Outcome Page</title>
    </head>
    <body>
        <h1>Validate Numbers Outcome</h1>
        <p>
            Your Numbers Are Valid. <b> <%=request.getAttribute("num") %> AND <%=request.getAttribute("num2") %></b>
        </p>
        <p>
            <a href="menu.html">Go back to Main Menu</a>      | 
            <a href="enter_a_number.html">Validate Numbers Again</a>
        </p>
    </body>
</html>
