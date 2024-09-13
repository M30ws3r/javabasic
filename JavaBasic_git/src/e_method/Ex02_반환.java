package e_method;

/*
 * 함수가 끝나기 전에 끝내려고 할 때 : return
 * 
 * return 할 때 단 하나의 값만 반환 가능.
 */

public class Ex02_반환{

	public static void main(String[] args){
		// TODO Auto-generated method stub
		int sum1 = add(); //헷갈릴 수 있으니 이름 맞춰주는 게 포인트. 변수에 저장 안해주면은 사라져요...
		System.out.println("합="+sum1);
	}

	static int add(){ //매개변수: parameter . add라는 친구는 받는 게 없고 int를 반환함.
		//데이터
		int a=10, b=20;
		int sum=a+b;
		return sum; //없으면 프로그램 제어권을 19줄에서 넘김(반환. 함수 end.) 
	}
}
