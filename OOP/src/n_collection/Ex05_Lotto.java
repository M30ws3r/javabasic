package n_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex05_Lotto{

	public static void main(String[] args) {
		Set<Integer> lotto = new HashSet<>();
		while(lotto.size()<6){

			//int n = (int)(Math.random()*45)+1;
			//lotto.add(n);
			
			lotto.add((int)(Math.random()*45)+1);
		}
		List list = new ArrayList(lotto);
		Collections.sort(list);
		System.out.println(list	);
	}
}
