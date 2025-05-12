package com.acon.prac4;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Member {
	String id;
	String pw;
	String name;
	
	public Member() {
		
	}
}
