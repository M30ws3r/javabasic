package DNA_DiseaseIndicator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GDC_result_wagro extends JFrame {
    private JButton bSave;
    private JLabel resultLabel;

    public GDC_result_wagro() {
        setTitle("검사 결과 - 유전질환 발견");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); // 화면 중앙에 위치

        // 특정 문구를 표시하는 JLabel
        resultLabel = new JLabel("<html><body style='text-align: center;'>"
                + "11번째 염색체 bp no.31,000,001 ~ 43,400,000"
                + "DEL(결손)에 의한 유전질환이 발견되었습니다.<br>"
                + "자세한 내용은 전문가에게 문의하십시오.</body></html>");
        resultLabel.setHorizontalAlignment(SwingConstants.CENTER);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 16)); // 글꼴 및 크기 설정

        bSave = new JButton("결과 저장");
        
        JPanel pSouth = new JPanel();
        pSouth.add(bSave);
        
        add(resultLabel, "Center");
        add(pSouth, "South");

        eventProc();
        setVisible(true);
    }

    void eventProc() {
        EventHandler hdlr = new EventHandler();
        bSave.addActionListener(hdlr);
    }

    class EventHandler implements ActionListener {
        public void actionPerformed(ActionEvent ev) {
            Object evt = ev.getSource();

            // "결과 저장" 버튼이 눌렸을 때
            if (evt == bSave) {
                JFileChooser fd = new JFileChooser();
                int returnValue = fd.showSaveDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File f = fd.getSelectedFile();
                    try (FileWriter out = new FileWriter(f)) {
                        out.write(resultLabel.getText());
                        JOptionPane.showMessageDialog(null, "저장 완료!");
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, "저장 실패: " + ex.getMessage());
                    }
                }
            }
        }
    }
}