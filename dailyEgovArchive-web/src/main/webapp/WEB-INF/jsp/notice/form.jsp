<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="noticeVO" name="noticeVO" method="post">
	<div>
		<input type="hidden" id="noticeId" name="noticeId" value="<c:out value='${result.noticeId}' />" />
	</div>
	<div>
		<label for="noticeTitle">제목</label>
		<input type="text"id="noticeTitle" name="noticeTitle" value="<c:out value='${result.noticeTitle}' />" />
	</div>
	<div>
		<label>조회수</label> <span><fmt:formatNumber value="${result.noticeHits}" pattern="#,###" /></span>
	</div>
	<div>
		<label for="noticeYn">공지여부</label>
		<div class="form-check">
			<input class="form-check-input" type="radio" name="noticeYn" id="noticeYn1" value="Y" <c:if test="${result.noticeYn eq 'Y'}">checked</c:if> /> 
			<label class="form-check-label" for="noticeYn1">예</label>
		</div>
		<div class="form-check">
			<input class="form-check-input" type="radio" name="noticeYn" id="noticeYn2" value="N" <c:if test="${result.noticeYn ne 'Y'}">checked</c:if> /> 
			<label class="form-check-label" for="noticeYn2">아니오</label>
		</div>
	</div>
	<div>
		<label for="noticeYn">상단고정</label>
		<div class="form-check">
			<input class="form-check-input" type="radio" name="noticeTopfixYn" id="noticeTopfixYn1" value="Y" <c:if test="${result.noticeTopfixYn eq 'Y'}">checked</c:if> /> 
			<label class="form-check-label" for="noticeTopfixYn1">예</label>
		</div>
		<div class="form-check">
			<input class="form-check-input" type="radio" name="noticeTopfixYn" id="noticeTopfixYn2" value="N" <c:if test="${result.noticeTopfixYn ne 'Y'}">checked</c:if> /> 
			<label class="form-check-label" for="noticeTopfixYn2">아니오</label>
		</div>
	</div>
	<div>
		<label for="noticeContents">내용</label>
		<textarea id="noticeContents" name="noticeContents" rows="6" cols="20"><c:out value="${result.noticeContents}" /></textarea>
	</div>
	<div>
		<label for="register">등록자</label>
		<c:if test="${result.noticeId eq 0}">
			<input type="text" id="register" name="register" value="<c:out value='${result.register}' />" />
		</c:if>
		<c:if test="${result.noticeId > 0}">
			<c:out value="${result.register}" />
			<input type="hidden" id="modifier" name="modifier" value="<c:out value='${result.register}' />" />
		</c:if>
	</div>
	<c:if test="${result.noticeId eq 0}">
		<button type="button" onclick="fnInsert(); return false;">등록</button>
		<button type="button" onclick="fnGoList(); return false;">취소</button>
	</c:if>
	<c:if test="${result.noticeId > 0}">
		<button type="button" onclick="fnUpdate(); return false;">수정</button>
		<button type="button" onclick="fnGoList(); return false;">목록</button>
		<button type="button" onclick="fnDelete(); return false;">삭제</button>
	</c:if>
</form>
<script type="text/javascript">
	function fnUpdate() {
		if ($.trim($("#noticeTitle").val()) == "") {
			alert("제목을 입력해주세요.");
			$("#noticeTitle").focus();
			return;
		}
		if ($.trim($("#noticeContents").val()) == "") {
			alert("내용을 입력해주세요.");
			$("#noticeContents").focus();
			return;
		}
		if (confirm("수정하시겠습니까?")) {
			$("#noticeVO").attr("action", "<c:url value='/notice/edit.do' />")
					.submit();
		}
	}
	function fnDelete() {
		if (confirm("삭제하시겠습니까?")) {
			$("#noticeVO")
					.attr("action", "<c:url value='/notice/delete.do' />")
					.submit();
		}
	}
	function fnInsert() {
		if ($.trim($("#noticeTitle").val()) == "") {
			alert("제목을 입력해주세요.");
			$("#noticeTitle").focus();
			return;
		}
		if ($.trim($("#noticeContents").val()) == "") {
			alert("내용을 입력해주세요.");
			$("#noticeContents").focus();
			return;
		}
		if ($.trim($("#register").val()) == "") {
			alert("등록자를 입력해주세요.");
			$("#register").focus();
			return;
		}
		if (confirm("등록하시겠습니까?")) {
			$("#noticeVO").attr("action", "<c:url value='/notice/write.do' />")
					.submit();
		}
	}
	function fnGoList() {
		location.href = "<c:url value='/notice.do' />";
	}
</script>