<%-- 
    Document   : get_total_number_of_accounts
    Created on : 19 May 2026, 8:01:05 PM
    Author     : TSHOVELO MOLTAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Total Number Of Accounts Outcome Page</title>
    </head>
    <body>
        <h1>Total Number Of Accounts Outcome</h1>
        <p>
            There are <b><%= request.getAttribute("total_num_accounts") %></b> Accounts(s) In the Added In the Dababase.
        </p>
        <p>
        <a href="index.html">Logout</a> |
        <a href="add_n_ccount.html">Add Another Account</a> |
        <a href="menu_page.html">Go back to main menu</a>
    </p>
    </body>
</html>
