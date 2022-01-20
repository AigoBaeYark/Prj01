package customer.controller.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import customer.controller.Controller;
import customer.dao.MemberDao;
import customer.vo.Member;

public class LoginOutProcController implements Controller{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("LoginOutProcController.doooooooooo");
		
		//로그아웃처리
		request.getSession().invalidate();
		
		response.sendRedirect("../customer/notice.do");
		
	}
	
}
