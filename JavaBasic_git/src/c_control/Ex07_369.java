package c_control;

public class Ex07_369 {

	public static void main(String[] args) {
		for(int i=1; i<=50; i++){
			int n =i;
			boolean n369 = false;
			
			while(n!=0) {
				int na = n%10;
				if( na==3|na==6|na==9) {
					System.out.print("짝 ");
					n369=true;
				}
				n = n/10;
			}
			if(n369) System.out.println();
			else System.out.print(i+" ");	
		}
	}
}
