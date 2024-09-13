package m_interface.yesinterface;

// 1. DBDriver 인터페이스 구현 선언
// 2. 메소드 오버라이딩

public class OracleDriver implements DBDriver{
	//인터페이스 물려받는다면, 인터페이스 이름으로 바꿔주어야.
	//100% 추상으로 물려받으면 100% 추상으로 바꿔줘야 함. 

	public OracleDriver(){
		System.out.println("오라클 드라이버");
	}
	
	public void connect(){
		System.out.println("오라클 디비에 연결");
	}
	
	public void insert(){
		System.out.println("오라클에 데이타 입력 작업");
	}
}
