package n_collection;

public class Ex00_Objects {

	public static void main(String[] args) {
		
		//println : 오버로딩임.
		//조상님이 Object인 객체들 모두 그냥 프린트 가능.
		StudentA a = new StudentA("01234", "홍길동");
		StudentA b = new StudentA("01234", "홍길동");
		//그냥 해버리면 print 서 주소값 나옴.
		
		System.out.println(a.toString());
		System.out.println(b.toString());
		
		if(a.equals(b)){
			
		}else{
			
		}
	}
}

class StudentA{
	String hakbun;
	String name;
	
	StudentA(String hakbun, String name){
		this.hakbun = hakbun;
		this.name 	= name;
	}
	public boolean equals(Object obj) {
		StudentA other = (StudentA)obj;
		
		if(hakbun.equals(other.hakbun)){
			return true;
		}else{
			return false;
		}
	}
	
	public String toString(){
		return "학번:"+hakbun+" 이름:"+name;
		//부모가 갖고 있는 함수 그대로 overriding.
	}
}
