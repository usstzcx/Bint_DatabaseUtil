package com.bint.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bint.data.DataSource;
import com.bint.db.DBConnection;
/**
 * 表的数据访问层实现类
 * @author  linhongbin
 * @data:  2015年2月12日 上午10:50:50
 * @version:  V1.0
 */
public class TableDaoBaseImpl {
	public DBConnection dbCon = null;
	public PreparedStatement pstmt = null;
	public Connection conn = null;
	public DataSource dataSource;
	
	public TableDaoBaseImpl(DataSource dataSource) {
		try {
			this.dataSource = dataSource;
			dbCon = new DBConnection(dataSource);
		} catch (Exception e) {
			e.printStackTrace();
		}
		conn = this.dbCon.getConnection();
	}
}
