package Examples;

public class StringChange {
	public String StringChange(String my_string, String overwrite_string, int s) {
		String answer = "";
			for(int i = 0; i<my_string.length(); i++) {
				if(i<s|i>=(overwrite_string.length()+s)) {
					answer = answer+(my_string.charAt(i));
				}else if(i>=s&i<(overwrite_string.length()+s)) {
					answer = answer + (overwrite_string.charAt(i-s));
				}
			}
			return answer;
	}
}
