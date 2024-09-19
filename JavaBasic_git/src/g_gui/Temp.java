package g_gui;

// AWT: JDK 1.2이전에 UI
import java.awt.*;	//visual based... 하면 UI구나 알아야 함!

public class Temp {
	//have a 방법
	Frame 	f = null;  
	Button b1 = null;
	Button b2 = null;
	
	Temp(){
		//객체 생성
		f = new Frame("첫번째 창");
		b1 = new Button("OK");
		b2 = new Button("Cancel");
		
		//화면에 붙이기
		//레이아웃: 컴포넌트를 붙이는 스타일.
		FlowLayout fl = new FlowLayout();
		f.setLayout(fl);
		
		f.add(b1);	//버튼에 붙이기
		f.add(b2);
		
		//화면 출력
		f.setBounds(100,100,600,400);	//프레임의 위치와 크기 지정
		f.setVisible(true);				//프레임에 화면 출력
	}

	public static void main(String[] args) {
		
		Temp t = new Temp();
	}
}
