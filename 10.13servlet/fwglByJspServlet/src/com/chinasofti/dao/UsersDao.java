package com.chinasofti.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.chinasofti.bean.Users;

public class UsersDao extends BaseDao{
	
	
	
	
	public Users selectById(String loginId) throws Exception {
		Users u=null;
		Connection conn = this.getConn();
		
		String sql="select * from users where loginid=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, loginId);
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			u=new Users();
			u.setLoginId(rs.getString(1));
			u.setLoginPwd(rs.getString(2));
			u.setNickName(rs.getString(3));
			u.setTel(rs.getString(4));
			u.setPic(rs.getString(5));
			
		}
		
		return u;
	}
	
	
	

}
