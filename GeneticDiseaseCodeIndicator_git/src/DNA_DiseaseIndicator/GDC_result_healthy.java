package DNA_DiseaseIndicator;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class GDC_result_healthy extends JFrame {
    public GDC_result_healthy() {
        setTitle("GDC_Result_healthy");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // 화면 중앙에 위치
        
        JLabel label = new JLabel("유전질환 미검출. 유전적으로 건강합니다!", SwingConstants.CENTER);
        add(label);
        
        setVisible(true);
    }
}