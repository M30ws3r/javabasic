package b_operator;

public class Ex11_종합 {

	public static void main(String[] args) {

		int z = 10 - 7 ^ 3 + 1 * 2 & 4;
			//   			 __2__		1번째 계산 -- * 먼저
			//	___3___________5__		2번쨰 계산 -- -, +
			//	______  __________		3번째 계산 -- &
			//	        _______4______	4번쨰 계산 -- ^

		//3번쨰 계산
		//0101 -5
		//0100 -4
		// & 연산(1,1만 1)
		//0100 -4
		
		//4번째
		//0011 -3
		//0100 -4
		// ^ 연산(0,0, 1,1 은 0 서로 다르면 1)
		//0111
		
		System.out.println("Z="+z);
		
		int i =5;
		System.out.println( i++); //5
		System.out.println( i++); //6
		
		int a = -5;
		if((a>0)&&(++a/3>0)) { //이미 앞의 a>0 의 false 임으로 인해 실행 안됨.
			a++;
		}
		
		// ((a>0)&(++a/3>0)) // 이거는 답 -4 나옴
		System.out.println("A="+a); //??

	}

}
