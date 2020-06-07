<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h5>Your Gold: <c:out value="${gold}"/></h5>
	<h1><c:out value="${location}"/></h1>
	<div>
		<h5>Farm</h5>
		<p>(earns 10-20 gold)</p>
		<form action="/farm" method="POST">
			<input type="hidden" name="building" value="farm">
			<input type="submit" value="Submit">
		</form>
	</div>
	<div>
		<h5>Cave</h5>
		<p>(earns 5-10 gold)</p>
		<form action="/cave" method ="POST">
			<input type="hidden" name="building" value="cave">
			<input type="submit" value="Submit">
		</form>
	</div>
	<div>
		<h5>House</h5>
		<p>(earns 2-5 gold)</p>
		<form action="/house" method="POST">
			<input type ="hidden" name="building" value="house">
			<input type="submit" value="Submit">
		</form>
	</div>
	<div>
		<h5>Casino</h5>
		<p>(earns/takes 0-50 gold)</p>
		<form action="/casino" method="POST">
			<input type="hidden" name="building" value="casino">
			<input type="submit" value="Submit">
		</form>
	</div>
	<div>
		<textarea cols="34" rows="7" >
			<c:forEach var = "comment" items="${comments}">
				<c:out value="${comment}"/>
			</c:forEach>
		</textarea>
	</div>
</body>
</html>