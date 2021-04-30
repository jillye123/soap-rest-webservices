<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@page
	language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.webage.billing.*"%>
<html>
<head>
<title>index</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<h3>Add new customer account</h3>

<%
String message = (String)request.getAttribute("message");

if (message == null || message.isEmpty()) {
	message = "Add a new account";

	request.setAttribute("message", message);
}
%>

<p>${message}</p>
<form method="post" action="BillingClient">
Name:<br/>
<input type="text" name="name"/><br/>
Address:<br/>
<textarea rows="4" cols="35" name="address"></textarea>
<br/>
<input type="submit" value="Add"/>
</form>

</body>
</html>