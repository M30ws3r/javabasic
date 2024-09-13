package n_collection;

import java.util.TreeSet;

public class Ex06_TreeSet{

	public static void main(String[] args){
		TreeSet set = new TreeSet();
		set.add("elephant");
		set.add("tiger");
		set.add("lion");
		set.add("Gorilla");
		set.add("Giraff");
		set.add("Red panda");
		set.add("Giant panda");
		set.add("Chinchilla");
		set.add("Fox");
		set.add("zebra");
		set.add("ant");
		//중복안됨
		
		System.out.println(set);
		System.out.println(set.subSet("d","s"));
		System.out.println(set.headSet("e")); //머리부터 e 까지
		System.out.println(set.tailSet("e")); //e부터 끝까지
	}
}
