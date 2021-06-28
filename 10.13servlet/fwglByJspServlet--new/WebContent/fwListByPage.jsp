<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,com.chinasofti.bean.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
  <tr>
      <td>编号</td>
      <td>标题</td>
      <td>价格</td>
      <td>类型</td>
      <td>操作</td>
  </tr>

	<%
	   List<FwInfo> list=(List<FwInfo>)request.getAttribute("fwList");
		Integer curPageObj=(Integer)request.getAttribute("curPage");
		int curPage=curPageObj;
		Integer totalObj=(Integer)request.getAttribute("total");
		int total=totalObj;
	
	
	   for(int i=0;i<list.size();i++){
		   FwInfo fw=list.get(i);
		   //out.print(fw.getPrice());
%>	
       <tr>    
           <td><%=i+1 %></td>
           <td><%=fw.getTitle() %></td>
           <td><%=fw.getPrice() %></td>     
           <td><%=fw.getType().getTypeName() %></td> 
           <td>
              <a href="DeleteFwinfo?fwid=<%=fw.getFwId()%>" onclick="return confirm('是否确认删除？')">删除</a>
           </td>     
       </tr>

<% 	      
	   }
	
	%>

</table>

    <a href="SelectAllByPageFwinfo?page=1">首页</a>
    <%
       if(curPage!=1){
%>
<a href="SelectAllByPageFwinfo?page=<%=curPage-1%>">上一页</a>
<%     	   
       }
    %>

	<a href="SelectAllByPageFwinfo?page=<%=curPage+1%>">下一页</a>
	<a href="SelectAllByPageFwinfo?page=<%=total%>">末页</a>


</body>
</html>