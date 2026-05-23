<%-- 
    Document   : error_message
    Created on : 22 May 2026, 7:26:56 PM
    Author     : TSHOVELO MOLTAR
--%>

<%@page isErrorPage="true" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error Message Page</title>
    </head>
    <body>
        <h1>Error Message</h1>
        <p>
            ERROR MESSAGE : <%= pageContext.getException().getMessage() %> <br> 
            <a href="enter_message.html">Try again</a>
        </p>
    </body>
</html>
