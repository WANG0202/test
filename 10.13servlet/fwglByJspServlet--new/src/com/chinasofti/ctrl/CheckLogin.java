package com.chinasofti.ctrl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chinasofti.bean.Users;
import com.chinasofti.dao.UsersDao;

/**
 * Servlet implementation class CheckLogin
 */
public class CheckLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1
		request.setCharacterEncoding("utf-8");
		
		String userid=request.getParameter("userid");
		String userpwd=request.getParameter("userpwd");
		System.out.println(userid+"   "+userpwd);

		//2 dao
		UsersDao usersDao=new UsersDao();
		try {
			Users users=usersDao.selectById(userid);
			if(users!=null&&users.getLoginPwd().equals(userpwd)) {//登录成功
				
				String auto=request.getParameter("auto");
				if(auto!=null&&auto.equals("xuan")) {//勾选了复选框
					//存cookie
					Cookie c=new Cookie("userid",userid);
					c.setMaxAge(60);
					response.addCookie(c);
				}
				//将用户信息存入session
				HttpSession session = request.getSession();
				session.setAttribute("users", users);
				
				response.sendRedirect("index.jsp");
			}else {//登录失败
				//response.sendRedirect("login.html");
				//请求转发
				
				//1 获取请求转发器对象  参数--跳转的页面
				RequestDispatcher dispatcher=request.getRequestDispatcher("login.html");
				//2 调用forward方法
				dispatcher.forward(request, response);
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
