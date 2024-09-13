package Examples;

import java.util.ArrayList;

public class 문자열섞기 {

	public static void main(String[] args) {
		String str1 = "aaaaa";
		String str2 = "bbbbb";
		String answer = "";
//        int len1 = str1.length() -1;
//        int len2 = str2.length() -1;
//        for(i=0; i<=len1; i++){
//            answer += str1.charAt(i);
//			  answer += str2.charAt(i);
//            }
        
        for(int i=0; i<str1.length(); i++){
        	answer+=String.valueOf(str1.charAt(i))+str2.charAt(i);
        }
        System.out.println(answer);
        
        ArrayList<Integer> arr = new ArrayList<>();
        	arr.add(1);
        	arr.add(4);
        	arr.add(3);
        	arr.add(2);
        	arr.add(5);
        	int ans = 1;
            for(int i=0; i<=arr.size();i++)
                ans *= arr.get(i);
        	System.out.println(ans);
	}
}
