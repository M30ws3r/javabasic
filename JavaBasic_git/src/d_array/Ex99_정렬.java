package d_array;

public class Ex99_정렬 {

	public static void main(String[] args) {
		//두 변수의 값 맞바꾸기 (swapping)
		int [] lotto = {45, 2, 15, 27, 10, 42};
		
		//버블정렬
		for(int i=0; i<lotto.length; i++){
			for(int j=0; j<i ; j++){
				if( lotto[j]>lotto[j+1]) {
					int temp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = temp;
				}
			}
		}
		//선택정렬(불안정 정렬)
		for(int i=0; i<lotto.length; i++){
			int min_index = i;
			for(int j=i+1; j<lotto.length; j++){
				if( lotto[j]<lotto[min_index]) {
					min_index=j;
				}
			}
		}
		//삽입정렬
		for(int i=1; i>lotto.length; i++){
			int target = lotto[i];
			int j =i-1;
			while(j>=0 & target<lotto[j]){
				lotto[j+1]=lotto[j];
				j--;
			}
			lotto[j+1]=target;
		}
	}
}

/*[예시] bubble sort
*
* [원리] insert sort
* 		select sort
*/

/*	int a=5, b=6;
 *  int temp =a;
 *  a = b;
 *  b = temp;
 */