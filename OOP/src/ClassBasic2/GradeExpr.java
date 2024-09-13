package ClassBasic2;

public class GradeExpr{
	//member fields
	private int[]  	jumsu;
	private int    	total;
	private double 	avg;
	
	//----------------------------
	// 생성자함수 constructor
	public GradeExpr(int[] jumsu){ //생성자 만들 때 기본 형식!
		this.jumsu = jumsu;
	}
	public int getTotal(){ //점수합 리턴
		for(int i=0; i<jumsu.length; i++){
			total += jumsu[i];
		}
		return total;
	}
	public double getAvg(){ //평균리턴
		avg = (double)total/jumsu.length;
		return avg;
	}
	public int getGoodScore() {//최대값 구하기
		int max=0;
		for(int i=0; i<jumsu.length; i++) {
			if(jumsu[i]>=max) {
				max = jumsu[i];
			}
		}
		return max;
	}
	public int getBadScore() {//최솟값 구하기
		int min=jumsu[0];
		for(int i=0; i<jumsu.length; i++) {
			if(jumsu[i]<=min) {
				min = jumsu[i];
			}
		}
		return min;
	}
}