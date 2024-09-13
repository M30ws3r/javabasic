package e_method;

import java.util.Scanner;

public class Ex99_복습3{

	public static void main(String[] args){
		char[][] ch = input();
		output(ch);
	}
	
	/*
	문자 배열에 저장된 문자들을 화면에 출력한다.
	*/
	static void output(char[][] ch){
		int a = ch.length;
		int b = ch[0].length;
		for(int i=0; i<a; i++){
			 for(int j=0; j<b; j++){
				 System.out.print(ch[i][j]+"  ");
			 }
			 System.out.println();
		 }
	}

	/*
	두 정수와 알파벳 문자 하나를 입력받는다
	[예] 3 4 F
	*/	
	static char[][] input(){
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 두 개를 입력하세요:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.print("알파벳 문자 하나를 입력하세요:");
		char al = sc.next().charAt(0);
		
		sc.close();
		return makeSquare(a, b, al);
	}
	
	// 입력받은 첫 번째 정수만큼의 행과 두번째 정수만큼의 문자 배열을 만들어
	//		입력받은 문자를 시작으로 저장한다. 
	/*
	 * 		F	G	H	I
	 * 		J	K	L	M
	 * 		N	O	P	Q
	 * 		char[][] ch = [[F G H I][J K L M][N O P Q]]
	 */
	static char[][] makeSquare(int a, int b, char al){
		 char[][] ch = new char[a][b];
		 for(int i=0; i<a; i++){
			 for(int j=0; j<b; j++){
				 ch[i][j] = al;
				 al++;
			 }
		 }
		 return ch;
	}
}