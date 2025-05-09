package com.acorn.day3.db.prac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.function.Consumer;

public class DBTEST2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		String driver = "oracle.jdbc.driver.OracleDriver" ;
		String url="jdbc:oracle:thin:@localhost:1521:testdb";
		String user="scott";
		String password="tiger";
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, user, password);
		
		if(con!=null) System.out.println("db ok");
		System.out.println("------------------");
		//sql작성
		String sql = "select * from member_tbl_11";
		PreparedStatement pst = con.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		
		ArrayList<Member> list = new ArrayList<Member>();
		
		while(rs.next()) {
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
			
			Member m = new Member(rs.getString(1), rs.getString(2),rs.getString(3), rs.getString(4));
			
			list.add(m);
			
		}
		System.out.println("------------------");
		//ArrayList<Member>
	
		//
		list.forEach((item)->{System.out.println(item);});
		System.out.println("------------------");
		list.forEach(System.out::println);//메서드참조문법: 람다식을 더 줄여서 표현
		System.out.println("------------------");
		list.forEach(new Consumer<Member>() {

			@Override
			public void accept(Member t) {
				System.out.println(t);
				
			}
			
		});
		
	}

}
