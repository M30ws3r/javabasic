package j_inherit2;

import java.util.Scanner;

public class Polymorphism{
	//코딩으로 다양한 상황에 따라서 변칙적으로 적용 가능함. 

	public static void main(String[] args) {
		
		Item i = null;
		Scanner input = new Scanner(System.in);
		System.out.println("원하는 상품 선택 (1.책 2.DVD 3.CD) )->");
		int sel = input.nextInt();
		
		switch(sel) {
		case 1 : i = new Book("001","자바책","ICT","자바썜"); break;
		case 2 : i = new Dvd("002", "아바타2", "AI", "카메룬"); break;
		case 3 : i = new Cd(); break;
		}
		i.output();
	}
}