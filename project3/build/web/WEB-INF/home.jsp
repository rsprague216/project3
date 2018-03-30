<%-- 
    Document   : home
    Created on : Mar 12, 2018, 5:55:12 PM
    Author     : Ryan Sprague
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Session Scope</title>
    </head>
    <body>
        <div>
            <h1>Counter</h1>
            <p>
                Session Counter: ${sessionCounter1}
                <br>
                Application Counter: ${globalCounter1}
            </p>
            <p>
                <a href="/project3/reset">reset counters</a>
            </p>
        </div>
        <nav>
            counter
            <a href="/project3/altCounter">Alt Counter</a>
            <a href="/project3/classCounter">Class Counter</a>
        </nav>
    </body>
</html>
