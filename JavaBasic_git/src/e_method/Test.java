package e_method;

//기초다지기
//[문제다지기 1]다음 프로그램의 결과는?
//public class Test{
//	public static void main (String[] args){
//		int i=4, j=2;
//		method(i, j);
//		System.out.println("i = " + i );
//	}
//	public static void method(int i, int j){
//		i <<= j; //shift 연산자. 4에서 2칸 올려갔으니 16나올거임.
//	}
//}

//[문제다지기 2]다음 아래의 method 메소드를 오버로딩 한 메소드들은?
//long  method(int a,int b){return a+b;}
//	(1)  void method (int x,int y) 	 { return x+y; };
//	(2)  long method (long a,long b) { return a+b; };
//	(3)  long Method (long a,long b) { return a+b; };
//	(4)  long method (int a,long b)  { return  a+b;};

//[문제다지기 3]다음 프로그램의 결과는?
//public class Test{
//	public static void main(String[] args){
//	     int i=4, j=2;
//	     method2(i, j);
//	     System.out.println("i="+i+" ,j="+j);
//	}
//	public static void method2(int i,int j){
//     	i+=j;
//     	System.out.println("i="+i+" ,j="+j);
//	}
//}

//[문제다지기 4]다음 프로그램의 결과는?
//class Test{
//	public static void main(String[] args){
//	     String i="안녕", j="자바";
//	     method(i, j);
//	     System.out.println("i="+i+" ,j="+j);
//	}
//	static void method(String i,String j){
//		i+=j;
//		System.out.println("i="+i+" ,j="+j);
//	}
//}

//[문제다지기 5] 다음 프로그램의 결과는?
class Test{
	public static void main(String [] args){
	     int i=4, j=2;
	     int sum=0;
	     method(i, j);
	     System.out.println("sum="+sum);
	}
	static int method(int i, int j){
		int sum=i+j;
		System.out.println("sum="+sum);
		return sum;
	}
}