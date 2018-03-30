<%-- 
    Document   : altCounter
    Created on : Mar 22, 2018, 9:10:29 PM
    Author     : rspra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>alt counter</title>
    </head>
    <body>
        <h1>Alt Counter</h1>
        <p>
            Session Counter: ${sessionCounter2}
            <br>
            Application Counter: ${globalCounter2}
        </p>
        <p>
            <a href="/project3/resetalt">reset counter</a>
        </p>
        <nav>
            <a href="/project3/home">counter</a>
            Alt Counter
            <a href="/project3/classCounter">Class Counter</a>
        </nav>
    </body>
</html>
