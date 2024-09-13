package c_control;

import java.util.Scanner;

/*
 * 콘솔로 전화번호 입력받아서
 * 지역번호를 추출하여
 * switch 문장을 이용하여 지역이름을 출력
 * ex) 02  : 서울
 * 	   032 : 인천
 * 	   031 : 경기
 *     064 : 제주
 *     나머지 : 한국
 */

public class Ex04_switch_전화번호 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("번호를 입력하세요: "); 	//02-304-2745
		String tel = sc.next();
		
		int idx = tel.indexOf('-');
		String localnum = tel.substring(0,idx);
		
		String local ="";
		switch(localnum) {
		case "02": local = "서울";
			break;
		case "032": local = "인천";
			break;
		case "031": local = "경기";
			break;
		case "064": local = "제주";
			break;
		default : local = "한국";
			break;
		}
		System.out.println("지역: "+local);
	}

}
