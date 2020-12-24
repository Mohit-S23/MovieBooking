<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" href="signup.css">
		<meta charset="ISO-8859-1">
		<title>Movie Hub</title>
	</head>
	<body>
		<div id="loginForm">
			<div id="image">
				<img src="user.jpg" id="left">
			</div>
			<div id="form">
				<form action="Create" method="post" id="login">
					<p style="font-size:35px; font-weight:bold; margin-left:14%; margin-top:28%; font-family:verdana">Sign Up</p><br>
					<input type="text" name="uname" placeholder="Username"  class="modifiedInput" id="username" required><br><br>
					<input type="password" name="pwd" placeholder="Password" class="modifiedInput" id="password" required><br><br>
					<input type="password" name="repwd" placeholder="Re-Enter Password" class="modifiedInput" id="password" required><br><br><br>
					<button type="submit" value="Create Account" id="signupButton">Create Account</button>
				</form>
			</div>	
		</div>
	</body>
</html>