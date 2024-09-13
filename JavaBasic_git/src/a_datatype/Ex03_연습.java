package a_datatype;

public class Ex03_연습 {

	public static void main(String[] args) {
		// 국어점수 변수 선언
		int kor;
		// 영어점수 변수 선언
		int eng;
		//국어점수 변수에 90점 지정
		kor = 91;
		//영어점수 변수에 100점 지정
		eng = 100;
		//총점 변수 선언
		int sum;
		//총점 계산하기
		sum = kor + eng;
		
		//총점 출력
		System.out.println("총점:"+sum);
		
		//--------------------
		// 평균을 구해서 출력
		double avg;
		avg = sum/2.0; //정수+정수 계산하면 정수로만 나오지만 정수+실수로 계산하면 실수 가능!
		// 191/2 = 95.5
		// 정수형끼리 연산한 결과는 정수형임 >> Java 특성임
		System.out.println("평균:"+avg);
		
		/*int n
		 * avg = sum/i;
		 */

	}
}
