package com.acorn.day3.db.prac;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data	//롬북연결됨
public class Member {
	
	String id;
	String pw;
	String name;
	String tel;
	
	
}
