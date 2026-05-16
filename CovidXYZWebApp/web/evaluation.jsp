<%-- 
    Document   : evaluation
    Created on : 14 May 2026, 3:31:06 PM
    Author     : TSHOVELO MOLTAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Evaluation Page</title>
    </head>
    <body>
        <h1>Evaluation</h1>
        <p>
            Fill in the form
        </p>
        <form action="CheckMasks.do" method="Post">
            Masks Check : <select name="check_Masks">
                <option value="On">Mask On</option>
                <option value="Off">No Mask</option>
            </select><br> 
            <input type="submit" value="Proceed">
        </form>
    </body>
</html>
