<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>register page</h1>
   <form action="/board/register" method="post">
   제목<input type="text" name="title"><br>
   작성자<input type="text" name="writer"><br>
   내용<input type="text" name="contents"><br>
   	<button type="submit">register</button>
   </form>	
   <form action="/board/list" method="get">
   		<button>list</button>
   </form>
</body>
</html>