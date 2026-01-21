package project.archive.notice.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.egovframe.rte.psl.dataaccess.util.EgovMap;
import org.springframework.stereotype.Service;

import project.archive.notice.service.NoticeService;
import project.archive.notice.service.NoticeVO;

@Service("noticeService")
public class NoticeServiceImpl implements NoticeService {

	@Resource(name="noticeMapper")
	private NoticeMapper noticeMapper;
	
	public List<EgovMap> selectNoticeList() throws Exception {
		return noticeMapper.selectNoticeList();
	}
	
	public int noticeListTotalCnt() throws Exception {
		return noticeMapper.noticeListTotalCnt();
	}
	
	public int writeNotice(NoticeVO noticeVO) throws Exception {
		return noticeMapper.writeNotice(noticeVO);
	}
	
	public int hitsPlusCnt(int noticeId) throws Exception {
		return noticeMapper.hitsPlusCnt(noticeId); 
	}
	
	public NoticeVO selectNoticeView(int noticeId) throws Exception {
		return noticeMapper.selectNoticeView(noticeId);
	}
	
	public int updateNotice(NoticeVO noticeVO) throws Exception {
		return noticeMapper.updateNotice(noticeVO);
	}
	
	public int deleteNotice(int noticeId) throws Exception {
		return noticeMapper.deleteNotice(noticeId);
	}
}
