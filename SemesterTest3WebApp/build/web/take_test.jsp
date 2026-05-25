<%-- 
    Document   : take_test
    Created on : 25 May 2026, 7:11:00 PM
    Author     : TSHOVELO MOLTAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Take Test Area Page</title>
    </head>
    <body>
        <h1>Take Test Step 1</h1>
        <p>
            Press the button below to start the test
        </p>
        <form action="StartTest.do" method="POST">
            <table>
                <tr>
                    <td>Student Name : </td>
                    <td><input type="text" name="name"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Start Quiz"></td>
                </tr>
            </table>
            
        </form>
    </body>
</html>
