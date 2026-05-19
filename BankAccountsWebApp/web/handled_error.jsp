<%-- 
    Document   : handled_error
    Created on : 19 May 2026, 1:20:11 PM
    Author     : TSHOVELO MOLTAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error Inputs Page</title>
    </head>
    <body>
        <h1>Error Inputs</h1>
        <p>
            Message : <b> <%= pageContext.getException().getMessage() %> !</b> <br>
            Please <a href="add_n_ccount.html">Try Again</a> .
        </p>
    </body>
</html>
