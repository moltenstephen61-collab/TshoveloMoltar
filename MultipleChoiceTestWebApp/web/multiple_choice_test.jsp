<%-- 
    Document   : multiple_choice_test
    Created on : 20 May 2026, 5:49:55 PM
    Author     : TSHOVELO MOLTAR
--%>

<%@page import="ac.za.tut.entity.Question"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Multiple Choice Test Page</title>
    </head>
    <body>
        <h1>Multiple Choice Test</h1>
        <p>
            <b> <%=application.getInitParameter("computer") %> : </b> <%= session.getAttribute("name") %> , Welcome , This is the menu page.
        </p>
        <% 
            List<Question> set_Questions = (List<Question>)request.getAttribute("set_Questions");
        %>
        
       <form action="CalculateStudentMarks.do" method="POST">
    
    <% for(int i = 0 ; i < set_Questions.size() ; i++ ) { %>
    <table>
        <tr>
            <td><strong>Q<%=i+1%>:</strong> <%=set_Questions.get(i).getQuestion() %></td>
            <td>
                <!-- The name will be user_answer_0, user_answer_1, etc. -->
                <select name="user_answer_<%=i%>">
                    <option value="A">A. <%=set_Questions.get(i).getOption_A() %></option>
                    <option value="B">B. <%=set_Questions.get(i).getOption_B() %></option>
                    <option value="C">C. <%=set_Questions.get(i).getOption_C() %></option>
                    <option value="D">D. <%=set_Questions.get(i).getOption_D() %></option>
                </select> 
            </td>
        </tr>          
    </table>
    <% } %>

    <%-- Keep the total question count in the session or re-fetch it so the servlet knows the limit --%>
    <br/>
    <input type="submit" value="Submit Test">
</form>
    </body>
</html>
