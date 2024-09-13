package b_basic_encapsulation;

public class MainTest{

	public static void main(String[] args){
		//클래스변수 선언 + 객체 생성
		Student s = new Student();
		
		// 갑지정 및 처리
//		s.name = "홍길순";
//		s.kor = 88;
//		s.eng = 77;
//		s.math = 60;
		s.setName("홍길순");
		s.setKor(88);
		s.setEng(77);
		s.setMath(60);
		
		System.out.println(s.getName()+"님 총점: "+s.calTotal());
		System.out.println(s.getName()+"님 평균: "+s.calAvg());
	}
}
