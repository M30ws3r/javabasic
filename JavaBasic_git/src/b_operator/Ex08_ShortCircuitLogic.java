package b_operator;

public class Ex08_ShortCircuitLogic {
	public static void main(String[] args) {
		int a =3;
		if( a>3 & ++a>3) { //이래서 문제다... && 쓰면은 ShortCircuitLogic 땜시 이상하게 되니,
						   //그래서 아예 2개짜리 못 쓰게 하는 팀도 있다...;
			System.out.println("조건만족");
		}
		System.out.println("A="+a); //다른 프로그래밍 언어로 하면 a=4 나오는데 자바만 이럼.
		
		//--------------------------
		int b = 3;
		if(b>1 | ++b>3) { //이미 앞이 True 라서 뒤에것 연산 자동X. 효율적이긴 한데 해석도 모름...
						   //그래서 2개짜리 말고 1개짜리 쓰게 됨.
			System.out.println("조건만족2");
		}
		System.out.println("B="+b);
	}
}
