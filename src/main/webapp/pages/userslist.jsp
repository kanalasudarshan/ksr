<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="commons/css/datatable/jquery.dataTables.css">
<script src="commons/js/jquery-1.11.1.js"></script>
<script src="commons/js/datatable/jquery.dataTables.js"></script>
<script>
$(document).ready(function() {
    $('#userlist').DataTable({
		"bPaginate": true,
		"bLengthChange": true,
		"bFilter": true,
		"bSort": true,
		"bInfo": true,
		"bAutoWidth": true,
		"aoColumns": [
			null,
			null,
			null //put as many null values as your columns

		]
	});
});
</script>
</head>
<body>
<table name="userlist" id="userlist">	
<thead>
<tr>
	<th>User Name</th>
	<th>First Name</th>
	<th>Last Name</th>
</tr>
</thead>
<tfoot>
<tr>
	<th>User Name</th>
	<th>First Name</th>
	<th>Last Name</th>
</tr>
</tfoot>
<c:forEach var="users" items="${items}">
<tbody>
<tr>
	<td>${users.userName}</td>
	<td>${users.firstName}</td>
	<td>${users.lastName}</td>
</tr>
<tbody>
</c:forEach>
</table>
</body>
</html>