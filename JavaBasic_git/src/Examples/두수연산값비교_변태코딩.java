package Examples;

public class 두수연산값비교_변태코딩 {

   public static void main(String[] args){
//    	int a=10; int b = 5;
//        System.out.print(Math.max(Integer.parseInt(String.valueOf(a)+String.valueOf(b)),2*a*b)); 
//    }
//}
	int answer = 0;
	int n =10;
    for(int i = n; i >= 0; i -= 2)
        answer += (n % 2 == 0) ? i * i : i;
    System.out.println(answer);
   }
}
    
	