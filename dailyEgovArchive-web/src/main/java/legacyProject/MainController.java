package legacyProject;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@Resource(name="sqlSessionTemplate")
    private SqlSessionTemplate sqlSession;
	
	/**
	 * 메인화면
	 * 
	 * @return
	 */
	@RequestMapping(value = "/main.do")
	public String main() {
		return "legacyProject/main";
	}

	/**
	 * DB연결 테스트
	 * 
	 * @return
	 */
    @RequestMapping(value = "/dbCheck.do")
    @ResponseBody
    public String dbCheck() {
    	try {
            Integer one = sqlSession.selectOne("TestMapper.test");
            return "DB OK: " + one;
        } catch (Exception e) {
            e.printStackTrace(); // 콘솔에 스택트레이스 강제 출력
            return "DB FAIL: " + e.getClass().getName() + "\n" + e.getMessage();
        }
    }
}
