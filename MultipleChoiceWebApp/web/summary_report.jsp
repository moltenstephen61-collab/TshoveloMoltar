<%-- 
    Document   : summary_report
    Created on : 16 May 2026, 11:51:17 PM
    Author     : TSHOVELO MOLTAR
--%>

<%@page import="java.util.List"%>
<%@page import="za.ac.tut.model.Question"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Summary Report Outcome Page</title>
</head>
<body>
    <h1>Summary Report Outcome</h1>

    <p><b>Student Name:</b> <%= session.getAttribute("name") %></p>
    <p><b>Total Questions:</b> <%= session.getAttribute("totalQuestions") %></p>
    <p><b>Correct Answers:</b> <%= session.getAttribute("correctCount") %></p>
    <p><b>Percentage:</b> <%= String.format("%.2f", (Double)session.getAttribute("percentage")) %>%</p>

    <h2>Detailed Results</h2>
    <%
        List<Question> questions = (List<Question>) session.getAttribute("questions");
        List<String> evaluateAnswers = (List<String>) session.getAttribute("evaluateAnswers");

        if (questions != null && evaluateAnswers != null) {
            for (int i = 0; i < questions.size(); i++) {
                Question q = questions.get(i);
                String outcome = evaluateAnswers.get(i);
    %>
        <div style="margin-bottom:20px; padding:10px; border:1px solid #ccc; border-radius:5px;">
            <b>Q<%= (i+1) %>:</b> <%= q.getText() %><br>
            <!-- outcome variable already contains the evaluation specifics -->
            <b>Status:</b> <%= outcome %>
        </div>
    <% 
            } 
        } 
    %>
    <p>
        <a href="enter_name.html">Try Again</a> or <a href="EndSession.do">Logout</a>
    </p>
</body>
</html>