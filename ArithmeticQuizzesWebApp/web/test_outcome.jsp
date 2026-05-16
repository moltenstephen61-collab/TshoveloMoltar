<%-- 
    Document   : test_outcome
    Created on : 16 May 2026, 1:09:31 AM
    Author     : TSHOVELO MOLTAR
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.lang.Integer"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Test Page</title>
    </head>
    <body>
        <h1>Test</h1>
        <p>
            <b><%= application.getInitParameter("computer_name") %> : </b> <%= session.getAttribute("name") %> Good Luck on the test.
        </p>
        
        <% 
            List<String> questions = (List<String>) session.getAttribute("questions");
            if (questions != null && !questions.isEmpty()) {
        %>
        
        <!-- STEP 1: Open the form ONCE before the loop starts -->
        <form action="SummaryServelet.do" method="Post">
            
            <% for(int i = 0 ; i < questions.size() ; i++ ) { %>
                <table border="1" >
                    <tr>
                        <td ><b>Question <%= i + 1 %>:</b></td>
                        <td ><%= questions.get(i) %></td>
                    </tr>
                    <tr>
                        <td >Your Answer:</td>
                        <td >
                            <!-- Note the square bracket fix: [<%= i %>] -->
                            <input type="number" name="user_answers[<%= i %>]" required>
                        </td>
                    </tr>
                </table>
            <% } %> <!-- Loop ends here -->
            
            <br>
            <!-- STEP 2: The submit button sits comfortably at the very end -->
            <input type="submit" value="Submit">
            
        <!-- STEP 3: Close the form ONCE after everything is drawn -->
        </form>
        
        <% 
            } else { 
        %>
            <p style="color: red;">No questions found in your session. Please restart the quiz.</p>
        <% 
            } 
        %>
    </body>
</html>