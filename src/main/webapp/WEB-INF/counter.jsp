<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Current visit count</title>
	</head>
	<body>
		<br />
		<br />
		<h2>You have visited <a href="/">http://localhost:8080</a> <c:out value="${counter}"/> times.</h2>
		<h2><a href="/">Test another visit?</a></h2>
		<br />
		<form action="/reboot" method="post">
			<button type="submit">Reboot</button>
		</form>
	</body>
</html>