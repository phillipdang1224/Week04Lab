<%-- 
    Document   : login
    Created on : Sep 28, 2018, 12:10:18 PM
    Author     : 747787
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Remember Me Login Page</h1>
        <br>

        <form method="post" action="login">
            Username: <input name="user">
            <br>
            Password: <input name="password" type="password">
            <br>
            <button type="submit">Login</button>
            <br>
            <input type="checkbox" name="remember"></input>Remember Me

        </form>
        <div>${message}</div>
    </body>
</html>
