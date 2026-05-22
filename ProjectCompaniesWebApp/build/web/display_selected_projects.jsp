<%-- 
    Document   : display_selected_projects
    Created on : 22 May 2026, 10:25:19 AM
    Author     : TSHOVELO MOLTAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display Selected Projects Page</title>
    </head>
    <body>
        <h1>Display Selected Projects</h1>
        
        <%
            // Retrieve the list from the session scope
            List<String> projectList = (List<String>) session.getAttribute("selectedProjectsList");
            
            // Check if the list exists and actually has projects inside it
            if (projectList != null && projectList.size() > 0) {
        %>
            <p>Here are the projects you have successfully selected:</p>
            <ol>
                <%
                    // Traditional for loop using an index counter
                    for (int i = 0; i < projectList.size(); i++) {
                        String project = projectList.get(i);
                %>
                    <li><%= project %></li>
                <%
                    }
                %>
            </ol>
        <%
            } else {
        %>
            <p style="color: red;">You haven't selected any projects yet!</p>
        <%
            }
        %>
        
        <br/>
        <!-- Provide a quick link to go back and select more if needed -->
        <a href="display_selected_projects.jsp">Back to Project Selection</a> |  
        <a href="main_menu.html">Go back to the main menu</a> | 
        <a href="EndSession.do">Logout</a>
    </body>
</html>