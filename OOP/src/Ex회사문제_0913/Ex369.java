package Ex회사문제_0913;

import java.util.Scanner;

public class Ex369 {
    public static void main(String[] args){
    	
    	//3,6,9 게임 진행 범위 지정
    	Scanner sc = new Scanner(System.in);
    	System.out.print("369게임 범위 입력:");
    	int n = sc.nextInt();
    	int clapCount = 0;
        
        // 1~num까지의 범위 지정 
        for (int i=1; i<=n; i++) {
            // 정수 n을 String s로 변환.
            String s = Integer.toString(i);          

            // s에 3|6|9 있다면 박수 카운트++;
            if (s.contains("3") || s.contains("6") || s.contains("9")) {
                clapCount++;
            }
        }
        // 총 박수 치는 횟수 출력
        System.out.println(clapCount + "회 손뼉을 칩니다.");
    }
}

