package l_abstract;

public class Test{

	public static void main(String[] args){
		
		System.out.println();
		Book b1 = new Book("0001", "자바책", "ICT", "자바쌤");
		b1.output(); //변수, 객체 
		
		System.out.println();
		Book b2 = new Book(); 
		//생성자 함수 이미 만들었으니 기본 생성자 함수 안 만들어줌... 매개변수 없으면 에러남
		b2.output();

		//객체지향적 프로그래밍 언어는 부모변수에 자식객체 생성하려고 함.
		System.out.println();
		Item b = new Book("0001", "자바책", "ICT", "자바쌤");
		b.output();
	}
}