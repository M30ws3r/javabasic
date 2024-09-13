package c_exercise2;
import java.util.Scanner;

public class Main2_클래스배열{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("입력할 학생 수:");
		int stuNum = sc.nextInt();
		Student[] s=new Student[stuNum]; //배열 잡아놓음.
		for(int i=0; i<s.length; i++){
			// ******
			s[i] = new Student(); //Student 값 따로 지정해두어야
			// NullPointerException 안생김!
			System.out.print("학생의 정보 입력:");
			s[i].setName(sc.next());
			s[i].setKor(sc.nextInt());
			s[i].setEng(sc.nextInt());
			s[i].setMath(sc.nextInt());
		}
		for(int i=0; i<s.length; i++){
			System.out.print(s[i].getName()+"총점: "+s[i].calTotal()+" 평균: "+s[i].calAvg()+"\n");
		}
	}
}
