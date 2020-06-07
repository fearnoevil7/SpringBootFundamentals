<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/postData" method="POST">
		<span>Name: </span><input type="text" name="name">
		<span>Location: </span><input type="text" name="location">
		<span>Language: </span><input type="text" name="language">
		<span>Comment: </span><textarea cols="7" rows = "3" name="comment"></textarea>
		<input type="submit" value="Submit">
	</form>
</body>
</html>