<%-- 
    Document   : error-invalid-message
    Created on : 24 May 2026, 12:05:44 AM
    Author     : TSHOVELO MOLTAR
--%>

<%@ page isErrorPage="true" contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Invalid Message Content</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f8f9fa;
            color: #333333;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .error-container {
            background-color: #ffffff;
            padding: 40px;
            border-radius: 8px;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
            max-width: 500px;
            width: 100%;
            text-align: center;
            border-top: 5px solid #dc3545;
        }
        h2 {
            color: #dc3545;
            margin-top: 0;
            font-size: 24px;
        }
        .error-message {
            background-color: #fff5f5;
            color: #bd2130;
            border: 1px solid #f5c6cb;
            padding: 15px;
            border-radius: 4px;
            margin: 20px 0;
            font-size: 16px;
            font-weight: 500;
            line-height: 1.4;
        }
        .btn-back {
            display: inline-block;
            background-color: #007bff;
            color: #ffffff;
            text-decoration: none;
            padding: 10px 20px;
            border-radius: 4px;
            font-weight: bold;
            transition: background-color 0.2s ease;
        }
        .btn-back:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

    <div class="error-container">
        <h2>Validation Error</h2>
        <p>There was a problem processing the message you submitted.</p>
        
        <!-- This dynamically extracts "Your Short Message is Invalid..." from the Java exception -->
        <div class="error-message">
            ${exception.message}
        </div>
        
        <p>Please return to the form, remove any numbers or invalid characters, and try again.</p>
        
        <a href="javascript:history.back()" class="btn-back">Go Back &amp; Fix Input</a>
    </div>

</body>
</html>
