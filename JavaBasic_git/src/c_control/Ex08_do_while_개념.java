package c_control;

import java.util.Scanner;

public class Ex08_do_while_개념 {
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
	* 		초기치;			//while 문은 그냥 실행!
	* 		while(조건문){
	* 			반복문장;
	* 			증가치;
	* 		}
	* 
	* 		초기치;			//do-while문 조건부터 실행!
	* 		do{
	* 			반복문장;
	* 			증가치;
	* 		}while(조건문);
	*/
	public static void main(String[] args){
		
//		int sum = 0;
//		int i=1;
//		while(i<=10){
//			sum += i;
//			i++;
//		}//end of for -i
//		System.out.println("합: "+sum);
		
		//단 수를 입력받아 구구단 출력 (do~while 구문)
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 단?: ");
		int dan = sc.nextInt();
		int i=1;
		do{
			System.out.printf(" %d * %d = %d ", dan, i, dan*i);
			i++;
			System.out.println();
		}while(i<=9);
	}
}
