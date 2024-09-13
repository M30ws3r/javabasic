package e_method;

public class Ex03_인자와반환 {

	public static void main(String[] args) {
		// 데이터
		int a=0, b=20;
		int sum = add(a, b);
		//결과 확인;
		System.out.println("합:"+ sum);
	}
	
	static int add(int a, int b){ //return 하는 애의 자료값이 int 니까 static void >> static int
		//데이터 처리 여기에서만 일어나야 하는 경우;
		int sum = a+b;
		return sum;
	}
}