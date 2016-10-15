package lzw.test;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lzw.service.UserSrv;

/**
 * Servlet implementation class loginServlet
 */
//@WebServlet("/myServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
   	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   		super.doGet(req, resp);
   		doPost(req, resp);
    }
    /**
   	 * ��дdoPost����
   	 * req ������󣬽���������ݷ�װ�ɵĶ���
   	 * resp ��Ӧ���󣬽�Ҫ���ظ�����������ݷ�װ�Ķ���
   	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		String userLoginName = req.getParameter("userLoginName");
		String userPswd = req.getParameter("userPwd");
		System.out.println(userLoginName + " " + userPswd);

		PrintWriter out = resp.getWriter();
		String result = "<html><head><meta charset=\"UTF-8\"></head><body>";
		UserSrv userSrv = new UserSrv();
		if (userSrv.checkPwd(userLoginName, userPswd)) {
			result += "<h2>Login successful!\n</h2>";
		} else {
			result += "��¼ʧ�ܣ���<a href = \"login.html\">���µ�¼</a>����<a  href = \"login.html\">ע��</a>\n";
		}
		result += "</body></html>";
		out.write(result);
		out.flush();
		out.close();
	}
   

}
