<%-- 
    Document   : main_menu
    Created on : 18 May 2026, 8:38:26 AM
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
            <b><%=application.getInitParameter("computer") %> : </b> <%=session.getAttribute("name") %> , Welcome. This is the Menu page. 
        </p>
        <ul>
            <li><a href="StartGuessingGame.do">Guessing Game</a></li>
            <li><a href="EndSession.do">Logout</a></li>
        </ul>
    </body>
</html>
