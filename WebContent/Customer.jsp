<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="CustomerAddServe" method="post">
<table>
<tr>
<td><label>ENTER CUSTOMER ID</label></td>
<td><input type="password" name="cid"></td>
</tr>
<tr>
<td><label>ENTER CUSTOMER NAME</label></td>
<td><input type="text" name="cname"></td>
</tr>
<tr>
<td><label>ENTER PHONE NUMBER</label></td>
<td><input type="text" name="cphno"></td>
</tr>
<tr>
<td><label>ENTER EMAIL</label></td>
<td><input type="text" name="cemail"></td>
</tr>
<tr>
<td><label>ENTER ADHAR NO</label></td>
<td><input type="text" name="adhar"></td>
</tr>
<tr>
<td><label>ENTER PAN CARD NO</label></td>
<td><input type="text" name="pan"></td>
</tr>
<tr>
<td><label>ENTER DATE OF BIRTH</label></td>
<td><input type="text" name="dob"></td>
</tr>
<tr>
<td><label>ENTER GENDER</label></td>
<td><select name="gender">
<option value="M">MALE</option>
<option value="F">FEMALE</option>
</select></td>
</tr>
<tr>
<td><label>PLOT NO</label></td>
<td><input type="text" name="plotno"></td>
</tr>
<tr>
<td><label>ENTER STREET NAME</label></td>
<td><input type="text" name="streetnm"></td>
</tr>
<tr>
<td><label>ENTER PINCODE</label></td>
<td><input type="text" name="pincode"></td>
</tr>
<tr>
<td><label>ENTER PASSCODE</label></td>
<td><input type="password" name="pass"></td>
</tr>
<tr>
<td><input type="submit" value="ADD CUSTOMER"></td>
</tr>
</table>

</form>
</body>
</html>