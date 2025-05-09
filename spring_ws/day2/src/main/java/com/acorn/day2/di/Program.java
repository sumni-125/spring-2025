package com.acorn.day2.di;

public class Program {
	
	
	Calculator calculator;
	
	void addNumber(int su1, int su2) {
		int result = calculator.add(su1, su2);
		System.out.println(result);
	}

	public Program(Calculator calculator) {
		super();
		this.calculator = calculator;
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	public Program() {
		// TODO Auto-generated constructor stub
	}
	
}
