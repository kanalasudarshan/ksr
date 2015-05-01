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
<div class="login_div">
<form name="loginform" action="./userpage.do">
<table class="login_table" cellspacing="0" cellpadding="0">
	<tr>
		<td colspan="2" align="center" class="login_form_header">User Login</td>		
	</tr>
	<tr>
		<td>User Name</td>
		<td><input type="text" id="uname" name="username"/></td>
	</tr>
	<tr>
		<td>Password</td>
		<td><input type="text" id="pword" name="password"/></td>
	</tr>
	<tr>
		<td><input type="submit" id="login" value="Login"/></td>
		<td><input type="button" id="reset" value="Reset"/></td>
	</tr>	
</table>
</form>
</div>
</body>
</html>