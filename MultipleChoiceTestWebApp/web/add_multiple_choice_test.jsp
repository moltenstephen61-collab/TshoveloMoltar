<%-- 
    Document   : add_multiple_choice_test
    Created on : 20 May 2026, 10:52:07 AM
    Author     : TSHOVELO MOLTAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Set Multiple Choice Test Page</title>
    </head>
    <body>
        <h2>Set Multiple Choice Test</h2>
<p>
    <!-- Fallback default if context param isn't loaded yet -->
    <b><%= (application.getInitParameter("computer") != null) ? application.getInitParameter("computer") : "Computer" %> :</b> 
    Welcome Sir, you can set the question details below.
</p>

<form action="SetQuestions.do" method="Post">
    <table>
        <tr>
            <td>Question Text:</td>
            <td><input type="text" name="question" size="40" required></td>
        </tr>
        <tr>
            <td>Option A:</td>
            <td><input type="text" name="option_A" required></td>
        </tr>
        <tr>
            <td>Option B:</td>
            <td><input type="text" name="option_B" required></td>
        </tr>
        <tr>
            <td>Option C:</td>
            <td><input type="text" name="option_C" required></td>
        </tr>
        <tr>
            <td>Option D:</td>
            <td><input type="text" name="option_D" required></td>
        </tr>
        <tr>
            <td>Correct Letter (A/B/C/D):</td>
            <td><input type="text" name="correct_answer" maxlength="1" size="5" required></td>
        </tr>
        <tr>
            <td></td>
            <td><br><input type="submit" value="Save Question"></td>
        </tr>
    </table>
</form>
    </body>
</html>
