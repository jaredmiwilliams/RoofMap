<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.wrp.roofmap.model.*"%>
    
<jsp:include page="header.jsp" />

<%
	AdminSettings settings = (AdminSettings)request.getAttribute("AdminSettings");

	if(settings == null) {
		settings = AdminSettings.getDefaultAdminSettings();
	}
%>

<%if(request.getAttribute("message") != null) { %>
	<h2><%= request.getAttribute("message") %></h2>
<% }
else if(request.getAttribute("error") != null) { %>
	<h2><%= request.getAttribute("error") %></h2>
<% } %>

<h3>Settings</h3>

<form method="post">
	<ul>
		<li>
			<label>Starting address</label>
			<input type="text" name="starting_address" value="<%= settings.getAddress() %>"></input>
		</li>
		<li>
			<label>Default zoom</label>
			<input type="text" name="default_zoom" value="<%= settings.getDefaultZoom() %>"></input>
		</li>
	</ul>
	
	<input type="submit" value="Submit"></input>
	
</form>

<div id="settings_map"></div>

<jsp:include page="footer.jsp" />