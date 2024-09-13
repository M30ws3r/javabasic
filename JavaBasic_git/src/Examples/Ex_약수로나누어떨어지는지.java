package Examples;

import java.util.Scanner;
import java.util.ArrayList;

public class Ex_약수로나누어떨어지는지 {

	public static void main(String[] args) {
		int a,b;
		Scanner input = new Scanner(System.in);
		System.out.print("배수 후보 입력> ");
		a = input.nextInt();
		System.out.print("약수 후보 입력> ");
		b = input.nextInt();
		
		if(a % b == 0){
			System.out.println(b + "은(는), " + a +" 의 약수이다.");
		}else{
			System.out.println(b + "은(는), " + a + "의 약수가 아님! \n");
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int c=1; c<=a; c++) {
			if(a%c==0){
				list.add(c);
			}
		}
		
		int listlen = list.size();
		System.out.println(a + "의 약수목록: " + list);
		if(listlen == 2 ){
			System.out.println(a + "은(는) 소수이다.");
		}else {
			System.out.println(a + "은(는) 소수가 아니다.");
		}
	}
}
