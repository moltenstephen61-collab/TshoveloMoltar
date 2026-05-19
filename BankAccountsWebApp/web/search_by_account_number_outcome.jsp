<%-- 
    Document   : search_by_account_number_outcome
    Created on : 19 May 2026, 6:05:43 PM
    Author     : TSHOVELO MOLTAR
--%>

<%@page import="ac.za.tut.model.entity.Account"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Account By Account Number Outcome Page</title>
    </head>
    <body>
        <h1>Search Account By Account Number Outcome</h1>
        <% 
           Account account = (Account) request.getAttribute("account");
        %>
        <p>
            The account number : <%= request.getAttribute("account_number") %> Is found. Below is the information for this account number.
        </p>
        <table border="1">
            <tr>
                <td>Account Number</td>
                <td><%= account.getAccountNumber() %></td>
            </tr>
            <tr>
                <td>Account Type</td>
                <td><%= account.getAccountType() %></td>
            </tr>
            <tr>
                <td>Balance</td>
                <td><%= account.getBalance() %></td>
            </tr>
            <tr>
                <td>Date Opened</td>
                <td><%= account.getCreationDate() %></td>
            </tr>
            <tr>
                <td>Account Holder's Name</td>
                <td><%= account.getAccountHolder().getName() %></td>
            </tr>
            <tr>
                <td>Account Holder's Surname</td>
                <td><%= account.getAccountHolder().getSurname() %></td>
            </tr>
            <tr>
                <td>Gender</td>
                <td><%= account.getAccountHolder().getGender() %></td>
            </tr>
            <tr>
                <td>Date of Birth</td>
                <td><%= account.getAccountHolder().getDateOfBirth() %></td>
            </tr>
            <tr>
                <td>Marital Status</td>
                <td><%= account.getAccountHolder().getMarried() %></td>
            </tr>
        </table>
    <p>
        <a href="index.html">Logout</a> |
        <a href="add_n_ccount.html">Add Another Account</a> |
        <a href="menu_page.html">Go back to main menu</a>
    </p>
    </body>
</html>
