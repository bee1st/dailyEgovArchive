package project.archive.notice.service;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.util.EgovMap;

public interface NoticeService {

	public List<EgovMap> selectNoticeList() throws Exception;
	
	public int noticeListTotalCnt() throws Exception;
	
	public int writeNotice(NoticeVO noticeVO) throws Exception;
	
	public EgovMap selectNoticeView(int noticeId) throws Exception;

	public int updateNotice(NoticeVO noticeVO) throws Exception;

	public int deleteNotice(int noticeId) throws Exception;
}
