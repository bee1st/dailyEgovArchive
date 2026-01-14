package project.archive.notice.service;

public class NoticeSearchVO {

	/** 
     * 현재 페이지 번호 (1부터 시작)
     * - 화면에서 넘어오는 값(pageIndex)
     * - PaginationInfo.setCurrentPageNo(pageIndex)에 사용
     */
	private int pageIndex = 1;
	
	/**
     * 페이지당 출력할 게시물 수(= 목록 건수)
     * - 화면에서 선택할 수 있는 "목록수"와 연결되는 값
     * - PaginationInfo.setRecordCountPerPage(pageUnit)에 사용
     * - SQL에서는 LIMIT 값으로 사용됨
     */
	private int pageUnit = 10;
	
	/**
     * 페이징 네비게이션에 표시할 페이지 번호 개수
     * - 예) 1 2 3 4 5 6 7 8 9 10 (pageSize=10)
     * - PaginationInfo.setPageSize(pageSize)에 사용
     * - DB 조회와는 직접 관련 없음(화면용)
     */
	private int pageSize = 10;
	
	/**
     * DB 조회 시작 위치(0부터 시작하는 offset 역할)
     * - PaginationInfo.getFirstRecordIndex() 값을 세팅받는 필드
     * - SQL에서는 OFFSET 값으로 사용됨
     * - 보통 컨트롤러에서 paginationInfo로 계산 후 searchVO.setFirstIndex(...)로 세팅
     */
	private int firstIndex = 0;

	/**
     * 한 페이지에 조회할 레코드 수 (= LIMIT)
     * - PaginationInfo.getRecordCountPerPage() 값을 세팅받는 필드
     * - pageUnit과 같은 의미로 쓰는 경우가 많지만,
     *   eGov 공통 로직에서는 recordCountPerPage 필드를 그대로 사용하는 패턴이 많아 별도로 둠
     * - SQL에서는 LIMIT 값으로 사용됨
     */
	private int recordCountPerPage = 10;

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public int getPageUnit() {
		return pageUnit;
	}

	public void setPageUnit(int pageUnit) {
		this.pageUnit = pageUnit;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getFirstIndex() {
		return firstIndex;
	}

	public void setFirstIndex(int firstIndex) {
		this.firstIndex = firstIndex;
	}

	public int getRecordCountPerPage() {
		return recordCountPerPage;
	}

	public void setRecordCountPerPage(int recordCountPerPage) {
		this.recordCountPerPage = recordCountPerPage;
	}
	
}
