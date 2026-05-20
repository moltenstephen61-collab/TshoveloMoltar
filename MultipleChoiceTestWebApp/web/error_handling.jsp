<%-- 
    Document   : error_handling.jsp
    Created on : 20 May 2026, 4:01:03 AM
    Author     : TSHOVELO MOLTAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error Handling Page</title>
    </head>
    <body>
        <h1>Error Handling</h1>
        <p>
            Message : <b><%= pageContext.getException().getMessage() %></b>  <br> 
            Please Enter The Correct name to continue. <a href="enter_name.html">Try Again</a>
        </p>
    </body>
</html>
