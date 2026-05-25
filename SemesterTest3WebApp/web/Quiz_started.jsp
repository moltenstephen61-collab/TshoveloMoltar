<%@page import="java.util.List"%>
<%@page import="ac.za.tut.model.entity.MultipleChoiceQuestion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quiz Started Page</title>
    </head>
    <body>
        <h1>Quiz Started</h1>
        <p>Good Luck!!!</p>

        <% 
          List<MultipleChoiceQuestion> questions = (List<MultipleChoiceQuestion>)request.getAttribute("questions");
        %>

        <form action="CalculateMarks.do" method="POST">
            <table>
                <% for(int i = 0; i < questions.size(); i++) { %>
                <tr>
                    <td>Question <%= i + 1 %>: </td>
                    <td><%= questions.get(i).getQuestion() %></td>
                    <td>
                        <select name="user_Answer_<%= i %>">
    <option value="">--Select Answer--</option>
    <option value="<%= questions.get(i).getOptionA() %>">A. <%= questions.get(i).getOptionA() %></option>
    <option value="<%= questions.get(i).getOptionB() %>">B. <%= questions.get(i).getOptionB() %></option>
    <option value="<%= questions.get(i).getOptionC() %>">C. <%= questions.get(i).getOptionC() %></option>
    <option value="<%= questions.get(i).getOptionD() %>">D. <%= questions.get(i).getOptionD() %></option>
</select>
                    </td>
                </tr>
                <% } %>
            </table>
            <br>
            <input type="submit" value="Submit Quiz">
        </form>
    </body>
</html>