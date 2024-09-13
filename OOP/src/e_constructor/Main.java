package e_constructor;

import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		Student s1 = new Student();
		
		System.out.println(s1.getName()+"님의 총점: "+s1.calTotal());
		System.out.println(s1.getName()+"님의 총점: "+s1.calAvg());
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학생이름:");
		String name = sc.next();
		System.out.print("국어점수:");
		int kor = sc.nextInt();
		System.out.print("영어점수:");
		int eng = sc.nextInt();
		System.out.print("수학점수:");
		int math = sc.nextInt();
		sc.close();
				
		Student s2 = new Student(name, kor, eng, math); //setter, 생성자 두 가지 방법으로 값 지정 작업 가능!
		System.out.println(s2.getName()+"님의 총점: "+s2.calTotal());
		System.out.println(s2.getName()+"님의 총점: "+s2.calAvg());
	}
}
