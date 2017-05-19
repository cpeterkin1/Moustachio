<%-- 
    Document   : sidePanel
    Created on : Nov 26, 2014, 9:06:17 PM
    Author     : Zach
--%>

<%@page import="bean.entity.Member"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean class="bean.SidePanel" id="panelBean" scope="session" />

<div class="side-panel">
	<h2>Search</h2>
	
	
	<%
		for (Member member : panelBean.getAllTopMembers()) {
			out.println("<p><a href=\"profile.jsp?user='"+member.getUsername()+"'\">");
			out.println(member.getUsername());
			out.println("</a></p>");
		}
		panelBean.getAllTopMembers();
	%>
	
	
	
	
	
</div>
