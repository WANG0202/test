<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,com.chinasofti.bean.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
     <form action="/fwglByJspServlet/InsertFwinfo" method="post">
	  房屋标题： <input type="text" name="title"/><br/>
	    房屋价格：<input type="text" name="price"/><br/>
	 房屋类型：<select name="typeId">
	 <%
	 	List<FwType> tlist=(List<FwType>)request.getAttribute("typeList");
	 	for(FwType type:tlist){
%>
			<option value="<%=type.getTypeId()%>"><%=type.getTypeName() %></option>
<% 	 		
	 	}
	 %>
	 </select> 
	 房屋面积：<input type="text" name="area"/><br/>
	  房屋地址：<input type="text" name="address"/><br/>
	   
	    
	    
	    
	    <input type="submit" value="提交"/>
	</form>

</body>
</html>