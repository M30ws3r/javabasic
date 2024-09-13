package b_operator;

import java.util.Scanner;

/*
 * 대입연산자 = 
 * 
 * 		대입연산자 축약 : 산술, 쉬프트, 이진논리
 * 
 * 		a = a+b;		===> a+=b;
 *  	a = a-b;		===> a-=b;
 *  	a = a*b;		===> a*=b;
 *   	a = a/b;		===> a/=b;
 *    	a = a%b;		===> a%=b;
 */

public class Ex10_대입 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a 값: ");
		int a = sc.nextInt();
		System.out.print("b 값: ");
		int b = sc.nextInt();
		int c;  //a+=b 하면 다른 값들도 영향을 끼쳐버리기 때문에 변수 c
		 		//따로 설정하기. 아니면 a+=b 이후 a-=b = 10의 값이 나옴.
		
		c = a+b;
		System.out.println("+= 결과: "+c);
		c = a-b;
		System.out.println("-= 결과: "+c);
		c = a*b;
		System.out.println("*= 결과: "+c);
		c = a/b;
		System.out.println("/= 결과: "+c);
		c = a%b;
		System.out.println("%= 결과: "+c);
	}
}
