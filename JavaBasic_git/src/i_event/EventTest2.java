package i_event;

/*
 *  이벤트 처리하기
 *  
 *  1) 이벤트 핸들러 만들기
 *  	` 이벤트관련클래스
 *  	` 이벤트인터페이스를 구현
 *  	` 이벤트메소드를 오버라이딩
 *  2) 이벤트핸들러(1번) 객체 생성
 *  
 *  3) 이벤트발생 컴포넌트와 2번을 연결(등록)
 *  
 *  
 *  
 *  [ 이벤트 종류 - ActionEvent ] - 게임 만들 때 제외하고 거진 이거 쓴다...
 *  	- 버튼 클릭
 *  	- 메뉴아이템 클릭
 *  	- 텍스트필드 엔터쳤을 때(한 줄 입력하기)
 *  	- 리스트 더블클릭
 */

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class EventTest2 extends JFrame{
	
	JButton btn;
	
	public EventTest2(){
		btn = new JButton("눌러");
		
		setLayout(new FlowLayout());
		add(btn);
		setBounds(100, 100, 400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void eventproc(){
		//2) 이벤트핸들러 객체 생성 -> 바로 연결(등록)
		//3)이벤트발생 컴포넌트와 2번을 연결(등록);
		btn.addActionListener(new EventHndr());
	}
	
	//1) 이벤트핸들러
	class EventHndr implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "이벤트발생");
		}
	}

	public static void main(String[] args){
		EventTest2 et = new EventTest2();
		et.eventproc();
	}
}
