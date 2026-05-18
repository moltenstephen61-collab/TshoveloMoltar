<%-- 
    Document   : summary_report
    Created on : 18 May 2026, 9:54:26 AM
    Author     : TSHOVELO MOLTAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Summary Report Page</title>
    </head>
    <body>
        <h1>Summary Report</h1>
        <p>
            <b><%=application.getInitParameter("computer") %> : </b> <%=session.getAttribute("name") %> , Below i have written a summary report for your performance. 
        </p>
        <table border="1">
            <tr>
                <td>Generated Number : </td>
                <td><%=session.getAttribute("generatedNum") %></td>
            </tr>
            <tr>
                <td>User Guess</td>
                <td><%=session.getAttribute("user_guess") %></td>
            </tr>
            <tr>
                <td>Scores : </td>
                <td><%=session.getAttribute("correct") %></td>
            </tr>
            <tr>
                <td>Total Questions : </td>
                <td><%=session.getAttribute("totalQuestions")%></td>
            </tr>
        </table>
            <p>
                <a href="EndSession.do">Logout</a> or <a href="main_menu.jsp">Go back to the main menu</a>
            </p> 
    </body>
</html>
