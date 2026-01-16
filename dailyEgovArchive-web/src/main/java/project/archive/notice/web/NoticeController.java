package project.archive.notice.web;

import java.util.List;

import javax.annotation.Resource;

import org.egovframe.rte.psl.dataaccess.util.EgovMap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import project.archive.notice.service.NoticeService;
import project.archive.notice.service.NoticeVO;

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
	public String view(NoticeVO noticeVO, @RequestParam("noticeId") int noticeId, ModelMap model) throws Exception {
		
		// 상세 조회
		EgovMap resultView = noticeService.selectNoticeView(noticeId);
		model.addAttribute("resultView", resultView);
		
		if (resultView.isEmpty() || resultView == null) {
			return "redirect:/notice.do";
		}
		
		return "notice/view.tiles";
		
	}
	
	@RequestMapping(value = "/notice/insert.do")
	public String insert() throws Exception {
		
		return "notice/insert.tiles";
	}
	
	@RequestMapping(value = "/notice/write.do")
	public String write(NoticeVO noticeVO) throws Exception {
		
		// 등록
		int result = noticeService.writeNotice(noticeVO);
		if (result > 0) {
			return "redirect:/notice.do";
		} else {
			return "redirect:/notice/insert.do";
		}
		
	}
	
	@RequestMapping(value = "/notice/update.do")
	public String update(NoticeVO noticeVO, @RequestParam("noticeId") int noticeId, ModelMap model) throws Exception {
		
		// 상세 조회
		EgovMap resultView = noticeService.selectNoticeView(noticeId);
		model.addAttribute("resultView", resultView);
		
		if (resultView.isEmpty() || resultView == null) {
			return "redirect:/notice.do";
		}
		
		return "notice/update.tiles";
	}
	
	@RequestMapping(value = "/notice/edit.do")
	public String edit(NoticeVO noticeVO) throws Exception {
		
		// 수정
		int result = noticeService.updateNotice(noticeVO);
		if (result > 0) {
			return "redirect:/notice.do";
		} else {
			return "redirect:/notice/update.do";
		}
		
	}
	
	@RequestMapping(value = "/notice/delete.do")
	public String delete(@RequestParam("noticeId") int noticeId) throws Exception {

		int result = noticeService.deleteNotice(noticeId);
		if (result > 0) {
			return "redirect:/notice.do";
		} else {
			return "redirect:/notice/view.do";
		}
	}
		
}
