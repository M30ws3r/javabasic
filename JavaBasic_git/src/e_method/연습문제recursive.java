package e_method;

public class 연습문제recursive{

	public static void main(String[] args){
		f(4);
		System.out.println();
		g(4);
		System.out.println();
		h(4);
		System.out.println();
		hh(4);
		System.out.println();
		abc(78);
		System.out.println();
		int i = test("110100111", 4);
		System.out.print(i);
		System.out.println();
		t(4);
	}
	
	// 1. f(4)를 호출한다면?
	public static void f(int N){
		System.out.print(N+" ");
		if(N>0) f(N-1);
	}// 4 3 2 1 0
	
	// 2. g(4)를 호출한다면?
	public static void g(int N){
		if(N>0) g(N-1);
		System.out.print(N+", ");
	}// 0, 1, 2, 3, 4,
	
	// 3. h(4)를 호출한다면?
	public static void h(int N){
		System.out.print(N+" ");
		if(N>0) h(N-2);
		System.out.print(N+" ");
	}//4 2 0 / 0 2 4
	
	// 4. hh(4)를 호출한다면?
	public static void hh(int N){
		if(N>0){
			hh(N-1);
			System.out.print(" "+N);
		}
	}// 1 2 3 4
	
	// 5. abc(78)을 호출한다면?
	public static void abc(int N){
		int r = N % 2;
		System.out.print("*");
		if(N>=2) abc (N/2);
		System.out.printf("%d", r);
		return;
	}// *******
	
	//6,7은 10진법을 2진법으로 나타낸 것 연장선.
	// 6. test ("110100111", 4)호출한다면?
	public static int test(String s,int last){
		if(last<0) return 0;
		if(s.charAt(last)=='0') return 2*test(s, last-1);
		return 1 + 2*test(s, last-1);
	}// 26
	
	// 7. 무엇을 계산하는 함수인가???
	public static void t (int N){
		if(N>0) t (N/2);
		System.out.print(N%2);
	}// 10진법 > 2진법 변환.(eg)4 > 0100)
}