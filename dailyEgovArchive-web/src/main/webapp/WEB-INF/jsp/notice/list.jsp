<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
				<div>총 건수 : <c:out value="${count}"/></div>
				<table>
					<caption>공지사항</caption>
					<thead>
						<tr>	
							<th scope="col">아이디</th>
						    <th scope="col">제목</th>
						    <th scope="col">등록자</th>
						    <th scope="col">등록일</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${resultList}" var="list">
							<tr>
								<td><c:out value="${list.noticeId }" /></td>
								<td><a href="/notice/view.do?noticeId=<c:out value='${list.noticeId }' />"><c:out value="${list.noticeTitle }" /></td>
								<td><c:out value="${list.register }" /></td>
								<td><c:out value="${list.registedDate }" /></td>
						  </tr>
						</c:forEach>
					</tbody>
				</table>
