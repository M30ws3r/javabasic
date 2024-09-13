package c_control;

import java.util.Scanner;
import java.util.StringTokenizer;  //StringTokenizer(str)위치. 어떤 애들을 기준으로 쪼갬
								   //(주의) 공백으로 구분하기가 기본값! 구분자 뭐로 쓸 지 지정해줘야.
								   //countTokens() 라는 함수로 token 갯수 세어줌
								   //nextToken() 읽은거, 분리한 거 다음 토큰 하나씩 읽음
/*
 * for문 : 반복횟수를 정해져 있는 경우 주로 사용
 * while문 : 반복횟수를 모를 때 주로 사용
 */

public class Ex07_while_응용 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("예: 국어/영어/수학(90 80 70): ");
		String str = sc.nextLine();
		System.out.println(str);
		StringTokenizer st = new StringTokenizer(str);     //구분 기본값: 공백. 아닌 경우 (str, char)
		int cnt = st.countTokens();
		System.out.println(cnt);      //총 token 수 출력

		//반복횟수 정확히 아는 경우
		for(int i=0; i<st.countTokens(); i++){
			String token = st.nextToken();
			System.out.println("점수: "+token);
			}
		
		//반복횟수 정확히 모르는 경우
		int i=0;
		while(i<st.countTokens()){
			String token = st.nextToken();
			System.out.println("점수: "+token);
			i++;
		}
		
		while(st.hasMoreTokens()){
			String token = st.nextToken();
			System.out.println("점수: "+token);
		}
	}
}
