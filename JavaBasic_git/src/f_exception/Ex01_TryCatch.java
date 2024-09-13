package f_exception;

/*
 * 오류
 * 		- 에러 : 심각한 오류
 * 		- 에러 : 심각하지 않은 오류
 * 
 * 예외처리 : 최종적인 목적은 프로그램이 정상으로 종료
 * 
 * 		[1] try~catch
 * 
 * 			try{
 * 				예외가 발생할 여지가 있는 구문
 * 			}catch(Exception ex){
 * 				예외가 발생한 후에 구문
 * 			}finally{
 * 				예외관련없이 무조건 실행구문
 * 			}
 * 
 * 		[2] 함수 뒤에 throws
 */

public class Ex01_TryCatch{

	public static void main(String[] args){
		String[] str={"안녕하세요", "올라", "하이"};
		try{
			for(int i=0; i<str.length; i++){ //이부분을 일부러 문제 있게 만들면은 catch 구문 실행.
				System.out.println(str[i]);
			} //정상적인 구문이면 catch 건너뛰고 finally 실행.
			//return; // 리턴되는 순간 제어권 반환. 아래 코드에서 finally만 실행함.
		}catch(Exception ex){
			System.out.println("예외발생:"+ex.getMessage());
		}finally{ //DB같은 거 열어놓았을 때; 다른 사용자 접근을 위해 닫아야 하는 거 여기에 쓰는 경우 많아.
			System.out.println("무조건 실행 구문");
		}
		System.out.println("프로그램 종료");
	}
}
