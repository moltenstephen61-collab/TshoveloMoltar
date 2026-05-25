<%-- 
    Document   : Quiz_Results
    Created on : 25 May 2026, 7:57:49 PM
    Author     : TSHOVELO MOLTAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quiz Results Page</title>
        <style>
            .passed { color: green; font-weight: bold; }
            .failed { color: red; font-weight: bold; }
        </style>
    </head>
    <body>
        <h1>Quiz Results</h1>
        <p>
            Below is your Report.
        </p>
        
        <p>
            <%-- Retrieving attributes as Objects and displaying them --%>
            You Got <b><%= request.getAttribute("count") %> Out Of <%= request.getAttribute("total") %></b> 
            Leaving you with <b><%= request.getAttribute("percentage") %>%</b>
        </p>

        <p>
            <%
                // Safely cast the percentage to Double wrapper class
                Object percObj = request.getAttribute("percentage");
                Double percentage = 0.0;
                
                if (percObj != null) {
                    percentage = (Double) percObj;
                }

                if( percentage >= 50.0 ) { 
            %>
                <span class="passed">PASSED!!!!!</span>
            <% } else { %>
                <span class="failed">FAILED. Please Try again Next Time.</span>
            <% } %>
        </p>

        <hr>
        
        <p>
            <a href="student_menu.jsp">Main Menu</a>    | 
            <a href="take_test.jsp">Take the Test Again</a>    | 
            <a href="EndSession.do">Logout</a>
        </p>
    </body>
</html>