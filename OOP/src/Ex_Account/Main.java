package Ex_Account;

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		//계좌 정보 입력ㄴ
		Scanner sc = new Scanner(System.in);
		System.out.println("예금주명을 입력하시오:");
		String accountOwner = sc.next();
		System.out.println("계좌번호를 입력하시오:");
		String accountNum = sc.next();
		System.out.println("계좌 잔고를 입력하시오:");
		int left = sc.nextInt();
		System.out.println();
		
		//계좌 객체 생성
		Account acc = new Account(accountOwner, accountNum, left);
		//계좌정보 출력
		acc.accountInfo();
		
		//출금
		System.out.println("출금할 금액을 입력하시오:");
		int with = sc.nextInt();
		acc.withdraw(with);
		System.out.println();
		
		//입금
		System.out.println("입금할 금액을 입력하시오:");
		int depo = sc.nextInt();
		acc.deposit(depo);
		System.out.println();
		
		sc.close();
	}
}