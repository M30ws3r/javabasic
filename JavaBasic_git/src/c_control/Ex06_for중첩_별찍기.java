package c_control;

import java.util.Scanner;

public class Ex06_for중첩_별찍기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n과 m의 값을 입력하시오: ");
		int n = sc.nextInt(); //높이(1<=n<=100)
		int m = sc.nextInt(); //종류(1,2,3)

		if(m==1){
			for(int i=0; i<=n; i++) {
				for(int j=1; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}else if(m==2){
			for(int i=0;i<n;i++){
				for(int j=1;j<=n-i;j++){
					System.out.print("*");
				}
				System.out.println();
			}
		}else if(m==3){
			for(int i=0;i<n;i++) {
				for(int j=1;j<n-i;j++){
					System.out.print(" ");
				}
				for(int k=0; k<i*2+1;k++){
					System.out.print("*");
				}
				System.out.println();
			}//피라미드형
		}else{
			System.out.print("Input Error!");
		}
	}
}
