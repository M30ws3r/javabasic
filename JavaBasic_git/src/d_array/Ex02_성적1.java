package d_array;

import java.util.Scanner;

public class Ex02_성적1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생수를 입력하세요: ");
		
		int n = sc.nextInt();
		int[] kor = new int[n];
		
		for(int i=0; i<kor.length; i++){
			System.out.println(i+"번 학생의 국어점수를 입력하세요: ");
			kor[i] = sc.nextInt();
		}
		//총점구하기
		int total = 0;
		for(int i=0; i<kor.length; i++){
			total += kor[i];
		}
		
		//총점과 평균 출력
		int avg = total/kor.length;
		System.out.println("학생들 국어점수의 총점: "+total);
		System.out.println("학생들 국어점수의 평균: "+avg);
	}
}
