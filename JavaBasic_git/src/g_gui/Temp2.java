package g_gui;

import java.awt.*;

//Temp2 클래스가 Frame 역할을 할 예정
//>> is a 방식. (Temp2 is a Frame)
public class Temp2 extends Frame{
	
	Button b1 = null;
	Button b2 = null;
	
	Temp2(){
		super("두번째 창2");
		// setTitle("두번째 창");
		b1 = new Button("OK");
		b2 = new Button("CANCEL");
		
		//화면에 붙이기
		setLayout(new FlowLayout()); //조상이 갖고 있는 함수라...
		
		add(b1);	//프레임에 버튼 붙이기
		add(b2);
		
		//화면 출력
		setBounds(100,100,600,400); //프레임 위치와 크기 지정
		setVisible(true);			//프레임에 화면 출력
	}

	public static void main(String[] args) {
		
		//이미 메모리에서 상속받음.
		new Temp2();
			
	}
}
