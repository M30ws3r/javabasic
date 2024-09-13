package c_control;

import java.util.Scanner;
import java.util.StringTokenizer;

public class 연습연습_0905 {

	public static void main(String[] args) {
		//0905 카페 예시문제 4가지
		Scanner sc = new Scanner(System.in);
		//[문제1]n 입력받아 출력예시와 같은 프로그램 작성
//		System.out.print("숫자 n 입력: ");
//		int n = sc.nextInt();
//		int n1 = 1;
//		for(int i=0; i<n; i++){
//			for(int j=0; j<i; j++){
//				System.out.print(" ");
//			}
//			for(int k=n; k>i; k--){
//				System.out.print(n1);
//				n1++;
//				}
//			System.out.println();
//			}
			
		//[문제2]m(m<=6) 입력받아 출력예시와 같은 프로그램 작성
//		System.out.print("숫자 m 입력: ");
//		int m = sc.nextInt();
//		int m1 = 0;
//		char a = 'A';
//		for(int i=0; i<m; i++) {
//			for(int j=m; j>i; j--){
//				System.out.print(a);
//				a++;
//			}for(int j=0; j<i; j++){
//				System.out.print(m1);
//				m1++;
//			}
//			System.out.println();
//		}
		
//		//[문제3]N(1~9)을 입력받아 출력예시와 같은 프로그램 작성
//		System.out.print("숫자 N 입력: ");
//		int N=sc.nextInt();
//		int a=1;
//		for(int i=0; i<N; i++){
//			for(int j=1; j<=N; j++){
//				if(a<10){
//					System.out.print(a);
//					a+=2;
//				}else{
//					a=1;
//					System.out.print(a);
//					a+=2;
//				}
//			}
//			System.out.println();
//			}
		
		//[문제4]2~9까지 2개를 입력받아 구구단 출력하는 프로그램 작성
		System.out.print("구구단 시작: ");
		int sta = sc.nextInt();
		System.out.print("구구단 끝: ");
		int end = sc.nextInt();
		for(int i=1; i<10; i++){
			for(int j=sta; j<=end; j++){
				System.out.printf("%2d * %2d = %2d   ",j,i,j*i);
			}
			System.out.println();
		}
	}//main
}//class
