package n_collection;
import java.util.ArrayList;
import java.util.Collections;

public class Ex02_ArrayList{

	public static void main(String[] args){

		ArrayList<String> list = new ArrayList<String>(4);
		//<>안에는 제너릭(generics) 들어가는거.
		//ArrayList 안에 들어갈 자료형을 명확히 지정해준다.
		list.add("rabbit");
		list.add("cat");
		list.add("dog");
		list.add("fox");
		list.add("ant");
		
		System.out.println(list);
		
		list.set(3, "lion");
		System.out.println(list);
		
		list.remove(3);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);

//		for(int i=0; i<list.size(); i++){ //기존 범위보다 커지면 ArrayList가 알아서 더 잡아버림.
//										  //개수 확실하지 않을 때에 쓰면 알아서 2배로 잡아줌
//			Object obj = list.get(i);
//			System.out.print(obj+" ");
//		}
//		System.out.println("*"); //2개 더 잡아줘서 index number 2개 늘은거 확인차.
//		
//		//향상된 for 문
//		for(String temp : list){ // 변수 : 집합; 집합에서 하나씩 뽑아서 왼쪽 temp에다가 넣을거임.
//			System.out.println(temp);
//		}
	}
}
