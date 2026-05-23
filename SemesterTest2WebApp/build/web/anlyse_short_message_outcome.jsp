<%-- 
    Document   : anlyse_short_message_outcome
    Created on : 23 May 2026, 10:52:32 PM
    Author     : TSHOVELO MOLTAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Analyse Short Message Outcome Page</title>
    </head>
    <body>
        <h1>Analyse Short Message Outcome</h1>
        <p>
            Below is the message you entered.
        </p>
        <table>
            <tr>
                <td>Message : </td>
                <td><%=request.getAttribute("short_message") %></td>
            </tr>
            <tr>
                <td>Number Of Vowels : </td>
                <td><%=request.getAttribute("total_vowels") %></td>
            </tr>
            <tr>
                <td>Number Of Consonants : </td>
                <td><%=request.getAttribute("total_consonats") %></td>
            </tr>
            <tr>
                <td>It's Length Is : </td>
                <td><%=request.getAttribute("message_length") %></td>
            </tr>
            <tr>
                <td>Unique Words : </td>
                <td><%=request.getAttribute("unique_Words") %></td>
            </tr>
            <tr>
                <td>Repeating Words : </td>
                <td><%=request.getAttribute("repeating_Words") %></td>
            </tr>
        </table>
            <p>
                <a href="menu.html">Go back to the main menu</a>      | 
                <a href="enter_short_message.html">Enter another short message</a>       | 
                <a href="EndSession.do">Logout</a>
            </p>
    </body>
</html>
