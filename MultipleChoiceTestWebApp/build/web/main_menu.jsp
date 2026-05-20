<%-- 
    Document   : main_menu
    Created on : 20 May 2026, 3:58:39 AM
    Author     : TSHOVELO MOLTAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Main Menu Page</title>
    </head>
    <body>
        <h1>Main Menu</h1>
        <p>
            <b> <%=application.getInitParameter("computer") %> : </b> <%= session.getAttribute("name") %> , Welcome , This is the menu page.
        </p>
        <ul>
            <li><a href="add_multiple_choice_test.jsp">Set Multiple Choice Test</a></li>
            <li><a href="take_multiple_choice_test.jsp">Take The Test</a></li>
            <li><a href="check_students_performance.jsp">Check Students Performance</a></li>
            <li><a href="find_Best_performing_students.jsp">Find Best Performing Students </a></li>
            <li><a href="EndSession.do">Logout</a></li>
        </ul>
    </body>
</html>
