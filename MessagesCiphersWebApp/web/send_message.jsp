<%-- 
    Document   : send_message
    Created on : 08 May 2026, 6:23:18 PM
    Author     : TSHOVELO MOLTAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Send Message to the manager Page</title>
    </head>
    <body>
        <h1>Send Message to the manager</h1>
        <% 
          String name = (String)session.getAttribute("name");
          Long id = (Long)session.getAttribute("id");
        %>
        <p>
            <strong>${initParam.computer_name}:</strong> :  <b> <%=name%> (<%=id%>)</b> You can now send your message below.
        </p>
        <form action="SendMessegeServelet.do" method="GET">
            Message : <input type="text" name="message"><br>
            <input type="submit" value="Send Message">
        </form>
    </body>
</html>
