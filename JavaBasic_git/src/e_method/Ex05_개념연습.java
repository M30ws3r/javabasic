package e_method;

import java.util.Scanner;

public class Ex05_개념연습 {

	public static void main(String[] args) {
		//[문제 1] 소문자 여부 확인
		System.out.print("소문자 여부 확인 입력:");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		boolean flag = checkLower(ch);
		System.out.println("소문자여부:"+flag);
		
		//[문제 2] 소문자 -> 대문자, 대문자는 그대로 반환
		System.out.print("\n checkUpper 실행할 char:");
		char ch2 = sc.next().charAt(0);
		sc.close();
		char result = checkUpper(ch2);
		System.out.println("checkUpper 실행결과:"+result);
	}

/*
 * [문제 1] 영문자를 입력하여 이 문자를 넘겨받아 이 문자가 소문자면 true를 반환, X면 false반환하는 메소드
 * 함수명 	: checkLower
 * 인자		: char
 * 리턴(반환) : boolean
 */
	public static boolean checkLower(char ch){
		boolean flag;
		if(ch>='a'& ch<='z'){
			flag=true;
		}else{
			flag=false;
		}
		return flag;
	}
	
	/*
	 * [문제 2] 영문자를 입력하여 이 문자를 넘겨받아 이 문자가 소문자면 대분자로 변환 후 반환,
	 * 대문자라면 그대로 반환하는 메소드
	 * 함수명 	: checkUpper
	 * 인자		: char
	 * 리턴(반환) : boolean
	 */	
	public static char checkUpper(char ch){
		char result='a';
		if('A'<=ch & ch<='Z'){
			result = ch ;
		}else{
			result = (char)(ch-32);
		}
		return result;
	}
}
