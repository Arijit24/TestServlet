<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>
	function Validate() {

		var name = document.forms["Regform"]["uname"];
		var password = document.forms["Regform"]["password"];
		var email1 = document.forms["Regform"]["Email"];
		var dob = document.forms["Regform"]["DOB"];

		if (name.value == "") {
			window.alert("Please provide your name");
			name.focus();
			return false;
		}
		if (password.value == "") {
			window.alert("Please provide your password");
			password.focus();
			return false;
		}
		if (email1.value == "") {
			window.alert("Please provide your email");
			email1.focus();
			return false;
		}
		if (dob.value == "") {
			window.alert("Please provide your dob");
			dob.focus();
			return false;
		}
		return true;
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
	<form action="registration" name="Regform" onsubmit="return Validate()">
		<h3>Please Register Yourself</h3>
		<table>
			<tr>
				<td>Name</td>
				<td><input type="text" name="uname"><br></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password"><br></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="Email"><br></td>
			</tr>
			<tr>
				<td>DOB</td>
				<td><input type="text" name="DOB"><br></td>
			</tr>
			<tr>
				<td><input type="submit" value="submit"></td>
			</tr>
			<tr>
				<td><a href="login.jsp">login</a></td>
			</tr>
		</table>
	</form>
</body>
</html>