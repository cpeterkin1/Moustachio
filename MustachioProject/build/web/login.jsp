<%-- 
    Document   : login
    Created on : Nov 25, 2014, 6:06:25 PM
    Author     : Zach
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
		
		<div class="login-body">
			<form action="Login" method="post">
				<p>Username: <input type="text" name="username"></p>
				<p>Password: <input type="password" name="password"></p>
				<p><input type="submit" name="login" value="Login"> <input type="submit" name="register" value="Create Account"</p>
			</form>
		</div>
		
    </body>
</html>
