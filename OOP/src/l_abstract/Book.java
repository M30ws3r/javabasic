package l_abstract;

/*
 * @ this / super 
 * 
 * 		this   : 자기 객체를 지칭
 * 		super  : 부모 객체를 지칭
 * 
 * @ this() / super()
 * 
 * 		this()	: 다른 생성자를 호출
 * 		super() : 부모 생성자를 호출
 */

public class Book extends Item{
	
	private String writer; //자식 없으면 private! 자식에게는 주는 거; protected
	private String publisher;
	
	public Book(){ //void 쓰면 일반함수
		this.num 		= "0000"	;
		this.title 		= "제목없음" 	;
		this.publisher 	= "미정"		;
		this.writer 	= "무명"		;
	}	
	
	public Book(String num, String title, String publisher, String writer){ //void 쓰면 일반함수
		//super.num		= num		;
		//super.title	= title		;
		super(num, title); //부모함수로부터 다른 거 부르고 싶을 때 호출하는 언어 == super
		//생성물 건드리는 애들은 this 든 super든 맨 앞에 와야 함.
		this.num 		= num		;
		this.title 		= title		;
		this.publisher  = publisher ;
		this.writer 	= writer	;
	}
	
	//overriding
	public void output(){ //이름 달라지면은... 추가된 메소드인줄 알어...
		System.out.println("책번호:"+num)			;
		System.out.println("책제목:"+title)		;
		System.out.println("출판사:"+publisher)	;
		System.out.println("저자:"+writer)		;
	}
}