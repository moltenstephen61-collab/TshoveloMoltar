<%-- 
    Document   : enter_name
    Created on : 16 May 2026, 5:39:52 PM
    Author     : TSHOVELO MOLTAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Name Page</title>
    </head>
    <body>
        <h1>Register Name</h1>
        <p>
            <%= application.getInitParameter("computer_name") %> : Dear user, please enter your name so you can proceed. <br> 
            Below in the form.
        </p>
        <form action="StartSession.do" method="Post">
            Name : <input type="text" name="name"> <br> 
            <input type="submit" value="Register"> 
        </form>
    </body>
</html>
