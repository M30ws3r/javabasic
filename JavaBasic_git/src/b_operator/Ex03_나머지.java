package b_operator;

import java.util.Scanner;

public class Ex03_나머지 {

	public static void main(String[] args) {
		// 나머지 연산자 활용 : 홀/짝수 구할 때
		int a = 11;
		
		if(a%2 ==0) {
			System.out.println("짝수");
		}else{
			System.out.println("홀수");
		}
		System.out.print("\n");
		// ----------------------------------
		// 숫자 하나는 입력받아 해당하는 숫자가 3의 배수인지 여부 출력
		
		int i;
		Scanner input = new Scanner(System.in);
		//입력을 받기 위한 통로 선언
		System.out.print("숫자입력-> ");
		i = input.nextInt();
		
		if(i%3 ==0){
			System.out.println("3의 배수");
		}else{
			System.out.println("3의 배수 아님");
		}
	}
}