package b_operator;

import java.util.Scanner;

public class Ex05_비교 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 입력: ");
		int kor=sc.nextInt();
		System.out.print("영어점수 입력: ");
		int eng=sc.nextInt();
		System.out.print("수학점수 입력: ");
		int math=sc.nextInt();
		//총점, 평균 구해서 변수에 저장하고 출력
		int total;
		double avg;
		total = kor + eng + math;
		avg = total / 3.0;
		
		System.out.print("총점: "+total+"\n"+"평균: "+avg +"\n");
		
		/*[학점구하기]
		 * 
		 * 평균이 90점 이상이면 A학점
		 * 평균이 80이상 90미만이면 B학점
		 * 평균이 70이상 80미만이면 C학점
		 */
		
		if(avg>=90) {					// 만약에 avg 값이 90 이상이라면
			System.out.println("A학점"); //		그렇다면 'A'학점 출력
		}
		else if(avg>=80){				// 그렇지 않은 경우, avg 값이 80 이상
			System.out.println("B학점"); //		그렇다면 'B'학점 출력
		}
		else if(avg>=70) {				// 그렇지 않은 경우, avg 값이 70 이상
			System.out.println("C학점"); //		그렇다면 'C'학점 출력
		}
		
		/*
		if(avg>=90) {					// 만약에 avg 값이 90 이상이라면
		 
			System.out.println("A학점"); //		그렇다면 'A'학점 출력
		}
		if(avg>=80){				// 그렇지 않은 경우, avg 값이 80 이상
			System.out.println("B학점"); //		그렇다면 'B'학점 출력
		}
		if(avg>=70) {				// 그렇지 않은 경우, avg 값이 70 이상
			System.out.println("C학점"); //		그렇다면 'C'학점 출력
		}
		'그렇지 않은 경우에 대한 조건이 붙지 않아서 A, B, C 다 나올 수 있음.
		*/
		/*
		if(avg>=70) {				//이미 첫 줄 조건에 걸려버려서 C학점만 나옴...ㄱ-
			System.out.println("C학점");
		}else if(avg>=80) {
			System.out.println("B학점");
		}else if(avg>=90) {
			System.out.println("A학점");
		}
		*/
	}
}
