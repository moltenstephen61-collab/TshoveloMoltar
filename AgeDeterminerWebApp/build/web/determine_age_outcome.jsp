<%-- 
    Document   : determine_age_outcome
    Created on : 18 May 2026, 4:13:49 PM
    Author     : TSHOVELO MOLTAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Determine Age By Date of Birth Outcome Page</title>
    </head>
    <body>
        <h1>Determine Age By Date of Birth Outcome</h1>
        <p>
            This Year This person is turning : <%= request.getAttribute("years") %> <br> 
            <a href="enter_date_of_birth.html">Check another one</a> or <a href="index.html">Logout</a>
        </p>
    </body>
</html>
