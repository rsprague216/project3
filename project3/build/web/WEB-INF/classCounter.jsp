<%-- 
    Document   : classCounter
    Created on : Mar 22, 2018, 10:57:05 PM
    Author     : rspra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Class Counter</title>
    </head>
    <body>
        <h1>Class Counter</h1>
        <p>
            Session Counter: ${sessionCounter3.count}
            <br>
            Application Counter: ${globalCounter3.count}
        </p>
        <p>
            <a href="/project3/resetclass">reset counter</a>
        </p>
        <nav>
            <a href="/project3/home">counter</a>
            <a href="/project3/altCounter">Alt Counter</a>
            Class Counter
        </nav>
    </body>
</html>
