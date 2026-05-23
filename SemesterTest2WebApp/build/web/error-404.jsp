<%-- 
    Document   : error-404
    Created on : 24 May 2026, 12:06:18 AM
    Author     : TSHOVELO MOLTAR
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Page Not Found (404)</title>
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
            border-top: 5px solid #6c757d;
        }
        .error-code {
            font-size: 72px;
            font-weight: 800;
            color: #6c757d;
            margin: 0;
            line-height: 1;
        }
        h2 {
            color: #343a40;
            margin-top: 10px;
            font-size: 24px;
        }
        p {
            color: #6c757d;
            font-size: 16px;
            line-height: 1.5;
            margin: 20px 0 30px 0;
        }
        .btn-home {
            display: inline-block;
            background-color: #28a745;
            color: #ffffff;
            text-decoration: none;
            padding: 12px 24px;
            border-radius: 4px;
            font-weight: bold;
            transition: background-color 0.2s ease;
        }
        .btn-home:hover {
            background-color: #218838;
        }
    </style>
</head>
<body>

    <div class="error-container">
        <div class="error-code">404</div>
        <h2>Page Not Found</h2>
        
        <p>The page you are looking for might have been removed, had its name changed, or is temporarily unavailable.</p>
        
        <!-- Replace "index.jsp" with your actual main entry page or home URL -->
        <a href="index.jsp" class="btn-home">Return to Home Page</a>
    </div>

</body>
</html>
