package d_array;

public class Ex00_반복문복습 {

	public static void main(String[] args) {
		//로또번호 만들기
		double temp = Math.random();  // 0.0 <= 랜덤값 < 1.0
		int temp1 = (int)(Math.random()*10)+1;  // 1~10 까지의 랜덤값 나옴
		int temp2 = (int)(Math.random()*45)+1;  // 1~45 까지의 랜덤값 나옴
		System.out.print(temp+" "+temp1+" "+temp2+"\n");
		
		//for문
		for(int i=0; i<6; i++) {
			int tem = (int)(Math.random()*45)+1;
			System.out.print(tem+"/");
		}
		System.out.println();
		//while문
		int j=0;
		while(j<6) {
			int tem = (int)(Math.random()*45)+1;
			System.out.print(tem+"/");
			j++;
		}	
		System.out.println();
		//do-while
		int k=0;
		do{
			int tem = (int)(Math.random()*45)+1;
			System.out.print(tem+"/");
			k++;
		}while(k<6);
		System.out.println();
	}//main
}//class
