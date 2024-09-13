package c_control;

import java.util.Scanner;

public class Ex06_for중첩_숫자사각형 {

	public static void main(String[] args) {
		/*
		 * 문제) 행과 열의 수를 입력받아 다음과 같이 출력하는 프로그램을 작성하시오
			
			입력
			3 4
			
			출력
			1 2 3 4 
			2 4 6 8
			3 6 9 12
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 2개 입력->");
		int row = sc.nextInt();
		int col = sc.nextInt();
//		
//		for(int i=0;i<row;i++){
//			for(int j=0;j<col;j++) {
//				System.out.print((j+1)*(i+1));				
//			}
//			System.out.println();
//		} //내가 놓은 답
		
		/*
		int su =1;
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(su+" ");
				su++;
			}
			System.out.println();
		}//따로 int 변수 su를 따로 밖에서 지정하는 경우
		
		for(int i=0,su=1;i<row;i++){
			for(int j=0;j<col;j++,su++){
				System.out.print(su+" ");
				su++;
			}
			System.out.println();
		}//따로 int 변수 su를 for문 안에서 지정하는 경우 */
		
		//-----네이버카페 문제-----------------------		
		//정을 1303
//		for(int i=1;i<=row;i++){
//			for(int j=1;j<=col;j++) {
//				System.out.print((j)*(i)+" ");				
//			}
//			System.out.println();
//		}
		//정을 1304 - 숫자 하나만 입력하는거심
//		System.out.print("숫자 입력->");
//		int a = sc.nextInt();
//		for(int i=1;i<=a;i++){
//			for(int j=0;j<=a*3;j+=4) {
//				System.out.print((i)+(j)+" ");				
//			}
//			System.out.println();
//		}
//결과;	숫자 입력->4
//		1 5 9 13 
//		2 6 10 14 
//		3 7 11 15 
//		4 8 12 16 

		//정을 1856
		for(int i=0;i<row;i++){  		//col 4
			if(i%2==0){
				for(int j=0;j<col;j++){		//col 5
					System.out.print((j+1)*(i+1)+" ");
				}				
			}else{
				for(int j=col-1;j>=0;j--){
					System.out.print((j+1)*(i+1)+" ");
				}
			}System.out.println();
		}
	}
}
