package c_control;

public class Ex06_for중첩_알파벳 {
	public static void main(String[] args) {
		
//		for(int i=0;i<26;i++) { //26번 출력 반복문
//			for(char ch='A';ch<='A'+i;ch++){ 
//				System.out.print(ch);
//			}
//			System.out.println();
//		}//[문제 1]
		
//		for(int i=26;i>=0;i--) { //26번 출력 반복문
//			for(char ch='A';ch<'A'+i;ch++){ 
//				System.out.print(ch);
//			}
//			System.out.println();
//		}//[문제 2]
		
		for(int i=26;i>=0;i--) { //26번 출력 반복문
			for(char ch='Z';ch>='A'+i;ch--){ 
				System.out.print(ch);
			}
			System.out.println();
		}//[문제 3]
		
//		for(int i=0;i<26;i++) { //26번 출력 반복문
//			for(char ch='Z';ch>='A'+i;ch--){ 
//				System.out.print(ch);
//			}
//			System.out.println();
//		}//[문제 4]
		
//		for(char ch=(char)('A'+i); ch<='Z'; ch++) {
//		System.out.print(ch);
//		}
//		System.out.println();
//	}//[문제 4] 다른 풀이
		
	}
}
