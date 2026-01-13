package project.archive.notice.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.egovframe.rte.psl.dataaccess.util.EgovMap;
import org.springframework.stereotype.Service;

import project.archive.notice.service.NoticeService;

@Service("noticeService")
public class NoticeServiceImpl implements NoticeService {

	@Resource(name="noticeMapper")
	private NoticeMapper noticeMapper;
	
	public List<EgovMap> selectNoticeList() throws Exception {
		return noticeMapper.selectNoticeList();
	}
}
