<%-- 
    Document   : fibonacci_question
    Created on : 17 May 2026, 6:36:58 PM
    Author     : TSHOVELO MOLTAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fibonacci Questions Page</title>
    </head>
    <body>
        <h1>Fibonacci Questions</h1>
        <p>
            <b> <%= application.getInitParameter("computer_name") %> :</b> <b><%= session.getAttribute("name") %></b> , Is the number below part of a Fibonacci Series ?<br> 
        </p>
        <form action="VerifyAnswers.do" method="Post">
            <p>Is this Number : <b><%=session.getAttribute("generatedNumber") %></b></p> <br> 
                    <p>
                <select name="user_answer">
                    <option value="true">Yes</option>
                    <option value="false">No</option>
                </select>
                    </p>
                    <input type="submit" value="Submit">
        </form>
    </body>
</html>
