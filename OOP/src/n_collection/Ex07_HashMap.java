package n_collection;

import java.util.HashMap;
import java.util.Scanner;

public class Ex07_HashMap{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, String> map = new HashMap<>();
		// 	아이디 비번
		map.put("javaseem", "1677");//키가 중복되면 안되는 구조.
		map.put("javababo", "9999");
		map.put("kimjava", "9999");
		map.put("javaseem", "1234");//똑같은 키값은 후순위가 선순위 덮어버림.
		
		while(true){ //로그인 성공까지 계속 돎.
			System.out.print(" 아이디:");
			String id = sc.nextLine();
			System.out.print("비밀번호:");
			String pw = sc.nextLine();
			
			if(map.containsKey(id)){
				if((map.get(id)).equals(pw)){
					System.out.println("로그인 성공!");
					break;
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
					continue;
				}
			}else{
				System.out.println("존재하는 아이디 입니다.");
				continue;
			}
			//구현부분 - 실행하고 싶지 않을적이 있을지니... 위에서 continue를 기입한 이유임.
		}
		
	}
}
