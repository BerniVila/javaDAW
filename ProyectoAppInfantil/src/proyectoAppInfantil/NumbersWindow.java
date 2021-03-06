package proyectoAppInfantil;

import java.awt.EventQueue;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import addNumbers.AddNumbersLogic;
import chatWindow.ChatAlumnoCli;
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
import javax.swing.border.TitledBorder;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;

public class NumbersWindow {

	private JFrame numbersFrame;
	// private PanelBackground frameBG;
	private boolean isMuted = false;
	private boolean isJugando = true;
	private float volume;
	private static ArrayList<Integer> numList = new ArrayList<Integer>();
	private String result;
	private static JLabel lblTargetNumber;
	private static JLabel lblNombreUsuario;
	JButton btnPista;
	JButton btnHelp;
	FloatControl gainControl;

	public static String getSumaActual() {
		String sumaActual = devolverSumaActual(numList);
		return sumaActual;
	}

	public static String getObjetivoActual() {
		String objetivoActual = devolverObjetivoActual(lblTargetNumber);
		return objetivoActual;
	}

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
		numbersFrame.setBounds(0, 0, 1600, 900);
		numbersFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
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

		JLabel lblTitle = new JLabel("SUMA NUMEROS CON RESULTADO");
		lblTitle.setFocusable(false);
		lblTitle.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
		lblTitle.setForeground(new Color(255, 255, 255));
		lblTitle.setBounds(722, 94, 872, 90);
		bg.add(lblTitle);

		lblTargetNumber = new JLabel("");
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

		btnHelp = new JButton("AYUDA");
		btnHelp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnHelp.setEnabled(false);
		btnHelp.setOpaque(true);
		btnHelp.setBorder(null);
		btnHelp.setBorderPainted(false);
		btnHelp.setBackground(new Color(255, 153, 102));
		btnHelp.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		btnHelp.setBounds(439, 560, 231, 82);
		bg.add(btnHelp);

		JButton btnGenerateNumber = new JButton("GENERAR NUMERO");
		btnGenerateNumber.setOpaque(true);
		btnGenerateNumber.setBorder(null);
		btnGenerateNumber.setBorderPainted(false);
		btnGenerateNumber.setBackground(new Color(102, 153, 204));
		btnGenerateNumber.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGenerateNumber.setBounds(1384, 208, 166, 90);
		bg.add(btnGenerateNumber);

		JLabel lblResultado = new JLabel("");
		lblResultado.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/titles/resultado.png")));
		lblResultado.setForeground(new Color(153, 255, 204));
		lblResultado.setFont(new Font("Kohinoor Telugu", Font.PLAIN, 64));
		lblResultado.setBounds(1005, 341, 288, 62);
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

		btnPista = new JButton("PISTA");
		btnPista.setEnabled(false);
		btnPista.setSelected(true);
		btnPista.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPista.setBackground(new Color(102, 153, 153));
		btnPista.setBorder(null);
		btnPista.setOpaque(true);
		btnPista.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		btnPista.setBounds(439, 648, 231, 90);
		bg.add(btnPista);

		JButton btnAtras = new JButton("<-- ATRAS");
		btnAtras.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAtras.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		btnAtras.setBounds(6, 790, 309, 68);
		bg.add(btnAtras);

		JSpinner spinnerMaxValue = new JSpinner();
		spinnerMaxValue.setBounds(1244, 240, 113, 26);
		spinnerMaxValue.setValue(10);
		bg.add(spinnerMaxValue);

		JLabel lblMaxValue = new JLabel("N?? MAXIMO");
		lblMaxValue.setBounds(1244, 216, 113, 23);
		bg.add(lblMaxValue);

		JButton[] numberButtons = new JButton[] { btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9,
				btn_10 };

		// SOUNDS/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		File bso = new File(
				"C:\\Users\\bernivila\\git\\DAWProject\\ProyectoAppInfantil\\src\\audioFiles\\bso\\bensound-buddy.wav");

		File bsoMAC = new File(
				"/Users/berni/git/javaFinalProject/ProyectoAppInfantil/src/audioFiles/bso/bensound-buddy.wav");

		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(bso);
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			gainControl.setValue(-20.0f);
			clip.start();
			clip.loop(10);
			volume = gainControl.getValue();
			float lastVolume = volume;

			btnMute.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (isMuted) {
						gainControl.setValue(lastVolume);
						isMuted = false;

					} else {
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

		// GENERAR NUEVO NUMERO //////////////////////////////////////////////////
		AddNumbersLogic numbersLogic = new AddNumbersLogic();
		lblTargetNumber.setText(String.valueOf(numbersLogic.getTargetNum()));
		ocultarNumero(lblTargetNumber, numberButtons);

		JLabel lblMostrarResultado = new JLabel("");
		lblMostrarResultado.setForeground(new Color(255, 204, 255));
		lblMostrarResultado.setFont(new Font("Comic Sans MS", Font.PLAIN, 75));
		lblMostrarResultado.setBounds(830, 408, 703, 102);
		bg.add(lblMostrarResultado);

		JLabel lblWinning = new JLabel("");
		lblWinning.setVisible(false);
		lblWinning.setOpaque(true);
		lblWinning.setFocusable(false);
		lblWinning.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/titles/congrats.gif")));
		lblWinning.setBounds(830, 535, 500, 260);
		bg.add(lblWinning);

		lblNombreUsuario = new JLabel("");
		lblNombreUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreUsuario.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null),
				"NOMBRE DE USUARIO", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		lblNombreUsuario.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		lblNombreUsuario.setForeground(new Color(153, 153, 255));
		lblNombreUsuario.setBounds(899, 13, 367, 82);
		bg.add(lblNombreUsuario);

		btnGenerateNumber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int newTarget = numbersLogic.generateNumber(Integer.valueOf(spinnerMaxValue.getValue().toString()));
				lblTargetNumber.setText(String.valueOf(newTarget));
				numList.removeAll(numList);
				lblMostrarResultado.setText("");
				File generateNum = new File(
						"/Users/berni/git/javaFinalProject/ProyectoAppInfantil/src/audioFiles/fx/BOTW_Fanfare_SmallItem.wav");
				File generateNumWin = new File(
						"C:\\Users\\bernivila\\git\\DAWProject\\ProyectoAppInfantil\\src\\audioFiles\\fx\\BOTW_Fanfare_SmallItem.wav");
				StaticSoundMethods.playSound(generateNumWin);
				lblWinning.setVisible(false);
				isJugando = true;
				seguirJugando(isJugando, numberButtons);
				ocultarNumero(lblTargetNumber, numberButtons);
			}
		});

		// SONIDOS DE NUMEROS////////////////////////////////////////

		File numSound1Win = new File(
				"C:\\Users\\bernivila\\git\\DAWProject\\ProyectoAppInfantil\\src\\audioFiles\\numberSounds\\uno.wav");
		File numSound2Win = new File(
				"C:\\Users\\bernivila\\git\\DAWProject\\ProyectoAppInfantil\\src\\audioFiles\\numberSounds\\dos.wav");
		File numSound3Win = new File(
				"C:\\Users\\bernivila\\git\\DAWProject\\ProyectoAppInfantil\\src\\audioFiles\\numberSounds\\tres.wav");
		File numSound4Win = new File(
				"C:\\Users\\bernivila\\git\\DAWProject\\ProyectoAppInfantil\\src\\audioFiles\\numberSounds\\cuatro.wav");
		File numSound5Win = new File(
				"C:\\Users\\bernivila\\git\\DAWProject\\ProyectoAppInfantil\\src\\audioFiles\\numberSounds\\cinco.wav");
		File numSound6Win = new File(
				"C:\\Users\\bernivila\\git\\DAWProject\\ProyectoAppInfantil\\src\\audioFiles\\numberSounds\\seis.wav");
		File numSound7Win = new File(
				"C:\\Users\\bernivila\\git\\DAWProject\\ProyectoAppInfantil\\src\\audioFiles\\numberSounds\\siete.wav");
		File numSound8Win = new File(
				"C:\\Users\\bernivila\\git\\DAWProject\\ProyectoAppInfantil\\src\\audioFiles\\numberSounds\\ocho.wav");
		File numSound9Win = new File(
				"C:\\Users\\bernivila\\git\\DAWProject\\ProyectoAppInfantil\\src\\audioFiles\\numberSounds\\nueve.wav");
		File numSound10Win = new File(
				"C:\\Users\\bernivila\\git\\DAWProject\\ProyectoAppInfantil\\src\\audioFiles\\numberSounds\\diez.wav");

		File numSound1Mac = new File(
				"/Users/berni/git/javaFinalProject/ProyectoAppInfantil/src/audioFiles/numberSounds/uno.wav");
		File numSound2Mac = new File(
				"/Users/berni/git/javaFinalProject/ProyectoAppInfantil/src/audioFiles/numberSounds/dos.wav");
		File numSound3Mac = new File(
				"/Users/berni/git/javaFinalProject/ProyectoAppInfantil/src/audioFiles/numberSounds/tres.wav");
		File numSound4Mac = new File(
				"/Users/berni/git/javaFinalProject/ProyectoAppInfantil/src/audioFiles/numberSounds/cuatro.wav");
		File numSound5Mac = new File(
				"/Users/berni/git/javaFinalProject/ProyectoAppInfantil/src/audioFiles/numberSounds/cinco.wav");
		File numSound6Mac = new File(
				"/Users/berni/git/javaFinalProject/ProyectoAppInfantil/src/audioFiles/numberSounds/seis.wav");
		File numSound7Mac = new File(
				"/Users/berni/git/javaFinalProject/ProyectoAppInfantil/src/audioFiles/numberSounds/siete.wav");
		File numSound8Mac = new File(
				"/Users/berni/git/javaFinalProject/ProyectoAppInfantil/src/audioFiles/numberSounds/ocho.wav");
		File numSound9Mac = new File(
				"/Users/berni/git/javaFinalProject/ProyectoAppInfantil/src/audioFiles/numberSounds/nueve.wav");
		File numSound10Mac = new File(
				"/Users/berni/git/javaFinalProject/ProyectoAppInfantil/src/audioFiles/numberSounds/diez.wav");

		btn_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaticSoundMethods.playSound(numSound10Win);
				numbersLogic.addNumber(numList, Integer.valueOf(btn_10.getName()));
				lblMostrarResultado.setText(lblMostrarResultado.getText() + " " + btn_10.getName());
				result = numbersLogic.checkResult(numList, Integer.valueOf(lblTargetNumber.getText()));
				checkGameResult(result, lblMostrarResultado, lblWinning);
				System.out.println(numList);
				activarAyudaYPista();
			}
		});

		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaticSoundMethods.playSound(numSound1Win);
				numbersLogic.addNumber(numList, Integer.valueOf(btn_1.getName()));
				lblMostrarResultado.setText(lblMostrarResultado.getText() + " " + btn_1.getName());
				result = numbersLogic.checkResult(numList, Integer.valueOf(lblTargetNumber.getText()));
				checkGameResult(result, lblMostrarResultado, lblWinning);
				seguirJugando(isJugando, numberButtons);
				activarAyudaYPista();
			}
		});

		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaticSoundMethods.playSound(numSound2Win);
				numbersLogic.addNumber(numList, Integer.valueOf(btn_2.getName()));
				lblMostrarResultado.setText(lblMostrarResultado.getText() + " " + btn_2.getName());
				result = numbersLogic.checkResult(numList, Integer.valueOf(lblTargetNumber.getText()));
				checkGameResult(result, lblMostrarResultado, lblWinning);
				seguirJugando(isJugando, numberButtons);
				activarAyudaYPista();
			}
		});

		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaticSoundMethods.playSound(numSound3Win);
				numbersLogic.addNumber(numList, Integer.valueOf(btn_3.getName()));
				lblMostrarResultado.setText(lblMostrarResultado.getText() + " " + btn_3.getName());
				result = numbersLogic.checkResult(numList, Integer.valueOf(lblTargetNumber.getText()));
				checkGameResult(result, lblMostrarResultado, lblWinning);
				seguirJugando(isJugando, numberButtons);
				activarAyudaYPista();
			}
		});

		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaticSoundMethods.playSound(numSound4Win);
				numbersLogic.addNumber(numList, Integer.valueOf(btn_4.getName()));
				lblMostrarResultado.setText(lblMostrarResultado.getText() + " " + btn_4.getName());
				result = numbersLogic.checkResult(numList, Integer.valueOf(lblTargetNumber.getText()));
				checkGameResult(result, lblMostrarResultado, lblWinning);
				seguirJugando(isJugando, numberButtons);
				activarAyudaYPista();
			}
		});

		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaticSoundMethods.playSound(numSound5Win);
				numbersLogic.addNumber(numList, Integer.valueOf(btn_5.getName()));
				lblMostrarResultado.setText(lblMostrarResultado.getText() + " " + btn_5.getName());
				result = numbersLogic.checkResult(numList, Integer.valueOf(lblTargetNumber.getText()));
				checkGameResult(result, lblMostrarResultado, lblWinning);
				seguirJugando(isJugando, numberButtons);
				activarAyudaYPista();
			}
		});

		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaticSoundMethods.playSound(numSound6Win);
				numbersLogic.addNumber(numList, Integer.valueOf(btn_6.getName()));
				lblMostrarResultado.setText(lblMostrarResultado.getText() + " " + btn_6.getName());
				result = numbersLogic.checkResult(numList, Integer.valueOf(lblTargetNumber.getText()));
				checkGameResult(result, lblMostrarResultado, lblWinning);
				seguirJugando(isJugando, numberButtons);
				activarAyudaYPista();
			}
		});

		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaticSoundMethods.playSound(numSound7Win);
				numbersLogic.addNumber(numList, Integer.valueOf(btn_7.getName()));
				lblMostrarResultado.setText(lblMostrarResultado.getText() + " " + btn_7.getName());
				result = numbersLogic.checkResult(numList, Integer.valueOf(lblTargetNumber.getText()));
				checkGameResult(result, lblMostrarResultado, lblWinning);
				seguirJugando(isJugando, numberButtons);
				activarAyudaYPista();
			}
		});

		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaticSoundMethods.playSound(numSound8Win);
				numbersLogic.addNumber(numList, Integer.valueOf(btn_8.getName()));
				lblMostrarResultado.setText(lblMostrarResultado.getText() + " " + btn_8.getName());
				result = numbersLogic.checkResult(numList, Integer.valueOf(lblTargetNumber.getText()));
				checkGameResult(result, lblMostrarResultado, lblWinning);
				seguirJugando(isJugando, numberButtons);
				activarAyudaYPista();
			}
		});

		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaticSoundMethods.playSound(numSound9Win);
				numbersLogic.addNumber(numList, Integer.valueOf(btn_9.getName()));
				lblMostrarResultado.setText(lblMostrarResultado.getText() + " " + btn_9.getName());
				result = numbersLogic.checkResult(numList, Integer.valueOf(lblTargetNumber.getText()));
				checkGameResult(result, lblMostrarResultado, lblWinning);
				seguirJugando(isJugando, numberButtons);
				activarAyudaYPista();
			}
		});

		// VOLVER ATRAS //////////////////////////////////////////////////////////

		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainScreen window = new MainScreen();
				window.getMainFrame().setVisible(true);
				numbersFrame.setVisible(false);
				gainControl.setValue(gainControl.getMinimum());
			}
		});

		// PISTAS /////////////////////////////////////////////////////////////////

		btnPista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pista_tienes pista_tienesWindow = new Pista_tienes();
				pista_tienesWindow.getPista_tienes().setVisible(true);

				Pista_llegar_a pista_llegar_aWindow = new Pista_llegar_a();
				pista_llegar_aWindow.getPista_llegar_a().setVisible(true);

			}
		});

		// CHAT DE AYUDA
		// /////////////////////////////////////////////////////////////////

		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				ChatWindowServPruebasLOCAS alumnoServidor = new ChatWindowServPruebasLOCAS();
//				alumnoServidor.getServerWindow().setVisible(true);

				ChatAlumnoCli AlumnoCliente = new ChatAlumnoCli();
				AlumnoCliente.getChatAlumnoCli().setVisible(true);
				AlumnoCliente.setEstadoJuego("Llevo " + getSumaActual() + " y tengo que llegar a  " + getObjetivoActual());
			}
		});

	}

	public static void setNombreUsuario(String nombreUsuario) {
		lblNombreUsuario.setText(nombreUsuario);
	}

	public static String getNombreUsuario() {
		return lblNombreUsuario.getText();
	}

	public void checkGameResult(String result, JLabel lblMostrarResultado, JLabel lblWinning) {
		if (result.compareToIgnoreCase("win") == 0) {
			lblMostrarResultado.setText("HAS GANADO!!!");
			File congrats = new File(
					"/Users/berni/git/javaFinalProject/ProyectoAppInfantil/src/audioFiles/fx/congrats.wav");
			
			File congratsWindows = new File(
					"/Users/berni/git/javaFinalProject/ProyectoAppInfantil/src/audioFiles/fx/congrats.wav");
			
			StaticSoundMethods.playSound(congratsWindows);
			lblWinning.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/titles/congrats.gif")));
			lblWinning.setVisible(true);
			isJugando = false;

		}
		if (result.compareToIgnoreCase("lose") == 0) {
			lblMostrarResultado.setText("HAS PERDIDO!!!");
			File fail = new File(
					"/Users/berni/git/javaFinalProject/ProyectoAppInfantil/src/audioFiles/fx/fail-trombone.wav");
			
			File failWindows = new File(
					"/Users/berni/git/javaFinalProject/ProyectoAppInfantil/src/audioFiles/fx/fail-trombone.wav");
			
			StaticSoundMethods.playSound(failWindows);
			lblWinning.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/titles/youLose.gif")));
			lblWinning.setVisible(true);
			isJugando = false;
		}
		if (result.compareToIgnoreCase("try") == 0) {
			lblMostrarResultado.setText(lblMostrarResultado.getText() + " + ");
		}
	}

	public void seguirJugando(boolean jugando, JButton[] numberButtons) {
		if (!jugando) {
			for (JButton jButton : numberButtons) {
				jButton.setEnabled(false);
			}
		} else {
			for (JButton jButton : numberButtons) {
				jButton.setEnabled(true);
			}
		}
	}

	public void ocultarNumero(JLabel lblTargetNumber, JButton[] numberButtons) {
		String target = lblTargetNumber.getText();
		for (JButton jButton : numberButtons) {

			if (jButton.getName().compareToIgnoreCase(target) == 0) {
				jButton.setEnabled(false);
			}
		}
	}

	public static String devolverSumaActual(ArrayList<Integer> numList) {

		int tempSum = 0;
		for (int i = 0; i < numList.size(); i++) {
			tempSum += numList.get(i);
		}
		String sumaActual = String.valueOf(tempSum);

		return sumaActual;
	}

	public static String devolverObjetivoActual(JLabel lblTargetNumber) {
		String objetivoActual = lblTargetNumber.getText();

		return objetivoActual;
	}

	public void activarAyudaYPista() {
		btnPista.setEnabled(true);
		btnHelp.setEnabled(true);
	}

}
