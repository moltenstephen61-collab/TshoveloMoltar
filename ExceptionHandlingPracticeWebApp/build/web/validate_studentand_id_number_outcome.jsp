<%-- 
    Document   : validate_studentand_id_number_outcome
    Created on : 24 May 2026, 4:16:36 PM
    Author     : TSHOVELO MOLTAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Validate Student And ID Number Outcome Page</title>
    </head>
    <body>
        <h1>Validate Student And ID Number Outcome</h1>
        <p>
            Your Student Number And ID Number Are Valid. <b><%=request.getAttribute("student_number") %> <%=request.getAttribute("id_number") %></b>
        </p>
        <p>
            <a href="menu.html">Go back to Main Menu</a>      | 
            <a href="enter_student_and_id_number.html">Try Validating Student And ID Number</a>
        </p>
    </body>
</html>
