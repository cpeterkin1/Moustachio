<%-- 
    Document   : loginTest
    Created on : Nov 26, 2014, 8:10:08 PM
    Author     : Zach
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        	<%
				if (session.getAttribute("username") != null) {
					out.print(session.getAttribute("username"));
				}
				else {
					out.print("<a href='login.jsp'>New User</a>");
				}
				
				
			%>
    </body>
</html>
