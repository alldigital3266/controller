<%@ page language="java" contentType="text/html; charset=UTF-8" trimDirectiveWhitespaces="true" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>이화면이 나오나</h1>
	<p>1번째 넘겨 받은 자료 ${memberVO.getAaa()}</p>
	<p>2번째 넘겨 받은 자료 ${memberVO.getBbb()}</p>
	<p>3번째 넘겨 받은 자료 ${memberVO.getCcc()}</p>
	<p>4번째 넘겨 받은 자료 ${memberVO.getDdd()}</p>
	<p>5번째 넘겨 받은 자료 ${memberVO.getEee()}</p> 
	
	<hr />
	<p>Model를 통해 1번째 넘겨 받은 자료 ${vo.getAaa()}</p>
	<p>Model를 통해 2번째 넘겨 받은 자료 ${vo.getBbb()}</p>
	<p>Model를 통해 3번째 넘겨 받은 자료 ${vo.getCcc()}</p>
	<p>Model를 통해 4번째 넘겨 받은 자료 ${vo.getDdd()}</p>
	<p>Model를 통해 5번째 넘겨 받은 자료 ${vo.getEee()}</p> 
	
	

</body>
</html>