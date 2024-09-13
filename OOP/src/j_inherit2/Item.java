package j_inherit2;

public class Item{ //Item extends Object 안 써도 기본이라서 그냥 껴들어옴.
	protected String num  ;
	protected String title;
	
	public Item(){
		num="0";
		title="";
		System.out.println("부모 기본 생성자");
	}
	
	public Item(String num, String title) {
		this.num=num;
		this.title=title;
		System.out.println("부모 인자 생성자");
	}
	public void output(){
		
	}
}