package com.acorn.day1prac.실습과제;

import lombok.Data;

@Data
public class Music {
	String title;
	String singer;
	
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}
	
}
