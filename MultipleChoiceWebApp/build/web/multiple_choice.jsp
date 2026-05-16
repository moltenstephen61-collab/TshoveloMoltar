<%-- 
    Document   : multiple_choice
    Created on : 16 May 2026, 7:16:29 PM
    Author     : TSHOVELO MOLTAR
--%>

<%@page import="za.ac.tut.model.Question"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Quiz</title>
    </head>
    <body>
        <h2>Multiple Choice Quiz</h2>
        <p>
            <b><%= application.getInitParameter("computer_name") %> :</b>  <b><%= session.getAttribute("name") %></b> , Good Luck On Your Test. <br>      
        </p>
        <form action="ProcessQuiz.do" method="POST">
            <%
                List<Question> questions = (List<Question>) session.getAttribute("mutiple_choice");
                
                if (questions != null) {
                    for (int i = 0; i < questions.size(); i++) {
                        Question q = questions.get(i);
            %>
                        <p>
                            <strong>Question <%= (i + 1) %>:</strong> <%= q.getText() %>
                        </p>
                        
                        <select name="answer_<%= i %>">
                            <option value="A">A. <%= q.getOptionA() %></option>
                            <option value="B">B. <%= q.getOptionB() %></option>
                            <option value="C">C. <%= q.getOptionC() %></option>
                            <option value="D">D. <%= q.getOptionD() %></option>
                        </select>
                        
                        <br><br>
            <%
                    } 
                } 
            %>
            
            <input type="submit" value="Submit Answers">
        </form>
        
    </body>
</html>