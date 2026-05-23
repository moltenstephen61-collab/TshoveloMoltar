<%-- 
    Document   : summary_report_outcome
    Created on : 22 May 2026, 9:04:03 PM
    Author     : TSHOVELO MOLTAR
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Summary Report Outcome Page</title>
    </head>
    <body>
        <h1>Summary Report Outcome</h1>
        <p>
            Below is the Summary Report.
        </p>
        <% 
          List<String> messages = (List<String>) request.getAttribute("messages");
          int total_messages = (int)request.getAttribute("total_messages");
          
        %>
        <table>
        <% for( int i = 0 ; i < messages.size() ;i++ ){ %>
        <tr>
            <td>Message_<%= i %></td>
            <td><%=messages.get(i) %></td>
        </tr>
        <% } %>
        </table>
        <p>
            In Total There Were <%= total_messages%> Message(s) Analyzed In the App.
        </p>
        <p>
            <a href="EndSession.do">Logout</a>
        </p>
    </body>
</html>
