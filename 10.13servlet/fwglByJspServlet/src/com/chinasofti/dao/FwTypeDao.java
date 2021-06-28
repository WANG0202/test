package com.chinasofti.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chinasofti.bean.FwType;

public class FwTypeDao extends BaseDao {

	public List<FwType> selectAll() throws Exception, SQLException{
		List<FwType> list=new ArrayList<FwType>();
		Connection conn = this.getConn();
		String sql="select * from fwtype";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			FwType type=new FwType();
			type.setTypeId(rs.getInt(1));
			type.setTypeName(rs.getString(2));
			list.add(type);
		}
		return list;
		
	}
}
