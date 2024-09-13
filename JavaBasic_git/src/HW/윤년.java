package HW;

import java.util.Scanner;

public class 윤년 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("윤년 여부 판독: ");
		int year = sc.nextInt();
		
		//if-else
		if(year%4==0){
			if(year%100==0) {
				if(year%400==0) {
					System.out.println("윤년");
				}else {
					System.out.println("평년");
				}
				}else {
					System.out.println("윤년");
				}
			}else{
				System.out.println("평년");
			}
		
		if(year%4==0 && year%100!=0 || year%400==0) {
			System.out.println("윤년");
		}else{
			System.out.println("평년");
		}
		
		
		//삼항
		String A = (year%4==0 & year%100!=0 & year%400!=0)?"윤년":(year%4==0 & year%100==0 & year%400==0)?"윤년":(year%4==0 & year%100==0)?"평년":"평년";
		System.out.printf("입력하신 년도는 %s 입니다", A);
		
		}
}
		// String result = (yoon%100==0)|(yoon%4==0)&(yoon%400==0)? "윤년": "평년";
		// System.out.println(result);
