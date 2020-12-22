<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="Login" method="post">			<!-- Calling Login servlet on clicking Login button -->
		Username: <input type="text" name="userName"><br><br>
		Password: <input type="password" name="password"><br><br>
		<button type="submit" value="Sign In">Sign In</button><br><br>
	</form>
	
	<form action="Signup" method="post">
		<button type="submit" value="Sign Up">Sign Up</button>
	</form>
</body>
</html>