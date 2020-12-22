<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");		// to prevent accessing secure pages when clicking back button after logout
		
		response.setHeader("Pragma","no-cache");					// if working on older HTTP version i.e. HTTP 1.0
		
		response.setHeader("Expires","0");							// is using proxies
		
		if(session.getAttribute("userName")==null) {				// preventing login if username is empty
			response.sendRedirect("login.jsp");
		}
	%>
	Welcome ${userName}
	
	<br>
	<form action="Logout">
		<button type="submit"value="Logout">Logout</button>			<!-- calling Logout.jsp on clicking Logout button -->
	</form>
</body>
</html>