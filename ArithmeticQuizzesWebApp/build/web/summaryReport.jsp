<%-- 
    Document   : summaryReport
    Created on : 16 May 2026, 2:43:00 PM
    Author     : TSHOVELO MOLTAR
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Summary Report outcome Page</title>
    </head>
    <body>
        <h1>Summary Report outcome</h1>
        <p>
            <b><%= application.getInitParameter("computer_name") %> : </b> <%=session.getAttribute("name") %> Here i have written a summary report for your performance.
        </p>
        <% 
            List<String> questions = (List<String>)session.getAttribute("questions"); 
        %>
        <p>
            Number of questions asked : <%= questions.size() %> <br>
            Questions User Got Correct: <%= session.getAttribute("got_right") %> <br>
            Questions User Got Wrong  : <%= session.getAttribute("got_wrong") %> <br>
            Percentage                : <%= session.getAttribute("percentage")%> % <br> 
            <a href="EndSession.do">Logout</a> or <a href="start_quizzes.jsp">Try Again</a>
        </p>
        
    </body>
</html>
