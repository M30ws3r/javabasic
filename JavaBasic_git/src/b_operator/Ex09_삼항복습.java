package b_operator;

import java.util.Scanner;

public class Ex09_삼항복습 {
	public static void main(String[] args) {
		
		//두 수 중에서 큰수를 출력
		int a=15, b=40;
		
		int max;
		if(a>b) {
			max=a;
		}else {
			max=b;
		}
		System.out.println("두 수 중 큰수는 "+max);
		
		//두 수를 입력받고 그 두 수 중에서 큰 값을 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자->");
		int c = sc.nextInt();
		System.out.print("두번쨰 숫자->");
		int d = sc.nextInt();
		
		Integer max2 = (c>d)?c:d;
		System.out.println("두 수 중 큰수는 "+max2);
	}
}
