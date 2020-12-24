<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" href="ResetPassword.css">
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<div id="loginForm">
			<div id="image">
				<img src="user.jpg" id="left">
			</div>
			<div id="form">
				<form action="ResetPassword" method="post" id="login">
					<p style="font-size:35px; font-weight:bold; margin-top:28%; font-family:verdana">Reset Password</p><br>
					<input type="text" name="uname" placeholder="Username"  class="modifiedInput" id="username" required><br><br>
					<input type="password" name="pwd" placeholder="New Password" class="modifiedInput" id="newPassword" required><br><br>
					<input type="password" name="repwd" placeholder="Confirm New Password" class="modifiedInput" id="newPassword" required><br><br><br>
					<button type="submit" value="Reset Password" id="reset">Reset</button>
				</form>
			</div>	
		</div>
	</body>
</html>