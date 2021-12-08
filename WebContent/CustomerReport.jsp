<%@page import="master.dto.CustomerDTO"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="master.dao.CustomerDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2">
<tr>
<td>CID</td>
<td>NAME</td>
<td>PHONE NUMBER</td>
<td>EMAIL</td>
<td>ADHAR NUMBER</td>
<td>PANCARD NUMBER</td>
<td>DATE OF BIRTH</td>
<td>GENDER</td>
<td>PLOT NUMBER</td>
<td>STREET NAME</td>
<td>PINCODE</td>
<td>PASSWORD</td>
</tr>
<%
CustomerDAO rdao=new CustomerDAO();
ArrayList results=rdao.getData();
Iterator itr=results.iterator();
while(itr.hasNext())
{
	CustomerDTO rdto= (CustomerDTO)itr.next();
%>
<tr>
<td><%=rdto.getCid() %></td>
<td><%=rdto.getCname() %></td>
<td><%=rdto.getCphno() %></td>
<td><%=rdto.getCemail() %></td>
<td><%=rdto.getAdhar() %></td>
<td><%=rdto.getPan() %></td>
<td><%=rdto.getDob() %></td>
<td><%=rdto.getGender() %></td>
<td><%=rdto.getPlotno() %></td>
<td><%=rdto.getStreetnm() %></td>
<td><%=rdto.getPincode() %></td>
<td><%=rdto.getPass() %></td>
</tr>
<%
}
%>
</table>
</body>
</html>