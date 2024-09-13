package a_datatype;

// ->한 줄 주석
/* 여러줄 주석 */ 

public class Ex01_Naming {

	public static void main(String[] args) {
		//문자형 변수 ch 선언하기
 		char ch;
 		
 		// 정수형 변수 abcdef 선언하기
		int abcdef;
		  
		//실수형 변수
		double f;
		 
		//논리형 변수
		boolean flag;
		
	/*
	 [변수] 메모리상에 값을 저장하기 위한 공간
	 
	 	자료형(datatype) 변수명;
	 	*자료형
	 		[1] 기본형
	 			논리형 : boolean	(True, False)
	 			문자형 : char 	(String 과 chr 의 차이점)
	 			정수형 : int		(int / byte byte 1.000001 lim 개념이었다면 int는 0101)
	 			실수형 : double	(+float도 있지만, double 사용함...)
	 			
	 		[2] 참조형 : 배열 / 클래스
	 	*변수명 규칙 - 안지키면 error
	 		1- 문자, 숫자, _, $ 조합
	 		2- 숫자가 첫글자이면 안됨
	 		3- 길이제한 없음
			4- 대소문구별
	 		5- 키워드 사용안됨
	 		
	 		[권장사항](전세계 개발자들이 함께 쓰자는 문법)
	 		1-클래스명은 대문자시작
	 		2-변수명은 소문자시작
	 		3-패키지명은 전부다 소문자
	 		4-낙타표기법(camel-case)
	 			'원을그리는클래스	: DrawCircle
	 			'원을그리는변수		: drawCircle
	 		
	 		//문자형 변수 ch 선언하기
	 		char ch;
	 		char ch1;
	 		char ch_test;
	 		char ch_$
	 		char CH;
	 		
	 		//char 2ch; // 에러발생
	 		 char  abstract;
	 		 법칙만 제대로 지킨다면 이름 마음대로 줄 수 있음
	*/  
     System.out.println(3 + "+" + 5 + "=" + 8);
	
	}
}
