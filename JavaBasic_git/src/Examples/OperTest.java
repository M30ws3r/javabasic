package Examples;

public class OperTest {

	public static void main(String[] args) {
		// 1. int형 변수 a에 10을 대입하고 int형 변수 b에 7을 대입한 후 두 변수의 값을 비트 
		//연산자 중 XOR(배타적 OR)를 사용하여 얻어지는 결과는 얼마인지를 알아보는 프로그램을 작성하라
		int a=10, b=7;
		System.out.println(a ^ b);
		
		
		int x=10, y=20;
		System.out.println(++x); //x=11
		System.out.println(++x + y++); //x=12 y=20
		System.out.println((++x%3)+(x*++y)); // 1 + 286(22*13)
		
		int c=10, d=10;
		boolean e = ++c > d++ || c++ >= ++d; //true. 하나라도 참이면 참인데 뒤에가 참.
		
		System.out.println(c+","+d);
		System.out.println("변수 e의 값 :"+ e);
		
	}
}
