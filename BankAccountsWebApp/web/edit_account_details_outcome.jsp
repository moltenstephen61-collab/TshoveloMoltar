<%-- 
    Document   : edit_account_details_outcome
    Created on : 19 May 2026, 7:21:38 PM
    Author     : TSHOVELO MOLTAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Account Details Outcome Page</title>
    </head>
    <body>
        <h1>Edit Account Details Outcome</h1>
        <p>
            The Account That Has The Account Number : <b><%= request.getAttribute("account_number") %></b> Was Edited Successfully.
        </p>
     <p>
        <a href="index.html">Logout</a> |
        <a href="add_n_ccount.html">Add Another Account</a> |
        <a href="menu_page.html">Go back to main menu</a>
    </p>
    </body>
</html>
