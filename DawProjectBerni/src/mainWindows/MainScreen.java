package mainWindows;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Cursor;
import java.awt.Dimension;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainScreen {

	private JFrame frame;
	//Dimension screenSize = new Dimension();
	//int screenWidth = screenSize.width;
	//int screenHeight = screenSize.height;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen window = new MainScreen();
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
	public MainScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(screenSize.width, screenSize.height);
		frame.getContentPane().setBackground(new Color(255, 251, 243));
	//	frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAprendeJugando = new JLabel("APRENDE JUGANDO ");
		lblAprendeJugando.setFont(new Font("Tahoma", Font.BOLD, 60));
		lblAprendeJugando.setBounds(93, 87, 622, 125);
		frame.getContentPane().add(lblAprendeJugando);
		
		JLabel lblNewLabel_1 = new JLabel("Copyright © 2021 BerniVilaDev. All rights reserved");
		lblNewLabel_1.setBounds(242, 534, 323, 24);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setIcon(new ImageIcon(MainScreen.class.getResource("/images/empezar.gif")));
		btnNewButton.setBounds(263, 309, 285, 97);
		frame.getContentPane().add(btnNewButton);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SelectionScreen selectionScreen = new SelectionScreen();
				selectionScreen.getSelectionScreen().setVisible(true);

			}
		});
	}
}
