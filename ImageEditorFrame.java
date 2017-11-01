import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane; 

public class ImageEditorFrame extends JFrame{ 
	public ImageEditorFrame(){ 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 300);
		setVisible(true);
		setTitle("ImageEditor");
	}
	private void createMenuBar(){ 
		JMenuBar menuBar = new JMenuBar(); 
		setJMenuBar(menuBar); 
		JMenu menuFile = new JMenu("File"); 
		menuBar.add(menuFile); 
		JMenuItem menuItemOpen = new JMenuItem("Open"); 
		menuFile.add(menuItemOpen); 
		
	
		menuItemOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				onOpen();
				}
			} ); 
	}
		
	private void onOpen(){
			JOptionPane.showMessageDialog(this, "Open Selected");
		}
	

	

	public static void main(String[] args) {
		new ImageEditorFrame();
	}
}