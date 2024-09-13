package Class_basic2;

public class Product{
	private String productNo;
	private String productName;
	private int stock;

	public void setProductNo(String productNo){
		this.productNo = productNo;
	}
	public void setProductName(String productName){
		this.productName = productName;
	}
	public void setStock(int stock){
		this.stock = stock;
	}
	
	public void income(int n){
		stock+=n;
	}
	public void sale(int n){
		stock-=n;
	}
	public void output(){
		System.out.printf("상품번호: %4s, 상품명: %4s, 재고량: %4d", productNo, productName, stock);
	}
}
