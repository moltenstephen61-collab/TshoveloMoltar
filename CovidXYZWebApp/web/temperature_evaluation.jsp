<%-- 
    Document   : temperature_evaluation
    Created on : 14 May 2026, 3:49:49 PM
    Author     : TSHOVELO MOLTAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Check Temperatures Page</title>
    </head>
    <body>
        <h1>Check Temperatures</h1>
        <p>
            Now We Will Check Your Temperature
        </p>
        <form action="CheckTemperature.do" method="Post">
            <input type="number" name="temperature"><br>
            <input type="submit" name="Check Temperature">
        </form>
    </body>
</html>
