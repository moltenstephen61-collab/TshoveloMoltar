<%-- 
    Document   : start_quizzes
    Created on : 16 May 2026, 12:29:59 AM
    Author     : TSHOVELO MOLTAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Start Quizzes Page</title>
    </head>
    <body>
        <h1>Start Quizzes</h1>
        <p>
            <b><%= application.getInitParameter("computer_name") %> : </b> <%=session.getAttribute("name") %> Please choose the operation you want your quizzes to asked.
        </p>
        <form action="SelectQuestions.do" method="Post">
            Operation : <select name="operation">
                <option value="add">Adding Number</option>
                <option value="sub">Substracting Numbers</option>
                <option value="div">Dividing Numbers</option>
                <option value="Mul">Multiplying Numbers</option>
            </select><br>
            <input type="submit" value="Start">
        </form>
    </body>
</html>
