package project.archive.notice.web;

import java.util.List;

import javax.annotation.Resource;

import org.egovframe.rte.psl.dataaccess.util.EgovMap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import project.archive.notice.service.NoticeService;

@Controller
public class NoticeController {

	@Resource(name="noticeService")
	private NoticeService noticeService;

	
	@RequestMapping(value = "/notice.do")
	public String list(ModelMap model) throws Exception {
		
		// 목록 조회
		List<EgovMap> resultList = noticeService.selectNoticeList();
		model.addAttribute("resultList", resultList);
		
		// 목록 총 건수
		int count = noticeService.noticeListTotalCnt();
		model.addAttribute("count", count);
		
		return "notice/list.tiles";
	}
	
	@RequestMapping(value = "/notice/view.do")
	public String view(@RequestParam("noticeId") int noticeId, ModelMap model) throws Exception {
		
		// 상세 조회
		EgovMap resultView = noticeService.selectNoticeView(noticeId);
		model.addAttribute("resultView", resultView);
		
		return "notice/view.tiles";
		
	}
	
	@RequestMapping(value = "/notice/update.do")
	public String update(@RequestParam("noticeId") int noticeId, ModelMap model) throws Exception {
		
		return "notice/update.tiles";
	}
	
		
}
