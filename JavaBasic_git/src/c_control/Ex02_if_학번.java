package c_control;

import java.util.Scanner;

public class Ex02_if_학번 {

	public static void main(String[] args){
		//String stu = "2017111001";
					  //0123456789
		Scanner sc = new Scanner(System.in);
		String stu = sc.next();				 //학번 hakbun
		String year = stu.substring(0,4);    // 0번째부터 idx(4)앞까지의 문자열 추출 (이상, 미만)
		String school = stu.substring(4,5);  // 단과대 번호 dan
		String Class = stu.substring(5,7);   // 학과
		/*
		 * 지역번호가 02라면 "서울" 출력
		 * 그렇지 않고 지역변수가 032라면 "인천"출력
		 * 나머지는 "한국"출력
		 * 
		 * charAt(n) - 문자열로부터 n 에 있는 알파벳 추출
		 */
		if(school.equals("1")){
			school = "공대";
			if(Class.equals("11")){
				Class = "컴퓨터학과";
			}else if(Class.equals("12")){
				Class = "소프트웨어학과";
			}else if(Class.equals("13")){
				Class = "모바일학과";
			}else if(Class.equals("22")){
				Class = "자바학과";
			}else{
				Class = "서버학과";
			}
		}else{
			school = "사회대";
			if(Class.equals("11")){
				Class = "사회학과";
			}else if(Class.equals("12")){
				Class = "경영학과";
			}else{
				Class = "경제학과";
			}
		}
	  //결과출력
	  //String result=hakbun+" 는 "+year+"년도에 입학한 "+school+" "+Class+" 학생입니다");
		System.out.println(stu+" 는 "+year+"년도에 입학한 "+school+" "+Class+" 학생입니다");
	}
}
