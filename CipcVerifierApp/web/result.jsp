<%-- 
    Document   : result
    Created on : 22 May 2026, 6:14:56 PM
    Author     : TSHOVELO MOLTAR
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Verification Result</title>
</head>
<body>
    <h2>CIPC Verification Results</h2>
    <hr/>

    <!-- If the number was valid, show the details -->
    <% if (request.getAttribute("isValid") != null && (Boolean)request.getAttribute("isValid") == true) { %>
        <p style="color: green; font-weight: bold;">✓ The registration number is valid!</p>
        <p><strong>Company Type:</strong> ${companyType}</p>
        <p><strong>Checked Value:</strong> ${checkedNumber}</p>
    <% } else { %>
        <!-- If it failed, show the error message -->
        <p style="color: red; font-weight: bold;">✗ Validation Failed!</p>
        <p>Reason: ${errorReason}</p>
    <% } %>

    <br/>
    <a href="index.html">Verify another number</a>
</body>
</html>