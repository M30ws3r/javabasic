package a_datatype;

/*
 * [참고] 자료형
 * 
 *  1. 기본형
 *  	'논리형 : boolean
 *  
 *  	'문자형 : char(2Byte)
 *  
 *  	'정수형 : (byte(1B), short(2B)), int(4B), long(8B)
 *  
 *  	'실수형 : float(4B), double(8B) - double 이 더 커서 long-double 상호교환 X
 *  
 *  20. 참조형 : 배열, 클래스
 *  
 *  
 *  [기본]
 *  	 변수의 자료형과 값의 자료형이 일치
 *  
 *  [참고]
 *  	 변수의 자료형과 값의 자료형이 안 맞는 경우
 *  
 *  	 '변수의 자료형 > 값의 자료형 자동해결 (메모리 낭비만 되고 문제 음슴)
 *  	 '변수의 자료형 < 값의 자료형 자료형 변경(casting)
*/

public class Ex04_Casting {

	public static void main(String[] args) {
	
		//float f = 3.6; 에러발생. float 쓰면 안됨. 
		//f = (float)3.6; //강제변환 (casting)
		//System.out.println("f="+f);
		
		double d;		//8B
		d = 100;		//공간(8B) = 4B값
		System.out.println("d="+d);
		
		int i; //정수형 변수 i에 36.99 실수 대입 후 출력
		i = (int)36.99;
		System.out.println("i="+i);
		
		int su;
		//su = 10000000000;
		
		long big;
		big = 10000000000L;
		System.out.println("큰수="+big);
		
	}
}
