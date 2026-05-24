<%-- 
    Document   : not_found_error
    Created on : 24 May 2026, 2:41:09 PM
    Author     : TSHOVELO MOLTAR
--%>

<%@page isErrorPage = "true" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Wrong Inputs Page</title>
    </head>
    <body>
        <h1>You entered Wrong inputs</h1>
        <p>
            Error Message : <b><%=exception.getMessage() %></b> 
            
        </p>
        <p>
            <a href="enter_name_surname.html">Enter Name And Surname Again</a>  |  
            <a href="enter_student_and_id_number.html">Enter Student Number And ID Number Again</a>  |
            <a href="enter_short_message.html">Enter Short Message again</a>  |
            <a href="enter_a_number.html">Enter Numbers Again</a>
        </p>
    </body>
</html>
