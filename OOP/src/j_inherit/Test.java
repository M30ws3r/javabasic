package j_inherit;

public class Test {

	public static void main(String[] args) {
		
		/*
		Umma 엄 = new Umma();
		엄.gene();
		엄.job();
		
		*/
//		Ddal d = new Ddal();
//		d.gene();
//		d.study();
//		d.job();	//부모꺼 호출 가능. 딸이 메모리에 올라오기 전에 부모가 먼저 메모리에 올라옴.
					//메모리상에 엄마와 딸을 둘 다 올려놓고 한꺼번에 호출.
		
		// @@@@@@@@@@@@@@
		// 변수는 부모 클래스이고 객체는 자식 클래스
//		Umma dal = new Ddal();
//		dal.job();
//		//dal.study();
//		dal.gene(); // *자식의 오버라이딩함수 호출
		
		// @@@@@@@@@@@@@@ casting
		//		참조형에서 부모자식간에 캐스팅
		/*	[ 아래 경우는 아님 ]
		 *  String a = new String();
		 *  StringBuffer b = (StringBuffer)a;
		 *  
		 */
//		Umma a = new Umma();
//		Ddal d = (Ddal)a;
		
//		Ddal d = new Ddal();
//		Umma a = (Umma)d;	 // up casting
//		Ddal d2 = (Ddal)a;	 // down casting
		
		//연산자 : instanceof
		Ddal d= new Ddal();
		
		if( d instanceof Ddal ){
			System.out.println("Ddal 클래스 객체");
		}
		if( d instanceof Umma){
			System.out.println("Umma 클래스 객체");
		}
	}
}
