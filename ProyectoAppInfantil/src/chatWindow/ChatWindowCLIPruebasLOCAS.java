package chatWindow;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JTextArea;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
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
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;

public class ChatWindowCLIPruebasLOCAS {

	private JFrame clientWindow;
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

	// added to use from main window
	public JFrame getClientWindow() {
		return clientWindow;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatWindowCLIPruebasLOCAS window = new ChatWindowCLIPruebasLOCAS();
					window.clientWindow.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	/**
	 * Create the application.
	 */
	public ChatWindowCLIPruebasLOCAS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		clientWindow = new JFrame();
		clientWindow.getContentPane().setBackground(new Color(102, 102, 204));
		clientWindow.setBounds(100, 600, 500, 336);
		clientWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		clientWindow.getContentPane().setLayout(null);

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
		clientWindow.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setVisible(true);
		updateEdition();

		scrollPane = new JScrollPane();
		scrollPane.setBounds(9, 4, 480, 237);
		clientWindow.getContentPane().add(scrollPane);

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
		clientWindow.getContentPane().add(btnSend);

		// events

//		btnConnectClient.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {

//				JFrame enterUserClient = new JFrame();
//				user = JOptionPane.showInputDialog(clientWindow, "USER?");
		user = "Alumno";

		// boolean exit = false;// bandera para controlar ciclo del programa

//				JFrame enterIp = new JFrame();
//				serverIP = JOptionPane.showInputDialog(clientWindow, "IP?");

		serverIP = "127.0.0.1";

		JFrame enterServer = new JFrame();
		String clientPort = JOptionPane.showInputDialog(clientWindow, "Que puerto quieres usar?");
		port = Integer.parseInt(clientPort);

//				String clientPort = "5012";
//				port = 5012;

		try {

			socket = new Socket(serverIP, port);// open socket
			// To read from the server
			input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// to write to the server
			output = new PrintStream(socket.getOutputStream());

			clientWindow.setTitle(user + " conectado por puerto " + clientPort + " a IP " + serverIP);

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
				System.out.println(textChatPanel.getText());

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

}
