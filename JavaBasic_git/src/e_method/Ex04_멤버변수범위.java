package e_method;

public class Ex04_멤버변수범위{
	
	static int a=10, b=20; //누가 자동초기화 되는지 안되는지 체크..
	static int sum;		//하기 귀찮다면, 그냥 다 초기화 해 주는 게 편함.

	public static void main(String[] args){

		add();
		System.out.println("합:" + sum);
	}
	
	static void add(){
		sum = a + b;
	}
}
