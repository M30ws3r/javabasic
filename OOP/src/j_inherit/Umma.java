package j_inherit;

public class Umma{
	public Umma() {
		System.out.println("엄마 생성");
	}
	//overriding method - 부모&자식 똑같은 것을 가지게 되는 것.
	public void gene(){ //범위지정자는 범위
		System.out.println("부모는 부모다");
	}
	public void job(){
		System.out.println("엄마는 대장");
	}
}
