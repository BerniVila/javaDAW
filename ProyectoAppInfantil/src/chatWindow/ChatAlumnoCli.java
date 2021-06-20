package chatWindow;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import proyectoAppInfantil.NumbersWindow;
import proyectoAppInfantil.StaticSoundMethods;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import java.awt.Dimension;


public class ChatAlumnoCli {


	private JFrame ChatAlumnoCli;
	private JTextField textField;
//	private JButton btnConnectClient;
	private int port;
	private String serverIP;
	private BufferedReader input;
	private PrintStream output;
	private String user;
//	private JButton btnDisconnect;
	private final int NOT_CONNECTED = 1;
	private final int CONNECTED = 2;
	private int state = NOT_CONNECTED;
	private JScrollPane scrollPane;
	JTextArea textChatPanel;
	Socket socket;
	Socket client;
	private String estadoJuego;
//	private String nombreUsuario;

	// added to use from main window
	public JFrame getChatAlumnoCli() {
		return ChatAlumnoCli;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatAlumnoCli window = new ChatAlumnoCli();
					window.ChatAlumnoCli.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	/**
	 * Create the application.
	 */
	public ChatAlumnoCli() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		ChatAlumnoCli = new JFrame();
		ChatAlumnoCli.getContentPane().setBackground(new Color(102, 102, 204));
		ChatAlumnoCli.setBounds(100, 600, 500, 407);
		ChatAlumnoCli.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		ChatAlumnoCli.getContentPane().setLayout(null);

//		btnConnectClient = new JButton("Connect as Client");
//		btnConnectClient.setBounds(134, 324, 172, 55);
//		btnConnectClient.setOpaque(true);
//		btnConnectClient.setBorderPainted(false);
//		btnConnectClient.setBackground(new Color(51, 153, 204));
//		clientWindow.getContentPane().add(btnConnectClient);

//		btnDisconnect = new JButton("Disconnect");
//		btnDisconnect.setBounds(13, 325, 115, 55);
//		btnDisconnect.setBorderPainted(false);
//		btnDisconnect.setOpaque(true);
//		btnDisconnect.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//		btnDisconnect.setBackground(new Color(153, 51, 51));
//		btnDisconnect.setForeground(Color.WHITE);
//		clientWindow.getContentPane().add(btnDisconnect);

		textField = new JTextField();
		textField.setBounds(9, 256, 395, 48);
		ChatAlumnoCli.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setVisible(true);
		updateEdition();

		scrollPane = new JScrollPane();
		scrollPane.setBounds(9, 4, 480, 237);
		ChatAlumnoCli.getContentPane().add(scrollPane);

		textChatPanel = new JTextArea(10, 20);
		scrollPane.setViewportView(textChatPanel);
		textChatPanel.setEditable(false);

		JButton btnSend = new JButton("");
		btnSend.setBounds(409, 256, 80, 48);
		btnSend.setContentAreaFilled(false);
		btnSend.setMinimumSize(new Dimension(30, 29));
		btnSend.setMaximumSize(new Dimension(30, 29));
		btnSend.setIconTextGap(2);
		btnSend.setIcon(
				new ImageIcon(ChatWindowCLIPruebasLOCAS.class.getResource("/images/icons/send-message-icon.png")));
		btnSend.setForeground(Color.WHITE);
		btnSend.setBackground(Color.WHITE);
		btnSend.setOpaque(true);
		ChatAlumnoCli.getContentPane().add(btnSend);
		
		
		JButton btnEscucharAyuda = new JButton("ESCUCHAR MENSAJE");
		btnEscucharAyuda.setForeground(new Color(255, 255, 255));
		btnEscucharAyuda.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEscucharAyuda.setBackground(new Color(255, 153, 102));
		btnEscucharAyuda.setBorderPainted(false);
		btnEscucharAyuda.setOpaque(true);
		btnEscucharAyuda.setBounds(20, 309, 200, 59);
		ChatAlumnoCli.getContentPane().add(btnEscucharAyuda);
		
		JButton btnPedirAyuda = new JButton("PEDIR AYUDA");
		btnPedirAyuda.setForeground(new Color(255, 255, 255));
		btnPedirAyuda.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPedirAyuda.setBackground(new Color(0, 153, 102));
		btnPedirAyuda.setBorderPainted(false);
		btnPedirAyuda.setOpaque(true);
		btnPedirAyuda.setBounds(250, 309, 200, 59);
		ChatAlumnoCli.getContentPane().add(btnPedirAyuda);
		
		
		File numSound1Mac = new File(
				"/Users/berni/git/javaFinalProject/ProyectoAppInfantil/src/audioFiles/numberSounds/elNumeroUno.wav");
		File numSound2Mac = new File(
				"/Users/berni/git/javaFinalProject/ProyectoAppInfantil/src/audioFiles/numberSounds/elNumeroDos.wav");
		File numSound3Mac = new File(
				"/Users/berni/git/javaFinalProject/ProyectoAppInfantil/src/audioFiles/numberSounds/elNumeroTres.wav");
		File numSound4Mac = new File(
				"/Users/berni/git/javaFinalProject/ProyectoAppInfantil/src/audioFiles/numberSounds/elNumeroCuatro.wav");
		File numSound5Mac = new File(
				"/Users/berni/git/javaFinalProject/ProyectoAppInfantil/src/audioFiles/numberSounds/elNumeroCinco.wav");
		File numSound6Mac = new File(
				"/Users/berni/git/javaFinalProject/ProyectoAppInfantil/src/audioFiles/numberSounds/elNumeroSeis.wav");
		File numSound7Mac = new File(
				"/Users/berni/git/javaFinalProject/ProyectoAppInfantil/src/audioFiles/numberSounds/elNumeroSiete.wav");
		File numSound8Mac = new File(
				"/Users/berni/git/javaFinalProject/ProyectoAppInfantil/src/audioFiles/numberSounds/elNumeroOcho.wav");
		File numSound9Mac = new File(
				"/Users/berni/git/javaFinalProject/ProyectoAppInfantil/src/audioFiles/numberSounds/elNumeroNueve.wav");
		File numSound10Mac = new File(
				"/Users/berni/git/javaFinalProject/ProyectoAppInfantil/src/audioFiles/numberSounds/elNumeroDiez.wav");
		
		
		
		File numSound1Win = new File(
				"C:\\Users\\bernivila\\git\\DAWProject\\ProyectoAppInfantil\\src\\audioFiles\\numberSounds\\elNumeroUno.wav");
		File numSound2Win = new File(
				"C:\\Users\\bernivila\\git\\DAWProject\\ProyectoAppInfantil\\src\\audioFiles\\numberSounds\\elNumeroDos.wav");
		File numSound3Win = new File(
				"C:\\Users\\bernivila\\git\\DAWProject\\ProyectoAppInfantil\\src\\audioFiles\\numberSounds\\elNumeroTres.wav");
		File numSound4Win = new File(
				"C:\\Users\\bernivila\\git\\DAWProject\\ProyectoAppInfantil\\src\\audioFiles\\numberSounds\\elNumeroCuatro.wav");
		File numSound5Win = new File(
				"C:\\Users\\bernivila\\git\\DAWProject\\ProyectoAppInfantil\\src\\audioFiles\\numberSounds\\elNumeroCinco.wav");
		File numSound6Win = new File(
				"C:\\Users\\bernivila\\git\\DAWProject\\ProyectoAppInfantil\\src\\audioFiles\\numberSounds\\elNumeroSeis.wav");
		File numSound7Win = new File(
				"C:\\Users\\bernivila\\git\\DAWProject\\ProyectoAppInfantil\\src\\audioFiles\\numberSounds\\elNumeroSiete.wav");
		File numSound8Win = new File(
				"C:\\Users\\bernivila\\git\\DAWProject\\ProyectoAppInfantil\\src\\audioFiles\\numberSounds\\elNumeroOcho.wav");
		File numSound9Win = new File(
				"C:\\Users\\bernivila\\git\\DAWProject\\ProyectoAppInfantil\\src\\audioFiles\\numberSounds\\elNumeroNueve.wav");
		File numSound10Win = new File(
				"C:\\Users\\bernivila\\git\\DAWProject\\ProyectoAppInfantil\\src\\audioFiles\\numberSounds\\elNumeroDiez.wav");
		

		// events

//		btnConnectClient.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {

//				JFrame enterUserClient = new JFrame();
//				user = JOptionPane.showInputDialog(clientWindow, "USER?");
		
		user = NumbersWindow.getNombreUsuario();

		// boolean exit = false;// bandera para controlar ciclo del programa

//				JFrame enterIp = new JFrame();
//				serverIP = JOptionPane.showInputDialog(clientWindow, "IP?");

		serverIP = "127.0.0.1";

		JFrame enterServer = new JFrame();
		String clientPort = JOptionPane.showInputDialog(ChatAlumnoCli, "Que puerto quieres usar?");
		port = Integer.parseInt(clientPort);

//				String clientPort = "5012";
//				port = 5012;

		try {

			socket = new Socket(serverIP, port);// open socket
			// To read from the server
			input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// to write to the server
			output = new PrintStream(socket.getOutputStream());

			ChatAlumnoCli.setTitle(user + " conectado por puerto " + clientPort + " a IP " + serverIP);

			Reading2 chatInput = new Reading2(input, output, textChatPanel);
			

			chatInput.start();

			state = CONNECTED;
			updateEdition();
			
			

		} catch (IOException ex) {
			System.err.println("Client -> " + ex.getMessage());
		}

//			}
//		});

		// send Message

		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String message = user + "  -->  " + textField.getText();

				output.flush();
				output.println(message);
				output.flush();

				textChatPanel.append("\n" + message + "\n");
				textField.setText("");

			}
		});
		
		
		
		btnEscucharAyuda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String texto = textChatPanel.getText();
				String numeroAyuda = String.valueOf(texto.charAt(texto.length() - 2));
				System.out.println(numeroAyuda);
				
				switch (numeroAyuda) {
				case "1":
					StaticSoundMethods.playSound(numSound1Mac);
					break;
				case "2":
					StaticSoundMethods.playSound(numSound2Mac);
					break;
				case "3":
					StaticSoundMethods.playSound(numSound3Mac);
					break;
				case "4":
					StaticSoundMethods.playSound(numSound4Mac);
					break;
				case "5":
					StaticSoundMethods.playSound(numSound5Mac);
					break;
				case "6":
					StaticSoundMethods.playSound(numSound6Mac);
					break;
				case "7":
					StaticSoundMethods.playSound(numSound7Mac);
					break;
				case "8":
					StaticSoundMethods.playSound(numSound8Mac);
					break;
				case "9":
					StaticSoundMethods.playSound(numSound9Mac);
					break;
				case "10":
					StaticSoundMethods.playSound(numSound10Mac);
					break;

				}
				
				
			}
		});
		
		
		
		
		btnPedirAyuda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String message = getEstadoJuego();
				output.flush();
				output.println(message);
				output.flush();
				textChatPanel.append("\n" + message + "\n");

			}
		});

//		btnDisconnect.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				try {
//					client.close();
//					socket.close();
//				} catch (IOException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//
//			}
//		});

	}

	public void updateEdition() {
		switch (state) {
		case CONNECTED:
			textField.setEnabled(true);
			break;

		case NOT_CONNECTED:
			textField.setEnabled(false);
			break;

		default:
			break;
		}
	}

	public void setEstadoJuego(String estadoJuego) {
		this.estadoJuego = estadoJuego;
	}

	public String getEstadoJuego() {
		return estadoJuego;
	}
	
//	public void setNombreUsuario(String nombreUsuario) {
//		this.nombreUsuario = nombreUsuario;
//	}
//
//	public String getNombreUsuario() {
//		return nombreUsuario;
//	}
}
