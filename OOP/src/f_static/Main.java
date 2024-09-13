package f_static;

public class Main{

	public static void main(String[] args){ //main 에 static? 하나만 있어야 하니까.
											//Java Virtual machine이 계속 부르니까...
		
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		
		System.out.println("책 갯수: "+b1.count);
		System.out.println("책 갯수: "+b2.count);
		System.out.println("책 갯수: "+b3.count);
	}
}
