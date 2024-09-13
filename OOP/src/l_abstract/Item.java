package l_abstract;

/*
 *  abstract(추상) : 미완성
 *  	- method  : 오버라이딩(overriding) 강제성 부여하기 위해.
 *  	- class   : 객체생성못함 ( 부모클래스 역할 )
 */

public abstract class Item extends Object{
	//Item extends Object 안 써도 기본이라서 그냥 껴들어옴.
	protected String num  ;
	protected String title;
	
	public Item(){
		num			= "0";
		title		= "";
		System.out.println("부모 기본 생성자");
	}
	
	public Item(String num, String title){
		this.num	= num;
		this.title	= title;
		System.out.println("부모 인자 생성자");
	}
	//Overriding 강제성 주기 위해서 미완성인 자식은 부모에게...
	public abstract void output(); 
}