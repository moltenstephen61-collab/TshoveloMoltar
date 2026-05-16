<%-- 
    Document   : send_encrypted_message_outcome
    Created on : 08 May 2026, 7:54:37 PM
    Author     : TSHOVELO MOLTAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Send Encrypted Message Outcome Page</title>
    </head>
    <body>
        <h1>Send Encrypted Message Outcome</h1>
        <% 
          String name = (String)session.getAttribute("name");
          Long id = (Long)session.getAttribute("id");
        %>
        <p>
            <strong>${initParam.computer_name}:</strong> :  <b> <%=name%> (<%=id%>)</b> Your Message was sent successfully.
        </p>
        
    </body>
</html>
