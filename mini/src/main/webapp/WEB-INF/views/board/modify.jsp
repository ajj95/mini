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
	<h1>modify page</h1>
	<form action="/board/modify" method="post">
		<table>
			<tr>
				<td>번호 : <c:out value="${board.bno}" /></td>
			</tr>
			<tr>
				<td>제목 : <input type="text" name="title"></td>
			</tr>
			<tr>
				<td>작성자 : <input type="text" name="writer"></td>
			</tr>
			<tr>
				<td>내용 : <input type="text" name="contents"></td>
			</tr>
		</table>
		 <input type="hidden" name="bno" value="${board.bno}">
		<button type="submit">modify</button>
	</form>

	<form action="/board/list" method="get">
		<button>list</button>
	</form>

</body>
</html>