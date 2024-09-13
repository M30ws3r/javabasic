package c_control;

/*
 * break : 블럭을 벗어나는 문장			 -실행중지요청. 조건 부합하면 바로 exit /{}밖으로
 * continue : 블럭의 끝으로 이동하는 문장  -밑에 코딩만 안 쓰고 싶을 때/{}안으로 다시 돌아감
 */

public class Ex10_BreakContinue {

	public static void main(String[] args) {
		for(int i=0; i<2; i++) {
			END: //label. 붙여진 반복문 전체를 벗어남. - 중첩되어진 상태에서 한꺼번에 벗어날 수 있음(goTO대신).
			for(int j=0; j<3; j++) {
				if(j==1) break END; //break; //continue;
				System.out.printf("< %d, %d > \n",i,j);
			}
			System.out.println("데이타"); //0,2
		}
	}
}
