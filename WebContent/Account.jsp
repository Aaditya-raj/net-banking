<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="AccountAddServe" method="post">
<table>
<tr>
<td><label>ENTER ACCOUNT NUMBER</label></td>
<td><input type="text" name="accno"></td>
</tr>
<tr>
<td><label>ENTER ACCOUNT TYPE</label></td>
<td><select name="acctyp">
<option value="SAVING">SAVING</option>
<option value="CURRENT">CURRENT</option>
</select></td>
</tr>
<tr>
<td><label>DATE OF OPEN</label></td>
<td><input type="text" name="date_of_open"></td>
</tr>
<tr>
<td><label>ENTER BALANCE</label></td>
<td><input type="text" name="balance"></td>
</tr>
<tr>
<td><label>ENTER CUSTOMER ID</label></td>
<td><input type="text" name="cid"></td>
</tr>
<tr>
<td><input type="submit" value="CREATE"></td>
</tr>
</table>
</form>
</body>
</html>