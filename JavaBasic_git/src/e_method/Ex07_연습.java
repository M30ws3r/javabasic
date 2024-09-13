package e_method;

import java.util.Scanner;

public class Ex07_연습 {

	public static void main(String[] args) {
		// 함수 만드는 이유? 역할별로 쪼개서 모듈화!
		int[] score = input();
		double avg = calculate(score);
		output(avg);
	}
	// 국, 영, 수 점수를 입력받기
	static int[] input(){
		int[] score = new int[3];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수:");
		score[0]=sc.nextInt();
		System.out.print("영어점수:");
		score[1]=sc.nextInt();
		System.out.print("수학점수:");
		score[2]=sc.nextInt();
		sc.close();
		
		return score;
	}
	//입력받은 정수들로 총점/평균 구해서 출력
	static double calculate(int[] score){
		int total  = 0;
		double avg = 0.0;
		for(int i=0; i<score.length; i++) {
			total += score[i];
		}
		avg = total/(double)3;
		System.out.println("총점은:"+total+" 평균은:"+avg);
		
		return avg;
	}
	//평균값을 받아서 학점을 구한 다음 출력
	static void output(double avg){
		switch((int)avg/10){
		case 10:System.out.println("A+학점"); break;
		case 9: System.out.println("A학점"); break;
		case 8: System.out.println("B+학점"); break;
		case 7: System.out.println("B학점"); break;
		case 6: System.out.println("C+학점"); break;
		case 5: System.out.println("C학점"); break;
		case 4: System.out.println("D+학점"); break;
		case 3: System.out.println("D학점"); break;
		default: System.out.println("F학점"); break;
		}
	}
}
