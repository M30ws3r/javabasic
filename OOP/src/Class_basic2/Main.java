package Class_basic2;

import java.util.Scanner;

import c_exercise2.Student;

public class Main{

	public static void main(String[] args){
		Product[] p=new Product[1]; //배열 잡아놓음.
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<p.length; i++){
			p[i] = new Product();
			System.out.print("상품번호 입력:");
			p[i].setProductNo(sc.next());
			System.out.print("상품명 입력:");
			p[i].setProductName(sc.next());
			System.out.print("초기재고량 입력:");
			p[i].setStock(sc.nextInt());
			System.out.println();
		
			System.out.print("판매량 입력:");
			p[i].sale(sc.nextInt());
			p[i].output();
			System.out.println("\n");
		
			System.out.print("입고량 입력:");
			p[i].income(sc.nextInt());
			p[i].output();
			System.out.println();
		}
	}
}
