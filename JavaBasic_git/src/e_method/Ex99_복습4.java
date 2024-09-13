package e_method;

public class Ex99_복습4{

	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.out.println();
		substract(10, 8);
		System.out.println();
		greeting(1);
		System.out.println();
		loopMethod(3);
		System.out.println();
		Circle(5);
		System.out.println();
		square(8,8);

	}
	/*
	 * 1. 정수형 데이터(int) 2개를 매개변수로 받아서 뺄셈 연산을 수행하여 결과값을 반환하는
	 * subtract 메소드를 선언하고, 입력 받은 두 수를 인자로 보내서
	 * 그 메소드를 호출하여 결과값을 출력하는 프로그램을 작성하시오.
	 */
	public static void substract(int a, int b){
		int result = a-b;
		System.out.println(result);
	}

	/*
	 * 2. 정수형 데이터 1개를 매개변수로 받아서 해당되는 문자열(인사말)을 모니터로 출력하는
	 * 메소드 greeting를 선언하고, 입력 받은 정수형 데이터를 인자로 보내서 그 메소드를 호출합니다.
	 * 단, 그 정수 데이터에 따라 다음과 같은 인사말을 출력합니다.
	 * ( 1-안녕하세요, 2-굿모닝, 3-올라, 4-곤니치와 )
	 */

	public static void greeting(int n){
		//switch-case경우
//		switch(n){
//		case 1:System.out.println("안녕하세요"); break;
//		case 2:System.out.println("굿모닝"); break;
//		case 3:System.out.println("올라"); break;
//		case 4:System.out.println("곤니치와"); break;
//		default: System.out.println("Hello"); break;
//		}
		
		if(n==1){
			System.out.println("안녕하세요");
		}else if(n==2) {
			System.out.println("굿모닝");
		}else if(n==3) {
			System.out.println("올라");
		}else if(n==4){
			System.out.println("곤니치와");
		}else{System.out.println("Hello");}
	}
	
	/*3. 반복 출력할 횟수를 매개변수로 받아서 “자바는 맛있다.”라는 문장을 반복하여 출력하는
	 * loopMethod 메소드를 선언하고, 입력 받아 수를 인자로 그 메소드를 호출하는 프로그램을 작성하세요.
	 */
	public static void loopMethod(int x){
		for(int i=0; i<x; i++){
			System.out.println("자바는 맛있다.");
		}
	}

	/*4 실수형 데이터 1개를 매개변수로 받아서 원이 넓이를 계산한 결과값을 반환하는 circle 메소드를
	 *  선언하고, 입력 받은 실수형 데이터를 인자로 넘겨 그 메소드를 호출하여 반환되는 결과를 출력하는
	 *  프로그램을 작성하세요.(단, 음수 데이터는 입력할 수 없습니다.)
	 */

	public static void Circle(double d){
		System.out.println(Math.PI*d*d);
	}
	
	/*5. 정수형 데이터 2개를 매개변수로 받아서 사각형의 넓이를 계산한 결과값을 반환하는
	 * square 메소드를 선언하고, 입력 받은 두 정수 데이터를 인자로 넘겨 그 메소드를
	 * 호출하여 반환값을 출력하는 프로그램을 작성하세요.(단, 음수 데이터는 입력할 수 없습니다.)
	 */
	
	public static void square(int i, int j){
		if(i>0 & j>0){
			System.out.println(i*j);
		}
		else{
			System.out.println(0);
		}
	}
}
