<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add A Movie</title>
</head>
<body>
<p><b>${status}</b></p>

<form method="post" action="AddMovieServlet">
<p>
Title:<br/>
<input type="text" name="title"/>
<br />
Rating:<br />
<input type="text" name="rating"/><br/>
Actors (separated by comma):<br />
<input type="text" name="actors"/><br/>
Description:<br />
<textarea name="description" rows="4" cols="20"></textarea><br/>
<input type="submit" value="Add Movie"/>
</p>
</form>

</body>
</html>