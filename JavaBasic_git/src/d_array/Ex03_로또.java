package d_array;

public class Ex03_로또 {

	public static void main(String[] args) {
		//값지정: 임의의 값
		//숫자 6개를 5줄로...ㄱ-
		/*
		 *   [ * * * * * * ]
		 *   [ * * * * * * ]
		 *   [ * * * * * * ]
		 *   [ * * * * * * ]
		 *   [ * * * * * * ]
		 */
		int [][]lotto=new int[5][6];
		for(int i=0; i<5; i++){
			for(int j=0; j<6; j++){
				lotto[i][j]=(int)(Math.random()*45)+1;
				for(int k=0; k<j; k++){
					if(lotto[i][j]==lotto[i][k]) j--;
					//6개의 숫자 내에서 중복값 없게.
				}
			}
		}
		for(int i=0; i<5; i++){
			for(int j=0; j<6; j++){
				System.out.printf("%2d ",lotto[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		//열에 대해서 오름차순 정렬
		for(int i=0; i<5; i++){
			for(int j=0; j<6; j++){
				for(int k=0; k<6; k++){
					if(lotto[i][j]<lotto[i][k]){
						int temp = lotto[i][j];
						lotto[i][j]=lotto[i][k];
						lotto[i][k]=temp;
					}
				}
			}
		}
		
		for(int i=0; i<5; i++){
			for(int j=0; j<6; j++){
				System.out.printf("%2d ",lotto[i][j]);
			}
			System.out.println();
		}
	}
}
