package i_access3;

import i_access2.sub.Access;

//Access 클래스와 MainTest 클래스가 다른 패키지(폴더, 디렉토리) 안에 있는 상황
public class MainTest extends Access{
	// Access 부모클래스, MainTest 자식클래스.
	// 객체 생성이 자식클래스여야만 접근이 가능하기에 자식으로 만들어준다...

	public static void main(String[] args){
		Access acc = new Access();//*
		//acc.a="프라이빗 변경";
		acc.b="퍼블릭 변경";
		//acc.c="프로텍티드 변경";
		//acc.d="디폴트 변경";
		
		acc.output();
	}
}