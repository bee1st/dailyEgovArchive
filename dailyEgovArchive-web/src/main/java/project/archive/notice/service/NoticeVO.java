package project.archive.notice.service;

public class NoticeVO {

	/** 아이디 */
	private int noticeId;
	
	/** 제목 */
	private String noticeTitle;
	
	/** 내용 */
	private String noticeContents;
	
	/** 노출유무 */
	private String noticeYn = "Y";
	
	/** 조회수 */
	private int noticeHits = 0;
	
	/** 최상단유무 */
	private String noticeTopfixYn = "N";
	
	/** 등록자 */
	private String register;
	
	/** 등록일시 */
	private String registedDate;
	
	/** 수정자 */
	private String modifier;
	
	/** 수정일시 */
	private String modifiedDate;

	public int getNoticeId() {
		return noticeId;
	}

	public void setNoticeId(int noticeId) {
		this.noticeId = noticeId;
	}

	public String getNoticeTitle() {
		return noticeTitle;
	}

	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}

	public String getNoticeContents() {
		return noticeContents;
	}

	public void setNoticeContents(String noticeContents) {
		this.noticeContents = noticeContents;
	}

	public String getNoticeYn() {
		return noticeYn;
	}

	public void setNoticeYn(String noticeYn) {
		this.noticeYn = noticeYn;
	}

	public int getNoticeHits() {
		return noticeHits;
	}

	public void setNoticeHits(int noticeHits) {
		this.noticeHits = noticeHits;
	}

	public String getNoticeTopfixYn() {
		return noticeTopfixYn;
	}

	public void setNoticeTopfixYn(String noticeTopfixYn) {
		this.noticeTopfixYn = noticeTopfixYn;
	}

	public String getRegister() {
		return register;
	}

	public void setRegister(String register) {
		this.register = register;
	}

	public String getRegistedDate() {
		return registedDate;
	}

	public void setRegistedDate(String registedDate) {
		this.registedDate = registedDate;
	}

	public String getModifier() {
		return modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	
}
