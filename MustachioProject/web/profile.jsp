<%-- 
    Document   : profile
    Created on : Nov 28, 2014, 10:11:21 AM
    Author     : Zach Bolan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link href="rsc/style.css" rel="stylesheet" type="text/css">
		<link href="rsc/header.css" rel="stylesheet" type="text/css">
		<link href='http://fonts.googleapis.com/css?family=Grand+Hotel' rel='stylesheet' type='text/css'>
        <title><%= request.getParameter("user")%>'s Profile</title>
    </head>
    <body>
        <jsp:include page="include/header.jsp" />
		<jsp:include page="sidePanel.jsp" />
		<h1>
			<%
				out.println(session.getAttribute("user"));
			%>
		</h1>

		<form action="Logout" method="post">
			<input type="submit" value="Logout" name="logout">
		</form>

    </body>
</html>
