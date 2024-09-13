package j_inherit2;

public class PolySample {

	public static void main(String[] args){
		Item[] result = method();
		//처리(출력)
		for(int i=0; i<result.length; i++){
			result[i].output();
			//똑같은 코딩인데 상황에 따라 다르게 출력됨 - polymorphism
		}
	}
	static Item[] method(){
	
		Book b = new Book("001", "아바타2", "ICT", "누군가");
		Dvd  d = new Dvd("002", "탈주", "한국인", "한국감독");
		Cd 	 c = new Cd();
		
		//굳이 오브젝트 필요 없음. Item으로 가면 됨.
		Item[] obj = new Item[3];
		obj[0]=b;
		obj[1]=d;
		obj[2]=c;
		
		return obj;
	}
}
