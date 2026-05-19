<%-- 
    Document   : account_removal_outcome
    Created on : 19 May 2026, 6:42:07 PM
    Author     : TSHOVELO MOLTAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Account Removal Outcome Page</title>
    </head>
    <body>
        <h1>Account Removal Outcome</h1>
        <p>
            This Account With the Account Number : <b><%= request.getAttribute("account_number") %></b> Has Been Removed Successfully.
        </p>
        <p>
        <a href="index.html">Logout</a> |
        <a href="add_n_ccount.html">Add Another Account</a> |
        <a href="menu_page.html">Go back to main menu</a>
    </p>
    </body>
</html>
