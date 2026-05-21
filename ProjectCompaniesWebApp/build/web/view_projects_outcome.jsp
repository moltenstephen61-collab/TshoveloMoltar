<%-- 
    Document   : view_projects_outcome
    Created on : 21 May 2026, 11:11:00 PM
    Author     : TSHOVELO MOLTAR
--%>

<%-- Import the entities --%>
<%@page import="ac.za.tut.entity.Company"%>
<%@page import="ac.za.tut.entity.Project"%>
<%@page import="java.util.List"%>

<html>
    <head>
        <title>View Available Projects Page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
     <h2>Available Projects by Company</h2>

<table border="1">
    <tr>
        <th>Company Name</th>
        <th>Project Title</th>
        <th>Description</th>
    </tr>
    <%
        List<Company> companies = (List<Company>) request.getAttribute("companies");
        for (int i = 0 ; i < companies.size() ; i++ ) {
            for (int j = 0 ; j < companies.get(i).getProjects().size() ; j++) {
    %>
    <tr>
        <td><%= companies.get(i).getName() %></td>
        <td><%= companies.get(i).getProjects().get(j).getTitle() %></td>
        <td><%= companies.get(i).getProjects().get(j).getDescription() %></td>
    </tr>
    <%
            }
        }
    %>
    
</table>
    <p>
        Press <a href="ChooseProjectsOfChoice.do">Here</a> to choose your projects of choice
    </p>
        
</body>
</html>