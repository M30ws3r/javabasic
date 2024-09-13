package b_operator;

import java.util.Scanner;

/*
 * 	산술연산자 : + - * / %
 * 
 */

public class Ex03_산술 {

	public static void main(String[] args) {
		
		int i, j;
		Scanner input = new Scanner(System.in);
		//입력을 받기 위한 통로 선언
		System.out.print("첫번째숫자입력-> ");
		i = input.nextInt();
		System.out.print("두번째숫자입력-> ");
		j = input.nextInt();
		System.out.println();
		
		int sum = i+j, min = i-j, mul = i*j, div = i/j, left = i%j;
		
		System.out.println("더하기 : " + sum);
		System.out.println("빼기 : " + min);
		System.out.println("곱하기 : " + mul);
		System.out.println("나누기 : " + div);
		System.out.println("나머지는 : " + left);
	}
}

/*[콘솔창에서]
 * 
 * 첫번째숫자입력-> __ (ex) 20
 * 두번째숫자입력-> __ (ex) 15
 * 
 * 더하기 : 35
 * 뺴기 : 5
 * 곱하기 : 300
 * 나누기 : 1
 * 나머지는 : 5
 */
