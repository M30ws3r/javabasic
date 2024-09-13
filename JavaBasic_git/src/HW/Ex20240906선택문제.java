package HW;

import java.util.Scanner;

public class Ex20240906선택문제 {

	public static void main(String[] args) {
		//[문제1] OOXXOXXOOO OX퀴즈 결과값 계산
//		Scanner sc = new Scanner(System.in);
//		System.out.print("OX퀴즈 결과 입력: "); 
//		//OOXXOXXOOO, OOXXOOXXOO, OXOXOXOXOXOXOX, OOOOOOOOOO, OOOOXOOOOXOOOOX
//		String str = sc.nextLine();
//		char[] ch = new char[str.length()];
//		for(int i=0; i<ch.length; i++) {
//			ch[i] = str.charAt(i);
//		}
//		sc.close();
//		
//		int seq =0;
//		int	score=0;
//		for(int i=0; i<ch.length; i++){
//			if(str.charAt(i)=='O'){
//				seq++;
//				score+=seq;
//			}else{
//				seq=0;
//			}
//		}
//		System.out.print(score);
		
		//[문제2]
		Scanner in = new Scanner(System.in);
		int[] arr;
		System.out.print("Testcase 입력:");
		int testcase = in.nextInt();
		
		System.out.print("학생 수 입력:");
		for(int i=0; i<testcase; i++) {
			int stuNum = in.nextInt(); //학생 수
			arr = new int[stuNum];
			double sum=0;	//성적 누적 합
			
			//성적 입력
			System.out.print("성적 입력:");
			for(int j=0; j<stuNum; j++) {
				int score = in.nextInt(); //성적 입력
				arr[j]=score;
				sum+=score;						
			}
			double avg = sum/stuNum;
			double count=0; //평균 넘는 학생들 수
			
			//평균 넘는 학생 비율 구하기
			for(int j=0; j<stuNum; j++) {
				if(arr[j]>avg){
					count++;
				}
			}
			System.out.printf("%.3f%%\n",(count/stuNum)*100);
		}
	}//main
}//class
