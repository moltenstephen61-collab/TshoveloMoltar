<%-- 
    Document   : input_error_page
    Created on : 22 May 2026, 10:51:40 AM
    Author     : TSHOVELO MOLTAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!-- Declaring isErrorPage="true" exposes the implicit 'exception' object -->
<%@page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Input Error Page</title>
    </head>
    <body>
        <h1 style="color: red;">Input Error</h1>
        <p>Something went wrong while validating your submitted details.</p>
        
        <hr/>
        
        <%
            // Retrieve the error message cleanly from the intercepted exception object
            String userWarningMessage = "An unspecified input rule violation occurred.";
            
            if (exception != null && exception.getMessage() != null) {
                userWarningMessage = exception.getMessage();
            }
        %>
        
        <div style="background-color: #f8d7da; color: #721c24; border: 1px solid #f5c6cb; padding: 15px; border-radius: 4px; width: 60%;">
            <strong>Validation Failure:</strong> <%= userWarningMessage %>
        </div>
        
        <br/><br/>
        <!-- Allows the user to navigate back without losing their form fields -->
        <a href="javascript:history.back()">← Go Back and Correct Fields</a>
    </body>
</html>