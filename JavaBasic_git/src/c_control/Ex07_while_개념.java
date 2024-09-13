package c_control;

import java.util.Scanner;

/*
 * 반복문
 *		- for 문
 * 		- while 문
 * 		- do~ while문
 * 
 * 		for(초기값;조건문;증가치){
 * 			반목문장;
 * 		}
 * 
 * 		초기치;
 * 		while(조건문){
 * 			반복문장;
 * 			증가치;
 * 		}
 */

public class Ex07_while_개념 {

	public static void main(String[] args) {
		
//		int sum = 0;
//		for(int i=1; i<=10; i++) {
//			sum += i;
//		}//end of for -i
//		System.out.println("합: "+sum);  //for문
//
//		int sum = 0;
//		int i=1;	//초기값 본래 위치
//		while(i<=10){
//			sum += i;
//			i++;	//증가값 본래 위치
//		}//end of for -i
//		System.out.println("합: "+sum);	//while 문
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력: ");
		int dan = sc.nextInt();
			// [ex] 2 * 1 = 2
			//
			//		2 * 9 = 18
		int i=1;
		for(i=1; i<=9; i++){
			System.out.printf(" %d * %d = %d \n",dan,i,dan*i);			
		}//구구단 for문
		
		while(i<=9){
			System.out.printf(" %d * %d = %d \n",dan,i,dan*i);
			i++;
		}//구구단 while문
	}//end of main
}//end of class
