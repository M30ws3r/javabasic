package b_operator;

import java.util.Scanner;

public class Ex06_복습 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("문자 하나를 입력하세요-> ");
	char ch = input.nextLine().charAt(0); //우리가 봤을 때 프로그래밍


	//사용자가 입력한 문자가 대문자인지 여부 출력
	if(ch>=65 & ch<=90) { // 문자가 'A'보다 크거나 같고, 문자가 'Z'보다 작거나 같다면
						  // ch >='A' && ch<='Z'
		System.out.println("대문자");
	}else if(ch>=61 & ch<=122){ //그렇지 않다면 문자가 'a'보다 크거나 같고 'z'보다 작거나 같다면
								//ch>='a' && ch<='z'
		System.out.println("소문자");
	}else {	//그렇지 않다면
			//'기타 문자'라고 출력
		System.out.println("기타 문자");
	}
	
	//Ascii-code
	//	'A' : 65
	//  'B' : 66
	//  'B' : 'A'
	
	//'가' ~ '힣'
	}
}

/*
  자동 임포트 : ctrl + shift + O
*/