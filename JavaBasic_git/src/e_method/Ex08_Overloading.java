package e_method;

public class Ex08_Overloading{

	public static void main(String[] args){
		// TODO Auto-generated method stub
		String str = new String("홍길순");
		StringBuffer sb = new StringBuffer("홍길자");
		char[] ch = new char[] {'홍','길','동'};
		
		System.out.println(str);  //오버로딩 없다면 이름을 각각 바꿔줘야함...ㄱ-
		System.out.println(sb);
		System.out.println(ch);
	}
}

/*	오버로딩이 없다면
 * 
 * 		void drawRect(int w, int h){
 * 			// 폭과 높이로 사각형 그리기
 * 		}
 * 
 * 		void drawRect2(Point p1, Point p2, Point p3, Point p4){
 * 			// 점 4개의 정보로 사각형 그리기 
 * 		}
 *  ----------------------
 *  오버로딩이 적용된다면???
 *  	함수 같은 이름 적어도 괜춘.
 *
 *		void drawRect(int w, int h){
 *			// 폭과 높이로 사각형 그리기
 *		}
 *
 *		void drawRect(Point p1, Point p2, Point p3, Point p4){
 *			// 점 4개의 정보로 사각형 그리기
 *		}
*/