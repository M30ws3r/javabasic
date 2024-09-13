package Ex_Account;

public class Account{
	private String accountOwner;
	private String accountNum;
	private int left;
	
	public Account(String accountOwner, String accountNum, int left) {
		this.accountOwner = accountOwner;
		this.accountNum = accountNum;
		this.left = left;
	}
	
	public void withdraw(int amount){
		if(left < amount) {
			System.out.println("잔액이 부족합니다");
		}else{
			left -= amount;
			System.out.println("출금 후 잔액:"+left+"원 입니다.");
		}
	}
	public void deposit(int amount){
		this.left += amount;
		System.out.println("계좌 잔액은:"+left+"원 입니다.");
	}
	public void accountInfo(){
		System.out.printf("예금주:%4s, 계좌번호:%14s, 잔액:%8d원\n",this.accountOwner, this.accountNum, this.left);
	}
}