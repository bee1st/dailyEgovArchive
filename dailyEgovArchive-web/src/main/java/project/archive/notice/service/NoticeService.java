package project.archive.notice.service;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.util.EgovMap;

public interface NoticeService {

	public List<EgovMap> selectNoticeList() throws Exception;
	
	public int noticeListTotalCnt() throws Exception;
}
