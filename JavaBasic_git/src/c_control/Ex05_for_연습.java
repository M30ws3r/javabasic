package c_control;

import java.util.Scanner;

public class Ex05_for_연습 {

	public static void main(String[] args) {
/*
 * 문제 1)1~ N까지의 숫자를 다음처럼 출력하라
	1 2 3 4 5 
	6 7 8 9 10
	11 12 13 14 15
 */
//		int N=15;
//		String a = "0";
//		for(int i=1; i<=15; i++) {
//			System.out.print(i+" ");
//			if(i%5==0) {
//				System.out.println();
//			}
//		}
/*
 * 문제2)  문자열처리하기 
문자 N(a~z, A~Z)를 입력받아 N이 소문자면 a부터 N까지 인쇄하고 
N이 대문자이면 문자 N부터  Z까지 출력하라 
그 밖의 문자가 입력되면 Error 를 출력하라 
	
입력  출력
f    abcdef
X    XYZ
6    Error 
 */	
		Scanner sc = new Scanner(System.in);
//		System.out.print("문자 입력: ");
//		char ch =sc.next().charAt(0);
//		// 소문자인지 여부
//		if(ch>='a' & ch<='z'){
//			for(char i='a'; i<=ch; i++) {
//				System.out.print(i);
//			}
//		}else if(ch>='A' & ch<='Z'){
//			for(char i='Z'; i>=ch; i--){
//				System.out.print(i);
//			}
//		}else{
//			System.out.print("Error");
//		}System.out.println();

/*
 * 문제3 ) 입력받은 문자열의 뒤집어서 출력하세요
 	[예]  입력 -> 출력

  안녕 친구  -> 구친 녕안
  CarpeDiem  -> meiDepraC
 [힌트] 문자열의 길이 구할 때   length() 이용		
 */
		System.out.print("문자열 입력: ");
		String a = sc.nextLine();
		System.out.println(a.length());
		for(int i=a.length()-1; i>=0; i--) {
			System.out.print(a.charAt(i));
		}
	}
}