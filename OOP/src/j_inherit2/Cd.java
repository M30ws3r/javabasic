package j_inherit2;

public class Cd extends Item{
	private String singer;
	
	public Cd(){ //void X쓰고(일반함수가 되어버림으로.) 기본 생성자 함수 
		this.num 		= "0000"	;
		this.title 		= "제목없음" 	;
		this.singer 	= "unknown"	;
	}
	
	public Cd(String num, String title, String singer){ //void 쓰면 일반함수
		this.num = num		;
		this.title = title	;
		this.singer = singer;
	}
	
	public void output(){
		System.out.println("Cd번호:"+num)	;
		System.out.println("Cd제목:"+title)	;
		System.out.println("Cd가수:"+singer) ;
	}
}