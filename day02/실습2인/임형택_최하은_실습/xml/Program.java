package lhtchePrac;

public class Program {
	Calculator calculator;
	
	public Program() {
		// TODO Auto-generated constructor stub
	}
	
	public Program(Calculator calculator) {
		super();
		this.calculator = calculator;
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	void addNumber(int su1, int su2) {
		
		int result = calculator.add(su1, su2);
		System.out.println(su1 + "+" + su2 + "=" + result + "입니다");
		
	}
	
	void minusNumber(int su1, int su2) {
		
		int result = calculator.minus(su1, su2);
		System.out.println(su1 + "-" + su2 + "=" + result + "입니다");
		
	}
	
	void multiplyNumber(int su1, int su2) {
		
		int result = calculator.multiply(su1, su2);
		System.out.println(su1 + "*" + su2 + "=" + result + "입니다");
		
	}
	
	void divideNumber(int su1, int su2) {
		
		int result = calculator.divide(su1, su2);
		System.out.println(su1 + "/" + su2 + "=" + result + "입니다");
		
	}
	
	
}
