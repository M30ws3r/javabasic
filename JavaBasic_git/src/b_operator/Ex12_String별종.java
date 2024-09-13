package b_operator;

/*
 * 문자열처리하는 클래스
 * 
 * 		- String
 * 		- StringBuffer / StringBuilder
 * 
 */
	
public class Ex12_String별종 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("홍길동");
		sb.append("바보");
		System.out.println(sb);
		
		/*
		 * StringBuilder 는 하나의 메모리를 건드리는 순차적인 작업 a,b에 대하여
		 * 작업의 결과값을 보장하지만
		 * 하나의 작업을 보장할 때 다른 작업을 락(lock) 걸어버림 (상호작업 BAN--)
		 * 가볍게 만들고 싶었어...☆
		 */
		StringBuilder sb2 = new StringBuilder("홍길국");
		sb2.append("바보");
		System.out.println(sb2);
		
		/*
		 * 문자열 수정이 많은 작업에는 StringBuilder 나 StringBuffer을 이용하는 편이 좋다.
		 * String str = new String("홍길자")
		 * [특권] new 생략가능
		 *  		 + 연산자 가능
		 */
		String str = "홍길자";
		str += "바보"; 		//str = str + "바보"
		System.out.println(str);
	}
}

/*
* java garbage collector 로 쓰면 되는데...
* 게임은 메모리 할당받고 바로바로 output 하고 메모리 관리해줘야 하는데...
* java는 garbage collector 항상 돌아가요...;
* 우선순위도 낮아서 다른 작업 먼저 하고 아무리 많이 발동해도
* 그 즉시 운용되지 않음
*/
