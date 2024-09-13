package HW;

public class Ex10_제어문_점심전카페문제 {

	public static void main(String[] args) {
//1. (2), (3), (6)
		
//2. (1) if(i==0){}
		
//3. (2), (3)
		
//4. (4)
		
//5. (4) - i==2니까 다 실행됨.
		
//6. (2)
		
//7. 
		
//		int x=1;
//		while(x++<3)
//			System.out.print(x+" ");

//		 int i = 0, j = 0;
//	      for( i = 0 ; i < 5 ; i++ ) {
//	         for( j = 0 ; j < 4 ; j++ ) { 
//	             if( i == 2 && j == 1 ) break;
//	             if( i == 3 && j == 2 ) continue;
//	         }
//	      }
//
//	           System.out.println("i = " + i + " , j = " +  j );
//		
		
//		int i = 2, j = 0;
//	      switch( i ) {
//	          case 0 : j+= 0;  //break 없음;;
//	          case 2 : j+= 2;
//	          case 4 : j+= 4;
//	          default : j += 6;
//	      }
//	      System.out.println( j );

//		 int i = 1, j = 10;
//	      do{
//	          if(  i > j ) break;
//	          j--;
//	      } while(++i<5);
//	           System.out.println("i="+i + " , j = " + j );

		 int i =0, j=0, k=0;
	      OUTER : for( i=0; i<10; i++ ) 
	           MIDDLE : for( j=0; j<3; j++ )
	               INNER : for( k=0; k<4; k++ ) {
	                    if( i==4 && j ==2 ) break OUTER;
	               }
	           System.out.println(i);
	           System.out.println(j);
	           System.out.println(k);
	}

}
