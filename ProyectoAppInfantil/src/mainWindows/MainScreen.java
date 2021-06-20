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
import java.awt.Cursor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class MainScreen {

	private JFrame mainFrame;
	private boolean isMuted = false;
	private float volume;
	FloatControl gainControl;
	
	
	
	
	// added to use from another window
	public JFrame getMainFrame() {
		return mainFrame;
	}
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen window = new MainScreen();
					window.mainFrame.setVisible(true);
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
		
		//Clip clip = null;
		
		mainFrame = new JFrame();
		mainFrame.setSize(1600, 900);
		mainFrame.getContentPane().setBackground(new Color(204, 204, 255));
		mainFrame.setBounds(0, 0, 1600, 900);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.getContentPane().setLayout(null);
		
		JLabel lblTitulo_AP = new JLabel("");
		lblTitulo_AP.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitulo_AP.setName("title_A");
		lblTitulo_AP.setIconTextGap(0);
		lblTitulo_AP.setIcon(new ImageIcon(MainScreen.class.getResource("/images/titles/title_AP.gif")));
		lblTitulo_AP.setFont(new Font("Tahoma", Font.BOLD, 60));
		lblTitulo_AP.setBounds(402, 20, 781, 172);
		mainFrame.getContentPane().add(lblTitulo_AP);
		
		JButton btnStart = new JButton("");
		btnStart.setContentAreaFilled(false);
		btnStart.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnStart.setBorderPainted(false);
		btnStart.setIcon(new ImageIcon(MainScreen.class.getResource("/images/titles/title_empezar.gif")));
		btnStart.setBounds(641, 543, 285, 97);
		mainFrame.getContentPane().add(btnStart);
		
		JLabel lblCopyright = new JLabel("Copyright © 2021 BerniVilaDev. Todos los derechos reservados");
		lblCopyright.setBounds(641, 822, 323, 24);
		mainFrame.getContentPane().add(lblCopyright);
		
		JButton btnLowerVolume = new JButton("");
		btnLowerVolume.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLowerVolume.setContentAreaFilled(false);
		btnLowerVolume.setBorder(null);
		btnLowerVolume.setBorderPainted(false);
		btnLowerVolume.setIcon(new ImageIcon(MainScreen.class.getResource("/images/icons/lowerVolume.png")));
		btnLowerVolume.setBounds(1342, 792, 60, 54);
		mainFrame.getContentPane().add(btnLowerVolume);
		
		JButton btnMute = new JButton("");
		btnMute.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMute.setIcon(new ImageIcon(MainScreen.class.getResource("/images/icons/muteIcon.png")));
		btnMute.setContentAreaFilled(false);
		btnMute.setBorderPainted(false);
		btnMute.setBorder(null);
		btnMute.setBounds(1419, 792, 60, 54);
		mainFrame.getContentPane().add(btnMute);
		
		JButton btnRaiseVolume = new JButton("");
		btnRaiseVolume.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRaiseVolume.setIcon(new ImageIcon(MainScreen.class.getResource("/images/icons/moreVolume.png")));
		btnRaiseVolume.setContentAreaFilled(false);
		btnRaiseVolume.setBorderPainted(false);
		btnRaiseVolume.setBorder(null);
		btnRaiseVolume.setBounds(1493, 792, 77, 54);
		mainFrame.getContentPane().add(btnRaiseVolume);
		
		JButton btnRegistro = new JButton("");
		btnRegistro.setContentAreaFilled(false);
		btnRegistro.setIcon(new ImageIcon(MainScreen.class.getResource("/images/titles/title_registrarse_blue.gif")));
		btnRegistro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRegistro.setBorderPainted(false);
		btnRegistro.setBounds(641, 679, 285, 97);
		mainFrame.getContentPane().add(btnRegistro);
		
		JLabel lblTitulo_RE = new JLabel("");
		lblTitulo_RE.setIcon(new ImageIcon(MainScreen.class.getResource("/images/titles/title_RE.gif")));
		lblTitulo_RE.setName("title_A");
		lblTitulo_RE.setIconTextGap(0);
		lblTitulo_RE.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitulo_RE.setFont(new Font("Tahoma", Font.BOLD, 60));
		lblTitulo_RE.setBounds(644, 20, 539, 172);
		mainFrame.getContentPane().add(lblTitulo_RE);
		
		JLabel lblTitulo_ND = new JLabel("");
		lblTitulo_ND.setIcon(new ImageIcon(MainScreen.class.getResource("/images/titles/title_ND.gif")));
		lblTitulo_ND.setName("title_A");
		lblTitulo_ND.setIconTextGap(0);
		lblTitulo_ND.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitulo_ND.setFont(new Font("Tahoma", Font.BOLD, 60));
		lblTitulo_ND.setBounds(848, 20, 335, 172);
		mainFrame.getContentPane().add(lblTitulo_ND);
		
		JLabel lblTitulo_E = new JLabel("");
		lblTitulo_E.setIcon(new ImageIcon(MainScreen.class.getResource("/images/titles/title_E.gif")));
		lblTitulo_E.setName("title_A");
		lblTitulo_E.setIconTextGap(0);
		lblTitulo_E.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitulo_E.setFont(new Font("Tahoma", Font.BOLD, 60));
		lblTitulo_E.setBounds(1098, 20, 85, 172);
		mainFrame.getContentPane().add(lblTitulo_E);
		
		JLabel lblTitulo_A = new JLabel("");
		lblTitulo_A.setIcon(new ImageIcon(MainScreen.class.getResource("/images/titles/title_A_small.gif")));
		lblTitulo_A.setName("title_A");
		lblTitulo_A.setIconTextGap(0);
		lblTitulo_A.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitulo_A.setFont(new Font("Tahoma", Font.BOLD, 60));
		lblTitulo_A.setBounds(771, 204, 77, 97);
		mainFrame.getContentPane().add(lblTitulo_A);
		
		JLabel lblTitulo_SU = new JLabel("");
		lblTitulo_SU.setIcon(new ImageIcon(MainScreen.class.getResource("/images/titles/title_SU.gif")));
		lblTitulo_SU.setName("title_A");
		lblTitulo_SU.setIconTextGap(0);
		lblTitulo_SU.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitulo_SU.setFont(new Font("Tahoma", Font.BOLD, 60));
		lblTitulo_SU.setBounds(490, 317, 230, 172);
		mainFrame.getContentPane().add(lblTitulo_SU);
		
		JLabel lblTitulo_M = new JLabel("");
		lblTitulo_M.setIcon(new ImageIcon(MainScreen.class.getResource("/images/titles/title_M.gif")));
		lblTitulo_M.setName("title_A");
		lblTitulo_M.setIconTextGap(0);
		lblTitulo_M.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitulo_M.setFont(new Font("Tahoma", Font.BOLD, 60));
		lblTitulo_M.setBounds(712, 317, 136, 172);
		mainFrame.getContentPane().add(lblTitulo_M);
		
		JLabel lblTitulo_AR = new JLabel("");
		lblTitulo_AR.setIcon(new ImageIcon(MainScreen.class.getResource("/images/titles/title_AR.gif")));
		lblTitulo_AR.setName("title_A");
		lblTitulo_AR.setIconTextGap(0);
		lblTitulo_AR.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitulo_AR.setFont(new Font("Tahoma", Font.BOLD, 60));
		lblTitulo_AR.setBounds(833, 317, 249, 172);
		mainFrame.getContentPane().add(lblTitulo_AR);
		
		JLabel lblBoy = new JLabel("");
		lblBoy.setVerifyInputWhenFocusTarget(false);
		lblBoy.setRequestFocusEnabled(false);
		lblBoy.setIconTextGap(0);
		lblBoy.setFocusable(false);
		lblBoy.setIcon(new ImageIcon(MainScreen.class.getResource("/images/titles/boy.gif")));
		lblBoy.setBounds(14, 347, 464, 447);
		mainFrame.getContentPane().add(lblBoy);
		
		JLabel lblGirl = new JLabel("");
		lblGirl.setIconTextGap(0);
		lblGirl.setFocusable(false);
		lblGirl.setVerifyInputWhenFocusTarget(false);
		lblGirl.setRequestFocusEnabled(false);
		lblGirl.setIcon(new ImageIcon(MainScreen.class.getResource("/images/titles/girl.gif")));
		lblGirl.setBounds(1169, 276, 378, 504);
		mainFrame.getContentPane().add(lblGirl);
		
		
		
		
		
		
		
		//SOUNDS/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		File bsoMainScreenWindows = new File("C:\\Users\\bernivila\\git\\DAWProject\\ProyectoAppInfantil\\src\\audioFiles\\bso\\bensound-buddy.wav");
		File bsoMainScreenMAC = new File("/Users/berni/git/javaFinalProject/ProyectoAppInfantil/src/audioFiles/bso/bensound-buddy.wav");


		
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(bsoMainScreenWindows);
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
//			FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			gainControl.setValue(-20.0f);
			volume = gainControl.getValue();
			float lastVolume = volume;
			
			
			btnMute.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (isMuted) {
						gainControl.setValue(lastVolume);
						isMuted = false;
						
					}
					else {
						gainControl.setValue(-80.0f);
						isMuted = true;
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
		
		
		
		
		//BOTONES PANTALLA PRINCIPAL ///////////////////////////////////////////////////////////////
		
		
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				LoginWindow loginWindow = new LoginWindow();
				loginWindow.getLoginWindow().setVisible(true);
				mainFrame.setVisible(false);
				
				gainControl.setValue(gainControl.getMinimum());

			}
		});
		
		btnRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterWindow registerWindow = new RegisterWindow();
				registerWindow.getRegisterWindow().setVisible(true);
				//frame.setVisible(false);
			}
		});
		
		
		
	}
}
