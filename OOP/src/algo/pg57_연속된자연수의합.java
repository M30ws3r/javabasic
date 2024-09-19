package algo;

import java.util.Scanner;

public class pg57_연속된자연수의합 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 N입력:");
		int N = sc.nextInt();
		sc.close();
		int count 	  = 1;
		int start_idx = 1;
		int end_idx   = 1;
		int sum		  = 1;
		
		while(end_idx != N){
			if(sum==N){
				count++;
				end_idx++;
				sum += end_idx;
			}else if(sum>N){
				sum -= start_idx;
				start_idx++;
			}else{
				end_idx++;
				sum += end_idx;
			}
		}
		System.out.println(count);
	}
}