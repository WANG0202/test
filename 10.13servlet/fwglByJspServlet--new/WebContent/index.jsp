<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.chinasofti.bean.Users"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--jsp注释 --%>
<!-- html注释 -->

	<%
	  //jsp内置对象
	  Users u=(Users)session.getAttribute("users");
	
	%>
    欢迎  <%=u.getNickName() %> 登录
<br/>
    <ul>
       <li><a href="PreInsertFwinfo">添加房屋</a></li>
       <li><a href="SelectAllFwinfo">查看房屋列表</a></li>
       <li><a href="SelectAllByPageFwinfo">查看房屋列表--分页显示</a></li>
       <li><a href="SelectAllFwType">查看房屋类型列表</a></li>
    </ul>

</body>
</html>