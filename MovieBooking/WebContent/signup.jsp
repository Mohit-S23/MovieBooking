<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Movie Hub</title>
</head>
<body>

	Password length must be between 6 to 18 characters.<br>
	Password must contain an Uppercase letter.<br>
	Password must contain a Lowercase letter.<br>
	Password must contain a digit.<br>
	Password must contain a special character.<br><br>
	<form action="Create" method="post">
		Set Username : <input type="text" name="uname"><br><br>
		Set Password : <input type="password" name="pwd"><br><br>
		<button type="submit" value="Create Account">Create Account</button>
	</form>
</body>
</html>