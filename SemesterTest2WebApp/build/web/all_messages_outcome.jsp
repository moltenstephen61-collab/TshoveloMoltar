<%-- 
    Document   : all_messages_outcome
    Created on : 24 May 2026, 12:21:18 PM
    Author     : TSHOVELO MOLTAR
--%>

<%@page import="java.util.List"%>
<%@page import="ac.za.tut.model.entity.ShortMessage"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All Messages Outcome Page</title>
    </head>
    <body>
        <h1>All Messages Outcome</h1>
        <p>
            The Messages that have been Analysed By this Web App are displayed below.
        </p>
        <% 
         List<ShortMessage> shortMessages = (List<ShortMessage>) request.getAttribute("shortMessages");
        %>
        <% for(int i = 0 ; i < shortMessages.size() ; i++) { %>
        <table>
            <tr>
                <td>Message : </td>
                <td><%=shortMessages.get(i).getShortMessage() %></td>
            </tr>
            <tr>
                <td>Number Of Vowels : </td>
                <td><%=shortMessages.get(i).getTotal_vowels() %></td>
            </tr>
            <tr>
                <td>Number Of Consonants : </td>
                <td><%=shortMessages.get(i).getTotal_consonants() %></td>
            </tr>
            <tr>
                <td>It's Length Is : </td>
                <td><%=shortMessages.get(i).getMessage_length() %></td>
            </tr>
            <tr>
                <td>Unique Words : </td>
                <td><%=shortMessages.get(i).getUniqueWords() %></td>
            </tr>
            <tr>
                <td>Repeating Words : </td>
                <td><%=shortMessages.get(i).getRepeatingWords() %></td>
            </tr>
            <tr>
                <td>Creation Date : </td>
                <td><%=shortMessages.get(i).getCreationDate() %></td>
            </tr>
        </table>
        <% }%>
        <p>
                <a href="menu.html">Go back to the main menu</a>      | 
                <a href="enter_short_message.html">Enter another short message</a>       | 
                <a href="EndSession.do">Logout</a>
            </p>
    </body>
</html>
