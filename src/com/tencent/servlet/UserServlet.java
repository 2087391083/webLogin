package com.tencent.servlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserServlet  {
	public int doLogin(String u_name,String u_pwd){
		int count=0;
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet result=null;
		conn=DbUtils.getConnection();
		try {
			String sql="select count(1) from user where u_name=? and u_pwd=?";
			pst=DbUtils.getPreparedStatement(conn, sql);
			pst.setString(1, u_name);
			pst.setString(2,u_pwd);
			result=pst.executeQuery();
			while(result.next()){
				count=result.getInt(1);
			}
		} catch (Exception e) {
		}finally{
			DbUtils.closeAll(conn,pst,result);
		}
		return count;
	}
}
