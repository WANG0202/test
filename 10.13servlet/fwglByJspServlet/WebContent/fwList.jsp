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
  </tr>

	<%
	   List<FwInfo> list=(List<FwInfo>)request.getAttribute("fwList");
	   for(int i=0;i<list.size();i++){
		   FwInfo fw=list.get(i);
		   //out.print(fw.getPrice());
%>	
       <tr>    
           <td><%=i+1 %></td>
           <td><%=fw.getTitle() %></td>
           <td><%=fw.getPrice() %></td>
           
           <td><%=fw.getType().getTypeName() %></td>
       
       </tr>
       
       
       
<% 	   
		   
	   }
	
	%>

</table>
</body>
</html>