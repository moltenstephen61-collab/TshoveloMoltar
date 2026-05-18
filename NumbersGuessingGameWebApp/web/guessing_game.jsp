<%-- 
    Document   : guessing_game
    Created on : 18 May 2026, 9:17:49 AM
    Author     : TSHOVELO MOLTAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Guessing Game Page</title>
    </head>
    <body>
        <h1>Guessing Game</h1>
        <p>
            <b><%=application.getInitParameter("computer") %> : </b> <%=session.getAttribute("name") %> , I have number with me. Guess which one it is. It is between 1 and 10. 
        </p>
        <form action="CheckGuesses.do" method="Post">
            Answer : <select name="user_guess">
                     <option value="1">1</option>
                     <option value="2">2</option>
                     <option value="3">3</option>
                     <option value="4">4</option>
                     <option value="5">5</option>
                     <option value="6">6</option>
                     <option value="7">7</option>
                     <option value="8">8</option>
                     <option value="9">9</option>
                     <option value="10">10</option>
                     </select> <br>
                     <input type="submit" value="Submit">
        </form>
    </body>
</html>
