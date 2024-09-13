package e_method;

/*
 * call by value
 * 		: 메소드의 인자(파라메터)가 기본형인 경우
 * 
 * 		=> 값만 복사
 */
public class Ex06_CallByVaule{

	public static void main(String[] args){
		// TODO Auto-generated method stub
		int a=10, b=20;
		
		add(a,b);
		System.out.println("A="+a+", B="+b);
	}
	
	static void add(int a, int b){ //넘어오는 값이 기본형과 같을 경우, 값이 복사되어 옴.
		a += b; //a+b;
		System.out.println("A="+a+", B="+b); 
		//void라서 그냥 return. 상기 main에서 값 연장X.
	}
}