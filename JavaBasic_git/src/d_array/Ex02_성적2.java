package d_array;
/*
 * 5명의 국어점수 입력(입력예시 : 10/10/10/10/10)->55/66/75/69/72
총점은 xxxx, 평균은 oooo 입니다.
*/
import java.util.*;

public class Ex02_성적2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("5명의 국어점수를 입력하시오: ");
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str,"/");
		int n = st.countTokens();
		int[] kor = new int[n];

		int total=0, avg=0;
		
		//kor에 점수들 넣기
		for(int i=0; i<n; i++){
			kor[i] = Integer.parseInt(st.nextToken());
		}
		
		//총점구하기
		for(int i=0; i<n; i++){
			total += kor[i];
		}
		
		//총점과 평균 출력
		avg = total/kor.length;
		System.out.println("학생들 국어점수의 총점: "+total);
		System.out.println("학생들 국어점수의 평균: "+avg);
		}
	}
