package b_operator;

import java.util.Scanner;

public class Ex09_삼항 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 점수가 80보다 크면 '합격'이라고 저장하고 아니면 '불합격' 처리
		System.out.print("점수입력1: ");
		int score = sc.nextInt();
		String result;
		if(score > 80) {
			result = "합격";
		}else {
			result = "불합격";
		}
		System.out.println("당신은 "+result);
		
		System.out.print("점수입력2: ");
		int score2 = sc.nextInt();
		String result2 = (score2 >80)? "합격" : "불합격"; //삼항 구조:(조건)?true 값:false 값;
		System.out.println("당신은 "+result2);
		
	}
}
