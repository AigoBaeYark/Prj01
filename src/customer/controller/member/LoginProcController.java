package customer.controller.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import customer.controller.Controller;
import customer.dao.MemberDao;
import customer.vo.Member;

public class LoginProcController implements Controller{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("LoginProcController.doooooooooo");
		
		//loginForm.jsp 에서 보낸 id, password 받기
		String uid = request.getParameter("id");
		String pass = request.getParameter("password");
		System.out.println(uid+" , "+pass);
		
		MemberDao dao = new MemberDao();
		Member m = dao.getMember(uid);
		
		if(m==null) {
			request.setAttribute("error", "아이디틀림");
			request.getRequestDispatcher("loginForm.jsp").forward(request, response);
			
		}else if(!m.getPwd().equals(pass)) {
			request.setAttribute("error", "비밀번호 틀림");
			request.getRequestDispatcher("loginForm.jsp").forward(request, response);

		}else {	//로그인 성공
			//아이디를 세션에 담기, notice.do 진행
			request.getSession().setAttribute("uid", uid);
			response.sendRedirect("../customer/notice.do");
			
		}
		
		System.out.println("m.id : " + m.getPwd());
		
		request.getRequestDispatcher("loginForm.jsp").forward(request, response);
		
	}
	
}
