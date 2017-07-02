<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
Welcome! you are logged in
<form  method="get" action=" LogoutServlet">
<table>
<tr><td></td><td><input type="submit" value="Logout"></td></tr>
</table>
 </form>
<a href="active.jsp">Active Users</a>
<br>
<jsp:include page="printdate.jsp" > 
<jsp:param name="name" value="http://google.com" />  
</jsp:include>
</body>
</html>