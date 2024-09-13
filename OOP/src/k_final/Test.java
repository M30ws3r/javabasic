package k_final;

/*
 * 	final : 변경불가
 * 
 * 		- class : 부모가 되기를 거절한다!!!
 * 		- field : 값변경 X
 * 		- method: overriding(기존 부모의 함수를 자식선에서 재정의.) X
 */
class Parent{
	String field = "부모님꺼"; //변수 앞에 final 붙이면은 값을 변경 못 함.
	void jib(){
		System.out.println("부모님이 만드신 집");
	}
}

class Child extends Parent{
	Child(){
		//field = "내꺼"; //변수는 부모것인데 자식이 마음대로 바꿔서 갖다 씀.
	}
	void jib(){
		System.out.println("자식이 유지");
	}
}

public class Test{
	public static void main(String[] args){
		Parent p = new Child();
		System.out.println(p.field);
		p.jib();
	}
}
