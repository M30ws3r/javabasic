package c_control;

public class Ex05_for_개념 {

	public static void main(String[] args) {
		
		int result = 0;
		for(int a=1; a<=10; a++){
			result += a;
		}//false 떠야만 멈춘다.
		System.out.printf("결과: "+result);
	}
}
