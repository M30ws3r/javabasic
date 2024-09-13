package c_exercise;

import java.util.Scanner;

public class CalculatorTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char ch=0;
		CalculatorExpr cal = new CalculatorExpr();
		
		do{
			System.out.print("첫번째 숫자 입력:");
			//cal.num1=sc.nextInt();
			//private이라서 손대지 못 함. get/set 써야.
			cal.setNum1(sc.nextInt());
			System.out.print("두번째 숫자 입력:");
			cal.setNum2(sc.nextInt());
			sc.close();
		
			System.out.println("추출된 숫자:"+cal.getNum1()+","+cal.getNum2());
			System.out.println("덧셈:"+cal.getAddition());
			System.out.println("뺄셈:"+cal.getSubtraction());
			System.out.println("곱셈:"+cal.getMultiplication());
			System.out.println("나눗셈:"+cal.getDivision());
			System.out.println("계속 진행하시겠습니까? Y/N");
			ch = sc.next().charAt(0);
		}while(ch=='Y' | ch=='y');
		sc.close();	
	}
}
