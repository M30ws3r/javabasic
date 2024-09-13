package e_method;

/*
 * 인자 - argument
 * 매개변수 - parameter
 * 
 * 인자 := 매개변수
 */
public class Ex01_1인자{

	public static void main(String[] args){
		// 데이타
		int a=10, b=20;
		
		add(a, b); //a, b 라는 인자들을 보내줌
	}
	
	static void add(int a, int b){ //(매개변수: parameter - 인자 받는 거 여기다 기재해줌)
		//데이타에 대한 처리
		int sum=a+b;
		System.out.println("합:"+sum);
	}
}
