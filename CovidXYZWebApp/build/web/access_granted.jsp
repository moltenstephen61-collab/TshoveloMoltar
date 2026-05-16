<%-- 
    Document   : access_granted
    Created on : 14 May 2026, 4:09:43 PM
    Author     : TSHOVELO MOLTAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Access Granted Page</title>
    </head>
    <body>
        <h1>Access Granted</h1>
        <p>
            Name : <%=session.getAttribute("name") %> <br>
            Access Granted. Your temperature is all fine. Please Sanitise your hands.<br> 
            <a href="EndSession.do">logout</a>
        </p>
    </body>
</html>
