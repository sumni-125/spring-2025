package com.acorn.day2.di;

import java.util.Scanner;

public class ProgramMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int su1 = sc.nextInt();
		int su2 = sc.nextInt();
		
		//ㄱㅖ산기 객체 생성하기
		Calculator cal = new AcornCalculator();
		
		//생성자 주입
//		Program p = new Program(cal);
//		p.addNumber(su1, su2);
		
		Program p = new Program(cal);
		p.setCalculator(cal);
		p.addNumber(su1, su2);
		
	}

}
