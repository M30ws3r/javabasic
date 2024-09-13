package a_datatype;

/*
 * [주의] String
 * 기존에 자바에서 제공해주는 클래스명 같은 것으로
 * 변수 이름을 잡으면 안된다... 그 기능을 추후 못 사용함
 * 
 * [데이터타입 - 자료형]
 * 
 * 1. 기본형
 * 2. 참조형 : 배열, 클래스
 *		-> 반드시 new 예약어를 통해 메모리를 확보해야 함!
 *
 *		*String은 자바에서 제공하는 클래스
 */

public class Ex06_String {
	public static void main(String[] args) {
		
		int age = 30;
		
		// [1] 클래스변수선언
		// [2] (보통의 경우에는 스택, new 예약어로 만들면은 힙에다가)메모리확보
		//참조형은 주소값을 따로 가짐; 아래의 경우 name 의 
		
		
		String name;
		name = new String ("홍길동");
		
		String name2 = new String ("홍길동");
		
		/* name 변수의 값과 name2 변수의 값이 같다면 "이름이 같다" 출력
		 * 아니면 "이름이 다르다" 출력
		 */
		
		if (name == name2) {
			System.out.println("이름이 같다.");
		}else
			System.out.println("이름이 다르다.");
		// 1)new String 결과는 "이름이 다르다"출력. 주소값이 다르니까.
		// 2)new String 없애면 "이름이 같다" 출력. String 같으니까.
		// 1)참조형과 2)기본형의 차이.
		
		if (name.equals(name2)) {
			System.out.println("이름이 같다.");
		}else
			System.out.println("이름이 다르다.");
		// 참조형의 경우에는 주소값이 아닌 변수 내의 값 비교시 equals 함수로 해야 한다.
	}
}
