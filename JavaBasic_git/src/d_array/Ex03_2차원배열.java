package d_array;

public class Ex03_2차원배열 {

	public static void main(String[] args) {
		char [][] alpha = new char[3][4];
		//기본출력
		for(int i=0; i<alpha.length; i++){
			for(int j=0; j<4; j++) {
				alpha[i][j]='*';
			}
		}
		
		//값입력
		char ch = 'A';
		for(int i=0; i<alpha.length; i++){
			for(int j=0; j<alpha.length; j++) {
				alpha[i][j]=ch;
			}
		}
		
		//값출력
		for(int i=0; i<alpha.length; i++){
			for(int j=0; j<alpha.length; j++){
				System.out.print(alpha[i][j]+" ");
			}
			System.out.println();
		}
	}
}
