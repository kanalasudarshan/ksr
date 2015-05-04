<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="commons/css/inline.css">
<script src="commons/js/jquery-1.11.1.js"></script>
<script src="commons/js/inline.js"></script>
<script>
$(document).ready(function(){
	$('#purchaseTypeId').change(function(){
		var ptype=$('#purchaseTypeId').val();
		if(ptype==""){
			$('#rpayment').hide();
			$('#pir').hide();
			$('#emi').hide();	
		}else if(ptype==1){
			$('#rpayment').hide();
			$('#pir').show();
			$('#emi').show();
		}else if(ptype==2){
			$('#rpayment').show();
			$('#pir').hide();
			$('#emi').hide();
		}else if(ptype==3){
			$('#rpayment').show();
			$('#pir').show();
			$('#emi').hide();
		}else if(ptype==4){
			$('#rpayment').hide();
			$('#pir').hide();
			$('#emi').hide();
		}
	});
});
</script>
<title>Purchase</title>
</head>
<body>
<form>
<table width="600">
<tr>
	<td>Purchase Type</td>
	<td>
		<select name="purchaseTypeId" id="purchaseTypeId">
			<option value=""> Please select </option>
			<option value="1">EMI</option>
			<option value="2">LIC</option>
			<option value="3">Loan</option>
			<option value="4">Single Payment</option>
		</select>
	</td>
</tr>
<tr>
	<td>Total purchase amount</td>
	<td><input type="text" name=purhcaseAmount" id="purhcaseAmount"/></td>
</tr>
<tr id="rpayment" style="display:none;">
	<td>Payment Recurrence</td>
	<td>
		<select  name=payementRecurrence" id="payementRecurrence">
			<option value=""> Please select </option>
			<option value="1">Monthly</option>
			<option value="2">Quarterly</option>
			<option value="3">Half Yearly</option>
			<option value="4">Yearly</option>
		</select>
	</td>
</tr>
<tr id="pir" style="display:none;">
	<td>Purchase Interest Rate</td>
	<td><input type="text" name=purchaseInterest" id="purchaseInterest"/></td>
</tr>
<tr id="emi" style="display:none;">
	<td>EMI months</td>
	<td><input type="text" name=emiMonths" id="emiMonths"/></td>
</tr>

<tr>
	<td>&nbsp;</td>
	<td><input type="submit" id="submit" value="Submit"/>&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" id="reset" value="Reset"/></td>
</tr>
</table>
</form>
</body>
</html>