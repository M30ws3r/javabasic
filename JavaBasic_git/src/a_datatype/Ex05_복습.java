package a_datatype;

public class Ex05_복습 {

	public static void main(String[] args) {
		int age = 468;  //나이를 저장할 변수를 선언, 본인의 나이를 대입
		System.out.printf("age: %d \n",age);	//한 후 출력하기
		
		//본인의 키를 소숫점 포함한 데이터로 저장하고 출력
		double height = 258.8;
		System.out.printf("height: %s \n",height);
		
		//이름 저장할 변수를 선언하고 이름을 대입후 출력
		//문자는 하나만 넣을 수 있으므로 문자열 필요!!
		//문자 char, 문자열은 String(클래스-참조형)
		/*
		 * char name  = '홍'
		 * char name2 = '길'
		 * char name3 = '동'
		 */
		String name = "하승모";
		System.out.println("이름은 "+name+" 입니다.");
		
		/*
		 * 전화번호, 주민번호, 학번 등은 문자열로 취급한다.
		 * 숫자 하나라도 더해지거나 뺴지면은 다른 사람을 지칭하잖아요...
		 */
	}

}
