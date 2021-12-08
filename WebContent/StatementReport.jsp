<%@page import="master.dao.CustomerDAO"%>
<%@page import="master.dto.CustomerDTO"%>
<%@page import="master.dto.AccountDTO"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="master.dao.AccountDAO"%>
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
<td>BALANCE</td>
<td>CUSTOMER NAME</td>
</tr>
<%
CustomerDAO cdao=new CustomerDAO();
ArrayList results=cdao.getData();
Iterator itr=results.iterator();
AccountDAO adao=new AccountDAO();
ArrayList results2=adao.getData();
Iterator itr2=results2.iterator();
AccountDTO adto= (AccountDTO)itr2.next();
CustomerDTO cdto= (CustomerDTO)itr.next();
%>
<tr>
<td><%=adto.getAccno() %></td>
<td><%=adto.getBalance() %></td>
<td><%=cdto.getCname() %></td>
</tr>
<%
}
%>
</table>
</body>
</html>