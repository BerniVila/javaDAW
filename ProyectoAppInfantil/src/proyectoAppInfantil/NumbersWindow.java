package proyectoAppInfantil;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import javax.swing.JButton;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NumbersWindow {

	private JFrame frame;
	private PanelBackground frameBG;
	File btnFX1 = new File(
			"/Users/berni/git/JavaProjects/ProyectoAppInfantil/src/audioFiles/fx/BOTW_Fanfare_SmallItem.wav");
	File btnFX2 = new File("/Users/berni/git/JavaProjects/ProyectoAppInfantil/src/audioFiles/fx/BOTW_Secret.wav");
	
	
	
	
	// added to use from main window
	public JFrame getNumbersWindow() {
		return frame;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NumbersWindow window = new NumbersWindow();
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
	public NumbersWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(153, 153, 255));
		frame.setBounds(100, 100, 1600, 900);
		// Image img =
		// Toolkit.getDefaultToolkit().getImage("/images/backgrounds/claseFondoBig.jpg");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		
		PanelBackground BG = new PanelBackground();
		BG.setBounds(0, 0, 1600, 900); //en clase 1600x900
		frame.getContentPane().add(BG);
		BG.setLayout(null);

		JButton btnNewButton_0 = new JButton("");
		btnNewButton_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(btnFX1);
					Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				} catch (Exception ex) {
					System.out.println("Error with playing sound.");
					ex.printStackTrace();
				}
			}
		});
		btnNewButton_0.setBorderPainted(false);
		btnNewButton_0.setContentAreaFilled(false);
		btnNewButton_0.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_0.setBackground(new Color(153, 153, 255));
		btnNewButton_0.setBorder(null);
		btnNewButton_0.setAutoscrolls(true);
		btnNewButton_0.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/numbers/one.gif")));
		btnNewButton_0.setBounds(79, 61, 138, 205);
		// frame.getContentPane().add(btnNewButton);
		BG.add(btnNewButton_0);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(btnFX2);
					Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				} catch (Exception ex) {
					System.out.println("Error with playing sound.");
					ex.printStackTrace();
				}
			}
		});
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(new Color(153, 153, 255));
		btnNewButton_1.setAutoscrolls(true);
		btnNewButton_1.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/numbers/two.gif")));
		btnNewButton_1.setBounds(306, 127, 161, 185);
		// frame.getContentPane().add(btnNewButton_1);
		BG.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBackground(new Color(153, 153, 255));
		btnNewButton_2.setAutoscrolls(true);
		btnNewButton_2.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/numbers/three.gif")));
		btnNewButton_2.setBounds(494, 93, 143, 205);
		// frame.getContentPane().add(btnNewButton_2);
		BG.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setBorder(null);
		btnNewButton_3.setBackground(new Color(153, 153, 255));
		btnNewButton_3.setAutoscrolls(true);
		btnNewButton_3.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/numbers/four.gif")));
		btnNewButton_3.setBounds(40, 309, 177, 205);
		// frame.getContentPane().add(btnNewButton_3);
		BG.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_4.setContentAreaFilled(false);
		btnNewButton_4.setBorderPainted(false);
		btnNewButton_4.setBorder(null);
		btnNewButton_4.setBackground(new Color(153, 153, 255));
		btnNewButton_4.setAutoscrolls(true);
		btnNewButton_4.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/numbers/five.gif")));
		btnNewButton_4.setBounds(327, 353, 172, 245);
		// frame.getContentPane().add(btnNewButton_4);
		BG.add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_5.setContentAreaFilled(false);
		btnNewButton_5.setBorderPainted(false);
		btnNewButton_5.setBorder(null);
		btnNewButton_5.setBackground(new Color(153, 153, 255));
		btnNewButton_5.setAutoscrolls(true);
		btnNewButton_5.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/numbers/six.gif")));
		btnNewButton_5.setBounds(605, 365, 205, 226);
		// frame.getContentPane().add(btnNewButton_5);
		BG.add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_6.setContentAreaFilled(false);
		btnNewButton_6.setBorderPainted(false);
		btnNewButton_6.setBorder(null);
		btnNewButton_6.setBackground(new Color(153, 153, 255));
		btnNewButton_6.setAutoscrolls(true);
		btnNewButton_6.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/numbers/seven.gif")));
		btnNewButton_6.setBounds(50, 595, 172, 212);
		// frame.getContentPane().add(btnNewButton_6);
		BG.add(btnNewButton_6);

		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_7.setContentAreaFilled(false);
		btnNewButton_7.setBorderPainted(false);
		btnNewButton_7.setBorder(null);
		btnNewButton_7.setBackground(new Color(153, 153, 255));
		btnNewButton_7.setAutoscrolls(true);
		btnNewButton_7.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/numbers/eight.gif")));
		btnNewButton_7.setBounds(349, 618, 143, 205);
		// frame.getContentPane().add(btnNewButton_7);
		BG.add(btnNewButton_7);

		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_8.setContentAreaFilled(false);
		btnNewButton_8.setBorderPainted(false);
		btnNewButton_8.setBorder(null);
		btnNewButton_8.setBackground(new Color(153, 153, 255));
		btnNewButton_8.setAutoscrolls(true);
		btnNewButton_8.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/numbers/nine.gif")));
		btnNewButton_8.setBounds(649, 618, 161, 205);
		// frame.getContentPane().add(btnNewButton_8);
		BG.add(btnNewButton_8);


		JLabel lblNewLabel = new JLabel("SUMA NÚMEROS HASTA LLEGAR A");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 45));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(762, 6, 830, 191);
		BG.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("25");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 99));
		lblNewLabel_1.setForeground(new Color(255, 255, 153));
		lblNewLabel_1.setBounds(1133, 189, 130, 109);
		BG.add(lblNewLabel_1);
		
		JButton btnNewButton_7_1 = new JButton("");
		btnNewButton_7_1.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/numbers/zeroSmall.gif")));
		btnNewButton_7_1.setContentAreaFilled(false);
		btnNewButton_7_1.setBorderPainted(false);
		btnNewButton_7_1.setBorder(null);
		btnNewButton_7_1.setBackground(new Color(153, 153, 255));
		btnNewButton_7_1.setAutoscrolls(true);
		btnNewButton_7_1.setBounds(883, 622, 130, 185);
		BG.add(btnNewButton_7_1);

		// PRUEBAS AUDIO
		// ////////////////////////////////////////////////////////////////////////////////////////////////////

		File bso = new File("/Users/berni/git/JavaProjects/ProyectoAppInfantil/src/audioFiles/bso/bensound-buddy.wav");
		
		StaticSoundMethods.playSound(bso);
//
//		try {
//			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(bso);
//			Clip clip = AudioSystem.getClip();
//			clip.open(audioInputStream);
//			clip.start();
//			FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
//			gainControl.setValue(-20.0f); // Reduce volume by 10 decibels.
//		} catch (Exception ex) {
//			System.out.println("Error with playing sound.");
//			ex.printStackTrace();
//		}

	}
}
