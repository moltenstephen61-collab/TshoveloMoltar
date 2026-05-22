<%-- 
    Document   : view_and_select_projects_page
    Created on : 22 May 2026, 10:06:43 AM
    Author     : TSHOVELO MOLTAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="ac.za.tut.entity.Company"%>
<%@page import="ac.za.tut.entity.Project"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View And Select Projects Page</title>
    </head>
    <body>
        <h1>View And Select Projects</h1>
        <p>
            Please Select the projects you want try below.
        </p>
        
        <!-- Wrap the table in a form to submit data to your backend controller -->
        <form action="AddSelectedProjectsServlet.do" method="POST">
            <table border="1">
                <tr>
                    <th>Select</th> <!-- New header for the checkboxes -->
                    <th>Company Name</th>
                    <th>Project Title</th>
                    <th>Description</th>
                </tr>
                <%
                    List<Company> companies = (List<Company>) request.getAttribute("companies");
                    if (companies != null) {
                        for (int i = 0 ; i < companies.size() ; i++ ) {
                            Company company = companies.get(i);
                            List<Project> projects = company.getProjects();
                            
                            if (projects != null) {
                                for (int j = 0 ; j < projects.size() ; j++) {
                                    Project project = projects.get(j);
                %>
                <tr>
                    <td>
                        <!-- 
                          The value should ideally be the unique ID of the project.
                          If your Project entity uses a different getter (e.g., getId()), 
                          change project.getTitle() to that method.
                        -->
                        <input type="checkbox" name="selectedProjectIds" value="<%= project.getTitle() %>" />
                    </td>
                    <td><%= company.getName() %></td>
                    <td><%= project.getTitle() %></td>
                    <td><%= project.getDescription() %></td>
                </tr>
                <%
                                }
                            }
                        }
                    }
                %>
            </table>
            <br/>
            <!-- Submit button to send the selected data -->
            <input type="submit" value="Add to Selected Projects" />
        </form>
    </body>
</html>