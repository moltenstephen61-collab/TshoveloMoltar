<%-- 
    Document   : results
    Created on : 20 May 2026, 6:55:09 PM
    Author     : TSHOVELO MOLTAR
--%>

<%-- 
    Document   : results
    Created on : 20 May 2026
    Author     : TSHOVELO MOLTAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Results</title>
    </head>
    <body>
        <h1>Test Results</h1>
        <%
            // 1. Get student data from session
            String name = (String) session.getAttribute("stud_name");
            String surname = (String) session.getAttribute("stud_surname");
            String studentNum = (String) session.getAttribute("stud_number");
            
            // 2. Get marks data from session
            int marks = (Integer) session.getAttribute("studentMarks");
            int total = (Integer) session.getAttribute("totalQuestions");
            
            // 3. Simple calculation
            double percentage = ((double) marks / total) * 100;
        %>
        
        <p>Student: <%= name %> <%= surname %> (<%= studentNum %>)</p>
        <p>Score: <%= marks %> / <%= total %></p>
        <p>Percentage: <%= percentage %>%</p>
        
        <p>
            Status: 
            <% if (percentage >= 50) { %>
                PASSED
            <% } else { %>
                FAILED
            <% } %>
        </p>
    </body>
</html>