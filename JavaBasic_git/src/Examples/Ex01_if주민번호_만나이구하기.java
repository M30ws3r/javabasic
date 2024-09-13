package Examples;

import java.util.Calendar;
import java.util.Scanner;

public class Ex01_if주민번호_만나이구하기 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int mon = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.print("주민등록번호를 입력해주세요(-포함):");
		String id = input.nextLine();

		String nai = id.substring(0,2);
		String Mon = id.substring(2,4);
		String Day = id.substring(4,6);

		int sunai = Integer.parseInt(nai); // Integer (int 의 클래스형) + parseInt (int)로 형변환
		int monnai = Integer.parseInt(Mon);
		int daynai = Integer.parseInt(Day);
		int age = 0;
		int manage = 0;
		String sung = id.substring(7,8);
		if(sung.equals("1") | sung.equals("2")) {
			age = year - (1900 + sunai) + 1;

			if (mon <  monnai ) {
					manage = year -(1900 + sunai)-1;
			}
			else if(mon == monnai) {
				if(day < daynai) {
					manage = year -(1900 + sunai)-1;
				}
				else if(day >= daynai) {
					manage = year -(1900 + sunai);
				}
			}
			else if(mon >  monnai ) {
					manage = year -(1900 + sunai);
				}
			}
	

		else if(sung.equals("3") | sung.equals("4")) {
			age = year - (2000 + sunai) + 1;
			if (mon <  monnai ) {
					manage = year -(2000 + sunai)-1;
			}
			else if(mon == monnai) {
				if(day < daynai) {
					manage = year -(2000 + sunai)-1;
				}
				else if(day >= daynai) {
					manage = year -(2000 + sunai);
				}
			}
			else if(mon >  monnai ) {
					manage = year -(2000 + sunai);
				}
			}
		System.out.println("한국나이:" + age);
		System.out.println("만나이:" + manage);
	}
}

/*
 *	Wrapper class : 자료형 클래스
 *
 *		int 	: Integer
 *		long 	: Long
 *		double	: Double 
 * 
 */