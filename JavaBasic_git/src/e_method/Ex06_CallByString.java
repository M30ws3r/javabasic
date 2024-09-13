package e_method;

public class Ex06_CallByString{

	public static void main(String[] args){
		// TODO Auto-generated method stub
		String a="안녕";
		String b="하이";
		
		add(a,b);
		System.out.println("2. A="+a+", B="+b);
	}
	
	static void add(String a, String b){
		a += b;
		System.out.println("1. A="+a+", B="+b);
	}
}