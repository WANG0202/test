package com.chinasofti.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDao {
	private Connection conn;
	
	public Connection getConn() throws Exception {
		if(conn==null) {
			//1 加载jdbc驱动
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2 建立数据库连接
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
		}
		return conn;
		
	}
	
	public void closeConn() throws Exception {
		if(conn!=null) {
			conn.close();
		}
	}

}
