package c_exercise2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] s=new Student[3]; //배열 잡아놓음.
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<s.length; i++){
			// ******
			s[i] = new Student(); //Studnet 값 따로 지정해두어야
			// NullPointerException 안생김!
			System.out.print("학생명 입력:");
			s[i].setName(sc.next());
			System.out.print("국어점수 입력:");
			s[i].setKor(sc.nextInt());
			System.out.print("영어점수 입력:");
			s[i].setEng(sc.nextInt());
			System.out.print("수학점수 입력:");
			s[i].setMath(sc.nextInt());
			
			System.out.println("총점"+s[i].calTotal());
			System.out.println("총점"+s[i].calAvg()+"\n");
		}
	}
}
