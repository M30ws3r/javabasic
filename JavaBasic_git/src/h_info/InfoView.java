package h_info;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class InfoView extends JFrame{ //화면만 뜻함
	// 0. 멤버변수 선언
	JTextArea  ta;
	JTextField tfName, tfID, tfTel, tfSex, tfAge, tfHome;
	JButton bAdd, bShow, bSearch, bDelete, bCancel, bExit; // *Swing tfName;
	
	// 모델단 변수
	InfoModelImpl model;
	
	// 1. 객체 생성
	InfoView(){
		ta      = new JTextArea(60,40) ;
		tfName  = new JTextField(15)   ;
		tfID    = new JTextField(15)   ;
		tfTel   = new JTextField(15)   ;
		tfSex   = new JTextField(15)   ;
		tfAge   = new JTextField(15)   ;
		tfHome  = new JTextField(15)   ;
		bAdd    = new JButton("Add")   ;
		bShow   = new JButton("Show")  ;
		bSearch = new JButton("Search");
		bDelete = new JButton("Delete");
		bCancel = new JButton("Cancel");
		bExit   = new JButton("Exit")  ;
		
		try {
			model = new InfoModelImpl();
		}catch(Exception e){
			System.out.println("로딩 실패");
			e.printStackTrace();
		}
	}
	
	//화면 초기화
	void clearText() {
		tfName.setText("");
		tfID.setText("");
		tfTel.setText("");
		tfSex.setText("");
		tfAge.setText("");
		tfHome.setText("");
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
	
	// 3. 이벤트처리
	void eventProc(){
		// 'Add' 버튼이 눌렸을 때
		bAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				addInfo();
			}
		});
		//'Show'버튼 눌렸을 때
		bShow.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(null, "입력값을 보여드립니다");
			}
		});
		//'Search'버튼 눌렸을 때
		bSearch.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				getInfo();
			}
		});
		//'Delete'버튼 눌렸을 때
		bDelete.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				deleteInfo();
			}
		});
		//'Cancel'버튼 눌렸을 때
		bCancel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				clearText();
			}
		});
		//'Exit' 버튼 눌렸을 때 
		bExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});
		
		//이름 필드서 엔터쳤을 떄
		tfName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				String Name = tfName.getText();
				JOptionPane.showMessageDialog(null, Name+"맞습니까?");
			}
		});
		//주민번호 필드서 엔터쳤을 떄 - 나이, 성별, 출생지 주루룩 나오게 만들어보기
		tfID.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				String ID = tfID.getText();
				//성별 받아서 출력하기
				char Sung = ID.charAt(7);
				if(Sung=='1'|Sung=='3'){
					tfSex.setText("남성");
				}else {
					tfSex.setText("여성");
				}
				
				//출생지 받아서 출력하기
				char chul = ID.charAt(8);
				switch(chul) { //switch-case로 출신지역 번호에 따라 해당 지역 토하게 만듦 
				case '0' : tfHome.setText("서울");
					break;
				case '1' : tfHome.setText("인천/부산");
					break;
				case '2' : tfHome.setText("경기");
					break;
				case '9' : tfHome.setText("제주");	
					break;
				default : tfHome.setText("한국");
					break;
				}
				
				//나이 받아서 출력하기
				LocalDate current_date = LocalDate.now();
				int current_year = current_date.getYear();
				
				String nai = ID.substring(0,2);
				int sunai = Integer.parseInt(nai);
				
				int age=0;
				char sung = ID.charAt(7);
				if(sung=='1'||sung=='2'){   				  // 성별문자가 '1'이거나 '2'라면
					age = current_year - (1900 + sunai) + 1;  //age = 2024 - (1900 + sunai) + 1;
				}else if(sung=='3'||sung=='4'){				  // 성별문자가 '3'이거나 '4'라면
					age = current_year - (2000 + sunai) + 1;  //age = 2024 - (2000 + sunai) + 1;
				}
				tfAge.setText(Integer.toString(age));
			}
		});
		//전화번호 필드서 엔터쳤을 떄
		tfTel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String tel = tfTel.getText();
				JOptionPane.showMessageDialog(null, tel+"맞습니까?");
			}
		});
	}//end of eventproc
	
	// 전화번호를 얻어서 해당 고객정보를 지워버림
	void deleteInfo() {
		String tel = tfTel.getText();
		try {
			model.deleteInfo(tel); //모델 단에 없으니 에러남.
			clearText();
		}catch(Exception ex) {
			ta.setText("고객정보 삭제 실패:" + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	// 입력한 전화번호를 얻어와서 해당 란에 고객정보를 출력
	void getInfo() {
		String tel = tfTel.getText();
		
		try {
			InfoVO vo = model.selectInfoByTel(tel);
			tfName.setText(vo.getName());
			tfID.setText(vo.getId());
			tfAge.setText(vo.getAge()+"");
			tfSex.setText(vo.getGender());
			tfHome.setText(vo.getHome());
		
		}catch(Exception ex) {
			ta.setText("전화번호검색실패:" + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	//Add 버튼 눌렸을 때 사용자 입력값을 받아서 DB에 저장하기
	void addInfo() {
		// 사용자 입력값을 받아오기
		String name   = tfName.getText();
		String ID 	  = tfID.getText();
		String tel 	  = tfTel.getText();
		String gender = tfSex.getText();
		int age		  = Integer.parseInt(tfAge.getText());
		String home   = tfHome.getText();
		
		/*
		 * VO : value of
		 * DTO: data transfer object
		 * 
		 * DAO: 데이터베이스 연결시켜주는 애...
		 */
		
		InfoVO vo = new InfoVO();
		vo.setName(name);
		vo.setId(ID);
		vo.setTel(tel);
		vo.setAge(age);
		vo.setGender(gender);
		vo.setHome(home);
		
		try {
			model.insertInfo(vo);
			ta.setText("입력한 정보가 저장되었습니다");
			clearText();
		} catch(Exception ex) {
			ta.setText("입력실패:" + ex.getMessage());
			ex.printStackTrace();
		}
		//이렇게 해주는 경우도 있지만 setter 만들어 주기도 함... 위와 같은 방법을 선호하시는 분들도 계심.
		//마우스 우클릭 > Source > Generate Constructors using fields > 해서 만들어 줄 수 있다.		

	}

	public static void main(String[] args){
		InfoView info = new InfoView();
		info.addLayout();
		info.eventProc();
	}
}