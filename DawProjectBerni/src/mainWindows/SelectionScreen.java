package mainWindows;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Cursor;

public class SelectionScreen {

	private JFrame frmSelectionScreen;

	// added to use from main window
	public JFrame getSelectionScreen() {
		return frmSelectionScreen;
	}

	public void setFrmSelectionScreen(JFrame frmSelectionScreen) {
		this.frmSelectionScreen = frmSelectionScreen;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectionScreen window = new SelectionScreen();
					window.frmSelectionScreen.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SelectionScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSelectionScreen = new JFrame();
		frmSelectionScreen.getContentPane().setBackground(new Color(0, 153, 102));
		frmSelectionScreen.setBounds(100, 100, 800, 600);
		frmSelectionScreen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmSelectionScreen.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("LETRAS");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBounds(6, 121, 256, 350);
		frmSelectionScreen.getContentPane().add(btnNewButton);

		JButton btnFormas = new JButton("FORMAS");
		btnFormas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFormas.setBounds(268, 121, 256, 350);
		frmSelectionScreen.getContentPane().add(btnFormas);

		JButton btnNmeros = new JButton("NÚMEROS");
		btnNmeros.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNmeros.setBounds(530, 121, 264, 350);
		frmSelectionScreen.getContentPane().add(btnNmeros);

		JLabel lblNewLabel = new JLabel("ELIGE UN JUEGO");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 60));
		lblNewLabel.setBounds(141, 16, 515, 93);
		frmSelectionScreen.getContentPane().add(lblNewLabel);
	}
}
