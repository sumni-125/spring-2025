package com.acorn.prac2.실습2인;

import org.springframework.stereotype.Component;

@Component //객체 생성
public class CalcService {
	
	public int add(int su1, int su2) {
		int add = su1 + su2;
		return add;
	}
	
	public int minus(int su1, int su2) {
		int minus = su1 - su2;
		return minus;
	}
	
	public int multiply(int su1, int su2) {
		int multiply = su1 * su2;
		return multiply;
	}
	
	public int divide(int su1, int su2) {
		int divide = su1 / su2;
		return divide;
	}
	
}
