package e_method;

/*
 * 	call by reference
 * 		: 메소드의 인자(파라메터)의 자료형이 참조형인 경우
 * 
 * 		=> (참조형)주소만 복사
 * 		값을 넣었다가 사라지는 게 아니라 빌려오는거라 
 */
public class Ex06_CallByReference{

	public static void main(String[] args){
		
		StringBuffer a = new StringBuffer("안녕"); //힙에다가 StringBuffer 만큼의 값 가져옴 
		StringBuffer b = new StringBuffer("하이");
		
		add(a,b);
		System.out.println("2. A="+a+", B="+b); //
	}
	
	public static void add(StringBuffer a, StringBuffer b){
		a.append(b);
		System.out.println("1. A="+a+", B="+b); //원본에 영향을 미침. line 18에서 확인 가능
	}
}
