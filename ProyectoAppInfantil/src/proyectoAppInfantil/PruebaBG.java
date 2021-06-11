package proyectoAppInfantil;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaBG {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PruebaBG window = new PruebaBG();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PruebaBG() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
//		JPanel panel = new JPanel();
//		panel.setBounds(167, 99, 187, 130);
//		frame.getContentPane().add(panel);
		
		PanelBackground BG = new PanelBackground();
		frame.getContentPane().add(BG);
	}
}
