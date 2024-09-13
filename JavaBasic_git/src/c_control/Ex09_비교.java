package c_control;

import java.util.Scanner;

public class Ex09_비교 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		//-------------[1]
//		System.out.println("구구단 출력 몇 번 반복할까요?");
//		
//		for(int a=0; a<n; a++) {
//			System.out.println("단 입력: ");
//			int dan = sc.nextInt();
//			for(int i=1; i<=9; i++) {
//				System.out.printf(" %d * %d = %d \n",dan,i,dan*i);
//			}
//		}
		//-------------[2] while 이용
//		while(true){
//			System.out.println("단 입력: ");
//			int dan = sc.nextInt();
//			for(int i=1; i<=9; i++) {
//				System.out.printf(" %d * %d = %d \n",dan,i,dan*i);
//			}
//			System.out.println("종료할까요?(Y/N)");
//			String answer = sc.next();
//			if(answer.equals("Y") | answer.equals("y")) break;
//			else continue;
//		}
		
		//-------------[3] do ~ while 이용
		String answer = "";
		do{
			System.out.println("단 입력: ");
			int dan = sc.nextInt();
			for(int i=1; i<=9; i++) {
				System.out.printf(" %d * %d = %d \n",dan,i,dan*i);
			}
			System.out.println("종료할까요?(Y/N)");
			answer = sc.next();
		}while(answer.equals("Y") | answer.equals("y"));
	}
}
