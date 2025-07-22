<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page</title>
</head>
<body>
	<h1>Welcom, <% request.getAttribute("displayUserName") %>!</h1>
	<p>Here is your profile page.</p>
</body>
</html>
