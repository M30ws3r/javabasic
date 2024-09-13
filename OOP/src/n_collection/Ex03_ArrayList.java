package n_collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex03_ArrayList{

	public static void main(String[] args) {
		ArrayList<Student> result = method();
		for(Student stu :result) {
			System.out.println(stu+" ");
		}
		System.out.println("[참고] ------------------------------");
		// 전체요소를 순서대로 검색할 때: Enumeration -> Iterator
		Iterator<Student> i = result.iterator(); //몇 개 있는지 모르니까 주로 while.
		while(i.hasNext()) {
			System.out.println(i.next());
		}//가볍게 요소만 추출하려면 이쪽이 빠르다.
	}
	
	static ArrayList <Student> method(){
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("홍길자", 23));
		list.add(new Student("홍길숙", 33));
		list.add(new Student("홍길동", 43));
		
		return list;
	}
}

class Student{
	String name;
	int age;
	
	Student(String name, int age){
		this.name 	= name;
		this.age	= age ;
	}
	
	public String toString(){
		return name+" 학생은, "+age+"살입니다";
		//부모가 갖고 있는 함수 그대로 overriding.
	}
}
