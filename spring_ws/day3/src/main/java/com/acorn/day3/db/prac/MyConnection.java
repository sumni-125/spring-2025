package com.acorn.day3.db.prac;

public class MyConnection implements MyAutoCloseable {

	@Override
	public void close() {
		System.out.println("Connection객체 close 하기");
		
	}

}
