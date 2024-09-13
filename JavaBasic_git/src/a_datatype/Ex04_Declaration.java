package a_datatype;

public class Ex04_Declaration {

	public static void main(String[] args) {
		/*int kor; //변수선언
		kor=30; // 숫자 저장 변수 kor에 30 대입
		
		초기화  = 변수선언 + 값대입
		int eng =50;
		*/
		
		int kor=30, eng=50;
		//초기화(format) 및 짧게쓰기
		System.out.println("국어:"+kor+", 영어:"+eng);
		System.out.printf("국어:%d, 영어:%d\n", kor, eng);
		//정수 %d 실수 %f 문자열 또는 문장 %s "\n"은 줄나누기
		
		/*
		 * 만약에 국어점수와 영어점수가 동일하니
		 * 그렇다면 "두 점수가 동일"이라고 출력 
		 */
		
		if(kor == eng){
			System.out.println("두 점수가 동일");
		}
		else{
			if(kor > eng){
				System.out.println("국어점수가 영어점수보다 높음");
			}
			else{
				System.out.println("영어점수가 국어점수보다 높음");
			}
		}
		
		//두 점수 맞바꾸기 => 두 변수의 값을 바꾸기
		//kor=30, eng=50
		//[바꾼 후] kor=50, eng=30
		
		int i=kor;	//임시변수 i 선언(잠시 국어점수를 넣어놓을 공간)
		kor=eng;    //영어점수를 '국어'에 넣음
		eng=i; 		//i에 넣어둔 국어점수를 '영어'에 넣음
		System.out.println("국어:"+kor+", 영어:"+eng); //결과출력
	
	}
}
