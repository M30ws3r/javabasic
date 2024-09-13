package Examples;

public class Heart {
	public static void main(String[] args) {
		int maxNum = 4;
		
		for(int i=0; i<maxNum; i++) {
			
			for(int j=maxNum-i;j>0;j--) {
				System.out.print(" ");
			}
			//왼쪽 귀 범위
			for(int k=1; k<=i*2; k++) {
				System.out.print("*");
			}
			//오른쪽 귀 모양잡기
			for(int j=(maxNum*2)-(i*2);j>0;j--) {
				System.out.print(" ");
			}
			//오른쪽 귀 범위
			for(int k=1; k<=i*2; k++) {
				System.out.print("*");
			}
			System.out.println();	
		}
		
		for(int i=0; i<maxNum*2-1; i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
				count++;
			}
			for(int k=0; k<(maxNum*4)-(count*2); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
