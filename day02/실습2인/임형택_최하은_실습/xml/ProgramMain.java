package lhtchePrac;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class ProgramMain {

	public static void main(String[] args) {
		
		ApplicationContext ac = new GenericXmlApplicationContext("lhtchePrac/setting.xml");
		
		Program p = ac.getBean(Program.class);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력해주세요.");
		int su1 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("두번째 숫자를 입력해주세요.");
		int su2 = sc.nextInt();
		sc.nextLine();
		
		
		while(true) {
			System.out.println("연산기호를 입력해주세요. ( +, -, *, / )");
			String go = sc.nextLine();
			if(go.equals("+")) {
				p.addNumber(su1, su2);
				break;
			}else if(go.equals("-")) {
				p.minusNumber(su1, su2);
				break;
			}else if(go.equals("*")) {
				p.multiplyNumber(su1, su2);
				break;
			}else if(go.equals("/")) {
				p.divideNumber(su1, su2);
				break;
			}else {
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			}
		}
	
	}

}
