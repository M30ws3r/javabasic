package j_inherit_sample;

import java.awt.Frame;

// 상속
public class Test2 extends Frame{
	Test2(){
		Frame f = new Frame(); //super("나의 두 번째 창")
		f.setBounds(100, 100, 500, 400);
		f.setVisible(true);
	}
	public static void main(String[] args){
		Test2 t2 = new Test2();
	} //실행됨 >> 제대로 상속받음.
}