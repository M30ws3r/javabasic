package c_control;

public class Ex04_switch_주민번호 {

	public static void main(String[] args) {
		String id="801212-1234567";
		char chul=id.charAt(7);
		
		String local="";
		switch(chul){
		case '0' : local = "서울";
				break;
		case '1' : local = "인천/부산";
				break;
		case '2' : local = "경기";
				break;
		case '9' : local = "제주";	
				break;
		default : local = "한국";
				break;
		}
		System.out.println("당신은 "+local+"출신입니다");
	}
}

/* 주민번호에서 출신지번호가
 * 	 0 : 서울
 * 	 1 : 인천/부산
 *   2 : 경기
 *   9 : 제주
 *   나머지 : 한국
 *   
 *   if( chul == '0'){
 *   	 서울
 *   }else if( chul =='1'){
 *   	 인천/부산
 *   }else if( chul =='2'){
 *   	 경기
 *   }else if( chul =='9'){
 *   	 제주
 *   }else{
 *   	 한국
 *   }
 */