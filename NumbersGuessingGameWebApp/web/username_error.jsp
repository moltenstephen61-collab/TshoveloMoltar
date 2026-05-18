<%-- 
    Document   : username_error
    Created on : 18 May 2026, 8:28:46 AM
    Author     : TSHOVELO MOLTAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Username Error Page</title>
    </head>
    <body>
        <h1>Username Error</h1>
        <p>
            <b>Error : </b> <%= pageContext.getException().getMessage() %> <br> 
            Please <a href="enter_name.jsp">try again </a>.
        </p>
    </body>
</html>
