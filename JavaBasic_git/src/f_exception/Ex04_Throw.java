package f_exception;

public class Ex04_Throw{

	public static void main(String[] args){
		try{
			readMessage();
		}catch(Exception ex){ //여기로 떨어지면 이미 뭔가가 잘못된 것이므로 negative feedback 해야!
			System.out.println("실패:"+ex.getMessage());
		}
		System.out.println("프로그램 종료");
	}
	
	static void readMessage() throws Exception{
		String[] str={"안녕하세요", "올라", "하이"};
		try{
			for(int i=0; i<str.length; i++){
				System.out.println(str[i]);
			}
		}catch(Exception ex){
			throw new MyException(); //일부러 예외를 만들어 처리하는 경우.
			//개발자가 프로젝트를 빨리 만들고 싶어하는 경우...
		}
	}
}