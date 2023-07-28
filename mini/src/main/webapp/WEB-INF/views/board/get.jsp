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
	<h1>get page</h1>
   <table>
      <thead>
         <tr>
            <th>번호</th>
            <th>제목</th>
            <th>작성자</th>
            <th>내용</th>
            <th>작성일</th>
            <th>수정일</th>
         </tr>
      </thead>
         <tr>
            <td><c:out value="${board.bno}"/></td>
            <td><c:out value="${board.title}"/></td>
            <td><c:out value="${board.writer}"/></td>
            <td><c:out value="${board.contents}"/></td>
            <td><fmt:formatDate pattern="yyyy-MM-dd" value="${board.regdate}"/></td>
            <td><fmt:formatDate pattern="yyyy-MM-dd" value="${board.updatedate}"/></td>
         </tr>            
   </table>
   
   <form action="/board/list" method="get">
   		<button>list</button>
   </form>
   
   <form action='/board/modify' method="get">
   <input type="hidden" name="bno" value="${board.bno}">
   		<button>modify</button>
   </form>
   
   <form action="/board/remove" method="post">
 	 	<input type="hidden" name="bno" value="${board.bno}">
   		<button type="submit">remove</button>
   </form>
   
</body>
</html>