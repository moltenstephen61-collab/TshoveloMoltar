<%-- 
    Document   : Main_menu
    Created on : 17 May 2026, 4:40:19 PM
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
            <b> <%= application.getInitParameter("computer_name") %> :</b> Welcome , <b><%= session.getAttribute("name") %></b> , This is the main menu page. <br> 
            Below are options to choose from. 
        </p>
        <ul>
            <li><a href="GenerateFibonacci.do">Go To Questions Page</a></li>
            <li><a href="EndServelet.do">Logout</a></li>
        </ul>
    </body>
</html>
