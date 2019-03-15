<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>
  function validate(){
	  var name = document.forms["loginform"]["uname"];               
	  var password =document.forms["loginform"]["password"];
	  
	  if(name.value==""){
		  window.alert("Please enter your name");
		  name.focus();
		  return false;
	  }
	  if(password.value==""){
		  window.alert("Please enter your password");
		  password.focus();
		  return false;
	  }
	  return true;
  }
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<form action="login" name="loginform" onsubmit="return validate()">
<table>
<tr><td>Name</td><td> <input type="text" name="uname"><br></td></tr>
<tr><td>Password </td><td><input type="password" name="password"><br></td></tr>
  <tr><td><input type="submit" value="login"></td></tr>
  <tr><td><a href="registration.jsp">registration</a></td></tr>
  </table>
</form>
</body>
</html>