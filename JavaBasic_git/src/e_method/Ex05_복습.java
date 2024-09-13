package e_method;

public class Ex05_복습{

	public static void main(String[] args){
		// TODO Auto-generated method stub
		int data1 = 1000;
		double data2 = 1.99;
		
		String result = method(data1, data2);
		// msg의 값을 출력
		System.out.println(result);
	}
	
	static String method(int a, double b){
		//data1와 data2의 값을 여기서 출력
		System.out.println(a);
		System.out.println(b);
		
		String msg="안녕하세요";
		return msg;
	}
}
