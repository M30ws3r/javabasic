package g_gui;

/* 
 *  자바의 GUI
 *  
 *  	- AWT	: 1.2 이전에 사용
 *  	- Swing : 1.2 이후에 사용
 *  		=> J 붙이기
 */

import java.awt.*;
import javax.swing.*; //Swing 설명은 따로 웹사이트 만들어서 해놓았다...bb

//Temp2 클래스가 Frame 역할을 할 예정
//>> is a 방식. (Temp2 is a Frame)
public class GuiTest extends JFrame{ // *Swing 것으로 클래스 명 바뀜
	
	JButton b1 = null;	// *Swing
	JButton b2 = null;	// *Swing
	JCheckBox hob1, hob2 = null;
	JTextField tf; //한줄 입력 받음
	JTextArea  ta; //여러 줄 입력받는...창 같은것
	
	JRadioButton rb_male, rb_female;
	
	// JLabel la; //라벨. 화면에만 띄우고 하는 일 없음. 객체생성 없어.
	
	GuiTest(){
		super("두번째 창2");
		// setTitle("두번째 창");
		b1 = new JButton("OK");	// *Swing
		b2 = new JButton("CANCEL"); // *Swing
		
		hob1 = new JCheckBox("독서", true); //처음부터 체크되어 있도록 만들어주기.
		hob2 = new JCheckBox("음악감상");
		
		tf = new JTextField(15);
		ta = new JTextArea(10,50); // 영단어 50개... 언어마다 폭이 다른데 영어 기준.
		
		rb_male = new JRadioButton("남성");
		rb_female = new JRadioButton("여성", true);
		ButtonGroup bGrp = new ButtonGroup();
		bGrp.add(rb_male);
		bGrp.add(rb_female);
		
		
		//----------------------------------------------------------------
		//화면에 붙이기 - awt 로부터 가져온거라 java.awt.* 가져온거.
		/*	* 레이아웃 : 화면에 붙이는 스타일
		 * 
		 * 		1. FlowLayout
		 * 			` 윗줄 상단에 한 줄 붙이기
		 * 			` 폭의 크기에 따라 다음 줄에 붙음
		 * 			` 컴포넌트 크기 고정
		 * 
		 * 		2. GridLayout
		 * 			` 행과 열에 맞춰서 붙임
		 * 			` 컴포넌트 크기 변경
		 * 
		 * 		3. BorderLayout
		 * 			` 정해진 5영역에 붙임
		 * 			` 동, 서, 남, 북, 중앙
		 * 			` 컴포넌트 크기 변경
		 */
		
		//setLayout(new FlowLayout()); //조상이 갖고 있는 함수라...container 로부터 얻어온 듯.
		//setLayout(new GridLayout(5,2));
		setLayout(new BorderLayout());
		
		add(b1, BorderLayout.WEST);	//프레임에 버튼 붙이기
		add(b2, BorderLayout.EAST);
				
		add(hob1, BorderLayout.NORTH);
		add(hob2, BorderLayout.SOUTH);
		
		JPanel p_center = new JPanel();//판떼기. 중앙에 하나만 넣을 순 없잖아요.
		p_center.setLayout(new GridLayout(2,2));
		p_center.add(rb_male);
		p_center.add(rb_female);
		p_center.add(new JLabel("이름입력"));
		p_center.add(tf);
		add( p_center , BorderLayout.CENTER ); //마지막 판떼기 붙이기
		
//		add(tf);
//		add(new JLabel("메시지입력"));
//		add(ta);
//		
//		add(rb_male);
//		add(rb_female);
		
		//화면 출력
		setBounds(100,100,600,400); //프레임 위치와 크기 지정
		setVisible(true);			//프레임에 화면 출력
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		//이미 메모리에서 상속받음.
		new GuiTest();	
	}
}