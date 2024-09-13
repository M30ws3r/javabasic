package d_array;

public class Ex04_2차원배열연습 {

	public static void main(String[] args) {
		int a[][]={{3,-5, 12 }, {-2, 11, 2, -7}, {21, -21, -35, -93, -11}, {9, 14, 39, -98}};
		
		//출력
//		for(int i=0; i<4; i++) {
//			for(int j=0; j<a[i].length ;j++) {
//				System.out.print(a[i][j]+"/");
//			}
//			System.out.println();
//		}
		
		//a 배열의 모든 값의 합을 구하기
//		int sum = 0;
//		for(int i=0; i<a.length; i++) {
//			for(int j=0; j<a[i].length; j++) {
//				sum += a[i][j];
//			}
//		}
//		System.out.println("합:"+sum);
		
		//--------------------------------
		//각 행의 합들의 합이 가장 큰 행을 출력하기
		int hap[] = new int[a.length];
		//계산위치
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				hap[i] += a[i][j];
			}
		}
		
		//출력
		for(int i=0; i<hap.length; i++) {
			System.out.println(i+"번째 줄의 합:"+hap[i]);
		}
			
		//이중에서 큰 거 구하기
		int max = hap[0];
		int idx = 0;
		for(int n=1; n<hap.length; n++){
			if(max<hap[n]) {
				max = hap[n];
				idx = n;
			}
		}
		System.out.println("줄 합에서의 최대값:"+max);
		System.out.println("최대값 줄의 index:"+idx);
	}
}
