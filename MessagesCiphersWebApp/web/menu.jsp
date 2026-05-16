<%-- 
    Document   : menu
    Created on : 08 May 2026, 6:11:32 PM
    Author     : TSHOVELO MOLTAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu Page</title>
    </head>
    <body>
        <h1>Main Menu</h1>
        <% 
          String name = (String)session.getAttribute("name");
          Long id = (Long)session.getAttribute("id");
        %>
        <p>
            <strong>${initParam.computer_name}:</strong> :  <b> <%=name%> (<%=id%>)</b>Welcome , please enter your name and Id below so i can address you by name and id.
        </p>
        <ul>
            <li><a href="send_message.jsp">send a message to the manager</a></li>
            <li><a href="decript_messages.jsp">decrypt sent a messages from agents</a></li>
            <li><a href="logout.html">logout</a></li>
        </ul>
    </body>
</html>
