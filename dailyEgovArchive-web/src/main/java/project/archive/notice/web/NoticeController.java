package project.archive.notice.web;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.egovframe.rte.psl.dataaccess.util.EgovMap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import project.archive.notice.service.NoticeService;

@Controller
public class NoticeController {

	@Resource(name="noticeService")
	private NoticeService noticeService;
	
	@RequestMapping(value = "/notice.do")
	public String list(ModelMap model) throws Exception {
		
		List<EgovMap> resultList = new ArrayList<>();
		resultList = noticeService.selectNoticeList();
		
		model.addAttribute("resultList", resultList);
		
		return "notice/list";
	}
	
}
