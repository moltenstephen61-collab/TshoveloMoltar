<%-- 
    Document   : set_multiple_choice_test_outcome
    Created on : 20 May 2026, 2:00:17 PM
    Author     : TSHOVELO MOLTAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Set Multiple Test Outcome Page</title>
    </head>
    <body>
        <h1>Set Multiple Test Outcome</h1>
        <p>
            <b> <%=application.getInitParameter("computer") %> : </b> Sir , Your Multiple Choice Was Set. Please Add More.
        </p>
        <p>
            To Add more Question Press <a href="add_multiple_choice_test.jsp">Here</a> | <a href="main_menu.jsp">Go To Main Menu</a> | 
            <a href="EndSession.do">Logout</a>
        </p>
    </body>
</html>
