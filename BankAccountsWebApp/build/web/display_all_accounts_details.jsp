<%-- 
    Document   : display_all_accounts_details
    Created on : 19 May 2026, 4:07:59 PM
    Author     : TSHOVELO MOLTAR
--%>

<%@page import="java.util.List"%>
<%@page import="ac.za.tut.model.entity.Account"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>View All Accounts Details Outcome Page</title>
</head>
<body>
    <h1>View All Accounts Details Outcome</h1>
    <%
        List<Account> accounts = (List<Account>) request.getAttribute("accounts");
    %>
    <p>Below are the accounts details</p>

    <table border="1">
        <tr>
            <th>Account Number</th>
            <th>Account Type</th>
            <th>Balance</th>
            <th>Creation Date</th>
            <th>Name</th>
            <th>Surname</th>
            <th>Gender</th>
            <th>Date of Birth</th>
            <th>Marital Status</th>
        </tr>
        <% if (accounts != null) {
               for (Account acc : accounts) { %>
        <tr>
            <td><%= acc.getAccountNumber() %></td>
            <td><%= acc.getAccountType() %></td>
            <td><%= acc.getBalance() %></td>
            <td><%= acc.getCreationDate() %></td>
            <td><%= acc.getAccountHolder().getName() %></td>
            <td><%= acc.getAccountHolder().getSurname() %></td>
            <td><%= acc.getAccountHolder().getGender() %></td>
            <td><%= acc.getAccountHolder().getDateOfBirth() %></td>
            <td><%= acc.getAccountHolder().getMarried() %></td>
        </tr>
        <%   }
           } else { %>
        <tr><td colspan="9">No accounts found.</td></tr>
        <% } %>
    </table>

    <p>
        <a href="index.html">Logout</a> |
        <a href="add_n_ccount.html">Add Another Account</a> |
        <a href="menu_page.html">Go back to main menu</a>
    </p>
</body>
</html>

