package f_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex02_TryCatch{

	public static void main(String[] args){
		FileInputStream fis = null;
		try{
			fis = new FileInputStream("abc.txt"); //필수 예외처리 프로그램
			fis.read();
			
			System.out.println("파일처리"); //파일 못 찾으면 Error 뜸.
		}catch(FileNotFoundException ex){ //순서 바꾸면은 에러뜸... 구체적인 에러는 앞에 기술하고,
										  //구체적이지 않은 애들은 그냥 Exception 으로 받아야.
			System.out.println("예외발생:"+ex.getMessage());
			//ex.printStackTrace();
		}catch(Exception ex){
			System.out.println("예외발생:"+ex.getMessage());
			//ex.printStackTrace();
		}finally{
			try{
			fis.close();
			}catch(Exception ex){}
		}
	}
}