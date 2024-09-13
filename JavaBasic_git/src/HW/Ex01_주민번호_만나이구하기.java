package HW;

import java.util.Calendar;
import java.util.Scanner;

public class Ex01_주민번호_만나이구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);        //달력서 해
		int mon = cal.get(Calendar.MONTH)+1;      //달력서 달
		int day = cal.get(Calendar.DAY_OF_MONTH); //달력서 일
		System.out.print("주민등록번호를 입력해주세요(-포함):");
		String id = sc.nextLine();

		String nai = id.substring(0,2); //주민등록번호서 생년 String
		String Mon = id.substring(2,4); //주민등록번호서 생월 String
		String Day = id.substring(4,6); //주민등록번호서 생일 String

		int sunai = Integer.parseInt(nai); // Integer 된 생년
		int monnai = Integer.parseInt(Mon);// Integer 된 생월 
		int daynai = Integer.parseInt(Day);// Integer 된 생일
		int manage = 0;
		int age = 0;
		int m = mon - monnai;
		//String sung = id.substring(7,8);
		
		//한국나이
		char sung = id.charAt(7);
		if(sung=='1'||sung=='2'){   				  // 성별문자가 '1'이거나 '2'라면
			age = year - (1900 + sunai) + 1;  //age = 2024 - (1900 + sunai) + 1;
		}else if(sung=='3'||sung=='4'){				  // 성별문자가 '3'이거나 '4'라면
			age = year - (2000 + sunai) + 1;  //age = 2024 - (2000 + sunai) + 1;
		}
		System.out.println("한국나이:" + age);
		
		//만나이
		if(sung=='1'||sung=='2'){   				  // 성별문자가 '1'이거나 '2'라면
			if(m<0 ||(m==0 && day < daynai)){
				manage = year - (1900 + sunai)-1;
			}else{
				manage = year - (1900 + sunai);
			}  //age = 2024 - (1900 + sunai) + 1;
		}else if(sung=='3'||sung=='4'){				  // 성별문자가 '3'이거나 '4'라면
			if(m<0 ||(m==0 && day < daynai)){
				manage = year - (2000 + sunai)-1;
			}else{
				manage = year - (2000 + sunai);
			}  //age = 2024 - (2000 + sunai) + 1;
		}
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
