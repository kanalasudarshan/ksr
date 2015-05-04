<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
<html>
<head>
<title>KSR Home Page</title>
<link rel="stylesheet" type="text/css" href="commons/css/inline.css">
<script src="commons/js/jquery-1.11.1.js"></script>
<script>
$(document).ready(function(){
	
});
</script>
</head>
<body id="index_page_backimg">
<div class="registration_div">
<form name="registrationform" action="./createuser.do">

<form:errors path="userDTO.userName" cssClass="error" />
<form:errors path="userDTO.firstName" cssClass="error" />
<form:errors path="addressDTO.city" cssClass="error" />
<form:errors path="addressDTO.state" cssClass="error" />
<form:errors path="addressDTO.country" cssClass="error" />
<form:errors path="addressDTO.address" cssClass="error" />
<form:errors path="addressDTO.pincode" cssClass="error" />
<form:errors path="addressDTO.phoneNumber" cssClass="error" />

<table class="register_table" cellspacing="0" cellpadding="0">
	<tr>
		<td colspan="4" align="center" class="login_form_header">User Login</td>		
	</tr>
	<tr>
		<td colspan="4" class="sub_heading">User Details</td>		
	</tr>
	<tr>
		<td>User Name</td>
		<td><input type="text" id="userName" name="userName"/></td>
		<td>First Name</td>
		<td><input type="text" id="firstName" name="firstName"/></td>
	</tr>
	<tr>
		<td>Last Name</td>
		<td><input type="text" id="lastName" name="lastName"/></td>
		<td>Gender</td>
		<td>
			<input type="radio" id="male" name="gender" value="1"/> Male &nbsp
			<input type="radio" id="female" name="gender" value="2"/> Female	
		</td>
	</tr>
	<tr>
		<td>Password</td>
		<td><input type="password" id="password" name="password"/></td>
		<td>Conform Password</td>
		<td><input type="password" id="conformpassword" name="conformpassword"/></td>
	</tr>
	<tr>
		<td colspan="4"  class="sub_heading">Address Details</td>		
	</tr>
	<tr>
		<td>City</td>
		<td><input type="text" id="city" name="city"/></td>		
		<td rowspan="3">Address</td>
		<td rowspan="3"><textarea id="address" name="address" rows="8" cols="35"></textarea></td>
	</tr>
	<tr>	
		<td>State</td>
		<td><input type="text" id="state" name="state"/></td>
	</tr>
	<tr>
		<td>Country</td>
		<td><input type="text" id="country" name="country"/></td>
		
	</tr>
	<tr>
		<td>Pin code</td>
		<td><input type="text" id="pincode" name="pincode"/></td>
		<td>Phone Number</td>
		<td><input type="text" id="phoneNumber" name="phoneNumber"/></td>
	</tr>	
	<tr>
		<td><input type="submit" id="register" value="Register"/></td>
		<td><input type="button" id="reset" value="Reset"/></td>
	</tr>
</table>
</form>
</div>
</body>
</html>