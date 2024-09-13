package c_control;

public class 방탈출문제 {

	public static void main(String[] args) {
		// 1이상 10000이하 '8' 카운터
		int count=0;
		for(int i = 1; i <= 10000; i++) {
			int n = i;
			while(0 < n) {
				if(n % 10 == 8){
					count++;
				}
				n/=10;
			}
		}
		System.out.println(count + "번");
		}
	}
