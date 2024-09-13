package e_method;

public class Ex99_복습1 {
	public static void main(String[] args){ //흐름적 판단 해야!!
		System.out.println("A"); 	//line 5 시작!
		test();						//line 6 >>line 9 
		System.out.println("B");	//line 17 >> 완료.
	}
	static void test(){
		System.out.println("C"); 	//line 9 > line 10
		sample();					//line 11 >> line 15
		imsi();						//line 12 >> line 18
		System.out.println("D");	//line 13 > line 7(6완료)		
	}	
	static void sample(){			//line 15 > line 16
		System.out.println("E");	//line 16 >> line 12(11완료)
	}
	static void imsi(){				//line 18 > line 19
		System.out.println("F");	//line 19 > line 13(12완료)
	}
}
// >> ACEFDB