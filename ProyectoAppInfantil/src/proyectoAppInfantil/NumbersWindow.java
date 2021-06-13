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
	//private PanelBackground frameBG;
	private boolean muted = false;
	private float volume;
	File btnFX1 = new File("/Users/berni/git/JavaProjects/ProyectoAppInfantil/src/audioFiles/fx/BOTW_Fanfare_SmallItem.wav");
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

		
		PanelBackground bg = new PanelBackground();
		bg.setBounds(0, 0, 1600, 900); //en clase 1600x900
		frame.getContentPane().add(bg);
		bg.setLayout(null);

		JButton btn_1 = new JButton("");
		btn_1.addActionListener(new ActionListener() {
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
		btn_1.setBorderPainted(false);
		btn_1.setContentAreaFilled(false);
		btn_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_1.setBackground(new Color(153, 153, 255));
		btn_1.setBorder(null);
		btn_1.setAutoscrolls(true);
		btn_1.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/numbers/one.gif")));
		btn_1.setBounds(209, 55, 124, 185);
		// frame.getContentPane().add(btnNewButton);
		bg.add(btn_1);

		JButton btn_2 = new JButton("");
		btn_2.addActionListener(new ActionListener() {
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
		btn_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_2.setContentAreaFilled(false);
		btn_2.setBorderPainted(false);
		btn_2.setBorder(null);
		btn_2.setBackground(new Color(153, 153, 255));
		btn_2.setAutoscrolls(true);
		btn_2.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/numbers/two.gif")));
		btn_2.setBounds(366, 61, 124, 168);
		// frame.getContentPane().add(btnNewButton_1);
		bg.add(btn_2);

		JButton btn_3 = new JButton("");
		btn_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_3.setContentAreaFilled(false);
		btn_3.setBorderPainted(false);
		btn_3.setBorder(null);
		btn_3.setBackground(new Color(153, 153, 255));
		btn_3.setAutoscrolls(true);
		btn_3.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/numbers/three.gif")));
		btn_3.setBounds(540, 55, 130, 185);
		// frame.getContentPane().add(btnNewButton_2);
		bg.add(btn_3);

		JButton btn_4 = new JButton("");
		btn_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_4.setContentAreaFilled(false);
		btn_4.setBorderPainted(false);
		btn_4.setBorder(null);
		btn_4.setBackground(new Color(153, 153, 255));
		btn_4.setAutoscrolls(true);
		btn_4.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/numbers/four.gif")));
		btn_4.setBounds(40, 309, 143, 176);
		// frame.getContentPane().add(btnNewButton_3);
		bg.add(btn_4);

		JButton btn_5 = new JButton("");
		btn_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_5.setContentAreaFilled(false);
		btn_5.setBorderPainted(false);
		btn_5.setBorder(null);
		btn_5.setBackground(new Color(153, 153, 255));
		btn_5.setAutoscrolls(true);
		btn_5.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/numbers/five.gif")));
		btn_5.setBounds(209, 309, 143, 191);
		// frame.getContentPane().add(btnNewButton_4);
		bg.add(btn_5);

		JButton btn_6 = new JButton("");
		btn_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_6.setContentAreaFilled(false);
		btn_6.setBorderPainted(false);
		btn_6.setBorder(null);
		btn_6.setBackground(new Color(153, 153, 255));
		btn_6.setAutoscrolls(true);
		btn_6.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/numbers/six.gif")));
		btn_6.setBounds(366, 309, 172, 185);
		// frame.getContentPane().add(btnNewButton_5);
		bg.add(btn_6);

		JButton btn_7 = new JButton("");
		btn_7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_7.setContentAreaFilled(false);
		btn_7.setBorderPainted(false);
		btn_7.setBorder(null);
		btn_7.setBackground(new Color(153, 153, 255));
		btn_7.setAutoscrolls(true);
		btn_7.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/numbers/seven.gif")));
		btn_7.setBounds(549, 309, 143, 176);
		// frame.getContentPane().add(btnNewButton_6);
		bg.add(btn_7);

		JButton btn_8 = new JButton("");
		btn_8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_8.setContentAreaFilled(false);
		btn_8.setBorderPainted(false);
		btn_8.setBorder(null);
		btn_8.setBackground(new Color(153, 153, 255));
		btn_8.setAutoscrolls(true);
		btn_8.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/numbers/eight.gif")));
		btn_8.setBounds(60, 565, 130, 185);
		// frame.getContentPane().add(btnNewButton_7);
		bg.add(btn_8);

		JButton btn_9 = new JButton("");
		btn_9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_9.setContentAreaFilled(false);
		btn_9.setBorderPainted(false);
		btn_9.setBorder(null);
		btn_9.setBackground(new Color(153, 153, 255));
		btn_9.setAutoscrolls(true);
		btn_9.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/numbers/nine.gif")));
		btn_9.setBounds(224, 565, 149, 176);
		// frame.getContentPane().add(btnNewButton_8);
		bg.add(btn_9);


		JLabel lblTitle = new JLabel("SUMA NÚMEROS CON RESULTADO");
		lblTitle.setFont(new Font("Comic Sans MS", Font.BOLD, 45));
		lblTitle.setForeground(new Color(255, 255, 255));
		lblTitle.setBounds(762, 6, 830, 191);
		bg.add(lblTitle);

		JLabel lblNumber = new JLabel("25");
		lblNumber.setFont(new Font("Comic Sans MS", Font.BOLD, 99));
		lblNumber.setForeground(new Color(255, 255, 153));
		lblNumber.setBounds(1133, 189, 130, 109);
		bg.add(lblNumber);
		
		JButton btn_0 = new JButton("");
		btn_0.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/numbers/zeroSmall.gif")));
		btn_0.setContentAreaFilled(false);
		btn_0.setBorderPainted(false);
		btn_0.setBorder(null);
		btn_0.setBackground(new Color(153, 153, 255));
		btn_0.setAutoscrolls(true);
		btn_0.setBounds(47, 55, 130, 185);
		bg.add(btn_0);
		
		JButton btnHelp = new JButton("AYUDA");
		btnHelp.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		btnHelp.setBounds(417, 583, 253, 158);
		bg.add(btnHelp);
		
		JButton btnGenerateNumber = new JButton("NUEVO NÚMERO");
		btnGenerateNumber.setBounds(1384, 189, 166, 90);
		bg.add(btnGenerateNumber);
		
		JLabel lblNewLabel = new JLabel("RESULTADO");
		lblNewLabel.setForeground(new Color(153, 255, 204));
		lblNewLabel.setFont(new Font("Kohinoor Telugu", Font.PLAIN, 64));
		lblNewLabel.setBounds(795, 348, 743, 137);
		bg.add(lblNewLabel);
		
		JButton btnLowerVolume = new JButton("");
		btnLowerVolume.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/icons/lowerVolume.png")));
		btnLowerVolume.setContentAreaFilled(false);
		btnLowerVolume.setBorderPainted(false);
		btnLowerVolume.setBorder(null);
		btnLowerVolume.setBounds(1354, 790, 60, 54);
		bg.add(btnLowerVolume);
		
		JButton btnMute = new JButton("");
		btnMute.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/icons/muteIcon.png")));
		btnMute.setContentAreaFilled(false);
		btnMute.setBorderPainted(false);
		btnMute.setBorder(null);
		btnMute.setBounds(1431, 790, 60, 54);
		bg.add(btnMute);
		
		JButton btnRaiseVolume = new JButton("");
		btnRaiseVolume.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/icons/moreVolume.png")));
		btnRaiseVolume.setContentAreaFilled(false);
		btnRaiseVolume.setBorderPainted(false);
		btnRaiseVolume.setBorder(null);
		btnRaiseVolume.setBounds(1505, 790, 77, 54);
		bg.add(btnRaiseVolume);
		
		
		
		
		//StaticSoundMethods.playSound(bso);

		//SOUNDS/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
				File bso = new File("C:\\Users\\bernivila\\git\\DAWProject\\ProyectoAppInfantil\\src\\audioFiles\\bso\\bensound-buddy.wav");
				
				File bsoMAC = new File("/Users/berni/git/JavaProjects/ProyectoAppInfantil/src/audioFiles/bso/bensound-buddy.wav");
				
				try {
					AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(bsoMAC);
					Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
					FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
					gainControl.setValue(-20.0f);
					volume = gainControl.getValue();
					float lastVolume = volume;
					
					
					btnMute.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if (muted) {
								gainControl.setValue(lastVolume);
								muted = false;
								
							}
							else {
								gainControl.setValue(-80.0f);
								muted = true;
							}
							
						}
					});
					
					
					btnRaiseVolume.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							volume = gainControl.getValue();
							volume += 2.5;
							if (volume >= 5.0) {
								volume = 5;
							}
							gainControl.setValue(volume);					
						}
					});
					
					
					btnLowerVolume.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							volume = gainControl.getValue();
							volume -= 10;
							if (volume <= -80) {
								volume = -80;
							}
							gainControl.setValue(volume);
						}
					});
					
					
				} catch (Exception ex) {
					System.out.println("Error with playing sound.");
					ex.printStackTrace();
				}
				
				
	}
}
