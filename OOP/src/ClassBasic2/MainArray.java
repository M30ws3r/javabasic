package ClassBasic2;

import java.util.Scanner;

public class MainArray{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("처리할 데이터 개수 입력:");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		System.out.print("점수 데이터 입력:");
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		sc.close();

		GradeExpr grade = new GradeExpr(arr);
		System.out.print("점수들: ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]);
			if(i != num-1) {
				System.out.print(", ");
			}
		}
		System.out.println("\n총점:"+grade.getTotal());
		System.out.printf("평균: %.2f\n",grade.getAvg());
		System.out.println("최고 점수:"+grade.getGoodScore());
		System.out.println("최저 점수:"+grade.getBadScore());
		}
	}
