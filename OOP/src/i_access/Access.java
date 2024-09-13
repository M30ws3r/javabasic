package i_access;

/* 	접근지정자
 * 
 *  - private : 다른 클래스에서 접근 못 함
 *  - public  :
 *  - protected :
 *  - default(아무것도 지정하지 않음) :
 *  
 */
public class Access{
	private   String a = "프라이빗 데이타";
	public 	  String b = "퍼블릭 데이타";
	protected String c = "프로텍티드 데이타";
			  String d = "디폴트 데이타";
			
	public void output(){
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}