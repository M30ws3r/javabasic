package b_operator;

public class Ex01_IncDec {

	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		
		System.out.println("A=" + a +", B="+b);
		//System.out.printf("A=%d, B=%d", a, b);
		System.out.println("A=" + a+1 +", B="+b+1); //[주의] A=51
		System.out.println("A=" + (a+1) +", B="+(b+1));
		
		/*
		 * a=a+1;
		 * b=b+1;
		 * System.out.println("A="+a+", B="+b);
		*/
		
		a++; // a=a+1
		b++; // b=b+1
			 // b--; b=b-1
		System.out.println("A=" + a + ", B=" + b);
		
		++a; // a = a + 1;
		--b; // b = b - 1;
		System.out.println("A=" + a + ", B=" + b);
		
		//--------------------------------------------
		int z = 10, y = 10;
		int result = ++z;  //z = z + 1; int result = z;
		System.out.println(result);
		
		int result2 = y++; //int result2 = y ; int y=y+1;
		//result2 에다가 y를 먼저 넣고 y+1. result2 출력시 증가하기 전 y가 나옴
		System.out.println(result2);
		
		System.out.println("Z="+ z + ",Y=" + y); //Z=11, Y=11
		
		System.out.println("Z="+ ++z +",Y="+ --y); //Z=12 , Y=10
		System.out.println("Z="+ z++ +",Y="+ y--); 
		//Z=12 , Y=10 출력이 먼저되고 나서 연산됨 Z=13, Y=9
		
		System.out.println("Z="+z+",Y="+y); // Z=13, Y=9
	}
}
