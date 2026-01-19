<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

			<form id="noticeVO" name="noticeVO" method="post">
				<div>
					<label for="noticeTitle">제목</label>
					<input type="text" id="noticeTitle" name="noticeTitle" />
				</div>			
				<div>
					<label for="noticeContents">내용</label>
					<textarea id="noticeContents" name="noticeContents" rows="6" cols="20"></textarea>
				</div>
				<div>
					<label for="noticeTitle">등록자</label>
					<input type="text" id="register" name="register" />
				</div>
				<fieldset>
					<a href="#self" onclick="fnInsert(); return false;">등록</a>
					<a href="#self" onclick="fnGoList(); return false;">취소</a>
				</fieldset>
			</form>

<script type="text/javascript">
function fnInsert() {
	
	if ($.trim($("#noticeTitle").val()) == "") {
	      alert("제목을 입력해주세요.");
	      $("#noticeTitle").focus();
	      return;
	   }
	
	if(confirm("등록하시겠습니까?")) {
		$("#noticeVO").attr("action", "<c:url value='/notice/write.do' />").submit();
	}
	
}

function fnGoList() {
	
	$("#noticeVO").attr("action", "<c:url value='/notice.do' />").submit();
}

</script>