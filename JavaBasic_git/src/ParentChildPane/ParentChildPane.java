package ParentChildPane;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.plaf.TabbedPaneUI;


public class ParentChildPane extends JFrame{
	
	public ParentChildPane(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createTabbedPane();
		setTitle("scheduler");
		setSize(1200, 800);
		setVisible(true);
		}

		void createTabbedPane(){
			
			JTabbedPane tPane = new JTabbedPane();
			add(tPane);
			JLabel mainLabel = new JLabel("첫번째", SwingConstants.CENTER);
			JPanel mainPanel = new JPanel();
			mainPanel.add(mainLabel);
			tPane.addTab("1", mainPanel);
			
			//탭 안에 탭 만들기
			JTabbedPane Parent2 = new JTabbedPane();
			tPane.addTab("황모기카페", Parent2);				// 부모 Tab
			Parent2.addTab("커피류", new JPanel());	// 자식 Tab
			Parent2.addTab("음료", new JPanel());
			Parent2.addTab("베이커리류", new JPanel());
			Parent2.addTab("샐러드", new JPanel());

			JLabel reportLabel = new JLabel("세번째", SwingConstants.CENTER);
			JPanel reportPanel = new JPanel();
			reportPanel.add(reportLabel);
			tPane.addTab("3", reportPanel);

			JLabel diaryLabel = new JLabel("네번째", SwingConstants.CENTER);
			JPanel diaryPanel = new JPanel();
			diaryLabel.add(diaryPanel);
			tPane.addTab("4", diaryPanel);
		}

		public static void main(String[] ar){
			new ParentChildPane();
		}
}