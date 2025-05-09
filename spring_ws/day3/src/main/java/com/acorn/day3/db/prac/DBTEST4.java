package com.acorn.day3.db.prac;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DBTEST4 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		ApplicationContext ac = new GenericXmlApplicationContext("file:src/main/webapp/WEB-INF/spring/**/root-context.xml");
		
		DataSource ds = ac.getBean(DataSource.class);
		//DataSource ds1 =(DataSource) ac.getBean(DriverManagerDataSource.class);
		
		Connection con = ds.getConnection();
		String sql = "select * from member_tbl_11";
		
		PreparedStatement pst = con.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		
		while(rs.next()) {
			System.out.print(rs.getString(1));
			System.out.print(rs.getString(2));
			System.out.print(rs.getString(3));
			System.out.println(rs.getString(4));
		}
		
		
	}

}
