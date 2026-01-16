<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
			<form action="/notice/write.do" method="post">
				<div>
					<label for="noticeTitle">제목</label>
					<input type="text" id="noticeTitle" name="noticeTitle" />
				</div>			
				<div>
					<label for="noticeContents">내용</label>
					<textarea id="noticeContents" name="noticeContents" row="6" cols="20"></textarea>
				</div>
				<div>
					<label for="noticeTitle">등록자</label>
					<input type="text" id="register" name="register" />
				</div>
				<div>
					<label for="registedDate">등록시간</label>
					<input type="hidden" id="registedDate" name="registedDate" value="<fmt:formatDate value='${resultView.registedDate}' pattern='yyyy-MM-dd' />" />
				</div>
				
				<fieldset>
					<button type="submit">등록</button>
					<a href="/notice.do">취소</a>
				</fieldset>
			</form>
