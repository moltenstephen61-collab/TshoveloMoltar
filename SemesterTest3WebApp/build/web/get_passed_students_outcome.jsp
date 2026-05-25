<%-- 
    Document   : get_passed_students_outcome
    Created on : 25 May 2026, 11:41:30 PM
    Author     : TSHOVELO MOLTAR
--%>

<%@page import="java.util.List"%>
<%@page import="ac.za.tut.model.entity.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Get Passed Students Outcome Page</title>
    </head>
    <body>
        <h1>Get Passed Students Outcome</h1>
        <% 
          List<Student> studentsWhoPassed = (List<Student>) request.getAttribute("studentsWhoPassed");
          int totalStudents = studentsWhoPassed.size();
        %>
        <p>
            The Results are below. <br> 
            <%=totalStudents %> Student(s) Passed The Test. <br>
            Below are their names and their marks.
        </p>
        <% 
         for(int i = 0 ; i < totalStudents ; i++ ){
        %>
        <table>
            <tr>
                <td><%= i + 1 %></td>
                <td></td>
            </tr>
            <tr>
                <td>Student Name : </td>
                <td><%=studentsWhoPassed.get(i).getName() %></td>
            </tr>
            <tr>
                <td></td>
                <td><%=studentsWhoPassed.get(i).getMarks() %></td>
            </tr>
        </table>
        <% } %>
        <p>
            <a href="lecturer_menu.html">Go back to the main menu</a>     |  
            <a href="EndSession.do">Logout</a>
        </p>
    </body>
</html>
