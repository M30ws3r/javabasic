package c_control;

public class Ex01_if_전화번호 {
	public static void main(String[] args) {
		String tel = "052-222-2222";
		int idx = tel.indexOf('-'); // indexOf('n') - 가장 앞에 있는 n의 index number 도출
			//System.out.println(idx);
		String localNum = tel.substring(0, idx); // 0번째부터 idx(2) 앞에까지의 문자열 추출
		System.out.println(localNum);
		/*
		 * 지역번호가 02라면 "서울" 출력
		 * 그렇지 않고 지역변수가 032라면 "인천"출력
		 * 나머지는 "한국"출력
		 */
		String local = "";
		if(localNum.equals("02")){
			local = "서울";
		}else if(localNum.equals("032")){
			local = "인천";
		}else{
			local = "한국";
		}System.out.println("지역: "+local);
	}
}

/*
 * 02-222-2222
 * 032-123-1234
 * 051-555-9876
 * 0505-123-1234
 */