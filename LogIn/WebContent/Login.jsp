<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table cellspacing="2" cellpadding="2" align="center">

		<form action="LoginController" method="post">
		
			<tr>
				<td colspan="2"><center><font color="black">Login</font></center></td>
			</tr>
			<tr>
				<td><font color="black">User ID</font></td>
				<td><input type="text" name="id" /></td>
			</tr>
			<tr>
				<td><font color="black">Password</font></td>
				<td><input type="password" name="password" /></td>
			</tr>
			<br/>
			<tr>
				<td colspan="2"><center><input type="submit" value="Login" /></center></td>
			</tr>
		</form>

	</table>

</body>
</html>