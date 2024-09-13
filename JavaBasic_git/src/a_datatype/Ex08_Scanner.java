package a_datatype;

/*
 * 자바에서 콘솔 입력받는 방법
 * 
 * 	- java.util.Scanner (java폴더 안)(util 폴더 안)(Scanner 클래스) 존재
 * 
 * 	- 정수형입력시 : nextInt()
 * 	- 실수형입력시 : nextDouble()
 * 	- 문자열입력시 : next() / nextline()  ***[숙제] 차이점??
 * 
 * nextLine()메소드는 Enter를 치기 전까지 쓴 문자열을 모두 리턴.
 * next() 메소드는 Space(공백) 전까지 입력받은 문자열을 리턴한다는 것이다.

공백이 있는 한줄을 리턴받고 싶으면 nextLine(),
한 단어만 리턴받고 싶으면 next().
 */

//기존 다른 패키지 폴더로부터 끌어오려면은 클래스보다 앞의 줄에서 선언해줘야 함
// [참조] 자주사용하는 기본적인 클래스는 
//

import java.util.Scanner;
//java.util.*; 전부쓸께!!

public class Ex08_Scanner {

	public static void main(String[] args) {
		int kor, eng, math;
		//사용자로부터 입력 받을거심!!
		//자동 import; Ctrl + Shift + 영문자 O
		Scanner input = new Scanner(System.in);
		//입력을 받기 위한 통로 선언
		System.out.print("국어점수입력> ");
		kor = input.nextInt();
		
		// 영어점수입력받기, 수학점수입력받기, 출력
		System.out.print("영어점수입력> ");
		eng = input.nextInt();
		System.out.print("수학점수입력> ");
		math = input.nextInt();
		
		//총점 구해서 출력
		//평균 구해서 출력
		int sum = kor + eng + math;
		double avg = (kor + eng + math)/3.0;
		
		
		System.out.println("국어: "+kor);
		System.out.println("영어: "+eng);
		System.out.println("수학: "+math);
		System.out.println("총점: "+sum);
		System.out.println("평균: "+avg);
		
	}
}
