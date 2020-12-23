<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" href="login.css">
		<meta charset="ISO-8859-1">
		<title>Movie Hub</title>
	</head>
	<body>
		<div id="loginForm">
			<div id="image">
				<img src="user.jpg" id="left">
			</div>
			<div id="form">
				<form action="Login" method="post" id="login">			<!-- Calling Login servlet on clicking Login button -->
					<p class="heading">Member Login</p><br>
					<input type="text" name="userName" placeholder="Username" class="modifiedInput" id="username"><br><br>
					<input type="password" name="password" placeholder="Password" class="modifiedInput" id="password"><br><br><br>
					<button type="submit" value="Sign In" id="loginButton">LOGIN</button>
				</form>
				<br>
				<form>
					<button type="submit" value="forgot" id="forgot">Forgot Password?</button>
				</form>
				<form action="Signup" method="post">
					<button type="submit" value="Sign Up" id="signupButton">Create your Account</button>
				</form>
			</div>
			
		</div>
	</body>
</html>