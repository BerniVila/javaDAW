package proyectoAppInfantil;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import addNumbers.AddNumbersLogic;
import mainWindows.MainScreen;

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
import javax.swing.JSpinner;

public class NumbersWindow {

	private JFrame numbersFrame;
	// private PanelBackground frameBG;
	private boolean muted = false;
	private float volume;
	ArrayList<Integer> numList = new ArrayList<Integer>();
	private String result;

	// added to use from main window
	public JFrame getNumbersWindow() {
		return numbersFrame;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NumbersWindow window = new NumbersWindow();
					window.numbersFrame.setVisible(true);
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
		
		
		
		numbersFrame = new JFrame();
		numbersFrame.getContentPane().setBackground(new Color(153, 153, 255));
		numbersFrame.setBounds(100, 100, 1600, 900);
		// Image img =
		// Toolkit.getDefaultToolkit().getImage("/images/backgrounds/claseFondoBig.jpg");
		numbersFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		numbersFrame.getContentPane().setLayout(null);

		PanelBackground bg = new PanelBackground();
		bg.setBounds(0, 0, 1600, 900); // en clase 1600x900
		numbersFrame.getContentPane().add(bg);
		bg.setLayout(null);

		JButton btn_1 = new JButton("");
		btn_1.setName("1");
		btn_1.setBorderPainted(false);
		btn_1.setContentAreaFilled(false);
		btn_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_1.setBackground(new Color(153, 153, 255));
		btn_1.setBorder(null);
		btn_1.setAutoscrolls(true);
		btn_1.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/numbers/one.gif")));
		btn_1.setBounds(59, 44, 124, 185);
		// frame.getContentPane().add(btnNewButton);
		bg.add(btn_1);

		JButton btn_2 = new JButton("");
		btn_2.setName("2");
		btn_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_2.setContentAreaFilled(false);
		btn_2.setBorderPainted(false);
		btn_2.setBorder(null);
		btn_2.setBackground(new Color(153, 153, 255));
		btn_2.setAutoscrolls(true);
		btn_2.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/numbers/two.gif")));
		btn_2.setBounds(223, 54, 124, 168);
		// frame.getContentPane().add(btnNewButton_1);
		bg.add(btn_2);

		JButton btn_3 = new JButton("");
		btn_3.setName("3");
		btn_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_3.setContentAreaFilled(false);
		btn_3.setBorderPainted(false);
		btn_3.setBorder(null);
		btn_3.setBackground(new Color(153, 153, 255));
		btn_3.setAutoscrolls(true);
		btn_3.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/numbers/three.gif")));
		btn_3.setBounds(393, 44, 130, 185);
		// frame.getContentPane().add(btnNewButton_2);
		bg.add(btn_3);

		JButton btn_4 = new JButton("");
		btn_4.setName("4");
		btn_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_4.setContentAreaFilled(false);
		btn_4.setBorderPainted(false);
		btn_4.setBorder(null);
		btn_4.setBackground(new Color(153, 153, 255));
		btn_4.setAutoscrolls(true);
		btn_4.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/numbers/four.gif")));
		btn_4.setBounds(549, 44, 143, 176);
		// frame.getContentPane().add(btnNewButton_3);
		bg.add(btn_4);

		JButton btn_5 = new JButton("");
		btn_5.setName("5");
		btn_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_5.setContentAreaFilled(false);
		btn_5.setBorderPainted(false);
		btn_5.setBorder(null);
		btn_5.setBackground(new Color(153, 153, 255));
		btn_5.setAutoscrolls(true);
		btn_5.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/numbers/five.gif")));
		btn_5.setBounds(47, 297, 143, 191);
		// frame.getContentPane().add(btnNewButton_4);
		bg.add(btn_5);

		JButton btn_6 = new JButton("");
		btn_6.setName("6");
		btn_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_6.setContentAreaFilled(false);
		btn_6.setBorderPainted(false);
		btn_6.setBorder(null);
		btn_6.setBackground(new Color(153, 153, 255));
		btn_6.setAutoscrolls(true);
		btn_6.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/numbers/six.gif")));
		btn_6.setBounds(202, 297, 172, 185);
		// frame.getContentPane().add(btnNewButton_5);
		bg.add(btn_6);

		JButton btn_7 = new JButton("");
		btn_7.setName("7");
		btn_7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_7.setContentAreaFilled(false);
		btn_7.setBorderPainted(false);
		btn_7.setBorder(null);
		btn_7.setBackground(new Color(153, 153, 255));
		btn_7.setAutoscrolls(true);
		btn_7.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/numbers/seven.gif")));
		btn_7.setBounds(393, 297, 143, 176);
		// frame.getContentPane().add(btnNewButton_6);
		bg.add(btn_7);

		JButton btn_8 = new JButton("");
		btn_8.setName("8");
		btn_8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_8.setContentAreaFilled(false);
		btn_8.setBorderPainted(false);
		btn_8.setBorder(null);
		btn_8.setBackground(new Color(153, 153, 255));
		btn_8.setAutoscrolls(true);
		btn_8.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/numbers/eight.gif")));
		btn_8.setBounds(562, 297, 130, 185);
		// frame.getContentPane().add(btnNewButton_7);
		bg.add(btn_8);

		JButton btn_9 = new JButton("");
		btn_9.setName("9");
		btn_9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_9.setContentAreaFilled(false);
		btn_9.setBorderPainted(false);
		btn_9.setBorder(null);
		btn_9.setBackground(new Color(153, 153, 255));
		btn_9.setAutoscrolls(true);
		btn_9.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/numbers/nine.gif")));
		btn_9.setBounds(47, 560, 149, 176);
		// frame.getContentPane().add(btnNewButton_8);
		bg.add(btn_9);

		JLabel lblTitle = new JLabel("SUMA NÃšMEROS CON RESULTADO");
		lblTitle.setFont(new Font("Comic Sans MS", Font.BOLD, 45));
		lblTitle.setForeground(new Color(255, 255, 255));
		lblTitle.setBounds(762, 6, 830, 191);
		bg.add(lblTitle);

		JLabel lblTargetNumber = new JLabel("");
		lblTargetNumber.setFont(new Font("Comic Sans MS", Font.BOLD, 99));
		lblTargetNumber.setForeground(new Color(255, 255, 153));
		lblTargetNumber.setBounds(1004, 189, 157, 109);
		bg.add(lblTargetNumber);

		JButton btn_10 = new JButton("");
		btn_10.setName("10");
		btn_10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_10.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/numbers/ten.gif")));
		btn_10.setContentAreaFilled(false);
		btn_10.setBorderPainted(false);
		btn_10.setBorder(null);
		btn_10.setBackground(new Color(153, 153, 255));
		btn_10.setAutoscrolls(true);
		btn_10.setBounds(235, 560, 150, 185);
		bg.add(btn_10);

		JButton btnHelp = new JButton("AYUDA");
		btnHelp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnHelp.setOpaque(true);
		btnHelp.setBorder(null);
		btnHelp.setBorderPainted(false);
		btnHelp.setBackground(new Color(255, 153, 102));
		btnHelp.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		btnHelp.setBounds(439, 560, 231, 82);
		bg.add(btnHelp);

		JButton btnGenerateNumber = new JButton("GENERAR NÃšMERO");
		btnGenerateNumber.setOpaque(true);
		btnGenerateNumber.setBorder(null);
		btnGenerateNumber.setBorderPainted(false);
		btnGenerateNumber.setBackground(new Color(102, 153, 204));
		btnGenerateNumber.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGenerateNumber.setBounds(1384, 208, 166, 90);
		bg.add(btnGenerateNumber);

		JLabel lblResultado = new JLabel("RESULTADO");
		lblResultado.setForeground(new Color(153, 255, 204));
		lblResultado.setFont(new Font("Kohinoor Telugu", Font.PLAIN, 64));
		lblResultado.setBounds(1059, 324, 341, 137);
		bg.add(lblResultado);

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
		
		JButton btnPista = new JButton("PISTA");
		btnPista.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPista.setBackground(new Color(102, 153, 153));
		btnPista.setBorderPainted(false);
		btnPista.setBorder(null);
		btnPista.setOpaque(true);
		btnPista.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		btnPista.setBounds(439, 648, 231, 90);
		bg.add(btnPista);
		
		JButton btnAtras = new JButton("<-- ATRÃ�S");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAtras.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAtras.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		btnAtras.setBounds(6, 790, 231, 68);
		bg.add(btnAtras);
		
		JSpinner spinnerMaxValue = new JSpinner();
		spinnerMaxValue.setBounds(1259, 239, 113, 26);
		bg.add(spinnerMaxValue);
		
		JLabel lblMaxValue = new JLabel("NÂº MÃ�XIMO");
		lblMaxValue.setBounds(1272, 216, 85, 23);
		bg.add(lblMaxValue);

		// StaticSoundMethods.playSound(bso);

		// SOUNDS/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		File bso = new File(
				"C:\\Users\\bernivila\\git\\DAWProject\\ProyectoAppInfantil\\src\\audioFiles\\bso\\bensound-buddy.wav");

		File bsoMAC = new File(
				"/Users/berni/git/JavaProjects/ProyectoAppInfantil/src/audioFiles/bso/bensound-buddy.wav");

		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(bso);
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			gainControl.setValue(-20.0f);
			clip.start();
			clip.loop(10);
			volume = gainControl.getValue();
			float lastVolume = volume;

			btnMute.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (muted) {
						gainControl.setValue(lastVolume);
						muted = false;

					} else {
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
		
		
		
		//GENERAR NUEVO NUMERO //////////////////////////////////////////////////////////
		AddNumbersLogic numbersLogic = new AddNumbersLogic(10);
		lblTargetNumber.setText(String.valueOf(numbersLogic.getTargetNum()));
		
		JLabel lblMostrarResultado = new JLabel("");
		lblMostrarResultado.setForeground(new Color(255, 204, 255));
		lblMostrarResultado.setFont(new Font("Comic Sans MS", Font.PLAIN, 75));
		lblMostrarResultado.setBounds(847, 437, 703, 115);
		bg.add(lblMostrarResultado);

		
		btnGenerateNumber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int newTarget = numbersLogic.generateNumber(Integer.valueOf(spinnerMaxValue.getValue().toString()));
				lblTargetNumber.setText(String.valueOf(newTarget));
				numList.removeAll(numList);
				lblMostrarResultado.setText("");
			}
		});
		

		// SONIDOS DE NÃšMEROS////////////////////////////////////////
		File numSound1 = new File(
				"/Users/berni/git/JavaProjects/ProyectoAppInfantil/src/audioFiles/numberSounds/uno.wav");
		File numSound2 = new File(
				"/Users/berni/git/JavaProjects/ProyectoAppInfantil/src/audioFiles/numberSounds/dos.wav");
		File numSound3 = new File(
				"/Users/berni/git/JavaProjects/ProyectoAppInfantil/src/audioFiles/numberSounds/tres.wav");
		File numSound4 = new File(
				"/Users/berni/git/JavaProjects/ProyectoAppInfantil/src/audioFiles/numberSounds/cuatro.wav");
		File numSound5 = new File(
				"/Users/berni/git/JavaProjects/ProyectoAppInfantil/src/audioFiles/numberSounds/cinco.wav");
		File numSound6 = new File(
				"/Users/berni/git/JavaProjects/ProyectoAppInfantil/src/audioFiles/numberSounds/seis.wav");
		File numSound7 = new File(
				"/Users/berni/git/JavaProjects/ProyectoAppInfantil/src/audioFiles/numberSounds/siete.wav");
		File numSound8 = new File(
				"/Users/berni/git/JavaProjects/ProyectoAppInfantil/src/audioFiles/numberSounds/ocho.wav");
		File numSound9 = new File(
				"/Users/berni/git/JavaProjects/ProyectoAppInfantil/src/audioFiles/numberSounds/nueve.wav");
		File numSound10 = new File(
				"/Users/berni/git/JavaProjects/ProyectoAppInfantil/src/audioFiles/numberSounds/diez.wav");

		
		
		btn_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaticSoundMethods.playSound(numSound10);
				numbersLogic.addNumber(numList, Integer.valueOf(btn_10.getName()));
				lblMostrarResultado.setText(lblMostrarResultado.getText() + " " + btn_10.getName());
				result = numbersLogic.checkResult(numList, Integer.valueOf(lblTargetNumber.getText()));
				checkGameResult(result, lblMostrarResultado);
				System.out.println(numList);
			}
		});

		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaticSoundMethods.playSound(numSound1);
				numbersLogic.addNumber(numList, Integer.valueOf(btn_1.getName()));
				lblMostrarResultado.setText(lblMostrarResultado.getText() + " " + btn_1.getName());
				result = numbersLogic.checkResult(numList, Integer.valueOf(lblTargetNumber.getText()));
				checkGameResult(result, lblMostrarResultado);
			}
		});

		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaticSoundMethods.playSound(numSound2);
				numbersLogic.addNumber(numList, Integer.valueOf(btn_2.getName()));
				lblMostrarResultado.setText(lblMostrarResultado.getText() + " " + btn_2.getName());
				result = numbersLogic.checkResult(numList, Integer.valueOf(lblTargetNumber.getText()));
				checkGameResult(result, lblMostrarResultado);
			}
		});

		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaticSoundMethods.playSound(numSound3);
				numbersLogic.addNumber(numList, Integer.valueOf(btn_3.getName()));
				lblMostrarResultado.setText(lblMostrarResultado.getText() + " " + btn_3.getName());
				result = numbersLogic.checkResult(numList, Integer.valueOf(lblTargetNumber.getText()));
				checkGameResult(result, lblMostrarResultado);
			}
		});

		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaticSoundMethods.playSound(numSound4);
				numbersLogic.addNumber(numList, Integer.valueOf(btn_4.getName()));
				lblMostrarResultado.setText(lblMostrarResultado.getText() + " " + btn_4.getName());
				result = numbersLogic.checkResult(numList, Integer.valueOf(lblTargetNumber.getText()));
				checkGameResult(result, lblMostrarResultado);
			}
		});

		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaticSoundMethods.playSound(numSound5);
				numbersLogic.addNumber(numList, Integer.valueOf(btn_5.getName()));
				lblMostrarResultado.setText(lblMostrarResultado.getText() + " " + btn_5.getName());
				result = numbersLogic.checkResult(numList, Integer.valueOf(lblTargetNumber.getText()));
				checkGameResult(result, lblMostrarResultado);
			}
		});

		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaticSoundMethods.playSound(numSound6);
				numbersLogic.addNumber(numList, Integer.valueOf(btn_6.getName()));
				lblMostrarResultado.setText(lblMostrarResultado.getText() + " " + btn_6.getName());
				result = numbersLogic.checkResult(numList, Integer.valueOf(lblTargetNumber.getText()));
				checkGameResult(result, lblMostrarResultado);
			}
		});

		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaticSoundMethods.playSound(numSound7);
				numbersLogic.addNumber(numList, Integer.valueOf(btn_7.getName()));
				lblMostrarResultado.setText(lblMostrarResultado.getText() + " " + btn_7.getName());
				result = numbersLogic.checkResult(numList, Integer.valueOf(lblTargetNumber.getText()));
				checkGameResult(result, lblMostrarResultado);
			}
		});

		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaticSoundMethods.playSound(numSound8);
				numbersLogic.addNumber(numList, Integer.valueOf(btn_8.getName()));
				lblMostrarResultado.setText(lblMostrarResultado.getText() + " " + btn_8.getName());
				result = numbersLogic.checkResult(numList, Integer.valueOf(lblTargetNumber.getText()));
				checkGameResult(result, lblMostrarResultado);
			}
		});

		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaticSoundMethods.playSound(numSound9);
				numbersLogic.addNumber(numList, Integer.valueOf(btn_9.getName()));
				lblMostrarResultado.setText(lblMostrarResultado.getText() + " " + btn_9.getName());
				result = numbersLogic.checkResult(numList, Integer.valueOf(lblTargetNumber.getText()));
				checkGameResult(result, lblMostrarResultado);
			}
		});
		
		//VOLVER ATRÃ�S///////////////////////////////////////////////////////////////////
		
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainScreen window = new MainScreen();
				window.getMainFrame().setVisible(true);
				numbersFrame.setVisible(false);
			}
		});
		

	}
	
	
	
	
	public void checkGameResult(String result, JLabel lblMostrarResultado) {
		if (result.compareToIgnoreCase("win") == 0) {
			lblMostrarResultado.setText("HAS GANADO!!!");
		}
		if (result.compareToIgnoreCase("lose") == 0) {
			lblMostrarResultado.setText("HAS PERDIDO!!!");
		}
		if (result.compareToIgnoreCase("try") == 0) {
			lblMostrarResultado.setText(lblMostrarResultado.getText() + " + ");
		}
	}
	
	
	
	
}
