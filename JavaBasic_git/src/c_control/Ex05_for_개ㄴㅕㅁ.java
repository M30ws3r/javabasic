package c_control;

public class Ex05_for_개ㄴㅕㅁ {

	public static void main(String[] args) {
		/*
		 * int result = 0;
		 * for(int a=1; a<=10000; a++){
		 * 		result += a;
		 * }System.out.print("결과:"+result);
		 */
		
		for(int a=10; a>0 ;a-=2) {
			System.out.print(a+" ");
		}
		System.out.println("\n");
		
		//1부터 10까지의 홀수의 합과 짝수의 합을 구하기
		int odd =0, even=0;
		for(int i=1; i<=10; i++) {
			int ans = (i%2==1)? (odd+=i): (even+=i); //true;1,3,5,7,9 false;2,4,6,8,10
		}
		System.out.print("범위 홀수 합:"+odd+"\n"+"범위 짝수 합:"+even);
		
		//Z>>A까지
//		for(char ch='Z'; ch>='A'; ch--) {
//			System.out.print(ch);
//		}System.out.println("\n");
//		
//		
//		for(char ch='A'; ch<='Z'; ch++) {
//			System.out.print(ch);
//		}System.out.println("\n");
//		
//		for(char ch='가'; ch<='힣'; ch++) {
//			System.out.print(ch);
//		}System.out.println("\n");
	}

}
