package HW;

import java.util.Scanner;

public class level3 { //중간값 구하기

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 입력: ");
		int A = sc.nextInt();
		System.out.print("두번째 수 입력: ");
		int B = sc.nextInt();
		System.out.print("세번째 수 입력: ");
		int C = sc.nextInt();
		
		//삼항
		int result = ((A>=B & C>=A)|(B>=A&A>=C))?A:((B>=A&C>=B)|(A>=B&B>=C))?B:C;
		System.out.println(result);
		
		//if-else ... ㅠㅠ
		if(A>=B){
			if(C>=A) {
				System.out.println(A);
			}else if(C>=B){
				System.out.println(C);
			}else System.out.println(B);
		}else if(C>=B){
			System.out.println(B);
		}else if(C>A){
			System.out.println(C);
		}else System.out.println(A);

	}
}

