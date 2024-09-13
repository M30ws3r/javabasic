package Examples;

import java.util.Scanner;

public class Ex그냥_1분컷하기 {

	public static void main(String[] args) {
		int a;
		Scanner input = new Scanner(System.in);
		System.out.print("숫자를 넣으세요: ");
		a = input.nextInt();
		
		if(a%77==0){
			System.out.println("77 배수!");
		}else {
			System.out.println("77 배수 아님!");
		}
	}
}
