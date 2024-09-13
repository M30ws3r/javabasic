package f_static;

/*
 * 	  static : 공유
 * 
 * 		  '	메모리 단 1번 설정(지정)
 * 		  ' 클래스명 접근(******)이 가능함.
 * 
 */
public class Book {
	
	public int count; //static 안 붙이는 것이 보통.
						//공유할 것에만 static 붙이는 것이 보통임.
						//본래 static X면 하나씩 붙어서 단일실행.b1 이든 b2든 b3든.
						//static 자 붙이면은 메모리 단 1번 설정(지정)
	
	static {
		System.out.println("딱한번");
		//여러 개의 함수가 건드려서 카운터수 올라가는 거...
	}
	
	public Book(){ //생성자 함수. public, static, private 안쓴 것 뿐.
		count++;
		System.out.println();
	}
}
