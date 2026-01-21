package project.archive.notice.service.impl;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.EgovAbstractMapper;
import org.egovframe.rte.psl.dataaccess.util.EgovMap;
import org.springframework.stereotype.Repository;

import project.archive.notice.service.NoticeVO;

@Repository("noticeMapper")
public class NoticeMapper extends EgovAbstractMapper {
	
	String NAMESPACE = "project.archive.notice.service.impl.NoticeMapper";

	public List<EgovMap> selectNoticeList() throws Exception {
		return selectList(NAMESPACE + ".selectNoticeList");
	}
	
	public int noticeListTotalCnt() throws Exception {
		return selectOne(NAMESPACE + ".noticeListTotalCnt");
	}
	
	public int writeNotice(NoticeVO noticeVO) throws Exception {
		return insert(NAMESPACE + ".writeNotice", noticeVO);
	}
	
	public int hitsPlusCnt(int noticeId) throws Exception {
		return update(NAMESPACE + ".hitsPlusCnt", noticeId); 
	}
	
	public NoticeVO selectNoticeView(int noticeId) throws Exception {
		return selectOne(NAMESPACE + ".selectNoticeView", noticeId);
	}
	
	public int updateNotice(NoticeVO noticeVO) throws Exception {
		return update(NAMESPACE + ".updateNotice", noticeVO);
	}
	
	public int deleteNotice(int noticeId) throws Exception {
		return update(NAMESPACE + ".deleteNotice", noticeId);
	}
}
