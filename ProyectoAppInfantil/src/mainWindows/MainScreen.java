package mainWindows;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;

import addNumbers.AddNumbersMainWindow;
import proyectoAppInfantil.LoginWindow;
import proyectoAppInfantil.NumbersWindow;
import proyectoAppInfantil.RegisterWindow;
import proyectoAppInfantil.StaticSoundMethods;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Cursor;
import java.awt.Dimension;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class MainScreen {

	private JFrame frame;
	private boolean muted = false;
	private float volume;

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
		//Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(1600, 900);
		frame.getContentPane().setBackground(new Color(255, 251, 243));
		frame.setBounds(0, 0, 1600, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("APRENDE A SUMAR CON JAVA");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 60));
		lblTitulo.setBounds(391, 116, 940, 125);
		frame.getContentPane().add(lblTitulo);
		
		JButton btnStart = new JButton("");
		btnStart.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnStart.setBorderPainted(false);
		btnStart.setIcon(new ImageIcon(MainScreen.class.getResource("/images/empezar.gif")));
		btnStart.setBounds(679, 412, 285, 97);
		frame.getContentPane().add(btnStart);
		
		JLabel lblCopyright = new JLabel("Copyright © 2021 BerniVilaDev. All rights reserved");
		lblCopyright.setBounds(641, 822, 323, 24);
		frame.getContentPane().add(lblCopyright);
		
		JButton btnLowerVolume = new JButton("");
		btnLowerVolume.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLowerVolume.setContentAreaFilled(false);
		btnLowerVolume.setBorder(null);
		btnLowerVolume.setBorderPainted(false);
		btnLowerVolume.setIcon(new ImageIcon(MainScreen.class.getResource("/images/icons/lowerVolume.png")));
		btnLowerVolume.setBounds(1342, 792, 60, 54);
		frame.getContentPane().add(btnLowerVolume);
		
		JButton btnMute = new JButton("");
		btnMute.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMute.setIcon(new ImageIcon(MainScreen.class.getResource("/images/icons/muteIcon.png")));
		btnMute.setContentAreaFilled(false);
		btnMute.setBorderPainted(false);
		btnMute.setBorder(null);
		btnMute.setBounds(1419, 792, 60, 54);
		frame.getContentPane().add(btnMute);
		
		JButton btnRaiseVolume = new JButton("");
		btnRaiseVolume.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRaiseVolume.setIcon(new ImageIcon(MainScreen.class.getResource("/images/icons/moreVolume.png")));
		btnRaiseVolume.setContentAreaFilled(false);
		btnRaiseVolume.setBorderPainted(false);
		btnRaiseVolume.setBorder(null);
		btnRaiseVolume.setBounds(1493, 792, 77, 54);
		frame.getContentPane().add(btnRaiseVolume);
		
		JButton btnRegistro = new JButton("Registrate");
		btnRegistro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRegistro.setBorderPainted(false);
		btnRegistro.setBounds(679, 584, 285, 97);
		frame.getContentPane().add(btnRegistro);
		
		
		
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				LoginWindow loginWindow = new LoginWindow();
				loginWindow.getLoginWindow().setVisible(true);
				//frame.setVisible(false);

			}
		});
		
		btnRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterWindow registerWindow = new RegisterWindow();
				registerWindow.getRegisterWindow().setVisible(true);
				//frame.setVisible(false);
			}
		});
		
		
		
		
		
		
		//SOUNDS/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		File bso = new File("C:\\Users\\bernivila\\git\\DAWProject\\ProyectoAppInfantil\\src\\audioFiles\\bso\\bensound-buddy.wav");
		
		File bsoMAC = new File("/Users/berni/git/JavaProjects/ProyectoAppInfantil/src/audioFiles/bso/bensound-buddy.wav");
		
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(bso);
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
