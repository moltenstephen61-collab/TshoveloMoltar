<%-- 
    Document   : analyze_message
    Created on : 22 May 2026, 8:01:37 PM
    Author     : TSHOVELO MOLTAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Analyze Message Outcome Page</title>
    </head>
    <body>
        <h1>Analyze Message Outcome</h1>
        <p>
           Below are the Analysis Made on the message that you entered just now.  
        </p>
        <table border="1">
            <tr>
                <th>Message</th>
                <th>Total Number Of Vowels</th>
                <th>Total Number Of Consonants</th>
                <th>Message Length</th>
                <th>Unique Words</th>
                <th>Repeating Words</th>
            </tr>
            <tr>
                <th><%= request.getAttribute("message") %></th>
                <th><%= request.getAttribute("total_vowels") %></th>
                <th><%= request.getAttribute("total_consants") %></th>
                <th><%= request.getAttribute("messageLength") %></th>
                <th><%= request.getAttribute("unique_words") %></th>
                <th><%= request.getAttribute("repeating_words") %></th>
            </tr>
        </table>
        <p>
            <a href="enter_message.html">Enter Another Message</a>     | 
            <a href="EndSession.do">Logout</a>   |
            <a href="menu.html">Go To Menu</a> 
        </p>
    </body>
</html>
