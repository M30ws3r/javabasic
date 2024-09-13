package n_collection;

import java.util.*;

public class Ex04_Set{

	public static void main(String[] args){
		Set set = new HashSet();
		//파이썬에서 많이 쓴다.
		
		// index 없어서 몇번째와 몇번째를 바꿔달라 하는 함수 없음.
		set.add("zebra");
		set.add("cat");
		set.add("dog");
		set.add("and");
		set.add("dog");
		set.add("dog");
		
		System.out.println(set);
	}

}
