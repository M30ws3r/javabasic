package DNA_DiseaseIndicator;

import java.awt.BorderLayout;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetAdapter;
import java.awt.dnd.DropTargetDropEvent;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class clearMethod extends JFrame{
	    private JTextArea ta;
	    private JButton clearButton;

	    public void FileDropDemo() {
	        setTitle("File Drop Demo");
	        setSize(400, 300);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setLayout(new BorderLayout());

	        enableFileDrop();
	    }

	    private void enableFileDrop(){
	        DropTarget dropTarget = new DropTarget(ta, new FileDropTargetListener());
	        ta.setDropTarget(dropTarget);
	    }

	    private void clearDroppedFiles(){
	        ta.setText(""); // Clear the text area
	    }

	    private class FileDropTargetListener extends DropTargetAdapter {
	        @Override
	        public void drop(DropTargetDropEvent dtde) {
	            try {
	                dtde.acceptDrop(DnDConstants.ACTION_COPY);
	                Transferable transferable = dtde.getTransferable();

	                if (transferable.isDataFlavorSupported(DataFlavor.javaFileListFlavor)) {
	                    java.util.List<File> files = (java.util.List<File>) transferable.getTransferData(DataFlavor.javaFileListFlavor);
	                    for (File file : files){
	                        ta.append(file.getAbsolutePath() + "\n");
	                    }
	                }
	                dtde.dropComplete(true);
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	    }
}

