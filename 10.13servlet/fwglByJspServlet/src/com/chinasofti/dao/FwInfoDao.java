package com.chinasofti.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.chinasofti.bean.FwInfo;
import com.chinasofti.bean.FwType;

public class FwInfoDao extends BaseDao{
	
	public List<FwInfo> selectAll() throws Exception{  
		List<FwInfo> list=new ArrayList<FwInfo>();
		Connection conn = this.getConn();
		String sql;
		sql="select fwinfo.*,fwtype.typename from fwinfo,fwtype where fwinfo.typeid=fwtype.typeid";
		PreparedStatement ps=conn.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()){
			FwInfo ff=new FwInfo();
			ff.setFwId(rs.getInt("fwid"));
			ff.setTitle(rs.getString("title"));
			ff.setAddress(rs.getString("address"));
			ff.setArea(rs.getDouble("area"));
			ff.setPrice(rs.getInt("price"));
			ff.setLoginId(rs.getString("loginid"));
			
			int typeId=rs.getInt("typeId");
			String typeName=rs.getString("typeName");
			FwType type=new FwType();
			type.setTypeId(typeId);
			type.setTypeName(typeName);
			ff.setType(type);
			
			list.add(ff);
		}
		
		
		
		return list;
	}

}
