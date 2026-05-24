<%-- 
    Document   : validate_message_outcome
    Created on : 24 May 2026, 4:35:17 PM
    Author     : TSHOVELO MOLTAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Validate Message Outcome Page</title>
    </head>
    <body>
        <h1>Validate Message Outcome</h1>
        <p>
            Your Message is Valid. <b><%= request.getAttribute("message")%></b>
        </p>
        <p>
            <a href="menu.html">Go back to Main Menu</a>      | 
            <a href="enter_short_message.html">Try Validating Another Message</a>
        </p>
    </body>
</html>
