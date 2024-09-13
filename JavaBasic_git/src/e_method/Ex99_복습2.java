package e_method;

import java.util.Scanner;

public class Ex99_복습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("점수입력:");
		int score = sc.nextInt();
		
		pass(score);
		// 합격여부 출력
		
		String result = pass2(score);
		System.out.println(result);
	}
	
	/*
	 * 역할 : 입력받은 점수를 넘겨받아서
	 * 		 80점 이상이면 '합격' 그렇지 않으면 '불합격' 출력
	 */
	static void pass(int score){
		if(score >= 80){
			System.out.print("'합격'");
		}else {
			System.out.print("'불합격'");
		}
	}
		
	/*
	 * 위와 같은 메소드를 String 으로 출력하는법.
	 */
	static String pass2(int score){
		String result="";
		if(score >= 80) result = "'합격'";
		else result = "'불합격'";
		return result;
		}
}
