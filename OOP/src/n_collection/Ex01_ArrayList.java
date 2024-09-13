package n_collection;
import java.util.ArrayList;
import java.util.*;

public class Ex01_ArrayList{

	public static void main(String[] args){
		
		List result = method();
		//처리
		for(int i=0; i<result.size(); i++) {
			Object obj = result.get(i); //조상님한테 모든 걸 맡겨...
			System.out.print(obj+" ");
		}

	}
	static List method(){
		String name = "홍길자";
		Integer age = 100; //int
		Double height = 190.99;
		
		List list = new ArrayList();
		// Object[] obj = new Object[갯수];
		list.add(name);
		list.add(age);
		list.add(height);
		
		return list;
	}
}
