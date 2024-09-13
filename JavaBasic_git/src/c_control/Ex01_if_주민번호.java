package c_control;

import java.util.Scanner;

/*
 *  1  : int
 * '1' : char
 * "1" : String
 */

public class Ex01_if_주민번호 {

	public static void main(String[] args) {
		//String id = "801212-1234567"; //index no.0부터 카운팅
		//char sung = id.charAt(7);
		
		//예시
		//801212-4234567
		//801212-9234567
		//801212-1234567
		
		String gender = "";
		Scanner sc = new Scanner(System.in);
		String id = sc.next();
		char sung = id.charAt(7);
		
		// 그 문자가 1이거나 3,9이라면 '남자' 출력
		// 그 문자가 2이거나 4,0이라면 '여자' 출력
		if( sung == '1' || sung =='3' || sung == '9') {
			//char 이니까 1인 정수가 아니라 char인 '1'로 비교해줘야함.
			gender = "남자";
		}else if( sung == '2' || sung =='4' || sung == '0'){
			gender = "여자";
		}else if( sung =='5'){ 
			gender = "재외국민입니다";
		}
	    System.out.printf("당신은 "+ gender +" 입니다.");
	}
}
