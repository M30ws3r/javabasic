package HW;

import java.util.Scanner;

public class Level2 { //가장 큰 값 구하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 입력: ");
		int a = sc.nextInt();
		System.out.print("두번째 수 입력: ");
		int b = sc.nextInt();
		System.out.print("세번째 수 입력: ");
		int c = sc.nextInt();
		
		//삼항
		int result = (a>=b)&(a>=c)? a: (b>=a)&(b>=c)? b:c ;
		System.out.println(result);
		
		//else if
		if(a>=b & b>=c){
			System.out.println(a);
		}else if(b>=a & b>=c){
			System.out.println(b);
		}else {
			System.out.println(c);
		}
	}
}
