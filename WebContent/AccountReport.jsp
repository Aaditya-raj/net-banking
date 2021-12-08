<%@page import="master.dto.AccountDTO"%>
<%@page import="master.dao.AccountDAO"%>
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
<td>ACCOUNT NUMBER</td>
<td>ACCOUNT TYPE</td>
<td>DATE OF OPEN</td>
<td>BALANCE</td>
<td>CID</td>
</tr>
<%
AccountDAO rdao=new AccountDAO();
ArrayList results=rdao.getData();
Iterator itr=results.iterator();
while(itr.hasNext())
{
	AccountDTO adto= (AccountDTO)itr.next();
%>
<tr>
<td><%=adto.getAccno() %></td>
<td><%=adto.getAcctyp() %></td>
<td><%=adto.getDate_of_open() %></td>
<td><%=adto.getBalance() %></td>
<td><%=adto.getCid() %></td>
</tr>
<%
}
%>
</table>
</body>
</html>