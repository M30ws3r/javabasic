package j_combobox;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;;

public class ComboBoxTest extends JFrame{
	// [1] 멤버변수 
		JComboBox<Integer> cbYear, cbMonth, cbDate;
		JButton btn;
		JLabel laDay;
		
	// [2] 객체생성 - void 도 쓰면 안 됨
	public ComboBoxTest(){
		
		Integer[] strY = new Integer[11]; //2020~2030
		for(int i=0; i<11; i++){	// int i=0, y=2020; i<11; i++ 로도 표현 가능
			strY[i] = i+2020;		// y; , y++;
		}
		
		Integer[] strM = new Integer[12];
		for(int i=0; i<12; i++){
			strM[i] = i+1;
		}
		
		Integer[] strD = new Integer[31];
		for(int i=0; i<31; i++){
			strD[i] = i+1;
		}
		
		cbYear  = new JComboBox<Integer>(strY);
		cbMonth = new JComboBox<Integer>(strM);
		cbDate  = new JComboBox<Integer>(strD);
		btn 	= new JButton("▶");
		laDay	= new JLabel(" 요일")   ;
	}
	
	// [3] 화면구성(보이기) - flow layout 으로 보이겠지? 눌러졌을 때 드랍다운 -> combobox
	public void addLayout(){
		//기본 flow 레이아웃이니까 언급 없어도 괜춘.
		setLayout(new FlowLayout());
		setBounds(100, 100, 350, 150);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("콤보박스 예제");
		
		//붙이기
		add(cbYear);
		add(new JLabel("년"));
		add(cbMonth);
		add(new JLabel("월"));
		add(cbDate);
		add(new JLabel("일"));
		add(btn);
		add(laDay);
	}
	
	// [4] 이벤트처리
	public void eventProc(){
		//버튼 눌렸을 때
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				outputDay();
			}
		});
		
		//연 콤보박스가 눌렸을 때
		cbYear.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				setDay();
			}
		});
		
		//월 콤보박스 눌렸을 때
		cbMonth.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				setDay();
			}
		});	
	}//end of eventProc()
	
	void setDay(){
		Integer[] lastDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		Integer y = (Integer)cbYear.getSelectedItem();
		/*
		 * if(y%4==0&y%100!==0|y%400==0){
		 * 	  lastDays[1]=29;
		 * }else{
		 * 	  lastDays[1]=28;
		 * }
		 */
		
		lastDays[1] = (y%4==0 & y%100!=0 | y%400!=0)? 29: 28;
		
		Integer m = (Integer)cbMonth.getSelectedItem();
		cbDate.removeAllItems();
		//이미 있던 cbDate 자료 끝에+(1~해당 월 마지막날짜) 해버리니까, 이전 자료 삭제해줌 
		for(int i=1; i<=lastDays[m-1]; i++){
			cbDate.addItem(i);
		}
	}
	
	/*
	 *  년, 월, 일 값을 얻어서 요일 구하고 출력
	 */	
	void outputDay(){
		Integer y = (Integer)cbYear.getSelectedItem();
		Integer m = (Integer)cbMonth.getSelectedItem();
		Integer d = (Integer)cbDate.getSelectedItem();
		//System.out.println(y+"년 "+m+"월 "+d+"일 은,");
		
		//getInstace - abstract 인 calendar 로 부터 새로운 거 만들 순 없어도 객체를 얻어옴.
		Calendar cal = Calendar.getInstance();
		cal.set(y, m-1, d); //서양 기준이라 January... 로 시작해서 월이 이래요
		//System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
		String[] yoil = {"일","월","화","수","목","금","토"};
		String Day = yoil[cal.get(Calendar.DAY_OF_WEEK)-1]+"요일";
		laDay.setText(Day);

	}//end of outputDay()
	
	/*
	 * 화면에 출력될 때 처음부터 오늘 날짜 지정하기
	 * 
	 * setSelectedItem으로 Year, Month, Date 각각 가져와서 오늘의 연도, 월, 날짜
	 * GUI에 표시되도록 할 수 있음
	 */
	void initial(){
		Calendar cal = Calendar.getInstance();
		cbYear.setSelectedItem(cal.get(Calendar.YEAR));
		cbMonth.setSelectedItem(cal.get(Calendar.MONTH)+1);
		cbDate.setSelectedItem(cal.get(Calendar.DATE));
	}

	public static void main(String[] args){
		ComboBoxTest cb = new ComboBoxTest();
		cb.addLayout();
		cb.initial();
		cb.eventProc();
	}
}
