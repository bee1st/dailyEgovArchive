package project.archive.notice.service.impl;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.EgovAbstractMapper;
import org.egovframe.rte.psl.dataaccess.util.EgovMap;
import org.springframework.stereotype.Repository;

@Repository("noticeMapper")
public class NoticeMapper extends EgovAbstractMapper {
	
	String namespace = "project.archive.notice.service.impl.NoticeMapper";

	public List<EgovMap> selectNoticeList() throws Exception {
		return selectList(namespace + ".selectNoticeList");
	}
}
