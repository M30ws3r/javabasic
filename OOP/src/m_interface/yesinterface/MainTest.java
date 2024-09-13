package m_interface.yesinterface;

public class MainTest{

	public static void main(String[] args){
		
		// 1. 오라클 디비에 연결하고 사용한다면?
		OracleDriver driver = new OracleDriver();
		driver.connect();
		driver.insert();
		
		// 2. 오라클 디비에서 마리아 디비로 변경한다면?
		// MariaDB 또는 MySQL 가볍게 만들고 싶다 
		MariadbDriver driver2 = new MariadbDriver();
		driver2.connect();
		driver2.insert();
	}
}