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
		frame.setBounds(100, 100, 1920, 1080);
		// Image img =
		// Toolkit.getDefaultToolkit().getImage("/images/backgrounds/claseFondoBig.jpg");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		PanelBackground BG = new PanelBackground();
		BG.setBounds(0, 0, 1920, 1080);
		frame.getContentPane().add(BG);
		BG.setLayout(null);

		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
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
		btnNewButton.setBorderPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBackground(new Color(153, 153, 255));
		btnNewButton.setBorder(null);
		btnNewButton.setAutoscrolls(true);
		btnNewButton.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/numbers/one.gif")));
		btnNewButton.setBounds(45, 61, 172, 292);
		// frame.getContentPane().add(btnNewButton);
		BG.add(btnNewButton);

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
		btnNewButton_2.setBounds(595, 91, 194, 262);
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
		btnNewButton_3.setBounds(30, 389, 225, 288);
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
		btnNewButton_4.setBounds(317, 361, 216, 339);
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
		btnNewButton_5.setBounds(619, 448, 205, 226);
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
		btnNewButton_6.setBounds(45, 731, 239, 281);
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
		btnNewButton_7.setBounds(390, 775, 143, 205);
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
		btnNewButton_8.setBounds(578, 712, 281, 304);
		// frame.getContentPane().add(btnNewButton_8);
		BG.add(btnNewButton_8);

		JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_9.setContentAreaFilled(false);
		btnNewButton_9.setBorderPainted(false);
		btnNewButton_9.setBorder(null);
		btnNewButton_9.setBackground(new Color(153, 153, 255));
		btnNewButton_9.setAutoscrolls(true);
		btnNewButton_9.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/numbers/zeroSmall.gif")));
		btnNewButton_9.setBounds(906, 389, 216, 328);
		// frame.getContentPane().add(btnNewButton_9);
		BG.add(btnNewButton_9);

		JLabel lblNewLabel = new JLabel("SUMA NÚMEROS HASTA LLEGAR A");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 45));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(978, 37, 902, 191);
		BG.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("25");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 99));
		lblNewLabel_1.setForeground(new Color(255, 255, 153));
		lblNewLabel_1.setBounds(1537, 264, 130, 109);
		BG.add(lblNewLabel_1);

		// PRUEBAS AUDIO
		// ////////////////////////////////////////////////////////////////////////////////////////////////////
		// mirar si puedo enganchar a socket buscando socket y audioimputstream

		File bso = new File("/Users/berni/git/JavaProjects/ProyectoAppInfantil/src/audioFiles/bso/bensound-buddy.wav");

		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(bso);
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			gainControl.setValue(-20.0f); // Reduce volume by 10 decibels.
		} catch (Exception ex) {
			System.out.println("Error with playing sound.");
			ex.printStackTrace();
		}

	}
}
