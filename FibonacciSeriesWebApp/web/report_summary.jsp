<%-- 
    Document   : report_summary
    Created on : 17 May 2026, 7:48:59 PM
    Author     : TSHOVELO MOLTAR
--%>

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
            <b> <%= application.getInitParameter("computer_name") %> :</b> <b><%= session.getAttribute("name") %></b> , Below i have written the summary report. <br> 
        </p>
        <p>Is this Number Part of a Fibonacci Series ? : <b> <%=session.getAttribute("generatedNumber") %></b></p>
        <p>Your Answer : <b> <%=session.getAttribute("user_answer") %></b></p>
        <p>The Correct Answer : <b> <%=session.getAttribute("isFibonacci") %></b></p> 
        <p>Your Score  : <b> <%=session.getAttribute("score") %></b></p> 
        <p>Total Number Of Questions Asked  : <b> <%=session.getAttribute("questionsAsked") %></b></p>
        <p><a href="EndServelet.do">Logout</a> or <a href="Main_menu.jsp">Try Again</a></p>
    </body>
</html>
