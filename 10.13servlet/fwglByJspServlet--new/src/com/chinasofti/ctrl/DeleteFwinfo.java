package com.chinasofti.ctrl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chinasofti.dao.FwInfoDao;

/**
 * Servlet implementation class DeleteFwinfo
 */
public class DeleteFwinfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteFwinfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取删除数据的id--dao delete--跳转
		String fwidStr = request.getParameter("fwid");
		int fwid=Integer.parseInt(fwidStr);
		System.out.println(fwid);
		
		FwInfoDao fwDao=new FwInfoDao();
		fwDao.delete(fwid);
		// 列表页   servlet
		response.sendRedirect("SelectAllByPageFwinfo");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
