package c_control;

public class Ex04_switch_복습 {

	public static void main(String[] args) {

		int kor=100, eng=100, math=100;
		int total = kor + eng + math;
		int avg = total/3;
		System.out.println("평균: "+avg);
		
		char score = '\u0000';  //유니코드 '0' 넣기
		switch(avg/10){
		case 10: score='A'	;
		case 9:	score='A'	; break;
		case 8:	score='B'	; break;
		case 7:	score='C'	; break;
		default : score='F'	; break;
		}
		System.out.println("당신의 학점은 "+score);
	}
}
/*
 * 평균을 구해서 90 이상이면 'A'학점
 * 90 미만 80 이상이면 'B'학점
 * 80 미만 70 이상이면 'C'학점
 * 그외는 F
 * (switch case 활용)
 */
