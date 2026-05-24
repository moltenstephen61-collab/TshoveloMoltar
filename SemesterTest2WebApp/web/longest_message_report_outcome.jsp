<%-- 
    Document   : longest_message_report_outcome
    Created on : 24 May 2026, 12:58:58 PM
    Author     : TSHOVELO MOLTAR
--%>

<%@page import="ac.za.tut.model.entity.ShortMessage"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Longest Message Report Outcome Page</title>
    </head>
    <body>
        <h1>Longest Message Report Outcome</h1>
        <p>
            This is the Longest Message Amalysed By our web web.
        </p>
        <% 
         ShortMessage longest_shortMessage = (ShortMessage) request.getAttribute("longest_message_report");
        %>
         <table>
            <tr>
                <td>Message : </td>
                <td><%=longest_shortMessage.getShortMessage() %></td>
            </tr>
            <tr>
                <td>Number Of Vowels : </td>
                <td><%=longest_shortMessage.getTotal_vowels() %></td>
            </tr>
            <tr>
                <td>Number Of Consonants : </td>
                <td><%=longest_shortMessage.getTotal_consonants() %></td>
            </tr>
            <tr>
                <td>It's Length Is : </td>
                <td><%=longest_shortMessage.getMessage_length() %></td>
            </tr>
            <tr>
                <td>Unique Words : </td>
                <td><%=longest_shortMessage.getUniqueWords() %></td>
            </tr>
            <tr>
                <td>Repeating Words : </td>
                <td><%=longest_shortMessage.getRepeatingWords() %></td>
            </tr>
            <tr>
                <td>Date Analysed : </td>
                <td><%=longest_shortMessage.getCreationDate() %></td>
            </tr>
        </table>
            <p>
                <a href="menu.html">Go back to the main menu</a>      | 
                <a href="enter_short_message.html">Enter another short message</a>       | 
                <a href="EndSession.do">Logout</a>
            </p>
    </body>
</html>
