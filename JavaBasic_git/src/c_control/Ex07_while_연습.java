package c_control;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex07_while_연습 {

	public static void main(String[] args) {
		//[문제1]숫자 여러 개 입력받아 가장 큰 수 구하기 (최대값찾기)
		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자들 입력: ");
//		String str1 = sc.nextLine();
//		System.out.println(str1);
//		StringTokenizer st1 = new StringTokenizer(str1);
//		
//		int max=0;
//		while(st1.hasMoreTokens()){
//			String token = st1.nextToken();
//			int n = Integer.parseInt(token);
//			if(max<n) max=n;	
//		}
//		System.out.println("큰 수: "+max);
		
		
		//[문제2]입력받은 정수들 중 짝수들과 홀수들의 개수를 각각 구하여 출력하는 프로그램
//		System.out.print("짝홀 숫자들 입력: ");
//		String str2 = sc.nextLine();
//		System.out.println(str2);
//		StringTokenizer st2 = new StringTokenizer(str2);
//		
//		int even2=0, odd2=0;
//		while(st2.hasMoreTokens()){
//			String token2 = st2.nextToken();
//			int n2 = Integer.parseInt(token2);
//			if(n2%2==0) {
//				even2++;
//			}else {
//				odd2++;
//			}
//			
//		}
//		System.out.println("짝수: "+even2+" 개, 홀수: "+odd2+" 개");
		
		//[문제3]입력받은 10개 정수 합과 평균 출력-0이 입력시 여태 입력된 합과 평균을 출력(평균은 정수만 출력).
		System.out.print("10개의 정수 입력: ");
		String str3 = sc.nextLine();
		System.out.println(str3);
		StringTokenizer st3 = new StringTokenizer(str3);
		
		int sum=0, avg=0, n3=0;
		
		while(st3.hasMoreTokens()){
			n3++;
			String token = st3.nextToken();
			int num = Integer.parseInt(token);
			if (n3==10|num == 0) break;
			sum += num;
			avg = sum/(n3);
		}
		System.out.println("정수합: "+sum+", 평균: "+avg);
	}	
}
