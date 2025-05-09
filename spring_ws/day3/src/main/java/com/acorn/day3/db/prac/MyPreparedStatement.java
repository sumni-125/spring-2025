package com.acorn.day3.db.prac;

public class MyPreparedStatement implements MyAutoCloseable {

	@Override
	public void close() {
		System.out.println("PreparedStatement객체 close 하기");
		
	}

}
