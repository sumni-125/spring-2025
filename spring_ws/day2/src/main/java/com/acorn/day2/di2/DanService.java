package com.acorn.day2.di2;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

//단 정보 제공

@Component//객체생성어노테이션
public class DanService {
	public ArrayList<String> getDan(){
		
		ArrayList<String> dan2 = new ArrayList<String>();
		
		int dan = 2;
		
		for(int i=1;i<=9;i++) {
			dan2.add(dan+" * "+i+" = "+i*dan);
		}
		
		return dan2;
	}
}
