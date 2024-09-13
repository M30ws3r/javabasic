package c_control;

import java.time.LocalDate;
//import java.util.Calendar;

public class Ex03_나이구하기 {
	public static void main(String[] args) {
		//String id = "800101-2123456";
		//String id = "010101-4123456";
		String id = "200101-2123456";
		//String id = "200101-4123456";
		
		// 올해연도 구하기
		LocalDate current_date = LocalDate.now();
		int current_year = current_date.getYear();
		// 올해연도 구하기 ft.Calendar
		//Calendar cal = Calendar.getInstance();
		//int year = cal.get(Calendar.YEAR);
		
		String nai = id.substring(0,2); // nai = "80"
		int sunai = Integer.parseInt(nai); // 문자열"80" -> int형 80 으로!
		
		int age=0;
		
		char sung = id.charAt(7);
		if(sung=='1'||sung=='2'){   				  // 성별문자가 '1'이거나 '2'라면
			age = current_year - (1900 + sunai) + 1;  //age = 2024 - (1900 + sunai) + 1;
		}else if(sung=='3'||sung=='4'){				  // 성별문자가 '3'이거나 '4'라면
			age = current_year - (2000 + sunai) + 1;  //age = 2024 - (2000 + sunai) + 1;
		}
		System.out.println("한국나이=" + age);
	}
}

/*
 * Wrapper class: 자료형 클래스
 * 
 *	int    : Integer
 *	long   : Long
 *	double : Double
 * 
 */
