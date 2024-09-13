package exercise;

//import java.util.Scanner;
public class StudentTest {

	public static void main(String[] args){
		//배열
		Student s[] = new Student[3]; 
		
//		Scanner sc = new Scanner(System.in);
//		for(int i=0; i<3; i++) {
//			System.out.printf("학생의 이름 나이 키 몸무게 학번 학과를 입력해주세요:");
//			String str = sc.nextLine();
//			s[i] = new Student(str);
//		}
//		sc.close();
		
		System.out.println("%2f 번째 학생의; 이름 나이 키 몸무게 학번 학과를 입력해주세요:");
		s[0] = new Student("홍길동",20,171,81,"201101","영문");
		s[2] = new Student("고길동",21,183,72,"201102","건축");
		s[1] = new Student("박길동",22,175,65,"201103","컴공");
		
		//출력
		for(int i=0; i<s.length; i++){
			System.out.println(s[i].printInformation());
		}
	}
}
