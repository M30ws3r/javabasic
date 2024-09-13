package n_collection;

import java.util.*;

/*
 *  자료구조 기초
 * 
 *  Stack : LIFO (Last In First Out)
 * 		   나중에 들어온 데이터 먼저 나가는 구조
 * 
 *  Queue : FIFO (First In First Out)
 *  	   먼저 들어온 데이터가 먼저 나가는 구조
 */

public class Ex08_StackQueue{

	public static void main(String[] args){
		Stack<Character> stack = new Stack<>();
		stack.push('A');
		stack.push('B');
		stack.push('C');
		System.out.println("스택에서 데이터 꺼내기 - LIFO");
		while(!stack.empty()){
			System.out.println(stack.pop());
		}
		
		Queue<String> queue = new LinkedList<String>();  //FIFO
		queue.offer("가");
		queue.offer("나");
		queue.offer("다");
		while(!stack.empty()){
			System.out.println(queue.poll());
		}
	}
}