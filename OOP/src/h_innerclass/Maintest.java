package h_innerclass;

/*
 *  inner class : 클래스 안에 클래스 (멤버 취급)
 */

class Outer{
	static class Inner{ // inner class 는 멤버라 static 붙일 수 있음 > Inner 호출 가능해짐!
		static void najabara(){ //마찬가지로 static 붙으면 호출 가능해짐!!
			System.out.println("잡아봅시다");
		}
	}
}

public class Maintest{

	public static void main(String[] args){
//		Outer o = new Outer();
//		Outer.Inner in = o.new Inner();
//		in.najabara();
		//Outer.Inner in = new Outer.Inner();
		//in.najabara();
		Outer.Inner.najabara();
	}
}
