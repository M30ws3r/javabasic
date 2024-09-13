package e_method;

public class Ex00_흐름 {

	static void method(){ //java 특성상 static 붙은 애들은 static 만 실행 가능.
						  //위에 main 은 static 인데 method 는 static 아니면 못 봐...
		System.out.println(" method 실행 "); // 위에서 안 불러주면 실행 X 
	}
	
	public static void main(String[] args){ //여기서부터 실행됨. (1)
		// work flow 잘 알아야 이후에도 코드 어디가 잘못되었는지 backtracking 쉬워짐!!
		// 정리 잘하자...
		
		System.out.println(" main 시작 "); // java virtual machine 이 알아서 돌려줌. main 이니까.
		method();
		method();
		method();
		System.out.println(" main 끝 ");
	}
}