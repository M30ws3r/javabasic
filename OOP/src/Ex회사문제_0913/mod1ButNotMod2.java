package Ex회사문제_0913;

class mod1ButNotMod2{
	
	public static void main(String[] args) {
		int i = solution(4, 3, 20);
		int j = solution(3, 4, 20);
		
		System.out.println(i);
		System.out.println(j);
	}

	public static int solution(int mod1, int mod2, int max_range){
		int result1 = 0;
		int result2 = 0;
		int answer=0;
		
		result1 = max_range / mod1;
		result2 = max_range / (mod1*mod2);
		answer = result1 - result2;
		
		return answer;
	}
}
