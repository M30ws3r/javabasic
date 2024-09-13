package b_operator;

/*
 * 	not : 결과에 반대로 하는 연산자
 * 
 * 		- 일반논리 (true/false) not : !
 * 		- 이진논리 not : ~
 */

public class Ex02_NOT {

	public static void main(String[] args) {
		
		// 일반논리 not = !
		// true 를 false 로, vice versa 도 가능한 !다.
		boolean result = 3>4;
		System.out.println(result);
		System.out.println(!result);
		
		//이진논리 not
		int a =15;		//	[0]00000000 00000000 00000000 00001111
						//	0:양수, 1:음수
		System.out.println(a);
		System.out.println(~a);
						//	[1]11111111 11111111 11111111 11110000
		//...안중요해
	}

}
