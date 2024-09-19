package h_info;

import java.awt.*;
import javax.swing.*;

public class InfoTest extends JFrame{
	// 0. 멤버변수 선언
	JTextArea  ta;
	JTextField tfName, tfID, tfTel, tfSex, tfAge, tfHome;
	JButton bAdd, bShow, bSearch, bDelete, bCancel, bExit; // *Swing tfName;
	
	
	// 1. 객체 생성
	InfoTest(){
		ta      = new JTextArea(60,80)	   ;
		tfName  = new JTextField(20)   ;
		tfID    = new JTextField(20)   ;
		tfTel   = new JTextField(20)   ;
		tfSex   = new JTextField(20)   ;
		tfAge   = new JTextField(20)   ;
		tfHome  = new JTextField(20)   ;
		bAdd    = new JButton("Add")   ;
		bShow   = new JButton("Show")  ;
		bSearch = new JButton("Search");
		bDelete = new JButton("Delete");
		bCancel = new JButton("Cancel");
		bExit   = new JButton("Exit")  ;
	}
	
	// 2. 화면 붙이기 및 출력
	void addLayout(){
		
		JPanel p_west = new JPanel();//판떼기. 중앙에 하나만 넣을 순 없잖아요.
		p_west.setLayout(new GridLayout(6,2)); //기본 flow 레이아웃 아닌 Grid.
		p_west.add(new JLabel("이름"));
		p_west.add(tfName);
		p_west.add(new JLabel("아이디"));
		p_west.add(tfID);
		p_west.add(new JLabel("전화번호"));
		p_west.add(tfTel);
		p_west.add(new JLabel("성별"));
		p_west.add(tfSex);
		p_west.add(new JLabel("나이"));
		p_west.add(tfAge);
		p_west.add(new JLabel("주소"));
		p_west.add(tfHome);
		add( p_west , BorderLayout.WEST ); //마지막 판떼기 붙이기
		
		//EAST 영역
		JPanel p_east = new JPanel();//판떼기. 중앙에 하나만 넣을 순 없잖아요.
		p_east.add(ta);
		add( p_east , BorderLayout.EAST ); //마지막 판떼기 붙이기
		
		//SOUTH 영역
		JPanel p_south = new JPanel();//판떼기. 중앙에 하나만 넣을 순 없잖아요.
		p_south.setLayout(new GridLayout(1,6));;
		p_south.add(bAdd);
		p_south.add(bShow);
		p_south.add(bSearch);
		p_south.add(bDelete);
		p_south.add(bCancel);
		p_south.add(bExit);
		add( p_south , BorderLayout.SOUTH ); //마지막 판떼기 붙이기
		
		//전체영역
		setLayout(new BorderLayout());
		add(p_south, BorderLayout.SOUTH);
		add(p_east, BorderLayout.EAST);
		add(p_west, BorderLayout.WEST);
		
		// 화면출력
		setBounds(100, 100, 800, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args){
		InfoTest info = new InfoTest();
		info.addLayout();
	}
}