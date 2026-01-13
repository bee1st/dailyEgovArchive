<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 목록 화면</title>
</head>
<body>

<table>
	<caption>공지사항</caption>
	<thead>
		<tr>	
			<th scope="col">아이디</th>
		    <th scope="col">제목</th>
		    <th scope="col">내용</th>
		    <th scope="col">등록자</th>
		    <th scope="col">등록일</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${resultList}" var="list">
			<td scope="col"><c:out value="${list.noticeId }" /></td>
			<td scope="col"><c:out value="${list.noticeTitle }" /></td>
			<td scope="col"><c:out value="${list.noticeContents }" /></td>
			<td scope="col"><c:out value="${list.register }" /></td>
			<td scope="col"><c:out value="${list.registedDate }" /></td>
		  </tr>
		</c:forEach>
	</tbody>
</table>
	
</body>
</html>