package e_constructor;

import java.util.Scanner;

public class MainArray{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("정보를 입력할 학생수를 입력:");
		int count = sc.nextInt();
		Student s[] = new Student[count];
		
		for(int i=0; i<count; i++) {
			System.out.print("학생명:");
			String name = sc.next();
			System.out.print("국어점수:");
			int kor = sc.nextInt();
			System.out.print("영어점수:");
			int eng = sc.nextInt();
			System.out.print("수학점수:");
			int math = sc.nextInt();
			
			s[i] = new Student(name, kor, eng, math);
			System.out.println(s[i].getName()+"님의 총점: "+s[i].calTotal());
			System.out.println(s[i].getName()+"님의 평균: "+s[i].calAvg()+"\n");
		}
		sc.close();
	}
}
