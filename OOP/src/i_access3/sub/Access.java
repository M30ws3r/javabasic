package i_access3.sub;

/* 	접근지정자
 * 
 *  - private : 다른 클래스에서 접근 못 함
 *  - public  : 모든 곳에서 접근 가능.
 *  - protected : 다른 패키지에서 자식 클래스는 접근 가능.
 *  - default(아무것도 지정하지 않음) : 동일한 패키지에서만 접근 가능.
 *  
 */ 
public class Access{
	private   String a = "프라이빗 데이타";  //다른 클래스에서 접근 불가능.
	public 	  String b = "퍼블릭 데이타";    //모든곳에서 접근 가능.
	protected String c = "프로텍티드 데이타"; //
			  String d = "디폴트 데이타";	  //동일한 패키지에서 접근 가능.
			
	public void output(){
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}