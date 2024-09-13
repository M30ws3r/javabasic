package m_interface.yesinterface;

//1. DBDriver 인터페이스 구현 선언
//2. 메소드 오버라이딩

public class MariadbDriver extends Object implements DBDriver{
	//미완성 함수를 가진 부모를 물려받는다면, 자식 선에서 그걸 완성시켜야 함(선언하는 것 마다!).
	//overriding 해야되니까 함수 선언 부분 동일해야!

	public MariadbDriver() {
		System.out.println("마리아디비 드라이버 실행");
	}
	
	public void connect() {
		System.out.println("마리아디비에 연결 작업");
	}
	
	public void insert() {
		System.out.println("마리아디비에 데이타를 입력");
	}
}
