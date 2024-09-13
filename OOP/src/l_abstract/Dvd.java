package l_abstract;

public class Dvd extends Item{
	private String DvdActor;
	private String DvdDirector;
	
	public Dvd(){ //void X쓰고(일반함수가 되어버림으로.) 기본 생성자 함수 
		this("0","제목없음","무명","유명한"); //Book과 비교해서 이렇게도 설정가능.
	}
	
	public Dvd(String num, String title, String DvdActor, String DvdEP){ //void 쓰면 일반함수
		this.num 		= num		;
		this.title 		= title		;
		this.DvdActor 	= DvdActor  ;
		this.DvdDirector= DvdEP		;
	}
	
	public void output(){
		System.out.println("DVD번호:"+num)		 ;
		System.out.println("DVD제목:"+title)		 ;
		System.out.println("DVD배우:"+DvdActor)   ;
		System.out.println("DVD감독:"+DvdDirector);
	}
}