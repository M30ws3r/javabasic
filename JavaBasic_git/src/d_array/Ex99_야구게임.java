package d_array;

import java.util.Scanner;

public class Ex99_야구게임 {

	public static void main(String[] args){
		//baseball에다가 아무 정수 3개 넣기
		int[] baseball = new int[3];
		for(int i=0; i<baseball.length; i++){
			baseball[i] = (int)(Math.random()*10)+1;
			if(baseball[i]==10) {
				i--;
			}else{
				for(int j=0; j<i; j++){
					if(baseball[j]==baseball[i]) {
						i--;
					}
				}
			}
		}
		//baseball 확인
//		for(int i=0; i<baseball.length; i++) {
//			System.out.print(baseball[i]+" ");
//		}
		//------------------------------------
		// 2. 사용자 입력값 answer에 각각의 숫자로 저장
		//		[ex] 3 4 5
		int []answer = new int[3];
		for(int i=0; i<baseball.length; i++){
			answer[i] = baseball[i];
			}
		//answer확인
//		for(int i=0; i<baseball.length; i++) {
//			System.out.print(baseball[i]+" ");}
		
		//구문작성 - 스캐너로 받아서 inputArray에 넣기
		Scanner sc = new Scanner(System.in);
		int[] inputArr = new int[3];
		
		while(true){
			System.out.println("3개의 정수 입력: ");
			for(int i=0; i<3; i++){
				inputArr[i] = sc.nextInt();
				for(int j=0; j<i; j++) {
					if(inputArr[i]==inputArr[j]){
						System.out.println("중복! 다시 입력해주세요: ");
						i--;
					}
				}
			}
			int strike=0, ball=0;
			
			for(int i=0; i<inputArr.length; i++){
				for(int j=0; j<baseball.length; j++){
					if(inputArr[i]==baseball[j]) {
						if(i==j) strike++;
						else ball++;
					}
				}
			}
			if(strike==0&ball==0){
				System.out.println("Out");
			}else{
				System.out.println("strike: "+strike+"/"+"ball: "+ball);
			}
			if(strike!=3){
				continue;
			}else{
				System.out.println("success!");
				break;
			}
		}
		sc.close();
	}//main
}//class
