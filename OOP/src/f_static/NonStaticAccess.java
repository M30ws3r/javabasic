package f_static;

public class NonStaticAccess{
	String name="홍길동";
	public static void main(String[] args){
		
		NonStaticAccess obj = new NonStaticAccess();
		System.out.println("고객명:"+obj.name);  //메인함수 한 번 불려지는 것 뿐이라 이정도는 허용됨.
	}
}