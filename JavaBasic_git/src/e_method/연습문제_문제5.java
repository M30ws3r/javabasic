package e_method;

import java.util.Arrays;
import java.util.Scanner;

public class 연습문제_문제5{
	public static void main(String[] args){	
		//5, [1,5,4,3,2,5,2,5,5,4] 의 경우
		int N1 = 5;
		int[] votes1 = {1,5,4,3,2,5,2,5,5,4};
		int[] ret1 = solution(N1, votes1);
		System.out.println("투표결과[1,5,4,3,2,5,2,5,5,4], "+Arrays.toString(ret1)); 	//실행결과
		
		//4, [1,3,2,3,2] 의 경우
		int N2 = 4;
		int[] votes2 = { 1, 3, 2, 3, 2 };
		int[] ret2 = solution(N2, votes2);
		System.out.println("투표결과[1,3,2,3,2], "+Arrays.toString(ret2));
	}

	public static int[] solution(int N, int[] votes){
		int answer[]=null;
		int candidate[]=new int[N];
		
		//개표해서 candidate[5] 안에 넣어줌.
		for(int i=0; i<votes.length; i++){
			candidate[votes[i]-1]++;
		}//[1,5,4,3,2,5,2,5,5,4] - candidate[0]++, candidate[4]++, ...
		
		//값 비교해서 max=최대득표자(candidate[?]);
		int max=candidate[0];
		int max_cnt=0;
		for(int i=0; i<N; i++){
			if(max < candidate[i]){
				max = candidate[i];
			}
		}
		
		//동일 득표수 있는지 체크해주기
		for(int i=0; i<N; i++){
			if(max==candidate[i]){
				max_cnt++;
			}
		}
		//답[배열] = [length; 최다득표 후보자 수](중복값이 있다면 둘 다 넣어주기);
		answer = new int[max_cnt];
		int k=0;
		
		for(int i=0; i<N; i++) {
			if(max == candidate[i]) {
				answer[k] = i+1;
				k++;
			}
		}
//		//최대득표자(중복값 후보자)들 번호 비교 후 오름차순 정렬
//		for(int i=0; i<max_cnt; i++) {
//			for(int j=0; j<max_cnt; j++) {
//				if(i!=j && answer[i] < answer[j]) {
//					int temp = answer[i];
//					answer[i] = answer[j];
//					answer[j] = temp;
//				}
//			}
//		}
		return answer;
	}
}