<%@page import="com.test.db.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
 <jsp:useBean id="employee" class="com.test.db.Employee" scope="request" />
 <jsp:setProperty name="employee" property="empName" value="Surabhi" />
<body>
<%
	Employee emp = new Employee();
emp.setEmpName("B");
%>
<%@ include file="header.html" %> 
<%!   int cube(int n){return n*n*n;}  %>  
User login is : <%=request.getParameter("user") %>
<br>
<%= "Cube of 3 is:"+cube(3) %>
<br>
 Name of Person is : <jsp:getProperty name="employee" property="empName" />
<%=emp.getEmpName() %>
</body>
</html>