<%@page import="com.dev.beans.Person"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Person p = (Person)session.getAttribute("person");
	%>
	<h3><%=p.getId() %></h3>
	<h3><%=p.getName()%></h3>
	<h3><%=p.getAge() %></h3>
</body>
</html>