package a_datatype;

/*
 * @@@@@@@@@@@@@@@@@@@@@@
 * 
 * String : 클래스임 (참조형)
 * 		-> 참조형은 무조건 new 연산자로 메모리 확보해야함
 * 
 * 		=> 단, 하나 String 특권으로 new 생략해도 됨(젤많이 쓴다고 특권 줌)
 * 			특권 없을 것이 차라리 나았어... 자칫 헷갈림
 * 			new 안써도 무조건 참조형됨...ㄱ-
 * 			개발자가 귀찮아서 'new' 안쓰고 그냥 String 선언해도 자동적으로 참조형!!
 */

public class Ex07_StringSpecial {

	public static void main(String[] args) {
		
		String name = new String ("홍길동");
		String name2 = new String ("홍길동");
		
		
		if (name == name2) {
			System.out.println("주소가 같다.");
		}else
			System.out.println("주소가 다르다.");		
		
		
		//문자열값을 비교한다면??
		if (name.equals(name2)) {
			System.out.println("이름이 같다.");
		}else
			System.out.println("이름이 다르다.");
		//값이 같을 때만 자바에서 새로 객체를 만들지 않음
		//String 내용이 달라지면은 주소할당을 다르게 해 줌...
		//개발자가 따박따박 new를 쓸 때만 값이 같더라도 다른 주소값 할당해 줌
		//1. 기본 2. 참조. 3. 변종(String)

	}

}
