package com.chinasofti.ctrl;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chinasofti.bean.FwInfo;
import com.chinasofti.dao.FwInfoDao;

/**
 * Servlet implementation class SelectAllByPageFwinfo
 */
public class SelectAllByPageFwinfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectAllByPageFwinfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取当前的页码（1或用户传递）
		String pageStr=request.getParameter("page");
		
		int page;
		if(pageStr==null) {//用户没传递page
			page=1;
		}else {
			page=Integer.parseInt(pageStr);
		}	
		
		//定义一个size
		int size=3;
		//dao 分页方法 list
		FwInfoDao fwDao=new FwInfoDao();
		try {
			List<FwInfo> fwList = fwDao.selectAllByPage(page, size);		
			//dao 总记录数
			int count=fwDao.getCount();
			//计算总页数
			int totalPage=count/size;
			if(count%size!=0) {
				totalPage++;
			}
			//list存入request
			//当前页码存入request
			//总页数存入request
			request.setAttribute("fwList", fwList);
			request.setAttribute("curPage", page);
			request.setAttribute("total", totalPage);
			
			//请求转发跳转
			request.getRequestDispatcher("fwListByPage.jsp").forward(request, response);
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
