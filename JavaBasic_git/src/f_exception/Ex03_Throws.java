package f_exception;

import java.io.FileInputStream;

public class Ex03_Throws {

	public static void main(String[] args){
		try {
			readFile();
			System.out.println("파일처리 성공");
		}catch(Exception ex) {
			System.out.println("예외발생:"+ex.getMessage());
			//ex.printStackTrace();
		}//예외처리 구문.
	}
	static void readFile() throws Exception{ //오류 발생 시 던지는 거 return 구현!
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("happy.txt");
		}finally{
			fis.close();
		} //예외처리 X함. catch 있어야만 예외처리 한 거.
		//안에서 예외 발생하면 던지겠다고 해 놓았으니 발생해도 괜춘.
	}
}
