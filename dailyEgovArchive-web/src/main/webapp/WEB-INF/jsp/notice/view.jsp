<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
				<table>
					<caption>공지사항 상세화면</caption>
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
						<tr>
							<td><c:out value="${resultView.noticeId}" /></td>
							<td><c:out value="${resultView.noticeTitle }" /></td>
							<td><c:out value="${resultView.noticeContents }" /></td>
							<td><c:out value="${resultView.register }" /></td>
							<td><c:out value="${resultView.registedDate }" /></td>
					  </tr>
					</tbody>
				</table>
				
				<fieldset>
					<a href="/notice/update.do?noticeId=<c:out value='${resultView.noticeId}' />">수정</a>
					<a href="/notice.do">목록</a>
					<a href="/notice/delete.do?noticeId=<c:out value='${resultView.noticeId}' />">삭제</a>
				</fieldset>
				