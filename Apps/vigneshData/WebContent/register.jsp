<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
</head>
<body>

<form name="registration" action="RegServlet"method="post">
	<table cellpadding="5" cellspacing="5">
	<tr>
		<td>First Name</td>
		<td><input type="text" name="txtFName"/></td>
	</tr>
	<tr>
		<td>Last Name</td>
		<td><input type="text" name="txtLName"/></td>
	</tr>
	<tr>
		<td>Gender</td>
		<td><input type="radio" name="rdoGendor" id="Male" value="Male"><label for="Male">Male</label>
			<input type="radio" name="rdoGendor" id="Female" value="Female"><label for="Famale">Famale</label>
	</tr>
	<tr>
		<td>Email</td>
		<td><input type="text" name="txtEmail"/></td>
	</tr>
	<tr>
		<td>Password</td>
		<td><input type="password" name="txtPassword"/></td>
	</tr>
	<tr>
		<td>State</td>
		<td>
		<select name="cboStates">
		<option name="TamilNadu">TamilNadu</option>
		<option name="Karnataka">Karnataka</option>
		<option name="Kerala">Kerala</option>
		</select></td>
	</tr>
	<tr>
		<td>Age</td>
		<td>
		<select name="cboAge">
		<option name="18">18</option>
		<option name="19">19</option>
		<option name="20">20</option>
		</select></td>
	</tr>
	<tr>
		<td>Address</td>
		<td>
			<textarea name="textarAddress"></textarea>
		</td>
	</tr>
	<tr>
		<td>Skills</td>
		<td>
		<input type="checkbox"name="chkSkills"value="JAVA">JAVA
		<input type="checkbox"name="chkSkills"value="JSP">JSP
		<input type="checkbox"name="chkSkills"value="PHP">PHP
		</td>
	</tr>
	<tr>
		<td><button type="submit">Submit</button></td>
	</tr>
	</table>
	</form>
</body>
</html>