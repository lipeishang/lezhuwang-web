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
   	 * 重写doPost方法
   	 * req 请求对象，将请求的数据封装成的对象
   	 * resp 响应对象，将要返回给浏览器的数据封装的对象
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
			result += "登录失败，请<a href = \"login.html\">重新登录</a>或者<a  href = \"login.html\">注册</a>\n";
		}
		result += "</body></html>";
		out.write(result);
		out.flush();
		out.close();
	}
   

}
