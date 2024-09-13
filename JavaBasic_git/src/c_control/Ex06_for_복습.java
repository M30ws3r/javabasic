package c_control;

import java.util.Scanner;

public class Ex06_for_복습 {

	public static void main(String[] args) {
		// main 함수는 Ctrl+space bar 하면 자동으로 나옴
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력: ");
		int n = sc.nextInt();
		
		//출력
		for(int i=0; i<n; i++) {   // 행(row)
			for(int j=0; j<n-i-1; j++) { //문자(열:column) 
				System.out.print(' ');
			}
			for(int j=1; j<=i+1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
