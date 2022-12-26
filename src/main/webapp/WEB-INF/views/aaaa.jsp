<%@ page language="java" contentType="text/html; charset=UTF-8" trimDirectiveWhitespaces="true" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>aaaa.jsp</h1>
<hr />
<p>data1 = ${data1 }</p>
<p>data2 = ${data2 }</p>
<hr />
	<p>1번째 넘겨 받은 자료 ${memberVO.getAaa()}</p>
	<p>2번째 넘겨 받은 자료 ${memberVO.getBbb()}</p>
	<p>3번째 넘겨 받은 자료 ${memberVO.getCcc()}</p>
	<p>4번째 넘겨 받은 자료 ${memberVO.getDdd()}</p>
	<p>5번째 넘겨 받은 자료 ${memberVO.getEee()}</p> 
</body>
</html>