<%@ page language="java" contentType="text/html; charset=UTF-8" trimDirectiveWhitespaces="true" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>
<form action="/test/inputData" method="post">
	<input type="text" name="aaa" />	<br />
	<input type="text" name="bbb" />	<br />
	<input type="text" name="ccc" />	<br />
	<input type="text" name="ddd" />	<br />
	<input type="text" name="eee" />	<br />
	<input type="submit" value="전송" />
</form>
</h1>
</body>
</html>