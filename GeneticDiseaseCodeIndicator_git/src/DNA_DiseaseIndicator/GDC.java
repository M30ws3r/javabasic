package DNA_DiseaseIndicator;

import java.awt.BorderLayout;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetAdapter;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class GDC extends JFrame { // Genetic Disease Checker
    public static void main(String args[]) {
        UIForm3 ui = new UIForm3();
        ui.addLayout_main();
        ui.eventProc();
    }
}

//========================================
//  화면을 관리하는 클래스 
//========================================
class UIForm3 extends JFrame {
    JTextArea ta;
    JButton bCheck, bImport, bClear;
    File importedFile = null; // 파일 객체를 저장할 변수

    UIForm3() {
        ta = new JTextArea();
        bImport = new JButton("DNA 파일 import");
        bCheck = new JButton("검사 실행");
        bClear = new JButton("Clear");
    }

    // 메인 창 구현
    void addLayout_main() {
        JPanel pCenter = new JPanel();
        pCenter.setLayout(new BorderLayout());
        pCenter.add("Center", ta);

        JPanel pSouth = new JPanel();
        pSouth.add(bImport);
        pSouth.add(bCheck);
        pSouth.add(bClear);

        getContentPane().add("Center", pCenter);
        getContentPane().add("South", pSouth);

        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Genetic Disease Checker");
        setVisible(true);
    }

    void eventProc() {
        EventHandler hdlr = new EventHandler();
        bImport.addActionListener(hdlr);
        bCheck.addActionListener(hdlr);
        bClear.addActionListener(hdlr);
        enableFileDrop(); // Enable file dropping functionality
    }

    // 파일 Drop(프로그램서 out) 메소드
    private void enableFileDrop() {
        DropTarget dropTarget = new DropTarget(ta, new FileDropTargetListener());
        ta.setDropTarget(dropTarget);
    }

    // Drop(프로그램서 out) 시킨 파일 프로그램서 치워버리는 메소드
    private void clearDroppedFiles() {
        ta.setText(""); // text area 내 데이터 없앰.
        importedFile = null; // imported 된 데이터 없앰.
    }

    private class FileDropTargetListener extends DropTargetAdapter {
        @Override
        public void drop(DropTargetDropEvent dtde) {
            try {
                dtde.acceptDrop(DnDConstants.ACTION_COPY);
                Transferable transferable = dtde.getTransferable();

                if (transferable.isDataFlavorSupported(DataFlavor.javaFileListFlavor)) {
                    java.util.List<File> files = (java.util.List<File>) transferable.getTransferData(DataFlavor.javaFileListFlavor);
                    for (File file : files) {
                        importFile(file);
                    }
                }
                dtde.dropComplete(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void importFile(File file) {
        importedFile = file;
        try (FileReader in = new FileReader(file)) {
            char[] data = new char[1024];
            int length = in.read(data);
            
            // 읽은 길이가 0보다 클 때만 처리
            if (length > 0) {
                ta.setText(new String(data, 0, length)); // 텍스트 영역에 표시
            } else {
                ta.setText("파일 내용이 비어 있습니다."); // 파일이 비어 있을 때 메시지 표시
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            ta.setText("파일 읽기 오류: " + ex.getMessage());
        }
    }

    class EventHandler implements ActionListener {
        public void actionPerformed(ActionEvent ev) {
            Object evt = ev.getSource();

            // "DNA 파일 import" 버튼이 눌렸을 때
            if (evt == bImport) {
                JFileChooser fd = new JFileChooser();
                int returnValue = fd.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File f = fd.getSelectedFile();
                    importFile(f);
                }
            }

            // "검사 실행" 버튼이 눌렸을 때
            if (evt == bCheck) {
                if (importedFile != null && importedFile.length() != 0) { 
                    new GDC_result_healthy(); // 건강함 창
                } else {
                    new GDC_result_wagro(); // 유전병 발견한 창
                }
            }

            // "Clear" 버튼이 눌렸을 때
            if (evt == bClear) {
                clearDroppedFiles();
            }
        }
    }
}